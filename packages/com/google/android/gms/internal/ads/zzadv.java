package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadv extends zzacy {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zzcxb;

    public zzadv(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zzcxb = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza(zzadg zzadgVar) {
        this.zzcxb.onUnifiedNativeAdLoaded(new zzadl(zzadgVar));
    }
}
