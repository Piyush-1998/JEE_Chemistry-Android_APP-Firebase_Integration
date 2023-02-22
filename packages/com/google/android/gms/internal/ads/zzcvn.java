package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcvn extends AdMetadataListener {
    private final /* synthetic */ zzvo zzgiv;
    private final /* synthetic */ zzcvl zzgiw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvn(zzcvl zzcvlVar, zzvo zzvoVar) {
        this.zzgiw = zzcvlVar;
        this.zzgiv = zzvoVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzbyz zzbyzVar;
        zzbyzVar = this.zzgiw.zzgil;
        if (zzbyzVar != null) {
            try {
                this.zzgiv.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzaug.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
