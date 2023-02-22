package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhc implements zzdwb<zzbhd> {
    private final zzdwo<zzcyp> zzepi;
    private final zzdwo<zzcvz> zzfbg;
    private final zzdwo<zzcvr> zzfbh;

    private zzbhc(zzdwo<zzcvz> zzdwoVar, zzdwo<zzcvr> zzdwoVar2, zzdwo<zzcyp> zzdwoVar3) {
        this.zzfbg = zzdwoVar;
        this.zzfbh = zzdwoVar2;
        this.zzepi = zzdwoVar3;
    }

    public static zzbhc zza(zzdwo<zzcvz> zzdwoVar, zzdwo<zzcvr> zzdwoVar2, zzdwo<zzcyp> zzdwoVar3) {
        return new zzbhc(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbhd(this.zzfbg.get(), this.zzfbh.get(), this.zzepi.get());
    }
}
