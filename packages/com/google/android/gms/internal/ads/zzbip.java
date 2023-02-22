package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbip implements zzdwb<zzbou> {
    private final zzdwo<Clock> zzfco;
    private final zzdwo<ScheduledExecutorService> zzfdm;

    public zzbip(zzdwo<ScheduledExecutorService> zzdwoVar, zzdwo<Clock> zzdwoVar2) {
        this.zzfdm = zzdwoVar;
        this.zzfco = zzdwoVar2;
    }

    public static zzbou zza(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return (zzbou) zzdwh.zza(new zzbou(scheduledExecutorService, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzfdm.get(), this.zzfco.get());
    }
}
