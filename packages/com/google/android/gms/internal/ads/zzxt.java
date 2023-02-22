package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzxt implements Runnable {
    private final /* synthetic */ zzxq zzcfi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxt(zzxq zzxqVar) {
        this.zzcfi = zzxqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzuy zzuyVar;
        zzuy zzuyVar2;
        zzuyVar = this.zzcfi.zzblp;
        if (zzuyVar != null) {
            try {
                zzuyVar2 = this.zzcfi.zzblp;
                zzuyVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaxi.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
