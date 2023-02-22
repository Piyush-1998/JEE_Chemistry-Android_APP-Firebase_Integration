package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzawv {
    private final View view;
    private boolean zzbny;
    private boolean zzbsc;
    private Activity zzdvj;
    private boolean zzdvk;
    private ViewTreeObserver.OnGlobalLayoutListener zzdvl;
    private ViewTreeObserver.OnScrollChangedListener zzdvm = null;

    public zzawv(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzdvj = activity;
        this.view = view;
        this.zzdvl = onGlobalLayoutListener;
    }

    public final void zzh(Activity activity) {
        this.zzdvj = activity;
    }

    public final void zzwf() {
        this.zzbsc = true;
        if (this.zzbny) {
            zzwh();
        }
    }

    public final void zzwg() {
        this.zzbsc = false;
        zzwi();
    }

    public final void onAttachedToWindow() {
        this.zzbny = true;
        if (this.zzbsc) {
            zzwh();
        }
    }

    public final void onDetachedFromWindow() {
        this.zzbny = false;
        zzwi();
    }

    private final void zzwh() {
        ViewTreeObserver zzi;
        if (this.zzdvk) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzdvl;
        if (onGlobalLayoutListener != null) {
            Activity activity = this.zzdvj;
            if (activity != null && (zzi = zzi(activity)) != null) {
                zzi.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            com.google.android.gms.ads.internal.zzq.zzlg();
            zzayd.zza(this.view, this.zzdvl);
        }
        this.zzdvk = true;
    }

    private final void zzwi() {
        ViewTreeObserver zzi;
        Activity activity = this.zzdvj;
        if (activity != null && this.zzdvk) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzdvl;
            if (onGlobalLayoutListener != null && (zzi = zzi(activity)) != null) {
                com.google.android.gms.ads.internal.zzq.zzkl();
                zzi.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzdvk = false;
        }
    }

    private static ViewTreeObserver zzi(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
