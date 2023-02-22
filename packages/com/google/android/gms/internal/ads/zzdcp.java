package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdcp extends zzdco<V> {
    private final /* synthetic */ zzdcm zzgrg;
    private final Callable<V> zzgrh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdcp(zzdcm zzdcmVar, Callable<V> callable, Executor executor) {
        super(zzdcmVar, executor);
        this.zzgrg = zzdcmVar;
        this.zzgrh = (Callable) zzdaq.checkNotNull(callable);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [V, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzddh
    final V zzapg() throws Exception {
        this.zzgrf = false;
        return this.zzgrh.call();
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    final void setValue(V v) {
        this.zzgrg.set(v);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    final String zzaph() {
        return this.zzgrh.toString();
    }
}
