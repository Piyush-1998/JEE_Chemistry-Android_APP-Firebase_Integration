package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbtr implements zzdwb<zzbkp<zzbio>> {
    private final zzdwo<zzbou> zzfgr;
    private final zzdwo<zzbei> zzfka;
    private final zzdwo<zzbmk.zza> zzfkb;
    private final zzdwo<zzbpn> zzfkc;
    private final zzdwo<zzbth> zzfkd;

    public zzbtr(zzdwo<zzbei> zzdwoVar, zzdwo<zzbmk.zza> zzdwoVar2, zzdwo<zzbpn> zzdwoVar3, zzdwo<zzbth> zzdwoVar4, zzdwo<zzbou> zzdwoVar5) {
        this.zzfka = zzdwoVar;
        this.zzfkb = zzdwoVar2;
        this.zzfkc = zzdwoVar3;
        this.zzfkd = zzdwoVar4;
        this.zzfgr = zzdwoVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbkp) zzdwh.zza(this.zzfka.get().zzabi().zzc(this.zzfkb.get().zzafy()).zzc(this.zzfkc.get()).zzb(this.zzfkd.get()).zza(new zzcle(null)).zza(new zzbkh(this.zzfgr.get())).zzb(new zzbin(null)).zzacz().zzacy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
