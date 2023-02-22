package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhw implements Runnable {
    private final /* synthetic */ boolean zzbi;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;
    private final /* synthetic */ AtomicReference zzrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhw(zzhv zzhvVar, AtomicReference atomicReference, zzn zznVar, boolean z) {
        this.zzrd = zzhvVar;
        this.zzrl = atomicReference;
        this.zzpg = zznVar;
        this.zzbi = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        synchronized (this.zzrl) {
            try {
                zzdxVar = this.zzrd.zzrf;
            } catch (RemoteException e) {
                this.zzrd.zzab().zzgk().zza("Failed to get user properties", e);
                this.zzrl.notify();
            }
            if (zzdxVar == null) {
                this.zzrd.zzab().zzgk().zzao("Failed to get user properties");
                this.zzrl.notify();
                return;
            }
            this.zzrl.set(zzdxVar.zza(this.zzpg, this.zzbi));
            this.zzrd.zzir();
            this.zzrl.notify();
        }
    }
}
