package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbme implements zzdwb<zzbqs<zzbpc>> {
    private final zzdwo<zzbmd> zzfcs;
    private final zzbmf zzfgp;

    private zzbme(zzbmf zzbmfVar, zzdwo<zzbmd> zzdwoVar) {
        this.zzfgp = zzbmfVar;
        this.zzfcs = zzdwoVar;
    }

    public static zzbme zza(zzbmf zzbmfVar, zzdwo<zzbmd> zzdwoVar) {
        return new zzbme(zzbmfVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfcs.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
