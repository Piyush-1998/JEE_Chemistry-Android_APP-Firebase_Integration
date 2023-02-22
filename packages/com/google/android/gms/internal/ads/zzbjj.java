package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjj implements zzdwb<zzbqs<zzpj>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzbkj> zzfdd;
    private final zzbiv zzfec;

    public zzbjj(zzbiv zzbivVar, zzdwo<zzbkj> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfec = zzbivVar;
        this.zzfdd = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
