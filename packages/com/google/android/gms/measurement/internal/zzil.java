package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzil implements Runnable {
    private final /* synthetic */ String zzas;
    private final /* synthetic */ boolean zzbi;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzhv zzrd;
    private final /* synthetic */ AtomicReference zzrl;
    private final /* synthetic */ String zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzil(zzhv zzhvVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzn zznVar) {
        this.zzrd = zzhvVar;
        this.zzrl = atomicReference;
        this.zzdn = str;
        this.zzx = str2;
        this.zzas = str3;
        this.zzbi = z;
        this.zzpg = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        synchronized (this.zzrl) {
            try {
                zzdxVar = this.zzrd.zzrf;
            } catch (RemoteException e) {
                this.zzrd.zzab().zzgk().zza("Failed to get user properties", zzef.zzam(this.zzdn), this.zzx, e);
                this.zzrl.set(Collections.emptyList());
                this.zzrl.notify();
            }
            if (zzdxVar == null) {
                this.zzrd.zzab().zzgk().zza("Failed to get user properties", zzef.zzam(this.zzdn), this.zzx, this.zzas);
                this.zzrl.set(Collections.emptyList());
                this.zzrl.notify();
                return;
            }
            if (TextUtils.isEmpty(this.zzdn)) {
                this.zzrl.set(zzdxVar.zza(this.zzx, this.zzas, this.zzbi, this.zzpg));
            } else {
                this.zzrl.set(zzdxVar.zza(this.zzdn, this.zzx, this.zzas, this.zzbi));
            }
            this.zzrd.zzir();
            this.zzrl.notify();
        }
    }
}
