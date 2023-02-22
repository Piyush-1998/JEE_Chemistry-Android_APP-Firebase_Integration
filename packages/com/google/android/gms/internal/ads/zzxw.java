package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxw extends zzaqz {
    @Override // com.google.android.gms.internal.ads.zzara
    public final String getMediationAdapterClassName() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzarb zzarbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzarj zzarjVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzarr zzarrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzwm zzwmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final zzaqv zzpk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zztx zztxVar, final zzari zzariVar) throws RemoteException {
        zzaxi.zzes("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzawy.zzzb.post(new Runnable(zzariVar) { // from class: com.google.android.gms.internal.ads.zzxz
            private final zzari zzcfl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcfl = zzariVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzari zzariVar2 = this.zzcfl;
                if (zzariVar2 != null) {
                    try {
                        zzariVar2.onRewardedAdFailedToLoad(1);
                    } catch (RemoteException e) {
                        zzaxi.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }
}
