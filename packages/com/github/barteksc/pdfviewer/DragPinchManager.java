package com.github.barteksc.pdfviewer;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;
import com.github.barteksc.pdfviewer.util.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DragPinchManager implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    private AnimationManager animationManager;
    private GestureDetector gestureDetector;
    private PDFView pdfView;
    private ScaleGestureDetector scaleGestureDetector;
    private boolean swipeVertical;
    private boolean scrolling = false;
    private boolean scaling = false;
    private boolean isSwipeEnabled = false;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public DragPinchManager(PDFView pDFView, AnimationManager animationManager) {
        this.pdfView = pDFView;
        this.animationManager = animationManager;
        this.swipeVertical = pDFView.isSwipeVertical();
        this.gestureDetector = new GestureDetector(pDFView.getContext(), this);
        this.scaleGestureDetector = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    public void enableDoubletap(boolean z) {
        if (z) {
            this.gestureDetector.setOnDoubleTapListener(this);
        } else {
            this.gestureDetector.setOnDoubleTapListener(null);
        }
    }

    public boolean isZooming() {
        return this.pdfView.isZooming();
    }

    private boolean isPageChange(float f) {
        float abs = Math.abs(f);
        PDFView pDFView = this.pdfView;
        return abs > Math.abs(pDFView.toCurrentScale(this.swipeVertical ? pDFView.getOptimalPageHeight() : pDFView.getOptimalPageWidth()) / 2.0f);
    }

    public void setSwipeEnabled(boolean z) {
        this.isSwipeEnabled = z;
    }

    public void setSwipeVertical(boolean z) {
        this.swipeVertical = z;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ScrollHandle scrollHandle;
        OnTapListener onTapListener = this.pdfView.getOnTapListener();
        if ((onTapListener == null || !onTapListener.onTap(motionEvent)) && (scrollHandle = this.pdfView.getScrollHandle()) != null && !this.pdfView.documentFitsView()) {
            if (!scrollHandle.shown()) {
                scrollHandle.show();
            } else {
                scrollHandle.hide();
            }
        }
        this.pdfView.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.pdfView.getZoom() < this.pdfView.getMidZoom()) {
            this.pdfView.zoomWithAnimation(motionEvent.getX(), motionEvent.getY(), this.pdfView.getMidZoom());
            return true;
        } else if (this.pdfView.getZoom() < this.pdfView.getMaxZoom()) {
            this.pdfView.zoomWithAnimation(motionEvent.getX(), motionEvent.getY(), this.pdfView.getMaxZoom());
            return true;
        } else {
            this.pdfView.resetZoomWithAnimation();
            return true;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.animationManager.stopFling();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.scrolling = true;
        if (isZooming() || this.isSwipeEnabled) {
            this.pdfView.moveRelativeTo(-f, -f2);
        }
        if (!this.scaling || this.pdfView.doRenderDuringScale()) {
            this.pdfView.loadPageByOffset();
        }
        return true;
    }

    public void onScrollEnd(MotionEvent motionEvent) {
        this.pdfView.loadPages();
        hideHandle();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float currentScale;
        int height;
        int currentXOffset = (int) this.pdfView.getCurrentXOffset();
        int currentYOffset = (int) this.pdfView.getCurrentYOffset();
        if (this.pdfView.isSwipeVertical()) {
            PDFView pDFView = this.pdfView;
            f3 = -(pDFView.toCurrentScale(pDFView.getOptimalPageWidth()) - this.pdfView.getWidth());
            currentScale = this.pdfView.calculateDocLength();
            height = this.pdfView.getHeight();
        } else {
            f3 = -(this.pdfView.calculateDocLength() - this.pdfView.getWidth());
            PDFView pDFView2 = this.pdfView;
            currentScale = pDFView2.toCurrentScale(pDFView2.getOptimalPageHeight());
            height = this.pdfView.getHeight();
        }
        this.animationManager.startFlingAnimation(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f3, 0, (int) (-(currentScale - height)), 0);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f;
        float zoom;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom2 = this.pdfView.getZoom() * scaleFactor;
        if (zoom2 < Constants.Pinch.MINIMUM_ZOOM) {
            f = Constants.Pinch.MINIMUM_ZOOM;
            zoom = this.pdfView.getZoom();
        } else {
            if (zoom2 > Constants.Pinch.MAXIMUM_ZOOM) {
                f = Constants.Pinch.MAXIMUM_ZOOM;
                zoom = this.pdfView.getZoom();
            }
            this.pdfView.zoomCenteredRelativeTo(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
            return true;
        }
        scaleFactor = f / zoom;
        this.pdfView.zoomCenteredRelativeTo(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.scaling = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.pdfView.loadPages();
        hideHandle();
        this.scaling = false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = this.gestureDetector.onTouchEvent(motionEvent) || this.scaleGestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.scrolling) {
            this.scrolling = false;
            onScrollEnd(motionEvent);
        }
        return z;
    }

    private void hideHandle() {
        if (this.pdfView.getScrollHandle() == null || !this.pdfView.getScrollHandle().shown()) {
            return;
        }
        this.pdfView.getScrollHandle().hideDelayed();
    }
}
