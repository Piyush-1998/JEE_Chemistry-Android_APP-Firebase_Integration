package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzik implements Runnable {
    private final /* synthetic */ String zzas;
    private final /* synthetic */ boolean zzbi;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzp zzdi;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;
    private final /* synthetic */ String zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzik(zzhv zzhvVar, String str, String str2, boolean z, zzn zznVar, com.google.android.gms.internal.measurement.zzp zzpVar) {
        this.zzrd = zzhvVar;
        this.zzx = str;
        this.zzas = str2;
        this.zzbi = z;
        this.zzpg = zznVar;
        this.zzdi = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        Bundle bundle = new Bundle();
        try {
            zzdxVar = this.zzrd.zzrf;
            if (zzdxVar == null) {
                this.zzrd.zzab().zzgk().zza("Failed to get user properties", this.zzx, this.zzas);
                return;
            }
            Bundle zzc = zzjs.zzc(zzdxVar.zza(this.zzx, this.zzas, this.zzbi, this.zzpg));
            this.zzrd.zzir();
            this.zzrd.zzz().zza(this.zzdi, zzc);
        } catch (RemoteException e) {
            this.zzrd.zzab().zzgk().zza("Failed to get user properties", this.zzx, e);
        } finally {
            this.zzrd.zzz().zza(this.zzdi, bundle);
        }
    }
}
