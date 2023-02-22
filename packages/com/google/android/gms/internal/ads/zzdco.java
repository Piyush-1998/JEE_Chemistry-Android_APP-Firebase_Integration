package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
abstract class zzdco<T> extends zzddh<T> {
    private final Executor zzgre;
    boolean zzgrf = true;
    private final /* synthetic */ zzdcm zzgrg;

    public zzdco(zzdcm zzdcmVar, Executor executor) {
        this.zzgrg = zzdcmVar;
        this.zzgre = (Executor) zzdaq.checkNotNull(executor);
    }

    abstract void setValue(T t);

    @Override // com.google.android.gms.internal.ads.zzddh
    final boolean isDone() {
        return this.zzgrg.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void execute() {
        try {
            this.zzgre.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.zzgrf) {
                this.zzgrg.setException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    final void zzb(T t, Throwable th) {
        if (th != null) {
            if (th instanceof ExecutionException) {
                this.zzgrg.setException(th.getCause());
                return;
            } else if (th instanceof CancellationException) {
                this.zzgrg.cancel(false);
                return;
            } else {
                this.zzgrg.setException(th);
                return;
            }
        }
        setValue(t);
    }
}
