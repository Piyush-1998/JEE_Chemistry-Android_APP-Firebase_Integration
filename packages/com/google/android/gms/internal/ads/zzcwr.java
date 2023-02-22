package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcwr implements zzdwb<zzbqs<zzbnb>> {
    private final zzdwo<zzcwu> zzfgh;
    private final zzcws zzgkv;

    private zzcwr(zzcws zzcwsVar, zzdwo<zzcwu> zzdwoVar) {
        this.zzgkv = zzcwsVar;
        this.zzfgh = zzdwoVar;
    }

    public static zzcwr zza(zzcws zzcwsVar, zzdwo<zzcwu> zzdwoVar) {
        return new zzcwr(zzcwsVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfgh.get(), zzaxn.zzdwn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
