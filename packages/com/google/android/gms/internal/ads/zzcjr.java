package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcjr extends zzamb {
    private zzcgf<zzamd, zzchk> zzfxs;

    private zzcjr(zzcjm zzcjmVar, zzcgf<zzamd, zzchk> zzcgfVar) {
        this.zzfxs = zzcgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzsf() throws RemoteException {
        this.zzfxs.zzfxg.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzdg(String str) throws RemoteException {
        this.zzfxs.zzfxg.onAdFailedToLoad(0);
    }
}
