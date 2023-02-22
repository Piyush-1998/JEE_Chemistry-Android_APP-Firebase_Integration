package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzalh implements Runnable {
    private final /* synthetic */ zzala zzden;
    private final /* synthetic */ AdRequest.ErrorCode zzdeo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalh(zzala zzalaVar, AdRequest.ErrorCode errorCode) {
        this.zzden = zzalaVar;
        this.zzdeo = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakd zzakdVar;
        try {
            zzakdVar = this.zzden.zzdea;
            zzakdVar.onAdFailedToLoad(zzalm.zza(this.zzdeo));
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }
}
