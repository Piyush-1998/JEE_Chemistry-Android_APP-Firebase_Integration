package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcto implements zzcru<zzctl> {
    private ScheduledExecutorService zzffn;
    private zzanu zzgho;
    private Context zzlk;

    public zzcto(zzanu zzanuVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzgho = zzanuVar;
        this.zzffn = scheduledExecutorService;
        this.zzlk = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzctl> zzalv() {
        return zzdcy.zzb(zzdcy.zza(this.zzgho.zzr(this.zzlk), ((Long) zzuv.zzon().zzd(zzza.zzcpg)).longValue(), TimeUnit.MILLISECONDS, this.zzffn), zzctn.zzdos, zzaxn.zzdwi);
    }
}
