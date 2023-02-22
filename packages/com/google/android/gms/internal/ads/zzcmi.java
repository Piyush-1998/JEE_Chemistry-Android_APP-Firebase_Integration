package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmi implements zzbna, zzbnb, zzbnj, zzbog, zztp {
    private zzuy zzgcm;

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzb(zzapy zzapyVar, String str, String str2) {
    }

    public final synchronized void zzc(zzuy zzuyVar) {
        this.zzgcm = zzuyVar;
    }

    public final synchronized zzuy zzalh() {
        return this.zzgcm;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final synchronized void onAdClosed() {
        if (this.zzgcm != null) {
            try {
                this.zzgcm.onAdClosed();
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdClosed.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final synchronized void onAdFailedToLoad(int i) {
        if (this.zzgcm != null) {
            try {
                this.zzgcm.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final synchronized void onAdLeftApplication() {
        if (this.zzgcm != null) {
            try {
                this.zzgcm.onAdLeftApplication();
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final synchronized void onAdLoaded() {
        if (this.zzgcm != null) {
            try {
                this.zzgcm.onAdLoaded();
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final synchronized void onAdOpened() {
        if (this.zzgcm != null) {
            try {
                this.zzgcm.onAdOpened();
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdOpened.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final synchronized void onAdClicked() {
        if (this.zzgcm != null) {
            try {
                this.zzgcm.onAdClicked();
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final synchronized void onAdImpression() {
        if (this.zzgcm != null) {
            try {
                this.zzgcm.onAdImpression();
            } catch (RemoteException e) {
                zzaug.zzd("Remote Exception at onAdImpression.", e);
            }
        }
    }
}
