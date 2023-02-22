package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzamv implements Runnable {
    private final /* synthetic */ zzamt zzdfe;
    private final /* synthetic */ AdOverlayInfoParcel zzdfm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamv(zzamt zzamtVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdfe = zzamtVar;
        this.zzdfm = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzq.zzki();
        activity = this.zzdfe.zzdff;
        com.google.android.gms.ads.internal.overlay.zzn.zza(activity, this.zzdfm, true);
    }
}
