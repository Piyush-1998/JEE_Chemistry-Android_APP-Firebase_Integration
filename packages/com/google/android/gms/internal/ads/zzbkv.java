package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbkv {
    private final Executor executor;
    private volatile boolean zzadc = true;
    private final ScheduledExecutorService zzffn;
    private final zzddi<zzbkq> zzffo;

    public zzbkv(Executor executor, ScheduledExecutorService scheduledExecutorService, zzddi<zzbkq> zzddiVar) {
        this.executor = executor;
        this.zzffn = scheduledExecutorService;
        this.zzffo = zzddiVar;
    }

    public final void zza(zzdcz<zzbkk> zzdczVar) {
        zzdcy.zza(this.zzffo, new zzbky(this, zzdczVar), this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(List<? extends zzddi<? extends zzbkk>> list, final zzdcz<zzbkk> zzdczVar) {
        if (list == null || list.isEmpty()) {
            this.executor.execute(new Runnable(zzdczVar) { // from class: com.google.android.gms.internal.ads.zzbku
                private final zzdcz zzffm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzffm = zzdczVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzffm.zzb(new zzccu(3));
                }
            });
            return;
        }
        zzddi zzah = zzdcy.zzah(null);
        for (final zzddi<? extends zzbkk> zzddiVar : list) {
            zzah = zzdcy.zzb(zzdcy.zzb(zzah, Throwable.class, new zzdcj(zzdczVar) { // from class: com.google.android.gms.internal.ads.zzbkx
                private final zzdcz zzffm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzffm = zzdczVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdcj
                public final zzddi zzf(Object obj) {
                    this.zzffm.zzb((Throwable) obj);
                    return zzdcy.zzah(null);
                }
            }, this.executor), new zzdcj(this, zzdczVar, zzddiVar) { // from class: com.google.android.gms.internal.ads.zzbkw
                private final zzbkv zzffp;
                private final zzdcz zzffq;
                private final zzddi zzffr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzffp = this;
                    this.zzffq = zzdczVar;
                    this.zzffr = zzddiVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdcj
                public final zzddi zzf(Object obj) {
                    return this.zzffp.zza(this.zzffq, this.zzffr, (zzbkk) obj);
                }
            }, this.executor);
        }
        zzdcy.zza(zzah, new zzblb(this, zzdczVar), this.executor);
    }

    public final boolean isLoading() {
        return this.zzadc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzafn() {
        zzaxn.zzdwm.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbkz
            private final zzbkv zzffp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzffp = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzffp.zzafo();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzafo() {
        this.zzadc = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(zzdcz zzdczVar, zzddi zzddiVar, zzbkk zzbkkVar) throws Exception {
        if (zzbkkVar != null) {
            zzdczVar.onSuccess(zzbkkVar);
        }
        return zzdcy.zza(zzddiVar, ((Long) zzuv.zzon().zzd(zzza.zzcmn)).longValue(), TimeUnit.MILLISECONDS, this.zzffn);
    }
}
