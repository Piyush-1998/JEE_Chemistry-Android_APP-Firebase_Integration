package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbrq implements zzrf {
    private zzdag zzfie;

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zza(Activity activity, WebView webView) {
        try {
            this.zzfie = new zzdag(activity, webView);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            zzaug.zzes(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zze(String str, String str2) {
        if (this.zzfie == null) {
            zzaug.zzes("ArWebView is not initialized.");
        } else {
            zzdag.getWebView().loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final WebView getWebView() {
        if (this.zzfie == null) {
            return null;
        }
        return zzdag.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final View getView() {
        return this.zzfie;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.zzfie != null) {
            zzdag.onPageStarted(webView, str, bitmap);
        }
    }
}
