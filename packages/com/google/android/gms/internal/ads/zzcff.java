package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcff implements zzdwb<zzbqs<zzbog>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcfn> zzfcs;

    private zzcff(zzdwo<zzcfn> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfcs = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzcff zzah(zzdwo<zzcfn> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzcff(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfcs.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
