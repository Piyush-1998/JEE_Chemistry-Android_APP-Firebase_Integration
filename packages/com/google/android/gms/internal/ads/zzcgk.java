package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcgk implements zzdwb<zzcgg> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzbzl> zzfno;
    private final zzdwo<zzbie> zzfxj;

    public zzcgk(zzdwo<zzbie> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<Executor> zzdwoVar3, zzdwo<zzbzl> zzdwoVar4, zzdwo<zzcwe> zzdwoVar5) {
        this.zzfxj = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfdx = zzdwoVar3;
        this.zzfno = zzdwoVar4;
        this.zzfef = zzdwoVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcgg(this.zzfxj.get(), this.zzejy.get(), this.zzfdx.get(), this.zzfno.get(), this.zzfef.get());
    }
}
