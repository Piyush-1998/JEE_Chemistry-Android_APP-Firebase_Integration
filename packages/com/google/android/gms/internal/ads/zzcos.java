package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcos implements zzcru<zzcop> {
    private final Executor executor;
    private final ScheduledExecutorService zzffn;
    private final Context zzlk;

    public zzcos(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzlk = context;
        this.zzffn = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcop> zzalv() {
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcth)).booleanValue()) {
            return zzdcy.zzah(null);
        }
        final zzaxv zzaxvVar = new zzaxv();
        try {
            new zzdah(zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzcor
                private final zzaxv zzbrt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbrt = zzaxvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdah
                public final void zzbc(boolean z) {
                    this.zzbrt.set(false);
                }
            }.zzbc(false);
        } catch (Throwable unused) {
            zzaug.zzes("ArCoreApk is not ready.");
            zzaxvVar.set(false);
        }
        return zzdcy.zzb(zzdcy.zzb(zzdcy.zza(zzaxvVar, 200L, TimeUnit.MILLISECONDS, this.zzffn), new zzdal(this) { // from class: com.google.android.gms.internal.ads.zzcou
            private final zzcos zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj) {
                return new zzcop(false, false, ((Boolean) obj).booleanValue());
            }
        }, this.executor), Throwable.class, zzcot.zzbkv, this.executor);
    }
}
