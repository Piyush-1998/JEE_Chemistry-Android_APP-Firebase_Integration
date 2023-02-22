package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzxr implements Runnable {
    private final /* synthetic */ zzxo zzcfg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxr(zzxo zzxoVar) {
        this.zzcfg = zzxoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzxm.zza(this.zzcfg.zzcff) != null) {
            try {
                zzxm.zza(this.zzcfg.zzcff).onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaxi.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
