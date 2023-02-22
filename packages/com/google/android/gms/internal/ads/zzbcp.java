package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbdd;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbcp<WebViewT extends zzbct & zzbdb & zzbdd> {
    private final zzbcu zzehs;
    private final WebViewT zzeht;

    public static zzbcp<zzbbw> zzc(final zzbbw zzbbwVar) {
        return new zzbcp<>(zzbbwVar, new zzbcu(zzbbwVar) { // from class: com.google.android.gms.internal.ads.zzbcs
            private final zzbbw zzehv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehv = zzbbwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbcu
            public final void zzh(Uri uri) {
                zzbdg zzzp = this.zzehv.zzzp();
                if (zzzp == null) {
                    zzaug.zzes("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                } else {
                    zzzp.zzh(uri);
                }
            }
        });
    }

    private zzbcp(WebViewT webviewt, zzbcu zzbcuVar) {
        this.zzehs = zzbcuVar;
        this.zzeht = webviewt;
    }

    @JavascriptInterface
    public final void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzaug.zzeu("URL is empty, ignoring message");
        } else {
            zzaul.zzdsu.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbcr
                private final String zzcyz;
                private final zzbcp zzehu;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzehu = this;
                    this.zzcyz = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzehu.zzfl(this.zzcyz);
                }
            });
        }
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzaug.zzdy("Click string is empty, not proceeding.");
            return "";
        }
        zzdf zzzs = this.zzeht.zzzs();
        if (zzzs == null) {
            zzaug.zzdy("Signal utils is empty, ignoring.");
            return "";
        }
        zzdc zzcd = zzzs.zzcd();
        if (zzcd == null) {
            zzaug.zzdy("Signals object is empty, ignoring.");
            return "";
        } else if (this.zzeht.getContext() == null) {
            zzaug.zzdy("Context is null, ignoring.");
            return "";
        } else {
            return zzcd.zza(this.zzeht.getContext(), str, this.zzeht.getView(), this.zzeht.zzxn());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfl(String str) {
        this.zzehs.zzh(Uri.parse(str));
    }
}
