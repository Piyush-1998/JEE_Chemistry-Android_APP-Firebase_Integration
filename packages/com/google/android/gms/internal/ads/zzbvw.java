package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvw implements zzdwb<zzbvr> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzbuz> zzetd;
    private final zzdwo<zzbyh> zzeuf;
    private final zzdwo<zzbzl> zzfno;
    private final zzdwo<zzbhx> zzfnp;

    public zzbvw(zzdwo<Context> zzdwoVar, zzdwo<zzbzl> zzdwoVar2, zzdwo<zzbyh> zzdwoVar3, zzdwo<zzbhx> zzdwoVar4, zzdwo<zzbuz> zzdwoVar5) {
        this.zzejy = zzdwoVar;
        this.zzfno = zzdwoVar2;
        this.zzeuf = zzdwoVar3;
        this.zzfnp = zzdwoVar4;
        this.zzetd = zzdwoVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbvr(this.zzejy.get(), this.zzfno.get(), this.zzeuf.get(), this.zzfnp.get(), this.zzetd.get());
    }
}
