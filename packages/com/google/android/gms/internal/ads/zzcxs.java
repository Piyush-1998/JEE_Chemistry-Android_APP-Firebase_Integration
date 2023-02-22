package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzcxs<E> {
    private static final zzddi<?> zzglo = zzdcy.zzah(null);
    private final ScheduledExecutorService zzfcx;
    private final zzddl zzfoa;
    private final zzcye<E> zzglp;

    public zzcxs(zzddl zzddlVar, ScheduledExecutorService scheduledExecutorService, zzcye<E> zzcyeVar) {
        this.zzfoa = zzddlVar;
        this.zzfcx = scheduledExecutorService;
        this.zzglp = zzcyeVar;
    }

    public abstract String zzv(E e);

    public final zzcxw zzu(E e) {
        return new zzcxw(this, e);
    }

    public final <I> zzcxy<I> zza(E e, zzddi<I> zzddiVar) {
        return new zzcxy<>(this, e, zzddiVar, Collections.singletonList(zzddiVar), zzddiVar);
    }

    public final zzcxu zza(E e, zzddi<?>... zzddiVarArr) {
        return new zzcxu(this, e, Arrays.asList(zzddiVarArr));
    }

    public static /* synthetic */ zzcye zzc(zzcxs zzcxsVar) {
        return zzcxsVar.zzglp;
    }
}
