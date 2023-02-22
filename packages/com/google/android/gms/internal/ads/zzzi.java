package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzi extends zzfn implements zzzg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.consent.IConsentSdkUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zza(Bundle bundle, zzzf zzzfVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, bundle);
        zzfp.zza(obtainAndWriteInterfaceToken, zzzfVar);
        zza(3, obtainAndWriteInterfaceToken);
    }
}
