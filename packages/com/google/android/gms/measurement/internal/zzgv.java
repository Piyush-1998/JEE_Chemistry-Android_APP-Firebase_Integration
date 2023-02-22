package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgv implements Runnable {
    private final /* synthetic */ zzgp zzpt;
    private final /* synthetic */ long zzqf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgv(zzgp zzgpVar, long j) {
        this.zzpt = zzgpVar;
        this.zzqf = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgp zzgpVar = this.zzpt;
        long j = this.zzqf;
        zzgpVar.zzo();
        zzgpVar.zzm();
        zzgpVar.zzbi();
        zzgpVar.zzab().zzgr().zzao("Resetting analytics data (FE)");
        zzgpVar.zzv().zziz();
        if (zzgpVar.zzad().zzr(zzgpVar.zzr().zzag())) {
            zzgpVar.zzac().zzlo.set(j);
        }
        boolean isEnabled = zzgpVar.zzj.isEnabled();
        if (!zzgpVar.zzad().zzbp()) {
            zzgpVar.zzac().zzf(!isEnabled);
        }
        zzgpVar.zzs().resetAnalyticsData();
        zzgpVar.zzpz = !isEnabled;
        this.zzpt.zzs().zza(new AtomicReference<>());
    }
}
