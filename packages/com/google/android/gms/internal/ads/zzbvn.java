package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvn implements zzdwb<zzbvj> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaui> zzemh;
    private final zzdwo<zzbuv> zzete;
    private final zzdwo<zzbvr> zzetf;
    private final zzdwo<zzbup> zzeth;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzbur> zzfkg;

    private zzbvn(zzdwo<Context> zzdwoVar, zzdwo<zzaui> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3, zzdwo<zzbuv> zzdwoVar4, zzdwo<zzbur> zzdwoVar5, zzdwo<zzbvr> zzdwoVar6, zzdwo<Executor> zzdwoVar7, zzdwo<Executor> zzdwoVar8, zzdwo<zzbup> zzdwoVar9) {
        this.zzejy = zzdwoVar;
        this.zzemh = zzdwoVar2;
        this.zzfef = zzdwoVar3;
        this.zzete = zzdwoVar4;
        this.zzfkg = zzdwoVar5;
        this.zzetf = zzdwoVar6;
        this.zzfdx = zzdwoVar7;
        this.zzfck = zzdwoVar8;
        this.zzeth = zzdwoVar9;
    }

    public static zzbvn zza(zzdwo<Context> zzdwoVar, zzdwo<zzaui> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3, zzdwo<zzbuv> zzdwoVar4, zzdwo<zzbur> zzdwoVar5, zzdwo<zzbvr> zzdwoVar6, zzdwo<Executor> zzdwoVar7, zzdwo<Executor> zzdwoVar8, zzdwo<zzbup> zzdwoVar9) {
        return new zzbvn(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5, zzdwoVar6, zzdwoVar7, zzdwoVar8, zzdwoVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbvj(this.zzejy.get(), this.zzemh.get(), this.zzfef.get(), this.zzete.get(), this.zzfkg.get(), this.zzetf.get(), this.zzfdx.get(), this.zzfck.get(), this.zzeth.get());
    }
}
