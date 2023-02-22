package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyw implements zzdwb<zzbyx> {
    private final zzdwo<zzbnr> zzesa;
    private final zzdwo<zzcvr> zzfbh;

    public zzbyw(zzdwo<zzbnr> zzdwoVar, zzdwo<zzcvr> zzdwoVar2) {
        this.zzesa = zzdwoVar;
        this.zzfbh = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbyx(this.zzesa.get(), this.zzfbh.get());
    }
}
