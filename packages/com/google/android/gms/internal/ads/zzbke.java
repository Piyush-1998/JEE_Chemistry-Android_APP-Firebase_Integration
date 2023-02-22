package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbke implements zzdwb<zzbkf> {
    private final zzdwo<zzcvr> zzfbh;
    private final zzdwo<zzbni> zzfew;
    private final zzdwo<zzbok> zzfex;

    private zzbke(zzdwo<zzcvr> zzdwoVar, zzdwo<zzbni> zzdwoVar2, zzdwo<zzbok> zzdwoVar3) {
        this.zzfbh = zzdwoVar;
        this.zzfew = zzdwoVar2;
        this.zzfex = zzdwoVar3;
    }

    public static zzbke zzg(zzdwo<zzcvr> zzdwoVar, zzdwo<zzbni> zzdwoVar2, zzdwo<zzbok> zzdwoVar3) {
        return new zzbke(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbkf(this.zzfbh.get(), this.zzfew.get(), this.zzfex.get());
    }
}
