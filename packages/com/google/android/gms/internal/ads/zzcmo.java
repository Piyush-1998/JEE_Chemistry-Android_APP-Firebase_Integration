package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmo {
    private final zzbuy zzgcx;
    private final zzcmi zzgcy;
    private final zzbnb zzgcz;

    public zzcmo(zzbuy zzbuyVar) {
        final zzcmi zzcmiVar = new zzcmi();
        this.zzgcy = zzcmiVar;
        this.zzgcx = zzbuyVar;
        final zzagj zzaii = zzbuyVar.zzaii();
        this.zzgcz = new zzbnb(zzcmiVar, zzaii) { // from class: com.google.android.gms.internal.ads.zzcmr
            private final zzcmi zzgdb;
            private final zzagj zzgdc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdb = zzcmiVar;
                this.zzgdc = zzaii;
            }

            @Override // com.google.android.gms.internal.ads.zzbnb
            public final void onAdFailedToLoad(int i) {
                zzcmi zzcmiVar2 = this.zzgdb;
                zzagj zzagjVar = this.zzgdc;
                zzcmiVar2.onAdFailedToLoad(i);
                if (zzagjVar != null) {
                    try {
                        zzagjVar.zzck(i);
                    } catch (RemoteException e) {
                        zzaxi.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        };
    }

    public final void zzc(zzuy zzuyVar) {
        this.zzgcy.zzc(zzuyVar);
    }

    public final zzbth zzalk() {
        return new zzbth(this.zzgcx, this.zzgcy.zzalh());
    }

    public final zzbna zzall() {
        return this.zzgcy;
    }

    public final zzbog zzalm() {
        return this.zzgcy;
    }

    public final zzbnb zzaln() {
        return this.zzgcz;
    }

    public final zzbnj zzalo() {
        return this.zzgcy;
    }

    public final zztp zzalp() {
        return this.zzgcy;
    }
}
