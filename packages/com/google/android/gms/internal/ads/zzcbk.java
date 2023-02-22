package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbk implements zzdwb<zzcbl> {
    private final zzdwo<zzcbo> zzekq;

    private zzcbk(zzdwo<zzcbo> zzdwoVar) {
        this.zzekq = zzdwoVar;
    }

    public static zzcbk zzz(zzdwo<zzcbo> zzdwoVar) {
        return new zzcbk(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcbl(this.zzekq.get());
    }
}
