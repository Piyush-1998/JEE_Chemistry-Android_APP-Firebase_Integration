package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzha implements Runnable {
    private final /* synthetic */ AtomicReference zzps;
    private final /* synthetic */ zzgp zzpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzha(zzgp zzgpVar, AtomicReference atomicReference) {
        this.zzpt = zzgpVar;
        this.zzps = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzps) {
            this.zzps.set(Long.valueOf(this.zzpt.zzad().zza(this.zzpt.zzr().zzag(), zzak.zzho)));
            this.zzps.notify();
        }
    }
}
