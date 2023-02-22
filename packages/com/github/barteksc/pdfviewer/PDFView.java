package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import androidx.core.internal.view.SupportMenu;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.model.PagePart;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;
import com.github.barteksc.pdfviewer.source.AssetSource;
import com.github.barteksc.pdfviewer.source.ByteArraySource;
import com.github.barteksc.pdfviewer.source.DocumentSource;
import com.github.barteksc.pdfviewer.source.FileSource;
import com.github.barteksc.pdfviewer.source.InputStreamSource;
import com.github.barteksc.pdfviewer.source.UriSource;
import com.github.barteksc.pdfviewer.util.ArrayUtils;
import com.github.barteksc.pdfviewer.util.Constants;
import com.github.barteksc.pdfviewer.util.MathUtils;
import com.github.barteksc.pdfviewer.util.Util;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PDFView extends RelativeLayout {
    public static final float DEFAULT_MAX_SCALE = 3.0f;
    public static final float DEFAULT_MID_SCALE = 1.75f;
    public static final float DEFAULT_MIN_SCALE = 1.0f;
    private static final String TAG = PDFView.class.getSimpleName();
    private AnimationManager animationManager;
    private boolean annotationRendering;
    private PaintFlagsDrawFilter antialiasFilter;
    private boolean bestQuality;
    CacheManager cacheManager;
    private int currentFilteredPage;
    private int currentPage;
    private float currentXOffset;
    private float currentYOffset;
    private Paint debugPaint;
    private DecodingAsyncTask decodingAsyncTask;
    private int defaultPage;
    private int documentPageCount;
    private DragPinchManager dragPinchManager;
    private boolean enableAntialiasing;
    private int[] filteredUserPageIndexes;
    private int[] filteredUserPages;
    private int invalidPageColor;
    private boolean isScrollHandleInit;
    private float maxZoom;
    private float midZoom;
    private float minZoom;
    private OnDrawListener onDrawAllListener;
    private OnDrawListener onDrawListener;
    private List<Integer> onDrawPagesNums;
    private OnErrorListener onErrorListener;
    private OnLoadCompleteListener onLoadCompleteListener;
    private OnPageChangeListener onPageChangeListener;
    private OnPageErrorListener onPageErrorListener;
    private OnPageScrollListener onPageScrollListener;
    private OnRenderListener onRenderListener;
    private OnTapListener onTapListener;
    private float optimalPageHeight;
    private float optimalPageWidth;
    private int[] originalUserPages;
    private int pageHeight;
    private int pageWidth;
    private PagesLoader pagesLoader;
    private Paint paint;
    private PdfDocument pdfDocument;
    private PdfiumCore pdfiumCore;
    private boolean recycled;
    private boolean renderDuringScale;
    RenderingHandler renderingHandler;
    private final HandlerThread renderingHandlerThread;
    private ScrollDir scrollDir;
    private ScrollHandle scrollHandle;
    private int spacingPx;
    private State state;
    private boolean swipeVertical;
    private float zoom;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum ScrollDir {
        NONE,
        START,
        END
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum State {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollHandle getScrollHandle() {
        return this.scrollHandle;
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.minZoom = 1.0f;
        this.midZoom = 1.75f;
        this.maxZoom = 3.0f;
        this.scrollDir = ScrollDir.NONE;
        this.currentXOffset = 0.0f;
        this.currentYOffset = 0.0f;
        this.zoom = 1.0f;
        this.recycled = true;
        this.state = State.DEFAULT;
        this.invalidPageColor = -1;
        this.defaultPage = 0;
        this.swipeVertical = true;
        this.isScrollHandleInit = false;
        this.bestQuality = false;
        this.annotationRendering = false;
        this.renderDuringScale = false;
        this.enableAntialiasing = true;
        this.antialiasFilter = new PaintFlagsDrawFilter(0, 3);
        this.spacingPx = 0;
        this.onDrawPagesNums = new ArrayList(10);
        this.renderingHandlerThread = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.cacheManager = new CacheManager();
        this.animationManager = new AnimationManager(this);
        this.dragPinchManager = new DragPinchManager(this, this.animationManager);
        this.paint = new Paint();
        Paint paint = new Paint();
        this.debugPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.pdfiumCore = new PdfiumCore(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load(DocumentSource documentSource, String str, OnLoadCompleteListener onLoadCompleteListener, OnErrorListener onErrorListener) {
        load(documentSource, str, onLoadCompleteListener, onErrorListener, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load(DocumentSource documentSource, String str, OnLoadCompleteListener onLoadCompleteListener, OnErrorListener onErrorListener, int[] iArr) {
        if (!this.recycled) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        if (iArr != null) {
            this.originalUserPages = iArr;
            this.filteredUserPages = ArrayUtils.deleteDuplicatedPages(iArr);
            this.filteredUserPageIndexes = ArrayUtils.calculateIndexesInDuplicateArray(this.originalUserPages);
        }
        this.onLoadCompleteListener = onLoadCompleteListener;
        this.onErrorListener = onErrorListener;
        int[] iArr2 = this.originalUserPages;
        int i = iArr2 != null ? iArr2[0] : 0;
        this.recycled = false;
        DecodingAsyncTask decodingAsyncTask = new DecodingAsyncTask(documentSource, str, this, this.pdfiumCore, i);
        this.decodingAsyncTask = decodingAsyncTask;
        decodingAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void jumpTo(int i, boolean z) {
        float f = -calculatePageOffset(i);
        if (this.swipeVertical) {
            if (z) {
                this.animationManager.startYAnimation(this.currentYOffset, f);
            } else {
                moveTo(this.currentXOffset, f);
            }
        } else if (z) {
            this.animationManager.startXAnimation(this.currentXOffset, f);
        } else {
            moveTo(f, this.currentYOffset);
        }
        showPage(i);
    }

    public void jumpTo(int i) {
        jumpTo(i, false);
    }

    void showPage(int i) {
        if (this.recycled) {
            return;
        }
        int determineValidPageNumberFrom = determineValidPageNumberFrom(i);
        this.currentPage = determineValidPageNumberFrom;
        this.currentFilteredPage = determineValidPageNumberFrom;
        int[] iArr = this.filteredUserPageIndexes;
        if (iArr != null && determineValidPageNumberFrom >= 0 && determineValidPageNumberFrom < iArr.length) {
            this.currentFilteredPage = iArr[determineValidPageNumberFrom];
        }
        loadPages();
        if (this.scrollHandle != null && !documentFitsView()) {
            this.scrollHandle.setPageNum(this.currentPage + 1);
        }
        OnPageChangeListener onPageChangeListener = this.onPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageChanged(this.currentPage, getPageCount());
        }
    }

    public float getPositionOffset() {
        float f;
        float calculateDocLength;
        int width;
        if (this.swipeVertical) {
            f = -this.currentYOffset;
            calculateDocLength = calculateDocLength();
            width = getHeight();
        } else {
            f = -this.currentXOffset;
            calculateDocLength = calculateDocLength();
            width = getWidth();
        }
        return MathUtils.limit(f / (calculateDocLength - width), 0.0f, 1.0f);
    }

    public void setPositionOffset(float f, boolean z) {
        if (this.swipeVertical) {
            moveTo(this.currentXOffset, ((-calculateDocLength()) + getHeight()) * f, z);
        } else {
            moveTo(((-calculateDocLength()) + getWidth()) * f, this.currentYOffset, z);
        }
        loadPageByOffset();
    }

    public void setPositionOffset(float f) {
        setPositionOffset(f, true);
    }

    private float calculatePageOffset(int i) {
        if (this.swipeVertical) {
            return toCurrentScale((i * this.optimalPageHeight) + (i * this.spacingPx));
        }
        return toCurrentScale((i * this.optimalPageWidth) + (i * this.spacingPx));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float calculateDocLength() {
        int pageCount = getPageCount();
        if (this.swipeVertical) {
            return toCurrentScale((pageCount * this.optimalPageHeight) + ((pageCount - 1) * this.spacingPx));
        }
        return toCurrentScale((pageCount * this.optimalPageWidth) + ((pageCount - 1) * this.spacingPx));
    }

    public void stopFling() {
        this.animationManager.stopFling();
    }

    public int getPageCount() {
        int[] iArr = this.originalUserPages;
        if (iArr != null) {
            return iArr.length;
        }
        return this.documentPageCount;
    }

    public void enableSwipe(boolean z) {
        this.dragPinchManager.setSwipeEnabled(z);
    }

    public void enableDoubletap(boolean z) {
        this.dragPinchManager.enableDoubletap(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.onPageChangeListener = onPageChangeListener;
    }

    OnPageChangeListener getOnPageChangeListener() {
        return this.onPageChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageScrollListener(OnPageScrollListener onPageScrollListener) {
        this.onPageScrollListener = onPageScrollListener;
    }

    OnPageScrollListener getOnPageScrollListener() {
        return this.onPageScrollListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnRenderListener(OnRenderListener onRenderListener) {
        this.onRenderListener = onRenderListener;
    }

    OnRenderListener getOnRenderListener() {
        return this.onRenderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnTapListener(OnTapListener onTapListener) {
        this.onTapListener = onTapListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnTapListener getOnTapListener() {
        return this.onTapListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDrawListener(OnDrawListener onDrawListener) {
        this.onDrawListener = onDrawListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDrawAllListener(OnDrawListener onDrawListener) {
        this.onDrawAllListener = onDrawListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPageErrorListener(OnPageErrorListener onPageErrorListener) {
        this.onPageErrorListener = onPageErrorListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPageError(PageRenderingException pageRenderingException) {
        OnPageErrorListener onPageErrorListener = this.onPageErrorListener;
        if (onPageErrorListener != null) {
            onPageErrorListener.onPageError(pageRenderingException.getPage(), pageRenderingException.getCause());
            return;
        }
        String str = TAG;
        Log.e(str, "Cannot open page " + pageRenderingException.getPage(), pageRenderingException.getCause());
    }

    public void recycle() {
        PdfDocument pdfDocument;
        this.animationManager.stopAll();
        RenderingHandler renderingHandler = this.renderingHandler;
        if (renderingHandler != null) {
            renderingHandler.stop();
            this.renderingHandler.removeMessages(1);
        }
        DecodingAsyncTask decodingAsyncTask = this.decodingAsyncTask;
        if (decodingAsyncTask != null) {
            decodingAsyncTask.cancel(true);
        }
        this.cacheManager.recycle();
        ScrollHandle scrollHandle = this.scrollHandle;
        if (scrollHandle != null && this.isScrollHandleInit) {
            scrollHandle.destroyLayout();
        }
        PdfiumCore pdfiumCore = this.pdfiumCore;
        if (pdfiumCore != null && (pdfDocument = this.pdfDocument) != null) {
            pdfiumCore.closeDocument(pdfDocument);
        }
        this.renderingHandler = null;
        this.originalUserPages = null;
        this.filteredUserPages = null;
        this.filteredUserPageIndexes = null;
        this.pdfDocument = null;
        this.scrollHandle = null;
        this.isScrollHandleInit = false;
        this.currentYOffset = 0.0f;
        this.currentXOffset = 0.0f;
        this.zoom = 1.0f;
        this.recycled = true;
        this.state = State.DEFAULT;
    }

    public boolean isRecycled() {
        return this.recycled;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        this.animationManager.computeFling();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        recycle();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (isInEditMode() || this.state != State.SHOWN) {
            return;
        }
        this.animationManager.stopAll();
        calculateOptimalWidthAndHeight();
        if (this.swipeVertical) {
            moveTo(this.currentXOffset, -calculatePageOffset(this.currentPage));
        } else {
            moveTo(-calculatePageOffset(this.currentPage), this.currentYOffset);
        }
        loadPageByOffset();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.swipeVertical) {
            if (i >= 0 || this.currentXOffset >= 0.0f) {
                return i > 0 && this.currentXOffset + toCurrentScale(this.optimalPageWidth) > ((float) getWidth());
            }
            return true;
        } else if (i >= 0 || this.currentXOffset >= 0.0f) {
            return i > 0 && this.currentXOffset + calculateDocLength() > ((float) getWidth());
        } else {
            return true;
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (this.swipeVertical) {
            if (i >= 0 || this.currentYOffset >= 0.0f) {
                return i > 0 && this.currentYOffset + calculateDocLength() > ((float) getHeight());
            }
            return true;
        } else if (i >= 0 || this.currentYOffset >= 0.0f) {
            return i > 0 && this.currentYOffset + toCurrentScale(this.optimalPageHeight) > ((float) getHeight());
        } else {
            return true;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            return;
        }
        if (this.enableAntialiasing) {
            canvas.setDrawFilter(this.antialiasFilter);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(-1);
        } else {
            background.draw(canvas);
        }
        if (!this.recycled && this.state == State.SHOWN) {
            float f = this.currentXOffset;
            float f2 = this.currentYOffset;
            canvas.translate(f, f2);
            for (PagePart pagePart : this.cacheManager.getThumbnails()) {
                drawPart(canvas, pagePart);
            }
            for (PagePart pagePart2 : this.cacheManager.getPageParts()) {
                drawPart(canvas, pagePart2);
                if (this.onDrawAllListener != null && !this.onDrawPagesNums.contains(Integer.valueOf(pagePart2.getUserPage()))) {
                    this.onDrawPagesNums.add(Integer.valueOf(pagePart2.getUserPage()));
                }
            }
            for (Integer num : this.onDrawPagesNums) {
                drawWithListener(canvas, num.intValue(), this.onDrawAllListener);
            }
            this.onDrawPagesNums.clear();
            drawWithListener(canvas, this.currentPage, this.onDrawListener);
            canvas.translate(-f, -f2);
        }
    }

    private void drawWithListener(Canvas canvas, int i, OnDrawListener onDrawListener) {
        float f;
        if (onDrawListener != null) {
            float f2 = 0.0f;
            if (this.swipeVertical) {
                f = calculatePageOffset(i);
            } else {
                f2 = calculatePageOffset(i);
                f = 0.0f;
            }
            canvas.translate(f2, f);
            onDrawListener.onLayerDrawn(canvas, toCurrentScale(this.optimalPageWidth), toCurrentScale(this.optimalPageHeight), i);
            canvas.translate(-f2, -f);
        }
    }

    private void drawPart(Canvas canvas, PagePart pagePart) {
        float calculatePageOffset;
        float f;
        RectF pageRelativeBounds = pagePart.getPageRelativeBounds();
        Bitmap renderedBitmap = pagePart.getRenderedBitmap();
        if (renderedBitmap.isRecycled()) {
            return;
        }
        if (this.swipeVertical) {
            f = calculatePageOffset(pagePart.getUserPage());
            calculatePageOffset = 0.0f;
        } else {
            calculatePageOffset = calculatePageOffset(pagePart.getUserPage());
            f = 0.0f;
        }
        canvas.translate(calculatePageOffset, f);
        Rect rect = new Rect(0, 0, renderedBitmap.getWidth(), renderedBitmap.getHeight());
        float currentScale = toCurrentScale(pageRelativeBounds.left * this.optimalPageWidth);
        float currentScale2 = toCurrentScale(pageRelativeBounds.top * this.optimalPageHeight);
        RectF rectF = new RectF((int) currentScale, (int) currentScale2, (int) (currentScale + toCurrentScale(pageRelativeBounds.width() * this.optimalPageWidth)), (int) (currentScale2 + toCurrentScale(pageRelativeBounds.height() * this.optimalPageHeight)));
        float f2 = this.currentXOffset + calculatePageOffset;
        float f3 = this.currentYOffset + f;
        if (rectF.left + f2 >= getWidth() || f2 + rectF.right <= 0.0f || rectF.top + f3 >= getHeight() || f3 + rectF.bottom <= 0.0f) {
            canvas.translate(-calculatePageOffset, -f);
            return;
        }
        canvas.drawBitmap(renderedBitmap, rect, rectF, this.paint);
        if (Constants.DEBUG_MODE) {
            this.debugPaint.setColor(pagePart.getUserPage() % 2 == 0 ? SupportMenu.CATEGORY_MASK : -16776961);
            canvas.drawRect(rectF, this.debugPaint);
        }
        canvas.translate(-calculatePageOffset, -f);
    }

    public void loadPages() {
        RenderingHandler renderingHandler;
        if (this.optimalPageWidth == 0.0f || this.optimalPageHeight == 0.0f || (renderingHandler = this.renderingHandler) == null) {
            return;
        }
        renderingHandler.removeMessages(1);
        this.cacheManager.makeANewSet();
        this.pagesLoader.loadPages();
        redraw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadComplete(PdfDocument pdfDocument, int i, int i2) {
        this.state = State.LOADED;
        this.documentPageCount = this.pdfiumCore.getPageCount(pdfDocument);
        this.pdfDocument = pdfDocument;
        this.pageWidth = i;
        this.pageHeight = i2;
        calculateOptimalWidthAndHeight();
        this.pagesLoader = new PagesLoader(this);
        if (!this.renderingHandlerThread.isAlive()) {
            this.renderingHandlerThread.start();
        }
        RenderingHandler renderingHandler = new RenderingHandler(this.renderingHandlerThread.getLooper(), this, this.pdfiumCore, pdfDocument);
        this.renderingHandler = renderingHandler;
        renderingHandler.start();
        ScrollHandle scrollHandle = this.scrollHandle;
        if (scrollHandle != null) {
            scrollHandle.setupLayout(this);
            this.isScrollHandleInit = true;
        }
        OnLoadCompleteListener onLoadCompleteListener = this.onLoadCompleteListener;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.loadComplete(this.documentPageCount);
        }
        jumpTo(this.defaultPage, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadError(Throwable th) {
        this.state = State.ERROR;
        recycle();
        invalidate();
        OnErrorListener onErrorListener = this.onErrorListener;
        if (onErrorListener != null) {
            onErrorListener.onError(th);
        } else {
            Log.e("PDFView", "load pdf error", th);
        }
    }

    void redraw() {
        invalidate();
    }

    public void onBitmapRendered(PagePart pagePart) {
        if (this.state == State.LOADED) {
            this.state = State.SHOWN;
            OnRenderListener onRenderListener = this.onRenderListener;
            if (onRenderListener != null) {
                onRenderListener.onInitiallyRendered(getPageCount(), this.optimalPageWidth, this.optimalPageHeight);
            }
        }
        if (pagePart.isThumbnail()) {
            this.cacheManager.cacheThumbnail(pagePart);
        } else {
            this.cacheManager.cachePart(pagePart);
        }
        redraw();
    }

    private int determineValidPageNumberFrom(int i) {
        if (i <= 0) {
            return 0;
        }
        int[] iArr = this.originalUserPages;
        if (iArr != null) {
            if (i >= iArr.length) {
                return iArr.length - 1;
            }
        } else {
            int i2 = this.documentPageCount;
            if (i >= i2) {
                return i2 - 1;
            }
        }
        return i;
    }

    private float calculateCenterOffsetForPage(int i) {
        float f;
        float width;
        float f2;
        if (this.swipeVertical) {
            f = -((i * this.optimalPageHeight) + (i * this.spacingPx));
            width = getHeight() / 2;
            f2 = this.optimalPageHeight;
        } else {
            f = -((i * this.optimalPageWidth) + (i * this.spacingPx));
            width = getWidth() / 2;
            f2 = this.optimalPageWidth;
        }
        return f + (width - (f2 / 2.0f));
    }

    private void calculateOptimalWidthAndHeight() {
        if (this.state == State.DEFAULT || getWidth() == 0) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f = this.pageWidth / this.pageHeight;
        float floor = (float) Math.floor(width / f);
        if (floor > height) {
            width = (float) Math.floor(f * height);
        } else {
            height = floor;
        }
        this.optimalPageWidth = width;
        this.optimalPageHeight = height;
    }

    public void moveTo(float f, float f2) {
        moveTo(f, f2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void moveTo(float r6, float r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.moveTo(float, float, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollDir getScrollDir() {
        return this.scrollDir;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadPageByOffset() {
        float f;
        float f2;
        int width;
        if (getPageCount() == 0) {
            return;
        }
        int i = this.spacingPx;
        float pageCount = i - (i / getPageCount());
        if (this.swipeVertical) {
            f = this.currentYOffset;
            f2 = this.optimalPageHeight + pageCount;
            width = getHeight();
        } else {
            f = this.currentXOffset;
            f2 = this.optimalPageWidth + pageCount;
            width = getWidth();
        }
        int floor = (int) Math.floor((Math.abs(f) + (width / 2.0f)) / toCurrentScale(f2));
        if (floor >= 0 && floor <= getPageCount() - 1 && floor != getCurrentPage()) {
            showPage(floor);
        } else {
            loadPages();
        }
    }

    int[] getFilteredUserPages() {
        return this.filteredUserPages;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] getOriginalUserPages() {
        return this.originalUserPages;
    }

    int[] getFilteredUserPageIndexes() {
        return this.filteredUserPageIndexes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDocumentPageCount() {
        return this.documentPageCount;
    }

    public void moveRelativeTo(float f, float f2) {
        moveTo(this.currentXOffset + f, this.currentYOffset + f2);
    }

    public void zoomTo(float f) {
        this.zoom = f;
    }

    public void zoomCenteredTo(float f, PointF pointF) {
        float f2 = f / this.zoom;
        zoomTo(f);
        moveTo((this.currentXOffset * f2) + (pointF.x - (pointF.x * f2)), (this.currentYOffset * f2) + (pointF.y - (pointF.y * f2)));
    }

    public void zoomCenteredRelativeTo(float f, PointF pointF) {
        zoomCenteredTo(this.zoom * f, pointF);
    }

    public boolean documentFitsView() {
        int pageCount = getPageCount();
        int i = (pageCount - 1) * this.spacingPx;
        return this.swipeVertical ? (((float) pageCount) * this.optimalPageHeight) + ((float) i) < ((float) getHeight()) : (((float) pageCount) * this.optimalPageWidth) + ((float) i) < ((float) getWidth());
    }

    public void fitToWidth(int i) {
        if (this.state != State.SHOWN) {
            Log.e(TAG, "Cannot fit, document not rendered yet");
            return;
        }
        fitToWidth();
        jumpTo(i);
    }

    public void fitToWidth() {
        if (this.state != State.SHOWN) {
            Log.e(TAG, "Cannot fit, document not rendered yet");
            return;
        }
        zoomTo(getWidth() / this.optimalPageWidth);
        setPositionOffset(0.0f);
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public float getCurrentXOffset() {
        return this.currentXOffset;
    }

    public float getCurrentYOffset() {
        return this.currentYOffset;
    }

    public float toRealScale(float f) {
        return f / this.zoom;
    }

    public float toCurrentScale(float f) {
        return f * this.zoom;
    }

    public float getZoom() {
        return this.zoom;
    }

    public boolean isZooming() {
        return this.zoom != this.minZoom;
    }

    public float getOptimalPageWidth() {
        return this.optimalPageWidth;
    }

    public float getOptimalPageHeight() {
        return this.optimalPageHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i) {
        this.defaultPage = i;
    }

    public void resetZoom() {
        zoomTo(this.minZoom);
    }

    public void resetZoomWithAnimation() {
        zoomWithAnimation(this.minZoom);
    }

    public void zoomWithAnimation(float f, float f2, float f3) {
        this.animationManager.startZoomAnimation(f, f2, this.zoom, f3);
    }

    public void zoomWithAnimation(float f) {
        this.animationManager.startZoomAnimation(getWidth() / 2, getHeight() / 2, this.zoom, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(ScrollHandle scrollHandle) {
        this.scrollHandle = scrollHandle;
    }

    public int getPageAtPositionOffset(float f) {
        int floor = (int) Math.floor(getPageCount() * f);
        return floor == getPageCount() ? floor - 1 : floor;
    }

    public float getMinZoom() {
        return this.minZoom;
    }

    public void setMinZoom(float f) {
        this.minZoom = f;
    }

    public float getMidZoom() {
        return this.midZoom;
    }

    public void setMidZoom(float f) {
        this.midZoom = f;
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public void setMaxZoom(float f) {
        this.maxZoom = f;
    }

    public void useBestQuality(boolean z) {
        this.bestQuality = z;
    }

    public boolean isBestQuality() {
        return this.bestQuality;
    }

    public boolean isSwipeVertical() {
        return this.swipeVertical;
    }

    public void setSwipeVertical(boolean z) {
        this.swipeVertical = z;
    }

    public void enableAnnotationRendering(boolean z) {
        this.annotationRendering = z;
    }

    public boolean isAnnotationRendering() {
        return this.annotationRendering;
    }

    public void enableRenderDuringScale(boolean z) {
        this.renderDuringScale = z;
    }

    public boolean isAntialiasing() {
        return this.enableAntialiasing;
    }

    public void enableAntialiasing(boolean z) {
        this.enableAntialiasing = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSpacingPx() {
        return this.spacingPx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i) {
        this.spacingPx = Util.getDP(getContext(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvalidPageColor(int i) {
        this.invalidPageColor = i;
    }

    public int getInvalidPageColor() {
        return this.invalidPageColor;
    }

    public boolean doRenderDuringScale() {
        return this.renderDuringScale;
    }

    public PdfDocument.Meta getDocumentMeta() {
        PdfDocument pdfDocument = this.pdfDocument;
        if (pdfDocument == null) {
            return null;
        }
        return this.pdfiumCore.getDocumentMeta(pdfDocument);
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        PdfDocument pdfDocument = this.pdfDocument;
        if (pdfDocument == null) {
            return new ArrayList();
        }
        return this.pdfiumCore.getTableOfContents(pdfDocument);
    }

    public Configurator fromAsset(String str) {
        return new Configurator(new AssetSource(str));
    }

    public Configurator fromFile(File file) {
        return new Configurator(new FileSource(file));
    }

    public Configurator fromUri(Uri uri) {
        return new Configurator(new UriSource(uri));
    }

    public Configurator fromBytes(byte[] bArr) {
        return new Configurator(new ByteArraySource(bArr));
    }

    public Configurator fromStream(InputStream inputStream) {
        return new Configurator(new InputStreamSource(inputStream));
    }

    public Configurator fromSource(DocumentSource documentSource) {
        return new Configurator(documentSource);
    }

    /* loaded from: classes.dex */
    public class Configurator {
        private boolean annotationRendering;
        private boolean antialiasing;
        private int defaultPage;
        private final DocumentSource documentSource;
        private boolean enableDoubletap;
        private boolean enableSwipe;
        private int invalidPageColor;
        private OnDrawListener onDrawAllListener;
        private OnDrawListener onDrawListener;
        private OnErrorListener onErrorListener;
        private OnLoadCompleteListener onLoadCompleteListener;
        private OnPageChangeListener onPageChangeListener;
        private OnPageErrorListener onPageErrorListener;
        private OnPageScrollListener onPageScrollListener;
        private OnRenderListener onRenderListener;
        private OnTapListener onTapListener;
        private int[] pageNumbers;
        private String password;
        private ScrollHandle scrollHandle;
        private int spacing;
        private boolean swipeHorizontal;

        private Configurator(DocumentSource documentSource) {
            this.pageNumbers = null;
            this.enableSwipe = true;
            this.enableDoubletap = true;
            this.defaultPage = 0;
            this.swipeHorizontal = false;
            this.annotationRendering = false;
            this.password = null;
            this.scrollHandle = null;
            this.antialiasing = true;
            this.spacing = 0;
            this.invalidPageColor = -1;
            this.documentSource = documentSource;
        }

        public Configurator pages(int... iArr) {
            this.pageNumbers = iArr;
            return this;
        }

        public Configurator enableSwipe(boolean z) {
            this.enableSwipe = z;
            return this;
        }

        public Configurator enableDoubletap(boolean z) {
            this.enableDoubletap = z;
            return this;
        }

        public Configurator enableAnnotationRendering(boolean z) {
            this.annotationRendering = z;
            return this;
        }

        public Configurator onDraw(OnDrawListener onDrawListener) {
            this.onDrawListener = onDrawListener;
            return this;
        }

        public Configurator onDrawAll(OnDrawListener onDrawListener) {
            this.onDrawAllListener = onDrawListener;
            return this;
        }

        public Configurator onLoad(OnLoadCompleteListener onLoadCompleteListener) {
            this.onLoadCompleteListener = onLoadCompleteListener;
            return this;
        }

        public Configurator onPageScroll(OnPageScrollListener onPageScrollListener) {
            this.onPageScrollListener = onPageScrollListener;
            return this;
        }

        public Configurator onError(OnErrorListener onErrorListener) {
            this.onErrorListener = onErrorListener;
            return this;
        }

        public Configurator onPageError(OnPageErrorListener onPageErrorListener) {
            this.onPageErrorListener = onPageErrorListener;
            return this;
        }

        public Configurator onPageChange(OnPageChangeListener onPageChangeListener) {
            this.onPageChangeListener = onPageChangeListener;
            return this;
        }

        public Configurator onRender(OnRenderListener onRenderListener) {
            this.onRenderListener = onRenderListener;
            return this;
        }

        public Configurator onTap(OnTapListener onTapListener) {
            this.onTapListener = onTapListener;
            return this;
        }

        public Configurator defaultPage(int i) {
            this.defaultPage = i;
            return this;
        }

        public Configurator swipeHorizontal(boolean z) {
            this.swipeHorizontal = z;
            return this;
        }

        public Configurator password(String str) {
            this.password = str;
            return this;
        }

        public Configurator scrollHandle(ScrollHandle scrollHandle) {
            this.scrollHandle = scrollHandle;
            return this;
        }

        public Configurator enableAntialiasing(boolean z) {
            this.antialiasing = z;
            return this;
        }

        public Configurator spacing(int i) {
            this.spacing = i;
            return this;
        }

        public Configurator invalidPageColor(int i) {
            this.invalidPageColor = i;
            return this;
        }

        public void load() {
            PDFView.this.recycle();
            PDFView.this.setOnDrawListener(this.onDrawListener);
            PDFView.this.setOnDrawAllListener(this.onDrawAllListener);
            PDFView.this.setOnPageChangeListener(this.onPageChangeListener);
            PDFView.this.setOnPageScrollListener(this.onPageScrollListener);
            PDFView.this.setOnRenderListener(this.onRenderListener);
            PDFView.this.setOnTapListener(this.onTapListener);
            PDFView.this.setOnPageErrorListener(this.onPageErrorListener);
            PDFView.this.enableSwipe(this.enableSwipe);
            PDFView.this.enableDoubletap(this.enableDoubletap);
            PDFView.this.setDefaultPage(this.defaultPage);
            PDFView.this.setSwipeVertical(!this.swipeHorizontal);
            PDFView.this.enableAnnotationRendering(this.annotationRendering);
            PDFView.this.setScrollHandle(this.scrollHandle);
            PDFView.this.enableAntialiasing(this.antialiasing);
            PDFView.this.setSpacing(this.spacing);
            PDFView.this.setInvalidPageColor(this.invalidPageColor);
            PDFView.this.dragPinchManager.setSwipeVertical(PDFView.this.swipeVertical);
            PDFView.this.post(new Runnable() { // from class: com.github.barteksc.pdfviewer.PDFView.Configurator.1
                @Override // java.lang.Runnable
                public void run() {
                    if (Configurator.this.pageNumbers != null) {
                        PDFView.this.load(Configurator.this.documentSource, Configurator.this.password, Configurator.this.onLoadCompleteListener, Configurator.this.onErrorListener, Configurator.this.pageNumbers);
                    } else {
                        PDFView.this.load(Configurator.this.documentSource, Configurator.this.password, Configurator.this.onLoadCompleteListener, Configurator.this.onErrorListener);
                    }
                }
            });
        }
    }
}
