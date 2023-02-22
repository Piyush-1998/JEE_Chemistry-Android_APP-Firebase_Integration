package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbci extends FrameLayout implements zzbbw {
    private final zzbbw zzefw;
    private final zzazc zzefx;
    private final AtomicBoolean zzefy;

    public zzbci(zzbbw zzbbwVar) {
        super(zzbbwVar.getContext());
        this.zzefy = new AtomicBoolean();
        this.zzefw = zzbbwVar;
        this.zzefx = new zzazc(zzbbwVar.zzzk(), this, this);
        if (zzaag()) {
            return;
        }
        addView(this.zzefw.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbdd
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final zzazc zzxk() {
        return this.zzefx;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void onPause() {
        this.zzefx.onPause();
        this.zzefw.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzv() {
        this.zzefx.onDestroy();
        this.zzefw.zzzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaab() {
        setBackgroundColor(0);
        this.zzefw.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final int zzxs() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final int zzxt() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zzxu() {
        this.zzefw.zzxu();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final WebView getWebView() {
        return this.zzefw.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final void zza(String str, Map<String, ?> map) {
        this.zzefw.zza(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final void zzb(String str, JSONObject jSONObject) {
        this.zzefw.zzb(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(String str, zzaer<? super zzbbw> zzaerVar) {
        this.zzefw.zza(str, zzaerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzb(String str, zzaer<? super zzbbw> zzaerVar) {
        this.zzefw.zzb(str, zzaerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(String str, Predicate<zzaer<? super zzbbw>> predicate) {
        this.zzefw.zza(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzi() {
        this.zzefw.zzzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzdb(int i) {
        this.zzefw.zzdb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzsu() {
        this.zzefw.zzsu();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzj() {
        this.zzefw.zzzj();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zza(boolean z, long j) {
        this.zzefw.zza(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzct(String str) {
        this.zzefw.zzct(str);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zza(String str, JSONObject jSONObject) {
        this.zzefw.zza(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj, com.google.android.gms.internal.ads.zzbct
    public final Activity zzxn() {
        return this.zzefw.zzxn();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final Context zzzk() {
        return this.zzefw.zzzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final com.google.android.gms.ads.internal.zza zzxo() {
        return this.zzefw.zzxo();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final com.google.android.gms.ads.internal.overlay.zzc zzzl() {
        return this.zzefw.zzzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final IObjectWrapper zzzt() {
        return this.zzefw.zzzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final com.google.android.gms.ads.internal.overlay.zzc zzzm() {
        return this.zzefw.zzzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbdc
    public final zzbdj zzzn() {
        return this.zzefw.zzzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final String zzzo() {
        return this.zzefw.zzzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final zzbdg zzzp() {
        return this.zzefw.zzzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final WebViewClient zzzq() {
        return this.zzefw.zzzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzzr() {
        return this.zzefw.zzzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbdb
    public final zzdf zzzs() {
        return this.zzefw.zzzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj, com.google.android.gms.internal.ads.zzbde
    public final zzaxl zzxr() {
        return this.zzefw.zzxr();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbcw
    public final boolean zzzu() {
        return this.zzefw.zzzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean isDestroyed() {
        return this.zzefw.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzzw() {
        return this.zzefw.zzzw();
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzjq() {
        this.zzefw.zzjq();
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzjp() {
        this.zzefw.zzjp();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final String zzxp() {
        return this.zzefw.zzxp();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final zzzz zzxm() {
        return this.zzefw.zzxm();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final zzzy zzxq() {
        return this.zzefw.zzxq();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final zzbco zzxl() {
        return this.zzefw.zzxl();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzefw.zza(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaq(IObjectWrapper iObjectWrapper) {
        this.zzefw.zzaq(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(zzbdj zzbdjVar) {
        this.zzefw.zza(zzbdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzas(boolean z) {
        this.zzefw.zzas(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzy() {
        this.zzefw.zzzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzbr(Context context) {
        this.zzefw.zzbr(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzae(boolean z) {
        this.zzefw.zzae(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void setRequestedOrientation(int i) {
        this.zzefw.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzefw.zzb(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzat(boolean z) {
        this.zzefw.zzat(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final void zza(String str, zzbax zzbaxVar) {
        this.zzefw.zza(str, zzbaxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final zzbax zzez(String str) {
        return this.zzefw.zzez(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzz() {
        this.zzefw.zzzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void destroy() {
        IObjectWrapper zzzt = zzzt();
        if (zzzt != null) {
            com.google.android.gms.ads.internal.zzq.zzky().zzaf(zzzt);
            zzaul.zzdsu.postDelayed(new zzbch(this), ((Integer) zzuv.zzon().zzd(zzza.zzcqv)).intValue());
            return;
        }
        this.zzefw.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void loadData(String str, String str2, String str3) {
        this.zzefw.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzefw.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void loadUrl(String str) {
        this.zzefw.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzb(String str, String str2, String str3) {
        this.zzefw.zzb(str, str2, str3);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbbw
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzefw.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbbw
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zzefw.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzefw.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzefw.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void onResume() {
        this.zzefw.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaac() {
        TextView textView = new TextView(getContext());
        Resources resources = com.google.android.gms.ads.internal.zzq.zzkn().getResources();
        textView.setText(resources != null ? resources.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaq(boolean z) {
        this.zzefw.zzaq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(zzaav zzaavVar) {
        this.zzefw.zza(zzaavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(zzqr zzqrVar) {
        this.zzefw.zza(zzqrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final zzqr zzaad() {
        return this.zzefw.zzaad();
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zza(zzpk zzpkVar) {
        this.zzefw.zza(zzpkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(zzaaw zzaawVar) {
        this.zzefw.zza(zzaawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final zzaaw zzaaa() {
        return this.zzefw.zzaaa();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final void zza(zzbco zzbcoVar) {
        this.zzefw.zza(zzbcoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzzx() {
        return this.zzefw.zzzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzau(boolean z) {
        this.zzefw.zzau(z);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zzao(boolean z) {
        this.zzefw.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zzsv() {
        this.zzefw.zzsv();
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzefw.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzb(boolean z, int i) {
        this.zzefw.zzb(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zza(boolean z, int i, String str) {
        this.zzefw.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzefw.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzc(boolean z, int i) {
        if (this.zzefy.compareAndSet(false, true)) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzckd)).booleanValue()) {
                return false;
            }
            if (this.zzefw.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.zzefw.getParent()).removeView(this.zzefw.getView());
            }
            return this.zzefw.zzc(z, i);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzaae() {
        return this.zzefy.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.zzefw.zza(this, activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final zzrf zzaaf() {
        return this.zzefw.zzaaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzaag() {
        return this.zzefw.zzaag();
    }
}
