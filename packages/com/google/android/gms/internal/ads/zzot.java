package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzot implements Handler.Callback, Choreographer.FrameCallback {
    private static final zzot zzbiq = new zzot();
    private final Handler handler;
    public volatile long zzbip;
    private final HandlerThread zzbir;
    private Choreographer zzbis;
    private int zzbit;

    public static zzot zzja() {
        return zzbiq;
    }

    private zzot() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.zzbir = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.zzbir.getLooper(), this);
        this.handler = handler;
        handler.sendEmptyMessage(0);
    }

    public final void zzjb() {
        this.handler.sendEmptyMessage(1);
    }

    public final void zzjc() {
        this.handler.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.zzbip = j;
        this.zzbis.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.zzbis = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.zzbit + 1;
            this.zzbit = i2;
            if (i2 == 1) {
                this.zzbis.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.zzbit - 1;
            this.zzbit = i3;
            if (i3 == 0) {
                this.zzbis.removeFrameCallback(this);
                this.zzbip = 0L;
            }
            return true;
        }
    }
}
