package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzvh extends zzfm implements zzve {
    public zzvh() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzuy zzuyVar = null;
        zzvz zzvzVar = null;
        switch (i) {
            case 1:
                zzvd zzor = zzor();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzor);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzuy) {
                        zzuyVar = (zzuy) queryLocalInterface;
                    } else {
                        zzuyVar = new zzva(readStrongBinder);
                    }
                }
                zzb(zzuyVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zza(zzacl.zzq(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                zza(zzacm.zzr(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                zza(parcel.readString(), zzacs.zzt(parcel.readStrongBinder()), zzacr.zzs(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zza((zzaay) zzfp.zza(parcel, zzaay.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzvz) {
                        zzvzVar = (zzvz) queryLocalInterface2;
                    } else {
                        zzvzVar = new zzvy(readStrongBinder2);
                    }
                }
                zzb(zzvzVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zza(zzacx.zzu(parcel.readStrongBinder()), (zzua) zzfp.zza(parcel, zzua.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zza((PublisherAdViewOptions) zzfp.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zza(zzacy.zzv(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zza((zzagd) zzfp.zza(parcel, zzagd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzagi.zzz(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
