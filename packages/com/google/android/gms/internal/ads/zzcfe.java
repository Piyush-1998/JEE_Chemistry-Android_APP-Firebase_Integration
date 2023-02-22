package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfe implements zzdwb<zzbqs<zzcym>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcfr> zzfcs;

    private zzcfe(zzdwo<zzcfr> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfcs = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzcfe zzag(zzdwo<zzcfr> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzcfe(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfcs.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
