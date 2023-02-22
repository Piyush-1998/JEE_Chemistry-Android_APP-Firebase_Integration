package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzqt extends zzrb {
    private final AppOpenAdPresentationCallback zzbqu;

    public zzqt(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.zzbqu = appOpenAdPresentationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void onAppOpenAdClosed() {
        this.zzbqu.onAppOpenAdClosed();
    }
}
