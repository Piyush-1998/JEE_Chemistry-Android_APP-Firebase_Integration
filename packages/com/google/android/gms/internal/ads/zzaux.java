package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzaux extends zzauy {
    @Override // com.google.android.gms.internal.ads.zzaur
    public final int zzvt() {
        return 16974374;
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public final CookieManager zzbd(Context context) {
        if (zzvs()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzaug.zzc("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzq.zzkn().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public final zzbbv zza(zzbbw zzbbwVar, zzsd zzsdVar, boolean z) {
        return new zzbcx(zzbbwVar, zzsdVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public final WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
