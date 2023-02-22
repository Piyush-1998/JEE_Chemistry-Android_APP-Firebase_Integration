package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzaou extends zzfm implements zzaor {
    public zzaou() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            zzaow zzaowVar = null;
            zzaoy zzaoyVar = null;
            zzaoy zzaoyVar2 = null;
            if (i == 2) {
                zzaol zzaolVar = (zzaol) zzfp.zza(parcel, zzaol.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzaow) {
                        zzaowVar = (zzaow) queryLocalInterface;
                    } else {
                        zzaowVar = new zzaov(readStrongBinder);
                    }
                }
                zza(zzaolVar, zzaowVar);
                parcel2.writeNoException();
            } else if (i == 4) {
                zzape zzapeVar = (zzape) zzfp.zza(parcel, zzape.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof zzaoy) {
                        zzaoyVar2 = (zzaoy) queryLocalInterface2;
                    } else {
                        zzaoyVar2 = new zzapa(readStrongBinder2);
                    }
                }
                zza(zzapeVar, zzaoyVar2);
                parcel2.writeNoException();
            } else if (i != 5) {
                return false;
            } else {
                zzape zzapeVar2 = (zzape) zzfp.zza(parcel, zzape.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof zzaoy) {
                        zzaoyVar = (zzaoy) queryLocalInterface3;
                    } else {
                        zzaoyVar = new zzapa(readStrongBinder3);
                    }
                }
                zzb(zzapeVar2, zzaoyVar);
                parcel2.writeNoException();
            }
        } else {
            zzaon zza = zza((zzaol) zzfp.zza(parcel, zzaol.CREATOR));
            parcel2.writeNoException();
            zzfp.zzb(parcel2, zza);
        }
        return true;
    }
}
