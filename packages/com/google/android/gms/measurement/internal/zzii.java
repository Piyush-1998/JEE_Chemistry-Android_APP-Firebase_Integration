package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzii implements Runnable {
    private final /* synthetic */ String zzas;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzp zzdi;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;
    private final /* synthetic */ String zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzhv zzhvVar, String str, String str2, zzn zznVar, com.google.android.gms.internal.measurement.zzp zzpVar) {
        this.zzrd = zzhvVar;
        this.zzx = str;
        this.zzas = str2;
        this.zzpg = zznVar;
        this.zzdi = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzdxVar = this.zzrd.zzrf;
            if (zzdxVar == null) {
                this.zzrd.zzab().zzgk().zza("Failed to get conditional properties", this.zzx, this.zzas);
                return;
            }
            ArrayList<Bundle> zzd = zzjs.zzd(zzdxVar.zza(this.zzx, this.zzas, this.zzpg));
            this.zzrd.zzir();
            this.zzrd.zzz().zza(this.zzdi, zzd);
        } catch (RemoteException e) {
            this.zzrd.zzab().zzgk().zza("Failed to get conditional properties", this.zzx, this.zzas, e);
        } finally {
            this.zzrd.zzz().zza(this.zzdi, arrayList);
        }
    }
}
