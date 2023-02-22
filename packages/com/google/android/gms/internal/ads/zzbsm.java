package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsm implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzboo zzfio;
    private final zzbqo zzfip;

    public zzbsm(zzboo zzbooVar, zzbqo zzbqoVar) {
        this.zzfio = zzbooVar;
        this.zzfip = zzbqoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsi() {
        this.zzfio.zzsi();
        this.zzfip.onHide();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        this.zzfio.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        this.zzfio.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsj() {
        this.zzfio.zzsj();
        this.zzfip.zzagp();
    }
}
