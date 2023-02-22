package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzaa {
    private static volatile Handler handler;
    private final zzgh zzev;
    private final Runnable zzew;
    private volatile long zzex;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzgh zzghVar) {
        Preconditions.checkNotNull(zzghVar);
        this.zzev = zzghVar;
        this.zzew = new zzad(this, zzghVar);
    }

    public abstract void run();

    public final void zzv(long j) {
        cancel();
        if (j >= 0) {
            this.zzex = this.zzev.zzx().currentTimeMillis();
            if (getHandler().postDelayed(this.zzew, j)) {
                return;
            }
            this.zzev.zzab().zzgk().zza("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean zzcp() {
        return this.zzex != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void cancel() {
        this.zzex = 0L;
        getHandler().removeCallbacks(this.zzew);
    }

    private final Handler getHandler() {
        Handler handler2;
        if (handler != null) {
            return handler;
        }
        synchronized (zzaa.class) {
            if (handler == null) {
                handler = new com.google.android.gms.internal.measurement.zzh(this.zzev.getContext().getMainLooper());
            }
            handler2 = handler;
        }
        return handler2;
    }
}
