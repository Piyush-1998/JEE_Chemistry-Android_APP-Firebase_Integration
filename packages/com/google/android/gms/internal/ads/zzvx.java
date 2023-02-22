package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzvx extends zzfm implements zzvu {
    public zzvx() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzvl zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzua) zzfp.zza(parcel, zzua.CREATOR), parcel.readString(), zzajw.zzaa(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zza);
                return true;
            case 2:
                zzvl zzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzua) zzfp.zza(parcel, zzua.CREATOR), parcel.readString(), zzajw.zzaa(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzb);
                return true;
            case 3:
                zzve zza2 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzajw.zzaa(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zza2);
                return true;
            case 4:
                zzwb zzg = zzg(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzg);
                return true;
            case 5:
                zzabm zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzc);
                return true;
            case 6:
                zzaqb zza3 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzajw.zzaa(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zza3);
                return true;
            case 7:
                zzany zzh = zzh(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzh);
                return true;
            case 8:
                zzano zzf = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzf);
                return true;
            case 9:
                zzwb zza4 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zza4);
                return true;
            case 10:
                zzvl zza5 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzua) zzfp.zza(parcel, zzua.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zza5);
                return true;
            case 11:
                zzabt zza6 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfp.zza(parcel2, zza6);
                return true;
            case 12:
                zzara zzb2 = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzajw.zzaa(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzb2);
                return true;
            case 13:
                zzvl zzc2 = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzua) zzfp.zza(parcel, zzua.CREATOR), parcel.readString(), zzajw.zzaa(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzc2);
                return true;
            default:
                return false;
        }
    }
}
