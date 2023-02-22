package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zztu extends zzvr {
    private final AdMetadataListener zzcbw;

    public zztu(AdMetadataListener adMetadataListener) {
        this.zzcbw = adMetadataListener;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.zzcbw;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}
