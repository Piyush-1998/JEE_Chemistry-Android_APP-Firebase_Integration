package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzyg extends zzwv {
    private final VideoController.VideoLifecycleCallbacks zzabo;

    public zzyg(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzabo = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void onVideoStart() {
        this.zzabo.onVideoStart();
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void onVideoPlay() {
        this.zzabo.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void onVideoPause() {
        this.zzabo.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void onVideoEnd() {
        this.zzabo.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void onVideoMute(boolean z) {
        this.zzabo.onVideoMute(z);
    }
}
