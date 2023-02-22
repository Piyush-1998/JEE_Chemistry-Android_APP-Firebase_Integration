package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcz implements Runnable {
    private final /* synthetic */ zzda zzvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcz(zzda zzdaVar) {
        this.zzvn = zzdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzdx zzdxVar;
        ConditionVariable conditionVariable2;
        if (this.zzvn.zzvr != null) {
            return;
        }
        conditionVariable = zzda.zzvp;
        synchronized (conditionVariable) {
            if (this.zzvn.zzvr != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzuv.zzon().zzd(zzza.zzcmw)).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzdxVar = this.zzvn.zzvo;
                    zzda.zzvq = new zzsi(zzdxVar.zzlk, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zzvn.zzvr = Boolean.valueOf(z2);
            conditionVariable2 = zzda.zzvp;
            conditionVariable2.open();
        }
    }
}
