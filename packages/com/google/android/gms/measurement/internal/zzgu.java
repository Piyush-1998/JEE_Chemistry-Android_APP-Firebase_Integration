package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgu implements Runnable {
    private final /* synthetic */ zzgk zzbc;
    private final /* synthetic */ zzgp zzpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgu(zzgp zzgpVar, zzgk zzgkVar) {
        this.zzpt = zzgpVar;
        this.zzbc = zzgkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpt.zza(this.zzbc);
    }
}
