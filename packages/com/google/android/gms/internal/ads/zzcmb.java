package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmb extends zzvc {
    private final zzcmm zzgca;

    public zzcmb(Context context, zzbei zzbeiVar, zzcwg zzcwgVar, zzbuy zzbuyVar, zzuy zzuyVar) {
        zzcmo zzcmoVar = new zzcmo(zzbuyVar);
        zzcmoVar.zzc(zzuyVar);
        this.zzgca = new zzcmm(new zzcmu(zzbeiVar, context, zzcmoVar, zzcwgVar), zzcwgVar.zzand());
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgca.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void zzb(zztx zztxVar) throws RemoteException {
        this.zzgca.zzb(zztxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized void zza(zztx zztxVar, int i) throws RemoteException {
        this.zzgca.zza(zztxVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized String getMediationAdapterClassName() {
        return this.zzgca.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized String zzju() {
        return this.zzgca.zzju();
    }
}
