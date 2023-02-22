package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import android.util.Pair;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.Constants;
import com.github.barteksc.pdfviewer.util.MathUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class PagesLoader {
    private int cacheOrder;
    private float colWidth;
    private Pair<Integer, Integer> colsRows;
    private float pageRelativePartHeight;
    private float pageRelativePartWidth;
    private float partRenderHeight;
    private float partRenderWidth;
    private PDFView pdfView;
    private float rowHeight;
    private float scaledHeight;
    private float scaledSpacingPx;
    private float scaledWidth;
    private int thumbnailHeight;
    private final RectF thumbnailRect = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    private int thumbnailWidth;
    private float xOffset;
    private float yOffset;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class Holder {
        int col;
        int page;
        int row;

        private Holder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PagesLoader(PDFView pDFView) {
        this.pdfView = pDFView;
    }

    private Pair<Integer, Integer> getPageColsRows() {
        float optimalPageHeight = (Constants.PART_SIZE * (1.0f / this.pdfView.getOptimalPageHeight())) / this.pdfView.getZoom();
        return new Pair<>(Integer.valueOf(MathUtils.ceil(1.0f / ((Constants.PART_SIZE * (1.0f / this.pdfView.getOptimalPageWidth())) / this.pdfView.getZoom()))), Integer.valueOf(MathUtils.ceil(1.0f / optimalPageHeight)));
    }

    private int documentPage(int i) {
        int i2;
        if (this.pdfView.getOriginalUserPages() == null) {
            i2 = i;
        } else if (i < 0 || i >= this.pdfView.getOriginalUserPages().length) {
            return -1;
        } else {
            i2 = this.pdfView.getOriginalUserPages()[i];
        }
        if (i2 < 0 || i >= this.pdfView.getDocumentPageCount()) {
            return -1;
        }
        return i2;
    }

    private Holder getPageAndCoordsByOffset(float f, boolean z) {
        float abs;
        float f2;
        Holder holder = new Holder();
        float f3 = -MathUtils.max(f, 0.0f);
        if (this.pdfView.isSwipeVertical()) {
            holder.page = MathUtils.floor(f3 / (this.scaledHeight + this.scaledSpacingPx));
            f2 = Math.abs(f3 - ((this.scaledHeight + this.scaledSpacingPx) * holder.page)) / this.rowHeight;
            abs = this.xOffset / this.colWidth;
        } else {
            holder.page = MathUtils.floor(f3 / (this.scaledWidth + this.scaledSpacingPx));
            abs = Math.abs(f3 - ((this.scaledWidth + this.scaledSpacingPx) * holder.page)) / this.colWidth;
            f2 = this.yOffset / this.rowHeight;
        }
        if (z) {
            holder.row = MathUtils.ceil(f2);
            holder.col = MathUtils.ceil(abs);
        } else {
            holder.row = MathUtils.floor(f2);
            holder.col = MathUtils.floor(abs);
        }
        return holder;
    }

    private void loadThumbnail(int i, int i2) {
        if (this.pdfView.cacheManager.containsThumbnail(i, i2, this.thumbnailWidth, this.thumbnailHeight, this.thumbnailRect)) {
            return;
        }
        this.pdfView.renderingHandler.addRenderingTask(i, i2, this.thumbnailWidth, this.thumbnailHeight, this.thumbnailRect, true, 0, this.pdfView.isBestQuality(), this.pdfView.isAnnotationRendering());
    }

    private int loadRelative(int i, int i2, boolean z) {
        float f;
        float currentXOffset;
        int width;
        int i3 = 0;
        if (this.pdfView.isSwipeVertical()) {
            f = (this.rowHeight * i) + 1.0f;
            currentXOffset = this.pdfView.getCurrentYOffset();
            if (z) {
                width = this.pdfView.getHeight();
            }
            width = 0;
        } else {
            f = this.colWidth * i;
            currentXOffset = this.pdfView.getCurrentXOffset();
            if (z) {
                width = this.pdfView.getWidth();
            }
            width = 0;
        }
        Holder pageAndCoordsByOffset = getPageAndCoordsByOffset((currentXOffset - width) - f, false);
        int documentPage = documentPage(pageAndCoordsByOffset.page);
        if (documentPage < 0) {
            return 0;
        }
        loadThumbnail(pageAndCoordsByOffset.page, documentPage);
        if (this.pdfView.isSwipeVertical()) {
            int max = MathUtils.max(MathUtils.ceil((this.xOffset + this.pdfView.getWidth()) / this.colWidth) + 1, ((Integer) this.colsRows.first).intValue());
            for (int min = MathUtils.min(MathUtils.floor(this.xOffset / this.colWidth) - 1, 0); min <= max; min++) {
                if (loadCell(pageAndCoordsByOffset.page, documentPage, pageAndCoordsByOffset.row, min, this.pageRelativePartWidth, this.pageRelativePartHeight)) {
                    i3++;
                }
                if (i3 >= i2) {
                    return i3;
                }
            }
        } else {
            int max2 = MathUtils.max(MathUtils.ceil((this.yOffset + this.pdfView.getHeight()) / this.rowHeight) + 1, ((Integer) this.colsRows.second).intValue());
            for (int min2 = MathUtils.min(MathUtils.floor(this.yOffset / this.rowHeight) - 1, 0); min2 <= max2; min2++) {
                if (loadCell(pageAndCoordsByOffset.page, documentPage, min2, pageAndCoordsByOffset.col, this.pageRelativePartWidth, this.pageRelativePartHeight)) {
                    i3++;
                }
                if (i3 >= i2) {
                    return i3;
                }
            }
        }
        return i3;
    }

    public int loadVisible() {
        Holder pageAndCoordsByOffset;
        int i;
        int i2;
        int i3;
        if (this.pdfView.isSwipeVertical()) {
            pageAndCoordsByOffset = getPageAndCoordsByOffset(this.pdfView.getCurrentYOffset(), false);
            Holder pageAndCoordsByOffset2 = getPageAndCoordsByOffset((this.pdfView.getCurrentYOffset() - this.pdfView.getHeight()) + 1.0f, true);
            if (pageAndCoordsByOffset.page == pageAndCoordsByOffset2.page) {
                i3 = (pageAndCoordsByOffset2.row - pageAndCoordsByOffset.row) + 1;
            } else {
                int intValue = (((Integer) this.colsRows.second).intValue() - pageAndCoordsByOffset.row) + 0;
                for (int i4 = pageAndCoordsByOffset.page + 1; i4 < pageAndCoordsByOffset2.page; i4++) {
                    intValue += ((Integer) this.colsRows.second).intValue();
                }
                i3 = pageAndCoordsByOffset2.row + 1 + intValue;
            }
            i2 = 0;
            for (int i5 = 0; i5 < i3 && i2 < Constants.Cache.CACHE_SIZE; i5++) {
                i2 += loadRelative(i5, Constants.Cache.CACHE_SIZE - i2, false);
            }
        } else {
            pageAndCoordsByOffset = getPageAndCoordsByOffset(this.pdfView.getCurrentXOffset(), false);
            Holder pageAndCoordsByOffset3 = getPageAndCoordsByOffset((this.pdfView.getCurrentXOffset() - this.pdfView.getWidth()) + 1.0f, true);
            if (pageAndCoordsByOffset.page == pageAndCoordsByOffset3.page) {
                i = (pageAndCoordsByOffset3.col - pageAndCoordsByOffset.col) + 1;
            } else {
                int intValue2 = (((Integer) this.colsRows.first).intValue() - pageAndCoordsByOffset.col) + 0;
                for (int i6 = pageAndCoordsByOffset.page + 1; i6 < pageAndCoordsByOffset3.page; i6++) {
                    intValue2 += ((Integer) this.colsRows.first).intValue();
                }
                i = pageAndCoordsByOffset3.col + 1 + intValue2;
            }
            i2 = 0;
            for (int i7 = 0; i7 < i && i2 < Constants.Cache.CACHE_SIZE; i7++) {
                i2 += loadRelative(i7, Constants.Cache.CACHE_SIZE - i2, false);
            }
        }
        int documentPage = documentPage(pageAndCoordsByOffset.page - 1);
        if (documentPage >= 0) {
            loadThumbnail(pageAndCoordsByOffset.page - 1, documentPage);
        }
        int documentPage2 = documentPage(pageAndCoordsByOffset.page + 1);
        if (documentPage2 >= 0) {
            loadThumbnail(pageAndCoordsByOffset.page + 1, documentPage2);
        }
        return i2;
    }

    private boolean loadCell(int i, int i2, int i3, int i4, float f, float f2) {
        float f3 = i4 * f;
        float f4 = i3 * f2;
        float f5 = this.partRenderWidth;
        float f6 = this.partRenderHeight;
        float f7 = f3 + f > 1.0f ? 1.0f - f3 : f;
        float f8 = f4 + f2 > 1.0f ? 1.0f - f4 : f2;
        float f9 = f5 * f7;
        float f10 = f6 * f8;
        RectF rectF = new RectF(f3, f4, f7 + f3, f8 + f4);
        if (f9 <= 0.0f || f10 <= 0.0f) {
            return false;
        }
        if (!this.pdfView.cacheManager.upPartIfContained(i, i2, f9, f10, rectF, this.cacheOrder)) {
            this.pdfView.renderingHandler.addRenderingTask(i, i2, f9, f10, rectF, false, this.cacheOrder, this.pdfView.isBestQuality(), this.pdfView.isAnnotationRendering());
        }
        this.cacheOrder++;
        return true;
    }

    public void loadPages() {
        PDFView pDFView;
        PDFView pDFView2 = this.pdfView;
        this.scaledHeight = pDFView2.toCurrentScale(pDFView2.getOptimalPageHeight());
        PDFView pDFView3 = this.pdfView;
        this.scaledWidth = pDFView3.toCurrentScale(pDFView3.getOptimalPageWidth());
        this.thumbnailWidth = (int) (this.pdfView.getOptimalPageWidth() * Constants.THUMBNAIL_RATIO);
        this.thumbnailHeight = (int) (this.pdfView.getOptimalPageHeight() * Constants.THUMBNAIL_RATIO);
        this.colsRows = getPageColsRows();
        this.xOffset = -MathUtils.max(this.pdfView.getCurrentXOffset(), 0.0f);
        this.yOffset = -MathUtils.max(this.pdfView.getCurrentYOffset(), 0.0f);
        this.rowHeight = this.scaledHeight / ((Integer) this.colsRows.second).intValue();
        this.colWidth = this.scaledWidth / ((Integer) this.colsRows.first).intValue();
        this.pageRelativePartWidth = 1.0f / ((Integer) this.colsRows.first).intValue();
        this.pageRelativePartHeight = 1.0f / ((Integer) this.colsRows.second).intValue();
        this.partRenderWidth = Constants.PART_SIZE / this.pageRelativePartWidth;
        this.partRenderHeight = Constants.PART_SIZE / this.pageRelativePartHeight;
        this.cacheOrder = 1;
        float currentScale = this.pdfView.toCurrentScale(pDFView.getSpacingPx());
        this.scaledSpacingPx = currentScale;
        this.scaledSpacingPx = currentScale - (currentScale / this.pdfView.getPageCount());
        int loadVisible = loadVisible();
        if (this.pdfView.getScrollDir().equals(PDFView.ScrollDir.END)) {
            for (int i = 0; i < Constants.PRELOAD_COUNT && loadVisible < Constants.Cache.CACHE_SIZE; i++) {
                loadVisible += loadRelative(i, loadVisible, true);
            }
            return;
        }
        for (int i2 = 0; i2 > (-Constants.PRELOAD_COUNT) && loadVisible < Constants.Cache.CACHE_SIZE; i2--) {
            loadVisible += loadRelative(i2, loadVisible, false);
        }
    }
}
