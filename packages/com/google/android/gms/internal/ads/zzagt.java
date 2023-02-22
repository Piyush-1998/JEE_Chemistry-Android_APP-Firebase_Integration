package com.google.android.gms.internal.ads;

import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzagt {
    private final zzagw zzczb;

    private zzagt(zzagw zzagwVar) {
        this.zzczb = zzagwVar;
    }

    @JavascriptInterface
    public final void notify(String str) {
        this.zzczb.zzcx(str);
    }
}
