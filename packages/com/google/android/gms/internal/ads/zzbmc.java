package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmc implements zzdwb<zzbmd> {
    private final zzdwo<zzccj> zzeks;
    private final zzdwo<zzaui> zzemh;
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<Context> zzfgo;

    private zzbmc(zzdwo<Context> zzdwoVar, zzdwo<zzcwe> zzdwoVar2, zzdwo<zzaxl> zzdwoVar3, zzdwo<zzaui> zzdwoVar4, zzdwo<zzccj> zzdwoVar5) {
        this.zzfgo = zzdwoVar;
        this.zzfef = zzdwoVar2;
        this.zzfcq = zzdwoVar3;
        this.zzemh = zzdwoVar4;
        this.zzeks = zzdwoVar5;
    }

    public static zzbmc zzc(zzdwo<Context> zzdwoVar, zzdwo<zzcwe> zzdwoVar2, zzdwo<zzaxl> zzdwoVar3, zzdwo<zzaui> zzdwoVar4, zzdwo<zzccj> zzdwoVar5) {
        return new zzbmc(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbmd(this.zzfgo.get(), this.zzfef.get(), this.zzfcq.get(), this.zzemh.get(), this.zzeks.get());
    }
}
