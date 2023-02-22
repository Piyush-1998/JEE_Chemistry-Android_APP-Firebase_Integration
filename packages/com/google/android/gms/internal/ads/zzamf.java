package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzamf extends zzfn implements zzamd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzua zzuaVar, zzame zzameVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzfp.zza(obtainAndWriteInterfaceToken, bundle);
        zzfp.zza(obtainAndWriteInterfaceToken, bundle2);
        zzfp.zza(obtainAndWriteInterfaceToken, zzuaVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzameVar);
        zza(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzamr zzsg() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        zzamr zzamrVar = (zzamr) zzfp.zza(transactAndReadException, zzamr.CREATOR);
        transactAndReadException.recycle();
        return zzamrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzamr zzsh() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        zzamr zzamrVar = (zzamr) zzfp.zza(transactAndReadException, zzamr.CREATOR);
        transactAndReadException.recycle();
        return zzamrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzwr getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        zzwr zzi = zzwq.zzi(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        obtainAndWriteInterfaceToken.writeTypedArray(bundleArr, 0);
        zza(11, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzalr zzalrVar, zzakd zzakdVar, zzua zzuaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzfp.zza(obtainAndWriteInterfaceToken, zztxVar);
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzalrVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzakdVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzuaVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzals zzalsVar, zzakd zzakdVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzfp.zza(obtainAndWriteInterfaceToken, zztxVar);
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzalsVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzakdVar);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final boolean zzac(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
        boolean zza = zzfp.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzaly zzalyVar, zzakd zzakdVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzfp.zza(obtainAndWriteInterfaceToken, zztxVar);
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzalyVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzakdVar);
        zza(16, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final boolean zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
        boolean zza = zzfp.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzalx zzalxVar, zzakd zzakdVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzfp.zza(obtainAndWriteInterfaceToken, zztxVar);
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzalxVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzakdVar);
        zza(18, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzdh(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(19, obtainAndWriteInterfaceToken);
    }
}
