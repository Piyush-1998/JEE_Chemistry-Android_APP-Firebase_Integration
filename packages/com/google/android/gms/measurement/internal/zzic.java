package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzic implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzp zzdi;
    private final /* synthetic */ zzai zzdm;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzhv zzrd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzic(zzhv zzhvVar, zzai zzaiVar, String str, com.google.android.gms.internal.measurement.zzp zzpVar) {
        this.zzrd = zzhvVar;
        this.zzdm = zzaiVar;
        this.zzdn = str;
        this.zzdi = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        try {
            zzdxVar = this.zzrd.zzrf;
            if (zzdxVar == null) {
                this.zzrd.zzab().zzgk().zzao("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] zza = zzdxVar.zza(this.zzdm, this.zzdn);
            this.zzrd.zzir();
            this.zzrd.zzz().zza(this.zzdi, zza);
        } catch (RemoteException e) {
            this.zzrd.zzab().zzgk().zza("Failed to send event to the service to bundle", e);
        } finally {
            this.zzrd.zzz().zza(this.zzdi, (byte[]) null);
        }
    }
}
