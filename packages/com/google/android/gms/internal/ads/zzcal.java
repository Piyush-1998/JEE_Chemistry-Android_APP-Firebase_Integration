package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcal implements zzdwb<zzbqs<Object>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcaq> zzfcs;

    private zzcal(zzdwo<zzcaq> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfcs = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzcal zzp(zzdwo<zzcaq> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzcal(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfcs.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
