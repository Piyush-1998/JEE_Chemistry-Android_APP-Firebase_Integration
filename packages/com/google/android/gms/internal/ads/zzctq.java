package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctq implements zzdwb<zzcto> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzanu> zzeqj;
    private final zzdwo<ScheduledExecutorService> zzfoz;

    public zzctq(zzdwo<zzanu> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<Context> zzdwoVar3) {
        this.zzeqj = zzdwoVar;
        this.zzfoz = zzdwoVar2;
        this.zzejy = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcto(this.zzeqj.get(), this.zzfoz.get(), this.zzejy.get());
    }
}
