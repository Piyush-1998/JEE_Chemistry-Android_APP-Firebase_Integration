package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzamp implements SignalCallbacks {
    private final /* synthetic */ zzame zzdfc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamp(zzami zzamiVar, zzame zzameVar) {
        this.zzdfc = zzameVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zzdfc.zzdi(str);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.zzdfc.onFailure(str);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }
}
