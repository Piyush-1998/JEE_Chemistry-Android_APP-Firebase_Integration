package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsj implements zzdwb<zzcsi> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzatn> zzeqj;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<ScheduledExecutorService> zzfoz;

    public zzcsj(zzdwo<zzatn> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<ScheduledExecutorService> zzdwoVar3, zzdwo<Executor> zzdwoVar4) {
        this.zzeqj = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfoz = zzdwoVar3;
        this.zzfck = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcsi(this.zzeqj.get(), this.zzejy.get(), this.zzfoz.get(), this.zzfck.get());
    }
}
