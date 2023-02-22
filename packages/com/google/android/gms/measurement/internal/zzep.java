package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzep implements Runnable {
    private final /* synthetic */ boolean zzmf;
    private final /* synthetic */ zzem zzmg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzem zzemVar, boolean z) {
        this.zzmg = zzemVar;
        this.zzmf = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar;
        zzjgVar = this.zzmg.zzkz;
        zzjgVar.zzj(this.zzmf);
    }
}
