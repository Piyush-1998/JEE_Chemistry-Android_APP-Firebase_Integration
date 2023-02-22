package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzakv implements InitializationCompleteCallback {
    private final /* synthetic */ zzaft zzdee;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakv(zzakt zzaktVar, zzaft zzaftVar) {
        this.zzdee = zzaftVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zzdee.onInitializationSucceeded();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zzdee.onInitializationFailed(str);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }
}
