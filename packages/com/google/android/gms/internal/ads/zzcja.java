package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcja implements zzdwb<zzcjb> {
    private final zzdwo<zzbei> zzfka;
    private final zzdwo<zzbmk.zza> zzfkb;
    private final zzdwo<zzbpn> zzfkc;
    private final zzdwo<zzcle> zzfzc;

    public zzcja(zzdwo<zzbei> zzdwoVar, zzdwo<zzbmk.zza> zzdwoVar2, zzdwo<zzcle> zzdwoVar3, zzdwo<zzbpn> zzdwoVar4) {
        this.zzfka = zzdwoVar;
        this.zzfkb = zzdwoVar2;
        this.zzfzc = zzdwoVar3;
        this.zzfkc = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcjb(this.zzfka.get(), this.zzfkb.get(), this.zzfzc.get(), this.zzfkc.get());
    }
}
