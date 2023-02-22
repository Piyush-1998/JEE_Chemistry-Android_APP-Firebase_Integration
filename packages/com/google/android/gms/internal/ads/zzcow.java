package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcow implements zzdwb<zzcos> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<ScheduledExecutorService> zzfoz;

    private zzcow(zzdwo<Context> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<Executor> zzdwoVar3) {
        this.zzejy = zzdwoVar;
        this.zzfoz = zzdwoVar2;
        this.zzfck = zzdwoVar3;
    }

    public static zzcow zzo(zzdwo<Context> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<Executor> zzdwoVar3) {
        return new zzcow(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcos(this.zzejy.get(), this.zzfoz.get(), this.zzfck.get());
    }
}
