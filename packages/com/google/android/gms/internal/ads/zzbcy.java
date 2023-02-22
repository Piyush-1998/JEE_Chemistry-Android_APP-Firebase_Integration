package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzbcy extends zzbbv {
    public zzbcy(zzbbw zzbbwVar, zzsd zzsdVar, boolean z) {
        super(zzbbwVar, zzsdVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zza(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbbw)) {
            zzaug.zzeu("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbbw zzbbwVar = (zzbbw) webView;
        if (this.zzeew != null) {
            this.zzeew.zza(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzd(str, map);
        }
        if (zzbbwVar.zzzp() != null) {
            zzbbwVar.zzzp().zzsq();
        }
        if (zzbbwVar.zzzn().zzaau()) {
            str2 = (String) zzuv.zzon().zzd(zzza.zzcig);
        } else if (zzbbwVar.zzzu()) {
            str2 = (String) zzuv.zzon().zzd(zzza.zzcif);
        } else {
            str2 = (String) zzuv.zzon().zzd(zzza.zzcie);
        }
        com.google.android.gms.ads.internal.zzq.zzkj();
        return zzaul.zzd(zzbbwVar.getContext(), zzbbwVar.zzxr().zzblz, str2);
    }
}
