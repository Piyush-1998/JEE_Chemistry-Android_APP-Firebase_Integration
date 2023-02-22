package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zziq implements Runnable {
    private final /* synthetic */ zzin zzrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziq(zzin zzinVar) {
        this.zzrs = zzinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzrs.zzrd.zzrf = null;
        this.zzrs.zzrd.zziv();
    }
}
