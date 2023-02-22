package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmm extends zzvc {
    private boolean zzadc = false;
    private final String zzbqy;
    private final zzcmq<zzbkk> zzgcs;
    private String zzgct;
    private String zzgcu;

    public zzcmm(zzcmq<zzbkk> zzcmqVar, String str) {
        this.zzgcs = zzcmqVar;
        this.zzbqy = str;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgcs.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void zzb(zztx zztxVar) throws RemoteException {
        zza(zztxVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized void zza(zztx zztxVar, int i) throws RemoteException {
        this.zzgct = null;
        this.zzgcu = null;
        this.zzadc = this.zzgcs.zza(zztxVar, this.zzbqy, new zzcmv(i), new zzcmp(this));
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized String getMediationAdapterClassName() {
        return this.zzgct;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized String zzju() {
        return this.zzgcu;
    }
}
