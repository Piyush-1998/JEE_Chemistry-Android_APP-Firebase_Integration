package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzih implements Runnable {
    private final /* synthetic */ zzai zzdm;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;
    private final /* synthetic */ boolean zzrm;
    private final /* synthetic */ boolean zzro;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzih(zzhv zzhvVar, boolean z, boolean z2, zzai zzaiVar, zzn zznVar, String str) {
        this.zzrd = zzhvVar;
        this.zzro = z;
        this.zzrm = z2;
        this.zzdm = zzaiVar;
        this.zzpg = zznVar;
        this.zzdn = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzdxVar = this.zzrd.zzrf;
        if (zzdxVar == null) {
            this.zzrd.zzab().zzgk().zzao("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zzro) {
            this.zzrd.zza(zzdxVar, this.zzrm ? null : this.zzdm, this.zzpg);
        } else {
            try {
                if (TextUtils.isEmpty(this.zzdn)) {
                    zzdxVar.zza(this.zzdm, this.zzpg);
                } else {
                    zzdxVar.zza(this.zzdm, this.zzdn, this.zzrd.zzab().zzgu());
                }
            } catch (RemoteException e) {
                this.zzrd.zzab().zzgk().zza("Failed to send event to the service", e);
            }
        }
        this.zzrd.zzir();
    }
}
