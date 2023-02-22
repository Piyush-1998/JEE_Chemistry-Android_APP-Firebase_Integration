package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzwa extends zzfm implements zzwb {
    public zzwa() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                initialize();
                parcel2.writeNoException();
                return true;
            case 2:
                setAppVolume(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                zzby(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                setAppMuted(zzfp.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzb(parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float zzos = zzos();
                parcel2.writeNoException();
                parcel2.writeFloat(zzos);
                return true;
            case 8:
                boolean zzot = zzot();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, zzot);
                return true;
            case 9:
                String versionString = getVersionString();
                parcel2.writeNoException();
                parcel2.writeString(versionString);
                return true;
            case 10:
                zzbz(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zza(zzajw.zzaa(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                zza(zzafx.zzy(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzafr> zzou = zzou();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzou);
                return true;
            case 14:
                zza((zzyd) zzfp.zza(parcel, zzyd.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
