package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsi implements zzcru<zzcsf> {
    private final Executor executor;
    private final ScheduledExecutorService zzffn;
    private final zzatn zzggu;
    private final Context zzlk;

    public zzcsi(zzatn zzatnVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzggu = zzatnVar;
        this.zzlk = context;
        this.zzffn = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcsf> zzalv() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzckp)).booleanValue()) {
            final zzaxv zzaxvVar = new zzaxv();
            final zzddi<AdvertisingIdClient.Info> zzak = this.zzggu.zzak(this.zzlk);
            zzak.addListener(new Runnable(this, zzak, zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzcsh
                private final zzddi zzfoe;
                private final zzaxv zzftc;
                private final zzcsi zzggt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzggt = this;
                    this.zzfoe = zzak;
                    this.zzftc = zzaxvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzggt.zza(this.zzfoe, this.zzftc);
                }
            }, this.executor);
            this.zzffn.schedule(new Runnable(zzak) { // from class: com.google.android.gms.internal.ads.zzcsk
                private final zzddi zzfov;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfov = zzak;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfov.cancel(true);
                }
            }, ((Long) zzuv.zzon().zzd(zzza.zzckq)).longValue(), TimeUnit.MILLISECONDS);
            return zzaxvVar;
        }
        return zzdcy.zzi(new Exception("Did not ad Ad ID into query param."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzddi zzddiVar, zzaxv zzaxvVar) {
        String str;
        try {
            AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) zzddiVar.get();
            if (info == null || !TextUtils.isEmpty(info.getId())) {
                str = null;
            } else {
                zzuv.zzoj();
                str = zzawy.zzbj(this.zzlk);
            }
            zzaxvVar.set(new zzcsf(info, this.zzlk, str));
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            zzuv.zzoj();
            zzaxvVar.set(new zzcsf(null, this.zzlk, zzawy.zzbj(this.zzlk)));
        }
    }
}
