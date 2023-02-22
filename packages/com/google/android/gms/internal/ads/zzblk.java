package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblk implements zzdwb<zzbqs<zzbna>> {
    private final zzbli zzfgg;
    private final zzdwo<zzblr> zzfgh;

    private zzblk(zzbli zzbliVar, zzdwo<zzblr> zzdwoVar) {
        this.zzfgg = zzbliVar;
        this.zzfgh = zzdwoVar;
    }

    public static zzblk zza(zzbli zzbliVar, zzdwo<zzblr> zzdwoVar) {
        return new zzblk(zzbliVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfgh.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
