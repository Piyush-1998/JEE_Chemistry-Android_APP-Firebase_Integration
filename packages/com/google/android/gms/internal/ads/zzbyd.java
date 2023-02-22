package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyd implements zzdwb<zzbyb> {
    private final zzdwo<zzbvj> zzeti;
    private final zzdwo<Context> zzfgo;
    private final zzdwo<zzbur> zzfkg;
    private final zzdwo<zzbuj> zzfpj;

    private zzbyd(zzdwo<Context> zzdwoVar, zzdwo<zzbur> zzdwoVar2, zzdwo<zzbvj> zzdwoVar3, zzdwo<zzbuj> zzdwoVar4) {
        this.zzfgo = zzdwoVar;
        this.zzfkg = zzdwoVar2;
        this.zzeti = zzdwoVar3;
        this.zzfpj = zzdwoVar4;
    }

    public static zzbyd zzb(zzdwo<Context> zzdwoVar, zzdwo<zzbur> zzdwoVar2, zzdwo<zzbvj> zzdwoVar3, zzdwo<zzbuj> zzdwoVar4) {
        return new zzbyd(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbyb(this.zzfgo.get(), this.zzfkg.get(), this.zzeti.get(), this.zzfpj.get());
    }
}
