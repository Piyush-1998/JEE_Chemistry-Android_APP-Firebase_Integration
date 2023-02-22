package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjc implements zzdwb<zzcjd> {
    private final zzdwo<zzbei> zzfka;
    private final zzdwo<zzbmk.zza> zzfkb;
    private final zzdwo<zzbpn> zzfkc;

    public zzcjc(zzdwo<zzbei> zzdwoVar, zzdwo<zzbmk.zza> zzdwoVar2, zzdwo<zzbpn> zzdwoVar3) {
        this.zzfka = zzdwoVar;
        this.zzfkb = zzdwoVar2;
        this.zzfkc = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcjd(this.zzfka.get(), this.zzfkb.get(), this.zzfkc.get());
    }
}
