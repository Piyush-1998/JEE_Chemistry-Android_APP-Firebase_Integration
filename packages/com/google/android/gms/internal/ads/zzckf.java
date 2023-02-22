package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzckf implements zzdwb<zzcju> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzbzl> zzfno;
    private final zzdwo<zzbzc> zzfxj;

    public zzckf(zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3, zzdwo<Executor> zzdwoVar4, zzdwo<zzbzc> zzdwoVar5, zzdwo<zzbzl> zzdwoVar6) {
        this.zzejy = zzdwoVar;
        this.zzfcq = zzdwoVar2;
        this.zzfef = zzdwoVar3;
        this.zzfdx = zzdwoVar4;
        this.zzfxj = zzdwoVar5;
        this.zzfno = zzdwoVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcju(this.zzejy.get(), this.zzfcq.get(), this.zzfef.get(), this.zzfdx.get(), this.zzfxj.get(), this.zzfno.get());
    }
}
