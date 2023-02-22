package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbkr<AdT> implements zzdwb<zzbko<AdT>> {
    private final zzdwo<Map<String, zzcga<AdT>>> zzffl;

    private zzbkr(zzdwo<Map<String, zzcga<AdT>>> zzdwoVar) {
        this.zzffl = zzdwoVar;
    }

    public static <AdT> zzbkr<AdT> zzd(zzdwo<Map<String, zzcga<AdT>>> zzdwoVar) {
        return new zzbkr<>(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbko(this.zzffl.get());
    }
}
