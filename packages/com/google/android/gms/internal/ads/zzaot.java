package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaot extends zzfn implements zzaor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final zzaon zza(zzaol zzaolVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzaolVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzaon zzaonVar = (zzaon) zzfp.zza(transactAndReadException, zzaon.CREATOR);
        transactAndReadException.recycle();
        return zzaonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(zzaol zzaolVar, zzaow zzaowVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzaolVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzaowVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(zzape zzapeVar, zzaoy zzaoyVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzapeVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzaoyVar);
        zza(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zzb(zzape zzapeVar, zzaoy zzaoyVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzapeVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzaoyVar);
        zza(5, obtainAndWriteInterfaceToken);
    }
}
