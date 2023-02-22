package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclz implements zzdwb<zzclw> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzuy> zzgbs;
    private final zzdwo<zzbio> zzgbt;

    public zzclz(zzdwo<Context> zzdwoVar, zzdwo<zzuy> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3, zzdwo<zzbio> zzdwoVar4) {
        this.zzejy = zzdwoVar;
        this.zzgbs = zzdwoVar2;
        this.zzfef = zzdwoVar3;
        this.zzgbt = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzclw(this.zzejy.get(), this.zzgbs.get(), this.zzfef.get(), this.zzgbt.get());
    }
}
