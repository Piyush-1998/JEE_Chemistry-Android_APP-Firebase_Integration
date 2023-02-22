package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmj implements zztp {
    private zzux zzgcn;

    public final synchronized void zzb(zzux zzuxVar) {
        this.zzgcn = zzuxVar;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final synchronized void onAdClicked() {
        if (this.zzgcn != null) {
            try {
                this.zzgcn.onAdClicked();
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
