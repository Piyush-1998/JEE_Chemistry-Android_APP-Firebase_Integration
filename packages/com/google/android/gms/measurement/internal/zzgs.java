package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgs implements Runnable {
    private final /* synthetic */ AtomicReference zzps;
    private final /* synthetic */ zzgp zzpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgs(zzgp zzgpVar, AtomicReference atomicReference) {
        this.zzpt = zzgpVar;
        this.zzps = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpt.zzs().zza(this.zzps);
    }
}
