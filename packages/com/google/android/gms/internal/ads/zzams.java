package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzams implements com.google.android.gms.ads.internal.overlay.zzo {
    private final /* synthetic */ zzamt zzdfe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzams(zzamt zzamtVar) {
        this.zzdfe = zzamtVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsi() {
        MediationInterstitialListener mediationInterstitialListener;
        zzaxi.zzdv("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.zzdfe.zzdfg;
        mediationInterstitialListener.onAdClosed(this.zzdfe);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        zzaxi.zzdv("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        zzaxi.zzdv("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsj() {
        MediationInterstitialListener mediationInterstitialListener;
        zzaxi.zzdv("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.zzdfe.zzdfg;
        mediationInterstitialListener.onAdOpened(this.zzdfe);
    }
}
