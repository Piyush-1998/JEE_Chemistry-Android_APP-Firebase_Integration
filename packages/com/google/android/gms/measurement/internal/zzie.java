package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzie implements Runnable {
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(zzhv zzhvVar, zzn zznVar) {
        this.zzrd = zzhvVar;
        this.zzpg = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzdxVar = this.zzrd.zzrf;
        if (zzdxVar == null) {
            this.zzrd.zzab().zzgk().zzao("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzdxVar.zzb(this.zzpg);
            this.zzrd.zzir();
        } catch (RemoteException e) {
            this.zzrd.zzab().zzgk().zza("Failed to send measurementEnabled to the service", e);
        }
    }
}
