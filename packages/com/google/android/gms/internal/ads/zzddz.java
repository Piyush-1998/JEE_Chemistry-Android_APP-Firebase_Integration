package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzddz extends zzddh<V> {
    private final Callable<V> zzgrh;
    private final /* synthetic */ zzddw zzgsg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddz(zzddw zzddwVar, Callable<V> callable) {
        this.zzgsg = zzddwVar;
        this.zzgrh = (Callable) zzdaq.checkNotNull(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    final boolean isDone() {
        return this.zzgsg.isDone();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzddh
    final V zzapg() throws Exception {
        return this.zzgrh.call();
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    final void zzb(V v, Throwable th) {
        if (th == null) {
            this.zzgsg.set(v);
        } else {
            this.zzgsg.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    final String zzaph() {
        return this.zzgrh.toString();
    }
}
