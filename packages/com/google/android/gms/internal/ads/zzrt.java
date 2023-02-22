package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrt extends zzfn implements zzru {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzru
    public final zzro zza(zzrp zzrpVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzrpVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzro zzroVar = (zzro) zzfp.zza(transactAndReadException, zzro.CREATOR);
        transactAndReadException.recycle();
        return zzroVar;
    }
}
