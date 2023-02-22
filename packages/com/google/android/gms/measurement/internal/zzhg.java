package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhg implements Runnable {
    private final /* synthetic */ long zzba;
    private final /* synthetic */ zzgp zzpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhg(zzgp zzgpVar, long j) {
        this.zzpt = zzgpVar;
        this.zzba = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpt.zzac().zzlv.set(this.zzba);
        this.zzpt.zzab().zzgr().zza("Session timeout duration set", Long.valueOf(this.zzba));
    }
}
