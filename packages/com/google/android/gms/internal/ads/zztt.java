package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zztt extends zzvb {
    private final AdListener zzcbv;

    public zztt(AdListener adListener) {
        this.zzcbv = adListener;
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void onAdClosed() {
        this.zzcbv.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void onAdFailedToLoad(int i) {
        this.zzcbv.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void onAdLeftApplication() {
        this.zzcbv.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void onAdLoaded() {
        this.zzcbv.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void onAdOpened() {
        this.zzcbv.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void onAdClicked() {
        this.zzcbv.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void onAdImpression() {
        this.zzcbv.onAdImpression();
    }

    public final AdListener getAdListener() {
        return this.zzcbv;
    }
}
