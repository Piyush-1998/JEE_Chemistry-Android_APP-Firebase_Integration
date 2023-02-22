package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchk extends zzakc implements zzbnz {
    private zzakd zzdfb;
    private zzboc zzfye;

    public final synchronized void zza(zzakd zzakdVar) {
        this.zzdfb = zzakdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final synchronized void zza(zzboc zzbocVar) {
        this.zzfye = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAdClicked() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAdClosed() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAdFailedToLoad(i);
        }
        if (this.zzfye != null) {
            this.zzfye.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAdOpened() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAdLoaded();
        }
        if (this.zzfye != null) {
            this.zzfye.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zza(zzake zzakeVar) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zza(zzakeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAdImpression() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zza(zzace zzaceVar, String str) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zza(zzaceVar, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onVideoEnd() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onVideoEnd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zzde(String str) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zzde(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zzrw() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zzrw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onVideoPlay();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zzb(zzaqt zzaqtVar) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zzb(zzaqtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void onVideoPause() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.onVideoPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zzb(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zzrx() throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zzrx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zzcl(int i) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zzcl(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final synchronized void zza(zzaqv zzaqvVar) throws RemoteException {
        if (this.zzdfb != null) {
            this.zzdfb.zza(zzaqvVar);
        }
    }
}
