package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
final class zzir implements Runnable {
    private final /* synthetic */ zzin zzrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzin zzinVar) {
        this.zzrs = zzinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhv zzhvVar = this.zzrs.zzrd;
        Context context = this.zzrs.zzrd.getContext();
        this.zzrs.zzrd.zzae();
        zzhvVar.onServiceDisconnected(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
