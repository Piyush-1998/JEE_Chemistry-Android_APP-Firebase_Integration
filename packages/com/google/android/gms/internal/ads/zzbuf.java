package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbuf implements zzdwb<zzbqs<zzbnj>> {
    private final zzdwo<zzbvy> zzfdd;
    private final zzbtx zzfkj;

    public zzbuf(zzbtx zzbtxVar, zzdwo<zzbvy> zzdwoVar) {
        this.zzfkj = zzbtxVar;
        this.zzfdd = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
