package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface zzbbw extends com.google.android.gms.ads.internal.zzi, zzagn, zzahk, zzazj, zzbct, zzbcw, zzbda, zzbdb, zzbdd, zzbde, zzpj {
    void destroy();

    @Override // com.google.android.gms.internal.ads.zzazj, com.google.android.gms.internal.ads.zzbct
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    @Override // com.google.android.gms.internal.ads.zzbdd
    View getView();

    WebView getWebView();

    int getWidth();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzazj
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zza(ViewGroup viewGroup, Activity activity, String str, String str2);

    void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar);

    void zza(zzaav zzaavVar);

    void zza(zzaaw zzaawVar);

    @Override // com.google.android.gms.internal.ads.zzazj
    void zza(zzbco zzbcoVar);

    void zza(zzbdj zzbdjVar);

    void zza(zzqr zzqrVar);

    void zza(String str, Predicate<zzaer<? super zzbbw>> predicate);

    void zza(String str, zzaer<? super zzbbw> zzaerVar);

    @Override // com.google.android.gms.internal.ads.zzazj
    void zza(String str, zzbax zzbaxVar);

    zzaaw zzaaa();

    void zzaab();

    void zzaac();

    zzqr zzaad();

    boolean zzaae();

    zzrf zzaaf();

    boolean zzaag();

    void zzae(boolean z);

    void zzaq(IObjectWrapper iObjectWrapper);

    void zzaq(boolean z);

    void zzas(boolean z);

    void zzat(boolean z);

    void zzau(boolean z);

    void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar);

    void zzb(String str, zzaer<? super zzbbw> zzaerVar);

    void zzb(String str, String str2, String str3);

    void zzbr(Context context);

    boolean zzc(boolean z, int i);

    void zzdb(int i);

    void zzsu();

    @Override // com.google.android.gms.internal.ads.zzazj
    zzbco zzxl();

    @Override // com.google.android.gms.internal.ads.zzazj, com.google.android.gms.internal.ads.zzbct
    Activity zzxn();

    @Override // com.google.android.gms.internal.ads.zzazj
    com.google.android.gms.ads.internal.zza zzxo();

    @Override // com.google.android.gms.internal.ads.zzazj
    zzzy zzxq();

    @Override // com.google.android.gms.internal.ads.zzazj, com.google.android.gms.internal.ads.zzbde
    zzaxl zzxr();

    void zzzi();

    void zzzj();

    Context zzzk();

    com.google.android.gms.ads.internal.overlay.zzc zzzl();

    com.google.android.gms.ads.internal.overlay.zzc zzzm();

    @Override // com.google.android.gms.internal.ads.zzbdc
    zzbdj zzzn();

    String zzzo();

    zzbdg zzzp();

    WebViewClient zzzq();

    boolean zzzr();

    @Override // com.google.android.gms.internal.ads.zzbdb
    zzdf zzzs();

    IObjectWrapper zzzt();

    @Override // com.google.android.gms.internal.ads.zzbcw
    boolean zzzu();

    void zzzv();

    boolean zzzw();

    boolean zzzx();

    void zzzy();

    void zzzz();
}
