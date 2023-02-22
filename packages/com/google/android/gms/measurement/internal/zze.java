package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zze implements Runnable {
    private final /* synthetic */ zza zzcc;
    private final /* synthetic */ long zzcd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(zza zzaVar, long j) {
        this.zzcc = zzaVar;
        this.zzcd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcc.zzd(this.zzcd);
    }
}
