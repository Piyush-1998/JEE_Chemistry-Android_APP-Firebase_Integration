package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfl implements Runnable {
    private final /* synthetic */ zzgm zzpd;
    private final /* synthetic */ zzfj zzpe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfl(zzfj zzfjVar, zzgm zzgmVar) {
        this.zzpe = zzfjVar;
        this.zzpd = zzgmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpe.zza(this.zzpd);
        this.zzpe.start();
    }
}
