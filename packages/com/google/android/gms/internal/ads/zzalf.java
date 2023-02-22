package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzalf implements Runnable {
    private final /* synthetic */ zzala zzden;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalf(zzala zzalaVar) {
        this.zzden = zzalaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakd zzakdVar;
        try {
            zzakdVar = this.zzden.zzdea;
            zzakdVar.onAdLoaded();
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }
}
