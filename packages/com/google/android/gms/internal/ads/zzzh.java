package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzh extends zzfn implements zzzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.consent.IConsentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void onSuccess(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzb(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void onFailure(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        zzb(3, obtainAndWriteInterfaceToken);
    }
}
