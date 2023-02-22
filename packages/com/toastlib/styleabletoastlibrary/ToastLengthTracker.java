package com.muddzdev.styleabletoastlibrary;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public class ToastLengthTracker {
    private static final int EXTRA_DELAY = 500;
    private int length;
    private OnToastFinishedListener onToastFinishedListener;

    public ToastLengthTracker(int i, OnToastFinishedListener onToastFinishedListener) {
        this.length = i;
        this.onToastFinishedListener = onToastFinishedListener;
    }

    public void trackToastLength() {
        new CountDownTimer(this.length + EXTRA_DELAY, 1000L) { // from class: com.muddzdev.styleabletoastlibrary.ToastLengthTracker.1
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (ToastLengthTracker.this.onToastFinishedListener != null) {
                    ToastLengthTracker.this.onToastFinishedListener.onToastFinished();
                }
            }
        }.start();
    }
}
