package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaqq implements RewardedVideoAd {
    private final zzaqb zzdnx;
    private String zzdnz;
    private String zzdoa;
    private final Context zzlk;
    private final Object lock = new Object();
    private final zzaql zzdny = new zzaql(null);

    public zzaqq(Context context, zzaqb zzaqbVar) {
        this.zzdnx = zzaqbVar == null ? new zzxy() : zzaqbVar;
        this.zzlk = context.getApplicationContext();
    }

    private final void zza(String str, zzwz zzwzVar) {
        synchronized (this.lock) {
            if (this.zzdnx == null) {
                return;
            }
            try {
                this.zzdnx.zza(zzty.zza(this.zzlk, zzwzVar, str));
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, AdRequest adRequest) {
        zza(str, adRequest.zzdb());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        zza(str, publisherAdRequest.zzdb());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void show() {
        synchronized (this.lock) {
            if (this.zzdnx == null) {
                return;
            }
            try {
                this.zzdnx.show();
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.lock) {
            this.zzdny.setRewardedVideoAdListener(rewardedVideoAdListener);
            if (this.zzdnx != null) {
                try {
                    this.zzdnx.zza(this.zzdny);
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.lock) {
            if (this.zzdnx != null) {
                try {
                    this.zzdnx.zza(new zztu(adMetadataListener));
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final Bundle getAdMetadata() {
        synchronized (this.lock) {
            if (this.zzdnx != null) {
                try {
                    return this.zzdnx.getAdMetadata();
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setUserId(String str) {
        synchronized (this.lock) {
            this.zzdnz = str;
            if (this.zzdnx != null) {
                try {
                    this.zzdnx.setUserId(str);
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final boolean isLoaded() {
        synchronized (this.lock) {
            if (this.zzdnx == null) {
                return false;
            }
            try {
                return this.zzdnx.isLoaded();
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause() {
        pause(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause(Context context) {
        synchronized (this.lock) {
            if (this.zzdnx == null) {
                return;
            }
            try {
                this.zzdnx.zzn(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume() {
        resume(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume(Context context) {
        synchronized (this.lock) {
            if (this.zzdnx == null) {
                return;
            }
            try {
                this.zzdnx.zzo(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy() {
        destroy(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy(Context context) {
        synchronized (this.lock) {
            this.zzdny.setRewardedVideoAdListener(null);
            if (this.zzdnx == null) {
                return;
            }
            try {
                this.zzdnx.zzp(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.lock) {
            rewardedVideoAdListener = this.zzdny.getRewardedVideoAdListener();
        }
        return rewardedVideoAdListener;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getUserId() {
        String str;
        synchronized (this.lock) {
            str = this.zzdnz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getMediationAdapterClassName() {
        try {
            if (this.zzdnx != null) {
                return this.zzdnx.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setImmersiveMode(boolean z) {
        synchronized (this.lock) {
            if (this.zzdnx != null) {
                try {
                    this.zzdnx.setImmersiveMode(z);
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setCustomData(String str) {
        synchronized (this.lock) {
            if (this.zzdnx != null) {
                try {
                    this.zzdnx.setCustomData(str);
                    this.zzdoa = str;
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getCustomData() {
        String str;
        synchronized (this.lock) {
            str = this.zzdoa;
        }
        return str;
    }
}
