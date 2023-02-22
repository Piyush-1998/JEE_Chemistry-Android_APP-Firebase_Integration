package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzio implements Runnable {
    private final /* synthetic */ zzin zzrs;
    private final /* synthetic */ zzdx zzrv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzio(zzin zzinVar, zzdx zzdxVar) {
        this.zzrs = zzinVar;
        this.zzrv = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzrs) {
            this.zzrs.zzrt = false;
            if (!this.zzrs.zzrd.isConnected()) {
                this.zzrs.zzrd.zzab().zzgr().zzao("Connected to remote service");
                this.zzrs.zzrd.zza(this.zzrv);
            }
        }
    }
}
