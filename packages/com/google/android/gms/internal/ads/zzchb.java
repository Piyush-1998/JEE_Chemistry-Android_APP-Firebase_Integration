package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzchb extends zzalq {
    private zzcgf<zzamd, zzchk> zzfxs;
    private final /* synthetic */ zzcgw zzfxt;

    private zzchb(zzcgw zzcgwVar, zzcgf<zzamd, zzchk> zzcgfVar) {
        this.zzfxt = zzcgwVar;
        this.zzfxs = zzcgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalr
    public final void zzab(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcgw.zza(this.zzfxt, (View) ObjectWrapper.unwrap(iObjectWrapper));
        this.zzfxs.zzfxg.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzalr
    public final void zzdg(String str) throws RemoteException {
        this.zzfxs.zzfxg.onAdFailedToLoad(0);
    }
}
