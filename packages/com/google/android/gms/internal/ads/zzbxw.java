package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxw implements zzdwb<zzbxx> {
    private final zzdwo<String> zzfgk;
    private final zzdwo<zzbur> zzfkg;
    private final zzdwo<zzbuj> zzfpj;

    private zzbxw(zzdwo<String> zzdwoVar, zzdwo<zzbuj> zzdwoVar2, zzdwo<zzbur> zzdwoVar3) {
        this.zzfgk = zzdwoVar;
        this.zzfpj = zzdwoVar2;
        this.zzfkg = zzdwoVar3;
    }

    public static zzbxw zzj(zzdwo<String> zzdwoVar, zzdwo<zzbuj> zzdwoVar2, zzdwo<zzbur> zzdwoVar3) {
        return new zzbxw(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbxx(this.zzfgk.get(), this.zzfpj.get(), this.zzfkg.get());
    }
}
