package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhf implements Runnable {
    private final /* synthetic */ boolean zzaz;
    private final /* synthetic */ zzgp zzpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhf(zzgp zzgpVar, boolean z) {
        this.zzpt = zzgpVar;
        this.zzaz = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpt.zzg(this.zzaz);
    }
}
