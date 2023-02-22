package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcic extends zzalv {
    private zzcgf<zzamd, zzchk> zzfxs;

    private zzcic(zzcib zzcibVar, zzcgf<zzamd, zzchk> zzcgfVar) {
        this.zzfxs = zzcgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzals
    public final void zzsf() throws RemoteException {
        this.zzfxs.zzfxg.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzals
    public final void zzdg(String str) throws RemoteException {
        this.zzfxs.zzfxg.onAdFailedToLoad(0);
    }
}
