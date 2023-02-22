package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgz implements zzbgs {
    private final Context zzlk;

    public zzbgz(Context context) {
        this.zzlk = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzk(Map<String, String> map) {
        CookieManager zzbd;
        String str = map.get("cookie");
        if (TextUtils.isEmpty(str) || (zzbd = com.google.android.gms.ads.internal.zzq.zzkl().zzbd(this.zzlk)) == null) {
            return;
        }
        zzbd.setCookie("googleads.g.doubleclick.net", str);
    }
}
