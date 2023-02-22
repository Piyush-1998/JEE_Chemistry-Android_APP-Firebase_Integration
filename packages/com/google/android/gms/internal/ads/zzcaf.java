package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcaf implements zzdwb<zzbqs<zzbnm>> {
    private final zzdwo<zzcaa> zzfdd;
    private final zzcac zzfra;

    private zzcaf(zzcac zzcacVar, zzdwo<zzcaa> zzdwoVar) {
        this.zzfra = zzcacVar;
        this.zzfdd = zzdwoVar;
    }

    public static zzcaf zza(zzcac zzcacVar, zzdwo<zzcaa> zzdwoVar) {
        return new zzcaf(zzcacVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), zzaxn.zzdwm), "Cannot return null from a non-@Nullable @Provides method");
    }
}
