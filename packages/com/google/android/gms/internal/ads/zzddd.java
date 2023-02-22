package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzddd<V> {
    private final boolean zzgqs;
    private final zzdbd<zzddi<? extends V>> zzgro;

    private zzddd(boolean z, zzdbd<zzddi<? extends V>> zzdbdVar) {
        this.zzgqs = false;
        this.zzgro = zzdbdVar;
    }

    public final <C> zzddi<C> zza(Callable<C> callable, Executor executor) {
        return new zzdcm(this.zzgro, this.zzgqs, executor, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzddd(boolean z, zzdbd zzdbdVar, zzddb zzddbVar) {
        this(false, zzdbdVar);
    }
}
