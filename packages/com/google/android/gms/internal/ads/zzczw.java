package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczw extends zzfn implements zzczx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzczw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.zzczx
    public final zzczv zza(zzczt zzcztVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzcztVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzczv zzczvVar = (zzczv) zzfp.zza(transactAndReadException, zzczv.CREATOR);
        transactAndReadException.recycle();
        return zzczvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczx
    public final void zza(zzczo zzczoVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzczoVar);
        zza(2, obtainAndWriteInterfaceToken);
    }
}
