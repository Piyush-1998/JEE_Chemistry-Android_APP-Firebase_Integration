package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgx implements Runnable {
    private final /* synthetic */ zzgp zzpt;
    private final /* synthetic */ Bundle zzqg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgx(zzgp zzgpVar, Bundle bundle) {
        this.zzpt = zzgpVar;
        this.zzqg = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpt.zze(this.zzqg);
    }
}
