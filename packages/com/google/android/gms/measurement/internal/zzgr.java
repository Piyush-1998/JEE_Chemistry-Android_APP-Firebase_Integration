package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgr implements Runnable {
    private final /* synthetic */ String zzbn;
    private final /* synthetic */ boolean zzbq;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzgp zzpt;
    private final /* synthetic */ long zzqb;
    private final /* synthetic */ Bundle zzqc;
    private final /* synthetic */ boolean zzqd;
    private final /* synthetic */ boolean zzqe;
    private final /* synthetic */ String zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgr(zzgp zzgpVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.zzpt = zzgpVar;
        this.zzx = str;
        this.zzbn = str2;
        this.zzqb = j;
        this.zzqc = bundle;
        this.zzbq = z;
        this.zzqd = z2;
        this.zzqe = z3;
        this.zzdn = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzpt.zza(this.zzx, this.zzbn, this.zzqb, this.zzqc, this.zzbq, this.zzqd, this.zzqe, this.zzdn);
    }
}
