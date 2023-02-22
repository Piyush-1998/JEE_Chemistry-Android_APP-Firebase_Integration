package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzati extends zzfm implements zzatf {
    public zzati() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzatd zzatgVar;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzath zzathVar = (zzath) zzfp.zza(parcel, zzath.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzatgVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                if (queryLocalInterface instanceof zzatd) {
                    zzatgVar = (zzatd) queryLocalInterface;
                } else {
                    zzatgVar = new zzatg(readStrongBinder);
                }
            }
            zza(asInterface, zzathVar, zzatgVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
