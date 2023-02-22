package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmg implements zzbnb {
    private zzqx zzgcj;

    public final synchronized void zzb(zzqx zzqxVar) {
        this.zzgcj = zzqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final synchronized void onAdFailedToLoad(int i) {
        if (this.zzgcj != null) {
            try {
                this.zzgcj.onAppOpenAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }
}
