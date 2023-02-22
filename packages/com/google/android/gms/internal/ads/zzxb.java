package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxb {
    private final zzty zzaax;
    private VideoOptions zzbjz;
    private boolean zzbkg;
    private AppEventListener zzbki;
    private zzvl zzbqx;
    private String zzbqy;
    private final zzaju zzbra;
    private zztp zzcbs;
    private AdListener zzcbv;
    private AdSize[] zzcdc;
    private final AtomicBoolean zzcem;
    private final VideoController zzcen;
    private final zzuu zzceo;
    private OnCustomRenderedAdLoadedListener zzcep;
    private ViewGroup zzceq;
    private int zzcer;

    private static boolean zzci(int i) {
        return i == 1;
    }

    public zzxb(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzty.zzccl, 0);
    }

    public zzxb(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzty.zzccl, i);
    }

    public zzxb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzty.zzccl, 0);
    }

    public zzxb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzty.zzccl, i);
    }

    private zzxb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzty zztyVar, zzvl zzvlVar, int i) {
        zzua zzuaVar;
        this.zzbra = new zzaju();
        this.zzcen = new VideoController();
        this.zzceo = new zzxa(this);
        this.zzceq = viewGroup;
        this.zzaax = zztyVar;
        this.zzbqx = null;
        this.zzcem = new AtomicBoolean(false);
        this.zzcer = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzuh zzuhVar = new zzuh(context, attributeSet);
                this.zzcdc = zzuhVar.zzr(z);
                this.zzbqy = zzuhVar.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzawy zzoj = zzuv.zzoj();
                    AdSize adSize = this.zzcdc[0];
                    int i2 = this.zzcer;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzuaVar = zzua.zzoc();
                    } else {
                        zzua zzuaVar2 = new zzua(context, adSize);
                        zzuaVar2.zzccp = zzci(i2);
                        zzuaVar = zzuaVar2;
                    }
                    zzoj.zza(viewGroup, zzuaVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzuv.zzoj().zza(viewGroup, new zzua(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private zzxb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzty zztyVar, int i) {
        this(viewGroup, attributeSet, z, zztyVar, null, i);
    }

    public final void destroy() {
        try {
            if (this.zzbqx != null) {
                this.zzbqx.destroy();
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzcbv;
    }

    public final AdSize getAdSize() {
        zzua zzjt;
        try {
            if (this.zzbqx != null && (zzjt = this.zzbqx.zzjt()) != null) {
                return zzjt.zzod();
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzcdc;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzcdc;
    }

    public final String getAdUnitId() {
        zzvl zzvlVar;
        if (this.zzbqy == null && (zzvlVar = this.zzbqx) != null) {
            try {
                this.zzbqy = zzvlVar.getAdUnitId();
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
            }
        }
        return this.zzbqy;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbki;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcep;
    }

    public final void zza(zzwz zzwzVar) {
        zzvl zzd;
        try {
            if (this.zzbqx == null) {
                if ((this.zzcdc == null || this.zzbqy == null) && this.zzbqx == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzceq.getContext();
                zzua zza = zza(context, this.zzcdc, this.zzcer);
                if ("search_v2".equals(zza.zzabd)) {
                    zzd = new zzun(zzuv.zzok(), context, zza, this.zzbqy).zzd(context, false);
                } else {
                    zzd = new zzuj(zzuv.zzok(), context, zza, this.zzbqy, this.zzbra).zzd(context, false);
                }
                this.zzbqx = zzd;
                zzd.zza(new zztt(this.zzceo));
                if (this.zzcbs != null) {
                    this.zzbqx.zza(new zzto(this.zzcbs));
                }
                if (this.zzbki != null) {
                    this.zzbqx.zza(new zzuc(this.zzbki));
                }
                if (this.zzcep != null) {
                    this.zzbqx.zza(new zzaai(this.zzcep));
                }
                if (this.zzbjz != null) {
                    this.zzbqx.zza(new zzyj(this.zzbjz));
                }
                this.zzbqx.setManualImpressionsEnabled(this.zzbkg);
                try {
                    IObjectWrapper zzjr = this.zzbqx.zzjr();
                    if (zzjr != null) {
                        this.zzceq.addView((View) ObjectWrapper.unwrap(zzjr));
                    }
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
            if (this.zzbqx.zza(zzty.zza(this.zzceq.getContext(), zzwzVar))) {
                this.zzbra.zzf(zzwzVar.zzpc());
            }
        } catch (RemoteException e2) {
            zzaxi.zze("#007 Could not call remote method.", e2);
        }
    }

    public final void pause() {
        try {
            if (this.zzbqx != null) {
                this.zzbqx.pause();
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordManualImpression() {
        if (this.zzcem.getAndSet(true)) {
            return;
        }
        try {
            if (this.zzbqx != null) {
                this.zzbqx.zzjs();
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final void resume() {
        try {
            if (this.zzbqx != null) {
                this.zzbqx.resume();
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzcbv = adListener;
        this.zzceo.zza(adListener);
    }

    public final void zza(zztp zztpVar) {
        try {
            this.zzcbs = zztpVar;
            if (this.zzbqx != null) {
                this.zzbqx.zza(zztpVar != null ? new zzto(zztpVar) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzcdc != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zza(adSizeArr);
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzcdc = adSizeArr;
        try {
            if (this.zzbqx != null) {
                this.zzbqx.zza(zza(this.zzceq.getContext(), this.zzcdc, this.zzcer));
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
        this.zzceq.requestLayout();
    }

    public final void setAdUnitId(String str) {
        if (this.zzbqy != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzbqy = str;
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbki = appEventListener;
            if (this.zzbqx != null) {
                this.zzbqx.zza(appEventListener != null ? new zzuc(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcep = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzbqx != null) {
                this.zzbqx.zza(onCustomRenderedAdLoadedListener != null ? new zzaai(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbkg = z;
        try {
            if (this.zzbqx != null) {
                this.zzbqx.setManualImpressionsEnabled(z);
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbqx != null) {
                return this.zzbqx.zzju();
            }
            return null;
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbqx != null) {
                return this.zzbqx.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final VideoController getVideoController() {
        return this.zzcen;
    }

    public final zzwr zzde() {
        zzvl zzvlVar = this.zzbqx;
        if (zzvlVar == null) {
            return null;
        }
        try {
            return zzvlVar.getVideoController();
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzbjz = videoOptions;
        try {
            if (this.zzbqx != null) {
                this.zzbqx.zza(videoOptions == null ? null : new zzyj(videoOptions));
            }
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions getVideoOptions() {
        return this.zzbjz;
    }

    public final boolean zza(zzvl zzvlVar) {
        if (zzvlVar == null) {
            return false;
        }
        try {
            IObjectWrapper zzjr = zzvlVar.zzjr();
            if (zzjr != null && ((View) ObjectWrapper.unwrap(zzjr)).getParent() == null) {
                this.zzceq.addView((View) ObjectWrapper.unwrap(zzjr));
                this.zzbqx = zzvlVar;
                return true;
            }
            return false;
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    private static zzua zza(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzua.zzoc();
            }
        }
        zzua zzuaVar = new zzua(context, adSizeArr);
        zzuaVar.zzccp = zzci(i);
        return zzuaVar;
    }
}
