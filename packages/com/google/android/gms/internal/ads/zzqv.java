package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzqv extends zzfm implements zzqw {
    public zzqv() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzrc zzreVar;
        if (i == 2) {
            zzvl zzdg = zzdg();
            parcel2.writeNoException();
            zzfp.zza(parcel2, zzdg);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzreVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                if (queryLocalInterface instanceof zzrc) {
                    zzreVar = (zzrc) queryLocalInterface;
                } else {
                    zzreVar = new zzre(readStrongBinder);
                }
            }
            zza(zzreVar);
            parcel2.writeNoException();
            return true;
        }
    }
}
