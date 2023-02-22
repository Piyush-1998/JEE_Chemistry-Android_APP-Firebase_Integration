package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzccv implements zzdwb<zzccj> {
    private final zzdwo<zzchm> zzejw;
    private final zzdwo<zzcbt> zzekr;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<ScheduledExecutorService> zzfoz;
    private final zzdwo<Context> zzftn;
    private final zzdwo<WeakReference<Context>> zzfto;

    public zzccv(zzdwo<Executor> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<WeakReference<Context>> zzdwoVar3, zzdwo<Executor> zzdwoVar4, zzdwo<zzchm> zzdwoVar5, zzdwo<ScheduledExecutorService> zzdwoVar6, zzdwo<zzcbt> zzdwoVar7, zzdwo<zzaxl> zzdwoVar8) {
        this.zzfdx = zzdwoVar;
        this.zzftn = zzdwoVar2;
        this.zzfto = zzdwoVar3;
        this.zzfck = zzdwoVar4;
        this.zzejw = zzdwoVar5;
        this.zzfoz = zzdwoVar6;
        this.zzekr = zzdwoVar7;
        this.zzfcq = zzdwoVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzccj(this.zzfdx.get(), this.zzftn.get(), this.zzfto.get(), this.zzfck.get(), this.zzejw.get(), this.zzfoz.get(), this.zzekr.get(), this.zzfcq.get());
    }
}
