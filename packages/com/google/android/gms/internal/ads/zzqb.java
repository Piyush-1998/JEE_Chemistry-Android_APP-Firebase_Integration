package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzqb implements Runnable {
    private ValueCallback<String> zzbpu = new zzqe(this);
    final /* synthetic */ zzpt zzbpv;
    final /* synthetic */ WebView zzbpw;
    final /* synthetic */ boolean zzbpx;
    final /* synthetic */ zzpz zzbpy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqb(zzpz zzpzVar, zzpt zzptVar, WebView webView, boolean z) {
        this.zzbpy = zzpzVar;
        this.zzbpv = zzptVar;
        this.zzbpw = webView;
        this.zzbpx = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbpw.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzbpw.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzbpu);
            } catch (Throwable unused) {
                this.zzbpu.onReceiveValue("");
            }
        }
    }
}
