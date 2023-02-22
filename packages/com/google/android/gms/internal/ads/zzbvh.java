package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvh extends zzabp implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbvz {
    public static final String[] zzfmp = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private FrameLayout zzbkb;
    private zzabh zzcwp;
    private final int zzdwf;
    private zzbuj zzfml;
    private zzpf zzfmm;
    private final String zzfmo;
    private FrameLayout zzfmr;
    private zzddl zzfms;
    private View zzfmt;
    private boolean zzfmv;
    private Map<String, WeakReference<View>> zzfmq = new HashMap();
    private IObjectWrapper zzfmu = null;
    private boolean zzegn = false;

    public zzbvh(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzfmr = frameLayout;
        this.zzbkb = frameLayout2;
        this.zzdwf = i;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzfmo = str;
        com.google.android.gms.ads.internal.zzq.zzlg();
        zzayd.zza((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzq.zzlg();
        zzayd.zza((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfms = zzaxn.zzdwm;
        this.zzfmm = new zzpf(this.zzfmr.getContext(), this.zzfmr);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzc(String str, IObjectWrapper iObjectWrapper) {
        zza(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zza(String str, View view, boolean z) {
        if (this.zzegn) {
            return;
        }
        if (view == null) {
            this.zzfmq.remove(str);
            return;
        }
        this.zzfmq.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            if (zzawm.zzcp(this.zzdwf)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized IObjectWrapper zzcj(String str) {
        return ObjectWrapper.wrap(zzfw(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized View zzfw(String str) {
        if (this.zzegn) {
            return null;
        }
        WeakReference<View> weakReference = this.zzfmq.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        if (this.zzegn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzbuj)) {
            zzaug.zzeu("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        if (this.zzfml != null) {
            this.zzfml.zzb(this);
        }
        zzaiu();
        zzbuj zzbujVar = (zzbuj) unwrap;
        this.zzfml = zzbujVar;
        zzbujVar.zza(this);
        this.zzfml.zzy(this.zzfmr);
        this.zzfml.zzz(this.zzbkb);
        if (this.zzfmv) {
            this.zzfml.zzahm().zza(this.zzcwp);
        }
    }

    private final synchronized void zzaiu() {
        this.zzfms.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbvg
            private final zzbvh zzfmn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfmn = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfmn.zzaiv();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void destroy() {
        if (this.zzegn) {
            return;
        }
        if (this.zzfml != null) {
            this.zzfml.zzb(this);
            this.zzfml = null;
        }
        this.zzfmq.clear();
        this.zzfmr.removeAllViews();
        this.zzbkb.removeAllViews();
        this.zzfmq = null;
        this.zzfmr = null;
        this.zzbkb = null;
        this.zzfmt = null;
        this.zzfmm = null;
        this.zzegn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzc(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzfml != null) {
            this.zzfml.cancelUnconfirmedClick();
            this.zzfml.zza(view, this.zzfmr, zzaip(), zzaiq(), false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfml != null) {
            this.zzfml.zza(view, motionEvent, this.zzfmr);
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzfml != null) {
            this.zzfml.zzb(this.zzfmr, zzaip(), zzaiq(), zzbuj.zzx(this.zzfmr));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzfml != null) {
            this.zzfml.zzb(this.zzfmr, zzaip(), zzaiq(), zzbuj.zzx(this.zzfmr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized Map<String, WeakReference<View>> zzaip() {
        return this.zzfmq;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized Map<String, WeakReference<View>> zzaiq() {
        return this.zzfmq;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized Map<String, WeakReference<View>> zzair() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized String zzais() {
        return this.zzfmo;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final FrameLayout zzain() {
        return this.zzbkb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final zzpf zzaio() {
        return this.zzfmm;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        this.zzfml.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        if (this.zzegn) {
            return;
        }
        this.zzfmu = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final IObjectWrapper zzait() {
        return this.zzfmu;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzj(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzfmr, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zza(zzabh zzabhVar) {
        if (this.zzegn) {
            return;
        }
        this.zzfmv = true;
        this.zzcwp = zzabhVar;
        if (this.zzfml != null) {
            this.zzfml.zzahm().zza(zzabhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final /* synthetic */ View zzaeu() {
        return this.zzfmr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaiv() {
        if (this.zzfmt == null) {
            View view = new View(this.zzfmr.getContext());
            this.zzfmt = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzfmr != this.zzfmt.getParent()) {
            this.zzfmr.addView(this.zzfmt);
        }
    }
}
