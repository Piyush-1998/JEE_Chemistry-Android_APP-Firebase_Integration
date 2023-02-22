package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsf implements zzdwb<zzbqs<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzdwo<zzbsx> zzfdd;
    private final zzbrx zzfin;

    private zzbsf(zzbrx zzbrxVar, zzdwo<zzbsx> zzdwoVar) {
        this.zzfin = zzbrxVar;
        this.zzfdd = zzdwoVar;
    }

    public static zzbsf zzc(zzbrx zzbrxVar, zzdwo<zzbsx> zzdwoVar) {
        return new zzbsf(zzbrxVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
