package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzk implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzp zzdi;
    private final /* synthetic */ AppMeasurementDynamiteService zzdj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzp zzpVar) {
        this.zzdj = appMeasurementDynamiteService;
        this.zzdi = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdj.zzj.zzz().zza(this.zzdi, this.zzdj.zzj.zzib());
    }
}
