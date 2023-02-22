package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblw implements zzdwb<zzbkn> {
    private final zzdwo<zzbnl> zzeru;
    private final zzdwo<zzbob> zzesn;
    private final zzdwo<zzcvz> zzfbg;
    private final zzdwo<zzcvr> zzfes;
    private final zzdwo<String> zzfgk;

    private zzblw(zzdwo<zzcvz> zzdwoVar, zzdwo<zzcvr> zzdwoVar2, zzdwo<zzbnl> zzdwoVar3, zzdwo<zzbob> zzdwoVar4, zzdwo<String> zzdwoVar5) {
        this.zzfbg = zzdwoVar;
        this.zzfes = zzdwoVar2;
        this.zzeru = zzdwoVar3;
        this.zzesn = zzdwoVar4;
        this.zzfgk = zzdwoVar5;
    }

    public static zzblw zzb(zzdwo<zzcvz> zzdwoVar, zzdwo<zzcvr> zzdwoVar2, zzdwo<zzbnl> zzdwoVar3, zzdwo<zzbob> zzdwoVar4, zzdwo<String> zzdwoVar5) {
        return new zzblw(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbkn(this.zzfbg.get(), this.zzfes.get(), this.zzeru.get(), this.zzesn.get(), this.zzfgk.get());
    }
}
