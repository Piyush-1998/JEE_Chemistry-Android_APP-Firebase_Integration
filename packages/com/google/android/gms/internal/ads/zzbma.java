package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbma implements zzdwb<zzbqs<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzdwo<zzble> zzfdd;
    private final zzbmb zzfgn;

    private zzbma(zzbmb zzbmbVar, zzdwo<zzble> zzdwoVar) {
        this.zzfgn = zzbmbVar;
        this.zzfdd = zzdwoVar;
    }

    public static zzbma zza(zzbmb zzbmbVar, zzdwo<zzble> zzdwoVar) {
        return new zzbma(zzbmbVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
