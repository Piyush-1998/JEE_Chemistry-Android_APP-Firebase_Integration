package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzyb implements Runnable {
    private final /* synthetic */ zzxy zzcfn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyb(zzxy zzxyVar) {
        this.zzcfn = zzxyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqi zzaqiVar;
        zzaqi zzaqiVar2;
        zzaqiVar = this.zzcfn.zzcfk;
        if (zzaqiVar != null) {
            try {
                zzaqiVar2 = this.zzcfn.zzcfk;
                zzaqiVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaxi.zzd("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
