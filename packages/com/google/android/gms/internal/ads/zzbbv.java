package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzsf;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbbv extends WebViewClient implements zzbdg {
    private static final String[] zzeek = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] zzeel = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private final Object lock;
    private boolean zzbma;
    private zztp zzcbs;
    private zzadw zzcxc;
    private zzady zzcxd;
    private com.google.android.gms.ads.internal.zzc zzcxx;
    private zzamz zzcxy;
    private com.google.android.gms.ads.internal.overlay.zzo zzdhy;
    private com.google.android.gms.ads.internal.overlay.zzt zzdic;
    private boolean zzdlr;
    protected zzbbw zzeem;
    private final zzsd zzeen;
    private final HashMap<String, List<zzaer<? super zzbbw>>> zzeeo;
    private zzbdf zzeep;
    private zzbdi zzeeq;
    private zzbdh zzeer;
    private boolean zzees;
    private boolean zzeet;
    private boolean zzeeu;
    private final zzang zzeev;
    protected zzasi zzeew;
    private boolean zzeex;
    private boolean zzeey;
    private int zzeez;
    private View.OnAttachStateChangeListener zzefa;

    public zzbbv(zzbbw zzbbwVar, zzsd zzsdVar, boolean z) {
        this(zzbbwVar, zzsdVar, z, new zzang(zzbbwVar, zzbbwVar.zzzk(), new zzyl(zzbbwVar.getContext())), null);
    }

    private zzbbv(zzbbw zzbbwVar, zzsd zzsdVar, boolean z, zzang zzangVar, zzamz zzamzVar) {
        this.zzeeo = new HashMap<>();
        this.lock = new Object();
        this.zzees = false;
        this.zzeen = zzsdVar;
        this.zzeem = zzbbwVar;
        this.zzbma = z;
        this.zzeev = zzangVar;
        this.zzcxy = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zza(int i, int i2, boolean z) {
        this.zzeev.zzi(i, i2);
        zzamz zzamzVar = this.zzcxy;
        if (zzamzVar != null) {
            zzamzVar.zza(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zza(zztp zztpVar, zzadw zzadwVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzady zzadyVar, com.google.android.gms.ads.internal.overlay.zzt zztVar, boolean z, zzaeq zzaeqVar, com.google.android.gms.ads.internal.zzc zzcVar, zzani zzaniVar, zzasi zzasiVar) {
        if (zzcVar == null) {
            zzcVar = new com.google.android.gms.ads.internal.zzc(this.zzeem.getContext(), zzasiVar, null);
        }
        this.zzcxy = new zzamz(this.zzeem, zzaniVar);
        this.zzeew = zzasiVar;
        if (((Boolean) zzuv.zzon().zzd(zzza.zzckl)).booleanValue()) {
            zza("/adMetadata", new zzadx(zzadwVar));
        }
        zza("/appEvent", new zzadz(zzadyVar));
        zza("/backButton", zzaea.zzcxn);
        zza("/refresh", zzaea.zzcxo);
        zza("/canOpenURLs", zzaea.zzcxe);
        zza("/canOpenIntents", zzaea.zzcxf);
        zza("/click", zzaea.zzcxg);
        zza("/close", zzaea.zzcxh);
        zza("/customClose", zzaea.zzcxi);
        zza("/instrument", zzaea.zzcxr);
        zza("/delayPageLoaded", zzaea.zzcxt);
        zza("/delayPageClosed", zzaea.zzcxu);
        zza("/getLocationInfo", zzaea.zzcxv);
        zza("/httpTrack", zzaea.zzcxj);
        zza("/log", zzaea.zzcxk);
        zza("/mraid", new zzaes(zzcVar, this.zzcxy, zzaniVar));
        zza("/mraidLoaded", this.zzeev);
        zza("/open", new zzaev(zzcVar, this.zzcxy));
        zza("/precache", new zzbbg());
        zza("/touch", zzaea.zzcxm);
        zza("/video", zzaea.zzcxp);
        zza("/videoMeta", zzaea.zzcxq);
        if (com.google.android.gms.ads.internal.zzq.zzlh().zzab(this.zzeem.getContext())) {
            zza("/logScionEvent", new zzaet(this.zzeem.getContext()));
        }
        this.zzcbs = zztpVar;
        this.zzdhy = zzoVar;
        this.zzcxc = zzadwVar;
        this.zzcxd = zzadyVar;
        this.zzdic = zztVar;
        this.zzcxx = zzcVar;
        this.zzees = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final com.google.android.gms.ads.internal.zzc zzyv() {
        return this.zzcxx;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final boolean zzyw() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzbma;
        }
        return z;
    }

    public final boolean zzyx() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeet;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzyy() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzyz() {
        synchronized (this.lock) {
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzrf zzaaf = this.zzeem.zzaaf();
        if (zzaaf != null && webView == zzaaf.getWebView()) {
            zzaaf.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.lock) {
            if (this.zzeem.isDestroyed()) {
                zzaug.zzdy("Blank page loaded, 1...");
                this.zzeem.zzzv();
                return;
            }
            this.zzeex = true;
            zzbdi zzbdiVar = this.zzeeq;
            if (zzbdiVar != null) {
                zzbdiVar.zzrf();
                this.zzeeq = null;
            }
            zzzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view, zzasi zzasiVar, int i) {
        if (!zzasiVar.zztn() || i <= 0) {
            return;
        }
        zzasiVar.zzj(view);
        if (zzasiVar.zztn()) {
            zzaul.zzdsu.postDelayed(new zzbca(this, view, zzasiVar, i), 100L);
        }
    }

    private final void zzza() {
        if (this.zzefa == null) {
            return;
        }
        this.zzeem.getView().removeOnAttachStateChangeListener(this.zzefa);
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzzb() {
        zzasi zzasiVar = this.zzeew;
        if (zzasiVar != null) {
            WebView webView = this.zzeem.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza(webView, zzasiVar, 10);
                return;
            }
            zzza();
            this.zzefa = new zzbbz(this, zzasiVar);
            this.zzeem.getView().addOnAttachStateChangeListener(this.zzefa);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzzc() {
        synchronized (this.lock) {
            this.zzeeu = true;
        }
        this.zzeez++;
        zzzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzzd() {
        this.zzeez--;
        zzzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzze() {
        zzsd zzsdVar = this.zzeen;
        if (zzsdVar != null) {
            zzsdVar.zza(zzsf.zza.EnumC0018zza.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzeey = true;
        zzzf();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcrz)).booleanValue()) {
            this.zzeem.destroy();
        }
    }

    private final void zzzf() {
        if (this.zzeep != null && ((this.zzeex && this.zzeez <= 0) || this.zzeey)) {
            this.zzeep.zzad(!this.zzeey);
            this.zzeep = null;
        }
        this.zzeem.zzzz();
    }

    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        boolean zzzu = this.zzeem.zzzu();
        zza(new AdOverlayInfoParcel(zzdVar, (!zzzu || this.zzeem.zzzn().zzaau()) ? this.zzcbs : null, zzzu ? null : this.zzdhy, this.zzdic, this.zzeem.zzxr()));
    }

    public final void zzb(boolean z, int i) {
        zztp zztpVar = (!this.zzeem.zzzu() || this.zzeem.zzzn().zzaau()) ? this.zzcbs : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzdhy;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdic;
        zzbbw zzbbwVar = this.zzeem;
        zza(new AdOverlayInfoParcel(zztpVar, zzoVar, zztVar, zzbbwVar, z, i, zzbbwVar.zzxr()));
    }

    public final void zza(boolean z, int i, String str) {
        boolean zzzu = this.zzeem.zzzu();
        zztp zztpVar = (!zzzu || this.zzeem.zzzn().zzaau()) ? this.zzcbs : null;
        zzbcc zzbccVar = zzzu ? null : new zzbcc(this.zzeem, this.zzdhy);
        zzadw zzadwVar = this.zzcxc;
        zzady zzadyVar = this.zzcxd;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdic;
        zzbbw zzbbwVar = this.zzeem;
        zza(new AdOverlayInfoParcel(zztpVar, zzbccVar, zzadwVar, zzadyVar, zztVar, zzbbwVar, z, i, str, zzbbwVar.zzxr()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzzu = this.zzeem.zzzu();
        zztp zztpVar = (!zzzu || this.zzeem.zzzn().zzaau()) ? this.zzcbs : null;
        zzbcc zzbccVar = zzzu ? null : new zzbcc(this.zzeem, this.zzdhy);
        zzadw zzadwVar = this.zzcxc;
        zzady zzadyVar = this.zzcxd;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdic;
        zzbbw zzbbwVar = this.zzeem;
        zza(new AdOverlayInfoParcel(zztpVar, zzbccVar, zzadwVar, zzadyVar, zztVar, zzbbwVar, z, i, str, str2, zzbbwVar.zzxr()));
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzamz zzamzVar = this.zzcxy;
        boolean zzsk = zzamzVar != null ? zzamzVar.zzsk() : false;
        com.google.android.gms.ads.internal.zzq.zzki();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzeem.getContext(), adOverlayInfoParcel, !zzsk);
        if (this.zzeew != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdhx != null) {
                str = adOverlayInfoParcel.zzdhx.url;
            }
            this.zzeew.zzdq(str);
        }
    }

    public final void zza(String str, zzaer<? super zzbbw> zzaerVar) {
        synchronized (this.lock) {
            List<zzaer<? super zzbbw>> list = this.zzeeo.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.zzeeo.put(str, list);
            }
            list.add(zzaerVar);
        }
    }

    public final void zzb(String str, zzaer<? super zzbbw> zzaerVar) {
        synchronized (this.lock) {
            List<zzaer<? super zzbbw>> list = this.zzeeo.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzaerVar);
        }
    }

    public final void zza(String str, Predicate<zzaer<? super zzbbw>> predicate) {
        synchronized (this.lock) {
            List<zzaer<? super zzbbw>> list = this.zzeeo.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzaer<? super zzbbw> zzaerVar : list) {
                if (predicate.apply(zzaerVar)) {
                    arrayList.add(zzaerVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void reset() {
        zzasi zzasiVar = this.zzeew;
        if (zzasiVar != null) {
            zzasiVar.zztp();
            this.zzeew = null;
        }
        zzza();
        synchronized (this.lock) {
            this.zzeeo.clear();
            this.zzcbs = null;
            this.zzdhy = null;
            this.zzeep = null;
            this.zzeeq = null;
            this.zzcxc = null;
            this.zzcxd = null;
            this.zzees = false;
            this.zzbma = false;
            this.zzeet = false;
            this.zzeeu = false;
            this.zzdic = null;
            this.zzeer = null;
            if (this.zzcxy != null) {
                this.zzcxy.zzv(true);
                this.zzcxy = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zza(zzbdf zzbdfVar) {
        this.zzeep = zzbdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zza(zzbdi zzbdiVar) {
        this.zzeeq = zzbdiVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaug.zzdy(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf;
        if (i < 0) {
            int i2 = (-i) - 1;
            String[] strArr = zzeek;
            if (i2 < strArr.length) {
                valueOf = strArr[i2];
                zze(this.zzeem.getContext(), "http_err", valueOf, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        valueOf = String.valueOf(i);
        zze(this.zzeem.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String valueOf;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = zzeel;
                if (primaryError < strArr.length) {
                    valueOf = strArr[primaryError];
                    Context context = this.zzeem.getContext();
                    com.google.android.gms.ads.internal.zzq.zzkl();
                    zze(context, "ssl_err", valueOf, sslError.getUrl());
                }
            }
            valueOf = String.valueOf(primaryError);
            Context context2 = this.zzeem.getContext();
            com.google.android.gms.ads.internal.zzq.zzkl();
            zze(context2, "ssl_err", valueOf, sslError.getUrl());
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    private final void zze(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmd)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_ERROR, str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    com.google.android.gms.ads.internal.zzq.zzkj().zza(context, this.zzeem.zzxr().zzblz, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            com.google.android.gms.ads.internal.zzq.zzkj().zza(context, this.zzeem.zzxr().zzblz, "gmob-apps", bundle, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaug.zzdy(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        } else {
            if (this.zzees && webView == this.zzeem.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zztp zztpVar = this.zzcbs;
                    if (zztpVar != null) {
                        zztpVar.onAdClicked();
                        zzasi zzasiVar = this.zzeew;
                        if (zzasiVar != null) {
                            zzasiVar.zzdq(str);
                        }
                        this.zzcbs = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzeem.getWebView().willNotDraw()) {
                try {
                    zzdf zzzs = this.zzeem.zzzs();
                    if (zzzs != null && zzzs.zzc(parse)) {
                        parse = zzzs.zza(parse, this.zzeem.getContext(), this.zzeem.getView(), this.zzeem.zzxn());
                    }
                } catch (zzdi unused) {
                    String valueOf2 = String.valueOf(str);
                    zzaug.zzeu(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zzc zzcVar = this.zzcxx;
                if (zzcVar == null || zzcVar.zzjk()) {
                    zza(new com.google.android.gms.ads.internal.overlay.zzd("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.zzcxx.zzbl(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzaug.zzeu(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzd(str, Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzd(String str, Map<String, String> map) {
        zzro zza;
        try {
            String zzd = zzate.zzd(str, this.zzeem.getContext(), this.zzdlr);
            if (!zzd.equals(str)) {
                return zze(zzd, map);
            }
            zzrp zzbt = zzrp.zzbt(str);
            if (zzbt != null && (zza = com.google.android.gms.ads.internal.zzq.zzkp().zza(zzbt)) != null && zza.zzmi()) {
                return new WebResourceResponse("", "", zza.zzmj());
            }
            if (zzaxc.isEnabled()) {
                if (((Boolean) zzuv.zzon().zzd(zzza.zzcls)).booleanValue()) {
                    return zze(str, map);
                }
                return null;
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "AdWebViewClient.interceptRequest");
            return zzzg();
        }
    }

    private static WebResourceResponse zzzg() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcka)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
        com.google.android.gms.ads.internal.zzq.zzkj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
        return com.google.android.gms.internal.ads.zzaul.zzd(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse zze(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbv.zze(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzao(boolean z) {
        this.zzees = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final zzasi zzzh() {
        return this.zzeew;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzsq() {
        synchronized (this.lock) {
            this.zzees = false;
            this.zzbma = true;
            zzaxn.zzdwm.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbby
                private final zzbbv zzefb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzefb = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbbv zzbbvVar = this.zzefb;
                    zzbbvVar.zzeem.zzzy();
                    com.google.android.gms.ads.internal.overlay.zzc zzzl = zzbbvVar.zzeem.zzzl();
                    if (zzzl != null) {
                        zzzl.zzsq();
                    }
                }
            });
        }
    }

    public final void zzaq(boolean z) {
        this.zzdlr = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzh(int i, int i2) {
        zzamz zzamzVar = this.zzcxy;
        if (zzamzVar != null) {
            zzamzVar.zzh(i, i2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzh(Uri uri) {
        final String path = uri.getPath();
        List<zzaer<? super zzbbw>> list = this.zzeeo.get(path);
        if (list != null) {
            com.google.android.gms.ads.internal.zzq.zzkj();
            Map<String, String> zzi = zzaul.zzi(uri);
            if (zzaug.isLoggable(2)) {
                String valueOf = String.valueOf(path);
                zzaug.zzdy(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String str : zzi.keySet()) {
                    String str2 = zzi.get(str);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length());
                    sb.append("  ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str2);
                    zzaug.zzdy(sb.toString());
                }
            }
            for (zzaer<? super zzbbw> zzaerVar : list) {
                zzaerVar.zza(this.zzeem, zzi);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        zzaug.zzdy(sb2.toString());
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzctw)).booleanValue() || com.google.android.gms.ads.internal.zzq.zzkn().zzub() == null) {
            return;
        }
        zzaxn.zzdwi.execute(new Runnable(path) { // from class: com.google.android.gms.internal.ads.zzbbx
            private final String zzczh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczh = path;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.zzq.zzkn().zzub().zzcm(this.zzczh.substring(1));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zzar(boolean z) {
        synchronized (this.lock) {
            this.zzeet = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzeem.zzc(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
