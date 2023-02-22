package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxd {
    private final zzty zzaax;
    private AppEventListener zzbki;
    private boolean zzblc;
    private zzvl zzbqx;
    private String zzbqy;
    private final zzaju zzbra;
    private zztp zzcbs;
    private AdListener zzcbv;
    private AdMetadataListener zzcbw;
    private OnCustomRenderedAdLoadedListener zzcep;
    private RewardedVideoAdListener zzcex;
    private boolean zzcey;
    private final Context zzlk;

    public zzxd(Context context) {
        this(context, zzty.zzccl, null);
    }

    public zzxd(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzty.zzccl, publisherInterstitialAd);
    }

    private zzxd(Context context, zzty zztyVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzbra = new zzaju();
        this.zzlk = context;
        this.zzaax = zztyVar;
    }

    public final AdListener getAdListener() {
        return this.zzcbv;
    }

    public final String getAdUnitId() {
        return this.zzbqy;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbki;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcep;
    }

    public final boolean isLoaded() {
        try {
            if (this.zzbqx == null) {
                return false;
            }
            return this.zzbqx.isReady();
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbqx == null) {
                return false;
            }
            return this.zzbqx.isLoading();
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final void zza(zzwz zzwzVar) {
        try {
            if (this.zzbqx == null) {
                if (this.zzbqy == null) {
                    zzci("loadAd");
                }
                zzua zzoa = this.zzcey ? zzua.zzoa() : new zzua();
                zzug zzok = zzuv.zzok();
                Context context = this.zzlk;
                zzvl zzd = new zzum(zzok, context, zzoa, this.zzbqy, this.zzbra).zzd(context, false);
                this.zzbqx = zzd;
                if (this.zzcbv != null) {
                    zzd.zza(new zztt(this.zzcbv));
                }
                if (this.zzcbs != null) {
                    this.zzbqx.zza(new zzto(this.zzcbs));
                }
                if (this.zzcbw != null) {
                    this.zzbqx.zza(new zztu(this.zzcbw));
                }
                if (this.zzbki != null) {
                    this.zzbqx.zza(new zzuc(this.zzbki));
                }
                if (this.zzcep != null) {
                    this.zzbqx.zza(new zzaai(this.zzcep));
                }
                if (this.zzcex != null) {
                    this.zzbqx.zza(new zzaql(this.zzcex));
                }
                this.zzbqx.setImmersiveMode(this.zzblc);
            }
            if (this.zzbqx.zza(zzty.zza(this.zzlk, zzwzVar))) {
                this.zzbra.zzf(zzwzVar.zzpc());
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzcbv = adListener;
            if (this.zzbqx != null) {
                this.zzbqx.zza(adListener != null ? new zztt(adListener) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zza(zztp zztpVar) {
        try {
            this.zzcbs = zztpVar;
            if (this.zzbqx != null) {
                this.zzbqx.zza(zztpVar != null ? new zzto(zztpVar) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzbqy != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzbqy = str;
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        try {
            this.zzcbw = adMetadataListener;
            if (this.zzbqx != null) {
                this.zzbqx.zza(adMetadataListener != null ? new zztu(adMetadataListener) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            if (this.zzbqx != null) {
                return this.zzbqx.getAdMetadata();
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbki = appEventListener;
            if (this.zzbqx != null) {
                this.zzbqx.zza(appEventListener != null ? new zzuc(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzcep = onCustomRenderedAdLoadedListener;
            if (this.zzbqx != null) {
                this.zzbqx.zza(onCustomRenderedAdLoadedListener != null ? new zzaai(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzcex = rewardedVideoAdListener;
            if (this.zzbqx != null) {
                this.zzbqx.zza(rewardedVideoAdListener != null ? new zzaql(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zzc(boolean z) {
        this.zzcey = true;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbqx != null) {
                return this.zzbqx.zzju();
            }
            return null;
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
            return null;
        }
    }

    public final void show() {
        try {
            zzci("show");
            this.zzbqx.showInterstitial();
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzblc = z;
            if (this.zzbqx != null) {
                this.zzbqx.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    private final void zzci(String str) {
        if (this.zzbqx != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }
}
