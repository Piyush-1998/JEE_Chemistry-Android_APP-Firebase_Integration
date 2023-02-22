package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblr implements zzbna, zzbnj, zzbog, zzbpc, zztp {
    private final Clock zzbmp;
    private final zzatq zzfgj;

    public zzblr(Clock clock, zzatq zzatqVar) {
        this.zzbmp = clock;
        this.zzfgj = zzatqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzb(zzape zzapeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzb(zzapy zzapyVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void onAdClicked() {
        this.zzfgj.zzty();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void onAdLoaded() {
        this.zzfgj.zzag(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void onAdImpression() {
        this.zzfgj.zztx();
    }

    public final void zzf(zztx zztxVar) {
        this.zzfgj.zze(zztxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zza(zzcvz zzcvzVar) {
        this.zzfgj.zzes(this.zzbmp.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdClosed() {
        this.zzfgj.zztz();
    }

    public final String zzua() {
        return this.zzfgj.zzua();
    }
}
