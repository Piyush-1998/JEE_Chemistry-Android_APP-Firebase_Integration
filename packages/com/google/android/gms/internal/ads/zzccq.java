package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzccq implements zzdcz<String> {
    final /* synthetic */ zzccj zzfth;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccq(zzccj zzccjVar) {
        this.zzfth = zzccjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        long j;
        zzaxv zzaxvVar;
        synchronized (this) {
            this.zzfth.zzfsu = true;
            zzccj zzccjVar = this.zzfth;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
            j = this.zzfth.zzfsv;
            zzccjVar.zza("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzaxvVar = this.zzfth.zzfsw;
            zzaxvVar.setException(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(@Nullable String str) {
        long j;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            this.zzfth.zzfsu = true;
            zzccj zzccjVar = this.zzfth;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
            j = this.zzfth.zzfsv;
            zzccjVar.zza("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zzfth.executor;
            executor.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzcct
                private final String zzcyz;
                private final zzccq zzftm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzftm = this;
                    this.zzcyz = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzccq zzccqVar = this.zzftm;
                    zzccqVar.zzfth.zzga(this.zzcyz);
                }
            });
        }
    }
}
