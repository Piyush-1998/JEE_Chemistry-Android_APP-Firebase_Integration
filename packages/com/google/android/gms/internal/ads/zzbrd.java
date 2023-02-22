package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbrd implements zzdwb<zzbra> {
    private final zzdwo<zzcyp> zzepi;
    private final zzdwo<zzcvr> zzfbh;

    private zzbrd(zzdwo<zzcvr> zzdwoVar, zzdwo<zzcyp> zzdwoVar2) {
        this.zzfbh = zzdwoVar;
        this.zzepi = zzdwoVar2;
    }

    public static zzbrd zzh(zzdwo<zzcvr> zzdwoVar, zzdwo<zzcyp> zzdwoVar2) {
        return new zzbrd(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbra(this.zzfbh.get(), this.zzepi.get());
    }
}
