package com.google.android.gms.ads.appopen;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzqt;
import com.google.android.gms.internal.ads.zzua;
import com.google.android.gms.internal.ads.zzvl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class AppOpenAdView extends ViewGroup {
    private AppOpenAd zzabx;
    private AppOpenAdPresentationCallback zzaby;

    public AppOpenAdView(Context context) {
        super(context);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AppOpenAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppOpenAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void setAppOpenAd(AppOpenAd appOpenAd) {
        IObjectWrapper zzjr;
        try {
            zzvl zzdg = appOpenAd.zzdg();
            if (zzdg == null || (zzjr = zzdg.zzjr()) == null) {
                return;
            }
            View view = (View) ObjectWrapper.unwrap(zzjr);
            if (view.getParent() == null) {
                removeAllViews();
                addView(view);
                this.zzabx = appOpenAd;
                zzdi();
                return;
            }
            zzaxi.zzes("Trying to set AppOpenAd which is already in use.");
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAppOpenAdPresentationCallback(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.zzaby = appOpenAdPresentationCallback;
        zzdi();
    }

    private final void zzdi() {
        AppOpenAd appOpenAd = this.zzabx;
        if (appOpenAd == null || this.zzaby == null) {
            return;
        }
        appOpenAd.zza(new zzqt(this.zzaby));
    }

    private final AdSize getAdSize() {
        zzvl zzdg = this.zzabx.zzdg();
        if (zzdg != null) {
            try {
                zzua zzjt = zzdg.zzjt();
                if (zzjt != null) {
                    return zzjt.zzod();
                }
                return null;
            } catch (RemoteException e) {
                zzaxi.zze("#007 Could not call remote method.", e);
                return null;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzaxi.zzc("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }
}
