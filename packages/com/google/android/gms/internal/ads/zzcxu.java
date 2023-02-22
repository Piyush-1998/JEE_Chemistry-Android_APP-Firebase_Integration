package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxu {
    private final E zzgll;
    private final List<zzddi<?>> zzglq;
    private final /* synthetic */ zzcxs zzglr;

    private zzcxu(zzcxs zzcxsVar, E e, List<zzddi<?>> list) {
        this.zzglr = zzcxsVar;
        this.zzgll = e;
        this.zzglq = list;
    }

    public final <O> zzcxy<O> zzb(Callable<O> callable) {
        zzddl zzddlVar;
        zzddd zzh = zzdcy.zzh(this.zzglq);
        zzddi zza = zzh.zza(zzcxt.zzgfh, zzaxn.zzdwn);
        zzcxs zzcxsVar = this.zzglr;
        E e = this.zzgll;
        List<zzddi<?>> list = this.zzglq;
        zzddlVar = zzcxsVar.zzfoa;
        return new zzcxy<>(zzcxsVar, e, zza, list, zzh.zza(callable, zzddlVar));
    }
}
