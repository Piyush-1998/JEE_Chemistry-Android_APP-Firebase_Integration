package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblx implements zzdwb<zzbqs<zzbog>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzbhd> zzfdd;

    private zzblx(zzdwo<zzbhd> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfdd = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzblx zzg(zzdwo<zzbhd> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzblx(zzdwoVar, zzdwoVar2);
    }

    public static zzbqs<zzbog> zza(zzbhd zzbhdVar, Executor executor) {
        return (zzbqs) zzdwh.zza(new zzbqs(zzbhdVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzfdd.get(), this.zzfck.get());
    }
}
