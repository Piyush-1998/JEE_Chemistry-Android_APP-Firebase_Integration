package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcix implements zzdwb<zzciu> {
    private final zzdwo<zzbei> zzfka;
    private final zzdwo<zzbmk.zza> zzfkb;
    private final zzdwo<zzbpn> zzfkc;
    private final zzdwo<zzbth> zzfkd;

    public zzcix(zzdwo<zzbei> zzdwoVar, zzdwo<zzbth> zzdwoVar2, zzdwo<zzbmk.zza> zzdwoVar3, zzdwo<zzbpn> zzdwoVar4) {
        this.zzfka = zzdwoVar;
        this.zzfkd = zzdwoVar2;
        this.zzfkb = zzdwoVar3;
        this.zzfkc = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzciu(this.zzfka.get(), this.zzfkd.get(), this.zzfkb.get(), this.zzfkc.get());
    }
}
