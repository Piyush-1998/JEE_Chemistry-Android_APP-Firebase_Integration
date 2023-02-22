package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblu implements zzdwb<zzbqs<zzbnj>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzbhd> zzfdd;

    private zzblu(zzdwo<zzbhd> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfdd = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzblu zze(zzdwo<zzbhd> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzblu(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
