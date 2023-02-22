package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbve extends zzabs implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbvz {
    private final WeakReference<View> zzfmh;
    private final Map<String, WeakReference<View>> zzfmi = new HashMap();
    private final Map<String, WeakReference<View>> zzfmj = new HashMap();
    private final Map<String, WeakReference<View>> zzfmk = new HashMap();
    private zzbuj zzfml;
    private zzpf zzfmm;

    public zzbve(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzq.zzlg();
        zzayd.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzq.zzlg();
        zzayd.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfmh = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.zzfmi.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.zzfmk.putAll(this.zzfmi);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.zzfmj.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.zzfmk.putAll(this.zzfmj);
        this.zzfmm = new zzpf(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final FrameLayout zzain() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final synchronized void unregisterNativeAd() {
        if (this.zzfml != null) {
            this.zzfml.zzb(this);
            this.zzfml = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzbuj)) {
            zzaug.zzeu("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.zzfml != null) {
            this.zzfml.zzb(this);
        }
        if (((zzbuj) unwrap).zzahk()) {
            zzbuj zzbujVar = (zzbuj) unwrap;
            this.zzfml = zzbujVar;
            zzbujVar.zza(this);
            this.zzfml.zzy(zzaeu());
            return;
        }
        zzaug.zzes("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final View zzaeu() {
        return this.zzfmh.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final zzpf zzaio() {
        return this.zzfmm;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zza(String str, View view, boolean z) {
        if (view == null) {
            this.zzfmk.remove(str);
            this.zzfmi.remove(str);
            this.zzfmj.remove(str);
            return;
        }
        this.zzfmk.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            this.zzfmi.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized Map<String, WeakReference<View>> zzaip() {
        return this.zzfmk;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized Map<String, WeakReference<View>> zzaiq() {
        return this.zzfmi;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized Map<String, WeakReference<View>> zzair() {
        return this.zzfmj;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized View zzfw(String str) {
        WeakReference<View> weakReference = this.zzfmk.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized String zzais() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized IObjectWrapper zzait() {
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfml != null) {
            this.zzfml.zza(view, motionEvent, zzaeu());
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzfml != null) {
            this.zzfml.zza(view, zzaeu(), zzaip(), zzaiq(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzfml != null) {
            this.zzfml.zzb(zzaeu(), zzaip(), zzaiq(), zzbuj.zzx(zzaeu()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzfml != null) {
            this.zzfml.zzb(zzaeu(), zzaip(), zzaiq(), zzbuj.zzx(zzaeu()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        if (this.zzfml != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                zzaug.zzeu("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zzfml.setClickConfirmingView((View) unwrap);
        }
    }
}
