package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadp extends zzacl {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzcwt;

    public zzadp(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzcwt = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zza(zzabw zzabwVar) {
        this.zzcwt.onAppInstallAdLoaded(new zzacb(zzabwVar));
    }
}
