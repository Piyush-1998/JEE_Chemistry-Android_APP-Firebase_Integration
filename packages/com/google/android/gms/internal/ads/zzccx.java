package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzccx {
    private final zzddl zzfoa;
    private final zzddl zzftr;
    private final zzcea zzfts;
    private final zzdvv<zzcen> zzftt;

    public zzccx(zzddl zzddlVar, zzddl zzddlVar2, zzcea zzceaVar, zzdvv<zzcen> zzdvvVar) {
        this.zzftr = zzddlVar;
        this.zzfoa = zzddlVar2;
        this.zzfts = zzceaVar;
        this.zzftt = zzdvvVar;
    }

    public final zzddi<InputStream> zzc(final zzape zzapeVar) {
        final zzddi<InputStream> zzf;
        String str = zzapeVar.packageName;
        com.google.android.gms.ads.internal.zzq.zzkj();
        if (zzaul.zzeh(str)) {
            zzf = zzdcy.zzi(new zzcel(0));
        } else {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcrr)).booleanValue()) {
                zzf = zzdcy.zzb(this.zzftr.zzd(new Callable(this, zzapeVar) { // from class: com.google.android.gms.internal.ads.zzccw
                    private final zzccx zzftp;
                    private final zzape zzftq;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzftp = this;
                        this.zzftq = zzapeVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzftp.zzd(this.zzftq);
                    }
                }), ExecutionException.class, zzccz.zzbkv, this.zzfoa);
            } else {
                zzf = this.zzfts.zzf(zzapeVar);
            }
        }
        zzddi<InputStream> zzb = zzdcy.zzb(zzf, zzcel.class, new zzdcj(this, zzapeVar) { // from class: com.google.android.gms.internal.ads.zzccy
            private final zzccx zzftp;
            private final zzape zzftq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftp = this;
                this.zzftq = zzapeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzftp.zza(this.zzftq, (zzcel) obj);
            }
        }, this.zzfoa);
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcrr)).booleanValue()) {
            zzb.addListener(new Runnable(zzf) { // from class: com.google.android.gms.internal.ads.zzcdb
                private final zzddi zzfov;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfov = zzf;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfov.cancel(true);
                }
            }, zzaxn.zzdwn);
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(zzape zzapeVar, zzcel zzcelVar) throws Exception {
        return this.zzftt.get().zzh(zzapeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzd(zzape zzapeVar) throws Exception {
        return this.zzfts.zzf(zzapeVar).get(((Integer) zzuv.zzon().zzd(zzza.zzcrq)).intValue(), TimeUnit.SECONDS);
    }
}
