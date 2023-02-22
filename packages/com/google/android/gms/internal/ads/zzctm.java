package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctm implements zzdwb<zzctk> {
    private final zzdwo<zzajk> zzeqj;
    private final zzdwo<ScheduledExecutorService> zzfoz;
    private final zzdwo<ApplicationInfo> zzfuk;
    private final zzdwo<Boolean> zzghn;

    public zzctm(zzdwo<zzajk> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<Boolean> zzdwoVar3, zzdwo<ApplicationInfo> zzdwoVar4) {
        this.zzeqj = zzdwoVar;
        this.zzfoz = zzdwoVar2;
        this.zzghn = zzdwoVar3;
        this.zzfuk = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzctk(this.zzeqj.get(), this.zzfoz.get(), this.zzghn.get().booleanValue(), this.zzfuk.get());
    }
}
