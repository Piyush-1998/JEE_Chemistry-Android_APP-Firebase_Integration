package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcvh extends AdMetadataListener {
    private final /* synthetic */ zzwm zzgiq;
    private final /* synthetic */ zzcvf zzgir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvh(zzcvf zzcvfVar, zzwm zzwmVar) {
        this.zzgir = zzcvfVar;
        this.zzgiq = zzwmVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzbyz zzbyzVar;
        zzbyzVar = this.zzgir.zzgil;
        if (zzbyzVar != null) {
            try {
                this.zzgiq.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzaug.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
