package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcit extends zzalw {
    private zzcgf<zzamd, zzchk> zzfxs;
    private final /* synthetic */ zzcir zzfyz;

    private zzcit(zzcir zzcirVar, zzcgf<zzamd, zzchk> zzcgfVar) {
        this.zzfyz = zzcirVar;
        this.zzfxs = zzcgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalx
    public final void zza(zzakm zzakmVar) throws RemoteException {
        zzcir.zza(this.zzfyz, zzakmVar);
        this.zzfxs.zzfxg.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzalx
    public final void zzdg(String str) throws RemoteException {
        this.zzfxs.zzfxg.onAdFailedToLoad(0);
    }
}
