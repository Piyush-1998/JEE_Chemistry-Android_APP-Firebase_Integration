package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhe implements Runnable {
    private final /* synthetic */ boolean zzaz;
    private final /* synthetic */ zzgp zzpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhe(zzgp zzgpVar, boolean z) {
        this.zzpt = zzgpVar;
        this.zzaz = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEnabled = this.zzpt.zzj.isEnabled();
        boolean zzib = this.zzpt.zzj.zzib();
        this.zzpt.zzj.zza(this.zzaz);
        if (zzib == this.zzaz) {
            this.zzpt.zzj.zzab().zzgs().zza("Default data collection state already set to", Boolean.valueOf(this.zzaz));
        }
        if (this.zzpt.zzj.isEnabled() == isEnabled || this.zzpt.zzj.isEnabled() != this.zzpt.zzj.zzib()) {
            this.zzpt.zzj.zzab().zzgp().zza("Default data collection is different than actual status", Boolean.valueOf(this.zzaz), Boolean.valueOf(isEnabled));
        }
        this.zzpt.zzil();
    }
}
