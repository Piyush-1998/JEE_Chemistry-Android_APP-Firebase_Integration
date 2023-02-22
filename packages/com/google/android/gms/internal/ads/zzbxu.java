package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxu implements zzdwb<zzbxs> {
    private final zzdwo<zzbur> zzfkg;
    private final zzdwo<zzbuj> zzfpj;

    private zzbxu(zzdwo<zzbuj> zzdwoVar, zzdwo<zzbur> zzdwoVar2) {
        this.zzfpj = zzdwoVar;
        this.zzfkg = zzdwoVar2;
    }

    public static zzbxu zzk(zzdwo<zzbuj> zzdwoVar, zzdwo<zzbur> zzdwoVar2) {
        return new zzbxu(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbxs(this.zzfpj.get(), this.zzfkg.get());
    }
}
