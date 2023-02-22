package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbwy implements zzdwb<zzbwq> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzbwl> zzepw;
    private final zzdwo<zzbxe> zzepy;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzdf> zzfkh;
    private final zzdwo<com.google.android.gms.ads.internal.zza> zzfox;
    private final zzdwo<zzsd> zzfoy;
    private final zzdwo<ScheduledExecutorService> zzfoz;

    public zzbwy(zzdwo<Context> zzdwoVar, zzdwo<zzbwl> zzdwoVar2, zzdwo<zzdf> zzdwoVar3, zzdwo<zzaxl> zzdwoVar4, zzdwo<com.google.android.gms.ads.internal.zza> zzdwoVar5, zzdwo<zzsd> zzdwoVar6, zzdwo<Executor> zzdwoVar7, zzdwo<zzcwe> zzdwoVar8, zzdwo<zzbxe> zzdwoVar9, zzdwo<ScheduledExecutorService> zzdwoVar10) {
        this.zzejy = zzdwoVar;
        this.zzepw = zzdwoVar2;
        this.zzfkh = zzdwoVar3;
        this.zzfan = zzdwoVar4;
        this.zzfox = zzdwoVar5;
        this.zzfoy = zzdwoVar6;
        this.zzfck = zzdwoVar7;
        this.zzfef = zzdwoVar8;
        this.zzepy = zzdwoVar9;
        this.zzfoz = zzdwoVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbwq(this.zzejy.get(), this.zzepw.get(), this.zzfkh.get(), this.zzfan.get(), this.zzfox.get(), this.zzfoy.get(), this.zzfck.get(), this.zzfef.get(), this.zzepy.get(), this.zzfoz.get());
    }
}
