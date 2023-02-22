package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcky implements zzdwb<zzcks> {
    private final zzdwo<zzddl> zzfdx;
    private final zzdwo<zzcyg> zzfek;
    private final zzdwo<zzbjn> zzfxj;
    private final zzdwo<Context> zzgas;
    private final zzdwo<zzaah> zzgat;

    public zzcky(zzdwo<Context> zzdwoVar, zzdwo<zzbjn> zzdwoVar2, zzdwo<zzcyg> zzdwoVar3, zzdwo<zzddl> zzdwoVar4, zzdwo<zzaah> zzdwoVar5) {
        this.zzgas = zzdwoVar;
        this.zzfxj = zzdwoVar2;
        this.zzfek = zzdwoVar3;
        this.zzfdx = zzdwoVar4;
        this.zzgat = zzdwoVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcks(this.zzgas.get(), this.zzfxj.get(), this.zzfek.get(), this.zzfdx.get(), this.zzgat.get());
    }
}
