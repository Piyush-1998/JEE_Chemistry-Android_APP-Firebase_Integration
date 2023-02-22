package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcrr;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqq<S extends zzcrr<?>> implements zzcru<S> {
    private final ScheduledExecutorService zzfcx;
    private final zzcru<S> zzgey;
    private final long zzgfn;

    public zzcqq(zzcru<S> zzcruVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zzgey = zzcruVar;
        this.zzgfn = j;
        this.zzfcx = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<S> zzalv() {
        zzddi<S> zzalv = this.zzgey.zzalv();
        long j = this.zzgfn;
        if (j > 0) {
            zzalv = zzdcy.zza(zzalv, j, TimeUnit.MILLISECONDS, this.zzfcx);
        }
        return zzdcy.zzb(zzalv, Throwable.class, zzcqp.zzbkv, zzaxn.zzdwn);
    }
}
