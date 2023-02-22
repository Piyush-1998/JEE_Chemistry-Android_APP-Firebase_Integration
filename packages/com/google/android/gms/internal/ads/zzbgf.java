package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgf implements zzdwb<zzbga> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzchm> zzekh;
    private final zzdwo<zzccj> zzeks;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<zzcge<zzcwm, zzchn>> zzfao;
    private final zzdwo<zzclr> zzfap;
    private final zzdwo<zzasl> zzfaq;

    public zzbgf(zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzchm> zzdwoVar3, zzdwo<zzcge<zzcwm, zzchn>> zzdwoVar4, zzdwo<zzclr> zzdwoVar5, zzdwo<zzccj> zzdwoVar6, zzdwo<zzasl> zzdwoVar7) {
        this.zzejy = zzdwoVar;
        this.zzfan = zzdwoVar2;
        this.zzekh = zzdwoVar3;
        this.zzfao = zzdwoVar4;
        this.zzfap = zzdwoVar5;
        this.zzeks = zzdwoVar6;
        this.zzfaq = zzdwoVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbga(this.zzejy.get(), this.zzfan.get(), this.zzekh.get(), this.zzfao.get(), this.zzfap.get(), this.zzeks.get(), this.zzfaq.get());
    }
}
