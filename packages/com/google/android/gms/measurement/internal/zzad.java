package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzad implements Runnable {
    private final /* synthetic */ zzgh zzfe;
    private final /* synthetic */ zzaa zzff;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(zzaa zzaaVar, zzgh zzghVar) {
        this.zzff = zzaaVar;
        this.zzfe = zzghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzfe.zzae();
        if (zzr.isMainThread()) {
            this.zzfe.zzaa().zza(this);
            return;
        }
        boolean zzcp = this.zzff.zzcp();
        this.zzff.zzex = 0L;
        if (zzcp) {
            this.zzff.run();
        }
    }
}
