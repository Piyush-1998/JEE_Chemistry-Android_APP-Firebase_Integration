package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcna implements zzdcz<zzcnl> {
    private final /* synthetic */ zzatd zzgdk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcna(zzcnb zzcnbVar, zzatd zzatdVar) {
        this.zzgdk = zzatdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        try {
            this.zzgdk.onError("Internal error.");
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzcnl zzcnlVar) {
        zzcnl zzcnlVar2 = zzcnlVar;
        try {
            this.zzgdk.zzm(zzcnlVar2.zzgdr, zzcnlVar2.zzgds);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }
}
