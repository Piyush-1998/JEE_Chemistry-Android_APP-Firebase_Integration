package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzccg implements zzdwb<zzcch> {
    private final zzdwo<zzbei> zzejx;
    private final zzdwo<zzcbv> zzfrj;

    private zzccg(zzdwo<zzcbv> zzdwoVar, zzdwo<zzbei> zzdwoVar2) {
        this.zzfrj = zzdwoVar;
        this.zzejx = zzdwoVar2;
    }

    public static zzccg zzz(zzdwo<zzcbv> zzdwoVar, zzdwo<zzbei> zzdwoVar2) {
        return new zzccg(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcch(this.zzfrj.get(), this.zzejx.get());
    }
}
