package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhh implements Runnable {
    private final /* synthetic */ long zzba;
    private final /* synthetic */ zzgp zzpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(zzgp zzgpVar, long j) {
        this.zzpt = zzgpVar;
        this.zzba = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpt.zzac().zzlu.set(this.zzba);
        this.zzpt.zzab().zzgr().zza("Minimum session duration set", Long.valueOf(this.zzba));
    }
}
