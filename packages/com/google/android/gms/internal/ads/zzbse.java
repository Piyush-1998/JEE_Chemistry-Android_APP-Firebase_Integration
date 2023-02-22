package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbse implements zzdwb<zzbqs<zzafb>> {
    private final zzdwo<zzbyx> zzfdd;
    private final zzbrx zzfin;

    public zzbse(zzbrx zzbrxVar, zzdwo<zzbyx> zzdwoVar) {
        this.zzfin = zzbrxVar;
        this.zzfdd = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
