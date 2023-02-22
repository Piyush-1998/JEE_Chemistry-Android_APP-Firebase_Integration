package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzaqz extends zzfm implements zzara {
    public zzaqz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzara zzam(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzara) {
            return (zzara) queryLocalInterface;
        }
        return new zzarc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzari zzariVar = null;
        zzarj zzarjVar = null;
        zzarb zzarbVar = null;
        switch (i) {
            case 1:
                zztx zztxVar = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzari) {
                        zzariVar = (zzari) queryLocalInterface;
                    } else {
                        zzariVar = new zzark(readStrongBinder);
                    }
                }
                zza(zztxVar, zzariVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzarb) {
                        zzarbVar = (zzarb) queryLocalInterface2;
                    } else {
                        zzarbVar = new zzard(readStrongBinder2);
                    }
                }
                zza(zzarbVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isLoaded = isLoaded();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, isLoaded);
                return true;
            case 4:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 5:
                zzl(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzarj) {
                        zzarjVar = (zzarj) queryLocalInterface3;
                    } else {
                        zzarjVar = new zzarm(readStrongBinder3);
                    }
                }
                zza(zzarjVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zza((zzarr) zzfp.zza(parcel, zzarr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zza(zzwp.zzh(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzfp.zzb(parcel2, adMetadata);
                return true;
            case 10:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzfp.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzaqv zzpk = zzpk();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzpk);
                return true;
            default:
                return false;
        }
    }
}
