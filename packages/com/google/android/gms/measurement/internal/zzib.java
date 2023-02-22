package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzib implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzp zzdi;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzib(zzhv zzhvVar, zzn zznVar, com.google.android.gms.internal.measurement.zzp zzpVar) {
        this.zzrd = zzhvVar;
        this.zzpg = zznVar;
        this.zzdi = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        try {
            zzdxVar = this.zzrd.zzrf;
            if (zzdxVar == null) {
                this.zzrd.zzab().zzgk().zzao("Failed to get app instance id");
                return;
            }
            String zzc = zzdxVar.zzc(this.zzpg);
            if (zzc != null) {
                this.zzrd.zzq().zzbg(zzc);
                this.zzrd.zzac().zzlq.zzau(zzc);
            }
            this.zzrd.zzir();
            this.zzrd.zzz().zzb(this.zzdi, zzc);
        } catch (RemoteException e) {
            this.zzrd.zzab().zzgk().zza("Failed to get app instance id", e);
        } finally {
            this.zzrd.zzz().zzb(this.zzdi, (String) null);
        }
    }
}
