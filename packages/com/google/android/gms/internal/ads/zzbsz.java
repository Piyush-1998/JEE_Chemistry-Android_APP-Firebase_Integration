package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsz implements zzbna {
    private final zzbni zzfiv;
    private final zzcvr zzfiw;

    public zzbsz(zzbni zzbniVar, zzcvr zzcvrVar) {
        this.zzfiv = zzbniVar;
        this.zzfiw = zzcvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzb(zzapy zzapyVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdOpened() {
        if (this.zzfiw.zzgjp == 0 || this.zzfiw.zzgjp == 1) {
            this.zzfiv.onAdImpression();
        }
    }
}
