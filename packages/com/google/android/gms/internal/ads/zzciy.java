package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzciy implements zzdwb<zzciz> {
    private final zzdwo<zzbou> zzfgr;
    private final zzdwo<zzbei> zzfka;
    private final zzdwo<zzbmk.zza> zzfkb;
    private final zzdwo<zzbpn> zzfkc;
    private final zzdwo<zzbth> zzfkd;
    private final zzdwo<zzcle> zzfzc;
    private final zzdwo<ViewGroup> zzfzd;

    public zzciy(zzdwo<zzbei> zzdwoVar, zzdwo<zzbmk.zza> zzdwoVar2, zzdwo<zzcle> zzdwoVar3, zzdwo<zzbpn> zzdwoVar4, zzdwo<zzbth> zzdwoVar5, zzdwo<zzbou> zzdwoVar6, zzdwo<ViewGroup> zzdwoVar7) {
        this.zzfka = zzdwoVar;
        this.zzfkb = zzdwoVar2;
        this.zzfzc = zzdwoVar3;
        this.zzfkc = zzdwoVar4;
        this.zzfkd = zzdwoVar5;
        this.zzfgr = zzdwoVar6;
        this.zzfzd = zzdwoVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzciz(this.zzfka.get(), this.zzfkb.get(), this.zzfzc.get(), this.zzfkc.get(), this.zzfkd.get(), this.zzfgr.get(), this.zzfzd.get());
    }
}
