package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsc implements zzdwb<zzbqs<zzbog>> {
    private final zzdwo<zzbsx> zzfdd;
    private final zzbrx zzfin;

    private zzbsc(zzbrx zzbrxVar, zzdwo<zzbsx> zzdwoVar) {
        this.zzfin = zzbrxVar;
        this.zzfdd = zzdwoVar;
    }

    public static zzbsc zzb(zzbrx zzbrxVar, zzdwo<zzbsx> zzdwoVar) {
        return new zzbsc(zzbrxVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
