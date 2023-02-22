package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbzz implements zzdwb<zzbzl> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzbou> zzfeg;
    private final zzdwo<zzdf> zzfkh;
    private final zzdwo<zzsd> zzfoy;
    private final zzdwo<zzbcb> zzfqe;
    private final zzdwo<com.google.android.gms.ads.internal.zza> zzfqv;
    private final zzdwo<zzbrq> zzfqw;

    private zzbzz(zzdwo<zzbcb> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3, zzdwo<zzdf> zzdwoVar4, zzdwo<zzaxl> zzdwoVar5, zzdwo<com.google.android.gms.ads.internal.zza> zzdwoVar6, zzdwo<zzsd> zzdwoVar7, zzdwo<zzbou> zzdwoVar8, zzdwo<zzbrq> zzdwoVar9) {
        this.zzfqe = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfef = zzdwoVar3;
        this.zzfkh = zzdwoVar4;
        this.zzfan = zzdwoVar5;
        this.zzfqv = zzdwoVar6;
        this.zzfoy = zzdwoVar7;
        this.zzfeg = zzdwoVar8;
        this.zzfqw = zzdwoVar9;
    }

    public static zzbzz zzb(zzdwo<zzbcb> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3, zzdwo<zzdf> zzdwoVar4, zzdwo<zzaxl> zzdwoVar5, zzdwo<com.google.android.gms.ads.internal.zza> zzdwoVar6, zzdwo<zzsd> zzdwoVar7, zzdwo<zzbou> zzdwoVar8, zzdwo<zzbrq> zzdwoVar9) {
        return new zzbzz(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5, zzdwoVar6, zzdwoVar7, zzdwoVar8, zzdwoVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbzl(this.zzfqe.get(), this.zzejy.get(), this.zzfef.get(), this.zzfkh.get(), this.zzfan.get(), this.zzfqv.get(), this.zzfoy.get(), this.zzfeg.get(), this.zzfqw.get());
    }
}
