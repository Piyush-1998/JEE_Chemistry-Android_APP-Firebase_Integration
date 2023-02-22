package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxa extends zzuu {
    private final /* synthetic */ zzxb zzcel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxa(zzxb zzxbVar) {
        this.zzcel = zzxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zzcel.zzcen;
        videoController.zza(this.zzcel.zzde());
        super.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i) {
        VideoController videoController;
        videoController = this.zzcel.zzcen;
        videoController.zza(this.zzcel.zzde());
        super.onAdFailedToLoad(i);
    }
}
