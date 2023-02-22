package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzsf;
import com.google.android.gms.internal.ads.zzsp;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzbdr extends zzbdx implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzagv, zzbbw {
    private int maxHeight;
    private int maxWidth;
    private String zzabd;
    private final zzaxl zzblk;
    private final WindowManager zzbnk;
    private int zzdgn;
    private int zzdgo;
    private boolean zzdia;
    private String zzdje;
    private zzzz zzeat;
    private final zzsd zzeen;
    private final zzbdk zzega;
    private final zzdf zzegb;
    private final com.google.android.gms.ads.internal.zzi zzegc;
    private final com.google.android.gms.ads.internal.zza zzegd;
    private final zzrf zzegf;
    private final boolean zzegg;
    private com.google.android.gms.ads.internal.overlay.zzc zzegk;
    private zzbdj zzegm;
    private boolean zzego;
    private boolean zzegp;
    private int zzegq;
    private boolean zzegr;
    private boolean zzegs;
    private zzbco zzegt;
    private boolean zzegu;
    private boolean zzegv;
    private zzaaw zzegw;
    private zzaav zzegx;
    private zzqr zzegy;
    private int zzegz;
    private int zzeha;
    private zzzz zzehb;
    private zzzz zzehc;
    private zzzy zzehd;
    private WeakReference<View.OnClickListener> zzehe;
    private com.google.android.gms.ads.internal.overlay.zzc zzehf;
    private zzawv zzehh;
    private Map<String, zzbax> zzehi;
    private final zzbdm zzeic;
    private final AtomicReference<IObjectWrapper> zzeid;
    private final DisplayMetrics zzwl;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbdr(zzbdk zzbdkVar, zzbdm zzbdmVar, zzbdj zzbdjVar, String str, boolean z, boolean z2, zzdf zzdfVar, zzaxl zzaxlVar, zzaab zzaabVar, com.google.android.gms.ads.internal.zzi zziVar, com.google.android.gms.ads.internal.zza zzaVar, zzsd zzsdVar, zzrf zzrfVar, boolean z3) {
        super(zzbdkVar, zzbdmVar);
        this.zzegr = true;
        this.zzegs = false;
        this.zzdje = "";
        this.zzeid = new AtomicReference<>();
        this.zzdgo = -1;
        this.zzdgn = -1;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.zzega = zzbdkVar;
        this.zzeic = zzbdmVar;
        this.zzegm = zzbdjVar;
        this.zzabd = str;
        this.zzego = z;
        this.zzegq = -1;
        this.zzegb = zzdfVar;
        this.zzblk = zzaxlVar;
        this.zzegc = zziVar;
        this.zzegd = zzaVar;
        this.zzbnk = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzq.zzkj();
        this.zzwl = zzaul.zza(this.zzbnk);
        this.zzeen = zzsdVar;
        this.zzegf = zzrfVar;
        this.zzegg = z3;
        this.zzehh = new zzawv(this.zzega.zzxn(), this, this, null);
        com.google.android.gms.ads.internal.zzq.zzkj().zza(zzbdkVar, zzaxlVar.zzblz, getSettings());
        setDownloadListener(this);
        zzaak();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzbcp.zzc(this), "googleAdsJsInterface");
        }
        zzaao();
        zzzy zzzyVar = new zzzy(new zzaab(true, "make_wv", this.zzabd));
        this.zzehd = zzzyVar;
        zzzyVar.zzpy().zzc(zzaabVar);
        zzzz zzb = zzzs.zzb(this.zzehd.zzpy());
        this.zzeat = zzb;
        this.zzehd.zza("native:view_create", zzb);
        this.zzehc = null;
        this.zzehb = null;
        com.google.android.gms.ads.internal.zzq.zzkl().zzbc(zzbdkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbdd
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final void zza(String str, Map map) {
        zzagu.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zza(String str, JSONObject jSONObject) {
        zzagu.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzaae() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagn
    public final void zzb(String str, JSONObject jSONObject) {
        zzagu.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final void zzk(String str, String str2) {
        zzagu.zza(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final zzazc zzxk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdx, com.google.android.gms.internal.ads.zzbbw
    public final void zzzv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final com.google.android.gms.ads.internal.zza zzxo() {
        return this.zzegd;
    }

    private final boolean zzaah() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzeic.zzyw() || this.zzeic.zzyx()) {
            zzuv.zzoj();
            DisplayMetrics displayMetrics = this.zzwl;
            int zzb = zzawy.zzb(displayMetrics, displayMetrics.widthPixels);
            zzuv.zzoj();
            DisplayMetrics displayMetrics2 = this.zzwl;
            int zzb2 = zzawy.zzb(displayMetrics2, displayMetrics2.heightPixels);
            Activity zzxn = this.zzega.zzxn();
            if (zzxn == null || zzxn.getWindow() == null) {
                i = zzb;
                i2 = zzb2;
            } else {
                com.google.android.gms.ads.internal.zzq.zzkj();
                int[] zzd = zzaul.zzd(zzxn);
                zzuv.zzoj();
                int zzb3 = zzawy.zzb(this.zzwl, zzd[0]);
                zzuv.zzoj();
                i2 = zzawy.zzb(this.zzwl, zzd[1]);
                i = zzb3;
            }
            if (this.zzdgn == zzb && this.zzdgo == zzb2 && this.maxWidth == i && this.maxHeight == i2) {
                return false;
            }
            z = (this.zzdgn == zzb && this.zzdgo == zzb2) ? true : true;
            this.zzdgn = zzb;
            this.zzdgo = zzb2;
            this.maxWidth = i;
            this.maxHeight = i2;
            new zzanj(this).zza(zzb, zzb2, i, i2, this.zzwl.density, this.zzbnk.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zzb(String str, String str2, String str3) {
        super.loadDataWithBaseURL(str, zzbcz.zzf(str2, zzbcz.zzaaq()), "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdx, com.google.android.gms.internal.ads.zzbdw, com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzahk
    public final synchronized void zzct(String str) {
        if (!isDestroyed()) {
            super.zzct(str);
        } else {
            zzaug.zzeu("The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzi() {
        zzaaj();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzblk.zzblz);
        zzagu.zza(this, "onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzdb(int i) {
        if (i == 0) {
            zzzs.zza(this.zzehd.zzpy(), this.zzeat, "aebb2");
        }
        zzaaj();
        if (this.zzehd.zzpy() != null) {
            this.zzehd.zzpy().zzj("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzblk.zzblz);
        zzagu.zza(this, "onhide", hashMap);
    }

    private final void zzaaj() {
        zzzs.zza(this.zzehd.zzpy(), this.zzeat, "aeh2");
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzsu() {
        if (this.zzehb == null) {
            zzzs.zza(this.zzehd.zzpy(), this.zzeat, "aes2");
            zzzz zzb = zzzs.zzb(this.zzehd.zzpy());
            this.zzehb = zzb;
            this.zzehd.zza("native:view_show", zzb);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzblk.zzblz);
        zzagu.zza(this, "onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzj() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzq.zzko().zzot()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzq.zzko().zzos()));
        hashMap.put("device_volume", String.valueOf(zzave.zzbe(getContext())));
        zzagu.zza(this, "volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zzagu.zza(this, "onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized com.google.android.gms.ads.internal.overlay.zzc zzzl() {
        return this.zzegk;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final IObjectWrapper zzzt() {
        return this.zzeid.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized com.google.android.gms.ads.internal.overlay.zzc zzzm() {
        return this.zzehf;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbdc
    public final synchronized zzbdj zzzn() {
        return this.zzegm;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized String zzzo() {
        return this.zzabd;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final WebViewClient zzzq() {
        return this.zzeic;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized boolean zzzr() {
        return this.zzdia;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbdb
    public final zzdf zzzs() {
        return this.zzegb;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj, com.google.android.gms.internal.ads.zzbde
    public final zzaxl zzxr() {
        return this.zzblk;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzbcw
    public final synchronized boolean zzzu() {
        return this.zzego;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzq.zzkj();
            zzaul.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzaug.zzdv(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdx, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzeic.zzyx()) {
            synchronized (this) {
                if (this.zzegw != null) {
                    this.zzegw.zzc(motionEvent);
                }
            }
        } else {
            zzdf zzdfVar = this.zzegb;
            if (zzdfVar != null) {
                zzdfVar.zzb(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8 A[Catch: all -> 0x01f3, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ca, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0155, B:96:0x0172, B:98:0x01cf, B:99:0x01d3, B:102:0x01d8, B:104:0x01de, B:105:0x01e1, B:108:0x01ee), top: B:114:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141 A[Catch: all -> 0x01f3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ca, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0155, B:96:0x0172, B:98:0x01cf, B:99:0x01d3, B:102:0x01d8, B:104:0x01de, B:105:0x01e1, B:108:0x01ee), top: B:114:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172 A[Catch: all -> 0x01f3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ca, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0155, B:96:0x0172, B:98:0x01cf, B:99:0x01d3, B:102:0x01d8, B:104:0x01de, B:105:0x01e1, B:108:0x01ee), top: B:114:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdr.onMeasure(int, int):void");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaah = zzaah();
        com.google.android.gms.ads.internal.overlay.zzc zzzl = zzzl();
        if (zzzl == null || !zzaah) {
            return;
        }
        zzzl.zzst();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzegk = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaq(IObjectWrapper iObjectWrapper) {
        this.zzeid.set(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzehf = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zza(zzbdj zzbdjVar) {
        this.zzegm = zzbdjVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zzas(boolean z) {
        boolean z2 = z != this.zzego;
        this.zzego = z;
        zzaak();
        if (z2) {
            if (!((Boolean) zzuv.zzon().zzd(zzza.zzcii)).booleanValue() || !this.zzegm.zzaau()) {
                new zzanj(this).zzdp(z ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzy() {
        this.zzehh.zzwf();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzehh.onAttachedToWindow();
        }
        boolean z = this.zzegu;
        if (this.zzeic != null && this.zzeic.zzyx()) {
            if (!this.zzegv) {
                this.zzeic.zzyy();
                this.zzeic.zzyz();
                this.zzegv = true;
            }
            zzaah();
            z = true;
        }
        zzav(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzehh.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzegv && this.zzeic != null && this.zzeic.zzyx() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzeic.zzyy();
                this.zzeic.zzyz();
                this.zzegv = false;
            }
        }
        zzav(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzbr(Context context) {
        this.zzega.setBaseContext(context);
        this.zzehh.zzh(this.zzega.zzxn());
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zzae(boolean z) {
        if (this.zzegk != null) {
            this.zzegk.zza(this.zzeic.zzyw(), z);
        } else {
            this.zzdia = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void setRequestedOrientation(int i) {
        this.zzegq = i;
        if (this.zzegk != null) {
            this.zzegk.setRequestedOrientation(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj, com.google.android.gms.internal.ads.zzbct
    public final Activity zzxn() {
        return this.zzega.zzxn();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final Context zzzk() {
        return this.zzega.zzzk();
    }

    private final synchronized void zzaak() {
        if (!this.zzego && !this.zzegm.zzaau()) {
            if (Build.VERSION.SDK_INT < 18) {
                zzaug.zzdv("Disabling hardware acceleration on an AdView.");
                zzaal();
                return;
            }
            zzaug.zzdv("Enabling hardware acceleration on an AdView.");
            zzaam();
            return;
        }
        zzaug.zzdv("Enabling hardware acceleration on an overlay.");
        zzaam();
    }

    private final synchronized void zzaal() {
        if (!this.zzegp) {
            com.google.android.gms.ads.internal.zzq.zzkl();
            setLayerType(1, null);
        }
        this.zzegp = true;
    }

    private final synchronized void zzaam() {
        if (this.zzegp) {
            com.google.android.gms.ads.internal.zzq.zzkl();
            setLayerType(0, null);
        }
        this.zzegp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    protected final synchronized void zzaw(boolean z) {
        if (!z) {
            zzaao();
            this.zzehh.zzwg();
            if (this.zzegk != null) {
                this.zzegk.close();
                this.zzegk.onDestroy();
                this.zzegk = null;
            }
        }
        this.zzeid.set(null);
        this.zzeic.destroy();
        com.google.android.gms.ads.internal.zzq.zzlf();
        zzbay.zzc(this);
        zzaan();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbdx, android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        zzbdm zzbdmVar = this.zzeic;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzzz() {
        if (this.zzehc == null) {
            zzzz zzb = zzzs.zzb(this.zzehd.zzpy());
            this.zzehc = zzb;
            this.zzehd.zza("native:view_load", zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdx, android.webkit.WebView, com.google.android.gms.internal.ads.zzbbw
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            zzaug.zzc("Could not pause webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdx, android.webkit.WebView, com.google.android.gms.internal.ads.zzbbw
    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            zzaug.zzc("Could not resume webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaac() {
        zzaug.zzdy("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaq(boolean z) {
        this.zzeic.zzaq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdx, android.webkit.WebView
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzaug.zzc("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zzat(boolean z) {
        this.zzegr = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized boolean zzzw() {
        return this.zzegr;
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final synchronized void zzjp() {
        this.zzegs = true;
        if (this.zzegc != null) {
            this.zzegc.zzjp();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final synchronized void zzjq() {
        this.zzegs = false;
        if (this.zzegc != null) {
            this.zzegc.zzjq();
        }
    }

    private final synchronized void zzaan() {
        if (this.zzehi != null) {
            for (zzbax zzbaxVar : this.zzehi.values()) {
                zzbaxVar.release();
            }
        }
        this.zzehi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final synchronized void zza(String str, zzbax zzbaxVar) {
        if (this.zzehi == null) {
            this.zzehi = new HashMap();
        }
        this.zzehi.put(str, zzbaxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final synchronized zzbax zzez(String str) {
        if (this.zzehi == null) {
            return null;
        }
        return this.zzehi.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final synchronized String zzxp() {
        return this.zzdje;
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final zzzz zzxm() {
        return this.zzeat;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final zzzy zzxq() {
        return this.zzehd;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbbw
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzehe = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zza(zzaaw zzaawVar) {
        this.zzegw = zzaawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized zzaaw zzaaa() {
        return this.zzegw;
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final synchronized void zzxu() {
        if (this.zzegx != null) {
            this.zzegx.zzqj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zza(zzaav zzaavVar) {
        this.zzegx = zzaavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zza(zzqr zzqrVar) {
        this.zzegy = zzqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized zzqr zzaad() {
        return this.zzegy;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final synchronized zzbco zzxl() {
        return this.zzegt;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw, com.google.android.gms.internal.ads.zzazj
    public final synchronized void zza(zzbco zzbcoVar) {
        if (this.zzegt != null) {
            zzaug.zzes("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzegt = zzbcoVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized boolean zzzx() {
        return this.zzegz > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final synchronized void zzau(boolean z) {
        int i = this.zzegz + (z ? 1 : -1);
        this.zzegz = i;
        if (i <= 0 && this.zzegk != null) {
            this.zzegk.zzsw();
        }
    }

    private final void zzaao() {
        zzaab zzpy;
        zzzy zzzyVar = this.zzehd;
        if (zzzyVar == null || (zzpy = zzzyVar.zzpy()) == null || com.google.android.gms.ads.internal.zzq.zzkn().zzub() == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzkn().zzub().zza(zzpy);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzaab() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zzao(boolean z) {
        this.zzeic.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zzsv() {
        com.google.android.gms.ads.internal.overlay.zzc zzzl = zzzl();
        if (zzzl != null) {
            zzzl.zzsv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final int zzxs() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final int zzxt() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzeic.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzb(boolean z, int i) {
        this.zzeic.zzb(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zza(boolean z, int i, String str) {
        this.zzeic.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzeic.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zza(zzpk zzpkVar) {
        synchronized (this) {
            this.zzegu = zzpkVar.zzbnp;
        }
        zzav(zzpkVar.zzbnp);
    }

    private final void zzav(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zzagu.zza(this, "onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(String str, zzaer<? super zzbbw> zzaerVar) {
        zzbdm zzbdmVar = this.zzeic;
        if (zzbdmVar != null) {
            zzbdmVar.zza(str, zzaerVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzb(String str, zzaer<? super zzbbw> zzaerVar) {
        zzbdm zzbdmVar = this.zzeic;
        if (zzbdmVar != null) {
            zzbdmVar.zzb(str, zzaerVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(String str, Predicate<zzaer<? super zzbbw>> predicate) {
        zzbdm zzbdmVar = this.zzeic;
        if (zzbdmVar != null) {
            zzbdmVar.zza(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzc(final boolean z, final int i) {
        destroy();
        this.zzeen.zza(new zzsg(z, i) { // from class: com.google.android.gms.internal.ads.zzbdu
            private final int zzdtk;
            private final boolean zzefz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzefz = z;
                this.zzdtk = i;
            }

            @Override // com.google.android.gms.internal.ads.zzsg
            public final void zza(zztl zztlVar) {
                zzbdr.zza(this.zzefz, this.zzdtk, zztlVar);
            }
        });
        this.zzeen.zza(zzsf.zza.EnumC0018zza.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!zzaag()) {
            zzaug.zzdy("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        zzaug.zzdy("Initializing ArWebView object.");
        this.zzegf.zza(activity, this);
        this.zzegf.zze(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.zzegf.getView());
        } else {
            zzaug.zzes("The FrameLayout object cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final zzrf zzaaf() {
        return this.zzegf;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final boolean zzaag() {
        return ((Boolean) zzuv.zzon().zzd(zzza.zzcth)).booleanValue() && this.zzegf != null && this.zzegg;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final /* synthetic */ zzbdg zzzp() {
        return this.zzeic;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(boolean z, int i, zztl zztlVar) {
        zzsp.zzw.zza zznv = zzsp.zzw.zznv();
        if (zznv.zznu() != z) {
            zznv.zzp(z);
        }
        zztlVar.zzcaz = (zzsp.zzw) ((zzdqw) zznv.zzce(i).zzazr());
    }
}
