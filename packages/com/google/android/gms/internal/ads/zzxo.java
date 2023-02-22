package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxo extends zzvc {
    final /* synthetic */ zzxm zzcff;

    private zzxo(zzxm zzxmVar) {
        this.zzcff = zzxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final String zzju() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void zzb(zztx zztxVar) throws RemoteException {
        zza(zztxVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void zza(zztx zztxVar, int i) throws RemoteException {
        zzaxi.zzes("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzawy.zzzb.post(new zzxr(this));
    }
}
