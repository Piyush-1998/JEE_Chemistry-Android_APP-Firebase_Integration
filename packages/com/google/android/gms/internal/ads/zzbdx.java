package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbdx extends zzbdw implements zzbec {
    private boolean zzegn;
    private boolean zzehg;
    private final zzbdv zzeig;

    public zzbdx(Context context, zzbdv zzbdvVar) {
        super(context);
        com.google.android.gms.ads.internal.zzq.zzkn().zzue();
        this.zzeig = zzbdvVar;
        super.setWebViewClient(zzbdvVar);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    protected void zzaw(boolean z) {
    }

    public final synchronized boolean isDestroyed() {
        return this.zzegn;
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.zzegn) {
            return;
        }
        this.zzegn = true;
        this.zzeig.zza(this);
        zzaw(false);
        zzaug.zzdy("Initiating WebView self destruct sequence in 3...");
        zzaug.zzdy("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzaug.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbec
    public final synchronized void zza(zzbdy zzbdyVar) {
        zzaug.zzdy("Blank page loaded, 1...");
        zzzv();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void zzzv() {
        zzaug.zzdy("Destroying WebView!");
        zzuf();
        zzaxn.zzdwm.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbea
            private final zzbdx zzeii;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeii = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeii.zzaay();
            }
        });
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    zzaw(true);
                }
                zzuf();
            }
        } finally {
            super.finalize();
        }
    }

    private final synchronized void zzuf() {
        if (!this.zzehg) {
            this.zzehg = true;
            com.google.android.gms.ads.internal.zzq.zzkn().zzuf();
        }
    }

    @Override // android.webkit.WebView
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            zzaug.zzeu("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzbdw, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            zzaug.zzeu("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzaug.zzeu("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzaug.zzeu("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbbw
    public void onPause() {
        if (isDestroyed()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbbw
    public void onResume() {
        if (isDestroyed()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        super.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzbdw, android.webkit.WebView
    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbdw, com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzahk
    public /* bridge */ /* synthetic */ void zzct(String str) {
        super.zzct(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaay() {
        super.destroy();
    }
}
