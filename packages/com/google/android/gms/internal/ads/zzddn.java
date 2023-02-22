package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzddn implements Executor {
    boolean zzgrv = true;
    private final /* synthetic */ Executor zzgrw;
    private final /* synthetic */ zzdby zzgrx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddn(Executor executor, zzdby zzdbyVar) {
        this.zzgrw = executor;
        this.zzgrx = zzdbyVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zzgrw.execute(new zzddm(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.zzgrv) {
                this.zzgrx.setException(e);
            }
        }
    }
}
