package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmp implements zzdwb<String> {
    private final zzdwo<zzblr> zzelz;
    private final zzbmk zzfgv;

    private zzbmp(zzbmk zzbmkVar, zzdwo<zzblr> zzdwoVar) {
        this.zzfgv = zzbmkVar;
        this.zzelz = zzdwoVar;
    }

    public static zzbmp zzb(zzbmk zzbmkVar, zzdwo<zzblr> zzdwoVar) {
        return new zzbmp(zzbmkVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (String) zzdwh.zza(this.zzelz.get().zzua(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
