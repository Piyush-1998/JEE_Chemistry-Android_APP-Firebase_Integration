package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxw {
    private final E zzgll;
    private final /* synthetic */ zzcxs zzglr;

    private zzcxw(zzcxs zzcxsVar, E e) {
        this.zzglr = zzcxsVar;
        this.zzgll = e;
    }

    public final <O> zzcxy<O> zzb(zzddi<O> zzddiVar) {
        zzddi zzddiVar2;
        zzcxs zzcxsVar = this.zzglr;
        E e = this.zzgll;
        zzddiVar2 = zzcxs.zzglo;
        return new zzcxy<>(zzcxsVar, e, zzddiVar2, Collections.emptyList(), zzddiVar);
    }

    public final <O> zzcxy<O> zzc(Callable<O> callable) {
        zzddl zzddlVar;
        zzddlVar = this.zzglr.zzfoa;
        return zza(callable, zzddlVar);
    }

    private final <O> zzcxy<O> zza(Callable<O> callable, zzddl zzddlVar) {
        zzddi zzddiVar;
        zzcxs zzcxsVar = this.zzglr;
        E e = this.zzgll;
        zzddiVar = zzcxs.zzglo;
        return new zzcxy<>(zzcxsVar, e, zzddiVar, Collections.emptyList(), zzddlVar.zzd(callable));
    }

    public final zzcxy<?> zza(final zzcxq zzcxqVar, zzddl zzddlVar) {
        return zza(new Callable(zzcxqVar) { // from class: com.google.android.gms.internal.ads.zzcxv
            private final zzcxq zzgls;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgls = zzcxqVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.zzgls.run();
                return null;
            }
        }, zzddlVar);
    }
}
