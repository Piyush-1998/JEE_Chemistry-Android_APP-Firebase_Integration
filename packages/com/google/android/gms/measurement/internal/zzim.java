package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzim implements Runnable {
    private final /* synthetic */ zzdx zzrr;
    private final /* synthetic */ zzin zzrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzim(zzin zzinVar, zzdx zzdxVar) {
        this.zzrs = zzinVar;
        this.zzrr = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzrs) {
            this.zzrs.zzrt = false;
            if (!this.zzrs.zzrd.isConnected()) {
                this.zzrs.zzrd.zzab().zzgs().zzao("Connected to service");
                this.zzrs.zzrd.zza(this.zzrr);
            }
        }
    }
}
