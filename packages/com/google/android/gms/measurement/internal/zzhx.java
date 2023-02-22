package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhx implements Runnable {
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzjn zzpi;
    private final /* synthetic */ zzhv zzrd;
    private final /* synthetic */ boolean zzrm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhx(zzhv zzhvVar, boolean z, zzjn zzjnVar, zzn zznVar) {
        this.zzrd = zzhvVar;
        this.zzrm = z;
        this.zzpi = zzjnVar;
        this.zzpg = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzdxVar = this.zzrd.zzrf;
        if (zzdxVar == null) {
            this.zzrd.zzab().zzgk().zzao("Discarding data. Failed to set user attribute");
            return;
        }
        this.zzrd.zza(zzdxVar, this.zzrm ? null : this.zzpi, this.zzpg);
        this.zzrd.zzir();
    }
}
