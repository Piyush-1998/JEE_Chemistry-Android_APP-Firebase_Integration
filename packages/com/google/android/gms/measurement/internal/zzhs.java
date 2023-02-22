package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhs implements Runnable {
    private final /* synthetic */ zzhr zzqy;
    private final /* synthetic */ zzhq zzqz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhs(zzhq zzhqVar, zzhr zzhrVar) {
        this.zzqz = zzhqVar;
        this.zzqy = zzhrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzqz.zza(this.zzqy, false);
        this.zzqz.zzqo = null;
        this.zzqz.zzs().zza((zzhr) null);
    }
}
