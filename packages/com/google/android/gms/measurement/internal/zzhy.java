package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhy implements Runnable {
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;
    private final /* synthetic */ AtomicReference zzrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhy(zzhv zzhvVar, AtomicReference atomicReference, zzn zznVar) {
        this.zzrd = zzhvVar;
        this.zzrl = atomicReference;
        this.zzpg = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        synchronized (this.zzrl) {
            try {
                zzdxVar = this.zzrd.zzrf;
            } catch (RemoteException e) {
                this.zzrd.zzab().zzgk().zza("Failed to get app instance id", e);
                this.zzrl.notify();
            }
            if (zzdxVar == null) {
                this.zzrd.zzab().zzgk().zzao("Failed to get app instance id");
                this.zzrl.notify();
                return;
            }
            this.zzrl.set(zzdxVar.zzc(this.zzpg));
            String str = (String) this.zzrl.get();
            if (str != null) {
                this.zzrd.zzq().zzbg(str);
                this.zzrd.zzac().zzlq.zzau(str);
            }
            this.zzrd.zzir();
            this.zzrl.notify();
        }
    }
}
