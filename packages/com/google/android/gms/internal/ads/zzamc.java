package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzamc extends zzfm implements zzamd {
    public zzamc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzamd zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzamd) {
            return (zzamd) queryLocalInterface;
        }
        return new zzamf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzame zzamgVar;
        zzame zzameVar;
        zzalr zzalrVar = null;
        zzalx zzalzVar = null;
        zzaly zzamaVar = null;
        zzals zzaluVar = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzfp.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzfp.zza(parcel, Bundle.CREATOR);
            zzua zzuaVar = (zzua) zzfp.zza(parcel, zzua.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzameVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof zzame) {
                    zzamgVar = (zzame) queryLocalInterface;
                } else {
                    zzamgVar = new zzamg(readStrongBinder);
                }
                zzameVar = zzamgVar;
            }
            zza(asInterface, readString, bundle, bundle2, zzuaVar, zzameVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzamr zzsg = zzsg();
            parcel2.writeNoException();
            zzfp.zzb(parcel2, zzsg);
        } else if (i == 3) {
            zzamr zzsh = zzsh();
            parcel2.writeNoException();
            zzfp.zzb(parcel2, zzsh);
        } else if (i == 5) {
            zzwr videoController = getVideoController();
            parcel2.writeNoException();
            zzfp.zza(parcel2, videoController);
        } else if (i == 10) {
            zzr(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 11) {
            zza(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        } else {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zztx zztxVar = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof zzalr) {
                            zzalrVar = (zzalr) queryLocalInterface2;
                        } else {
                            zzalrVar = new zzalt(readStrongBinder2);
                        }
                    }
                    zza(readString2, readString3, zztxVar, asInterface2, zzalrVar, zzakc.zzab(parcel.readStrongBinder()), (zzua) zzfp.zza(parcel, zzua.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zztx zztxVar2 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof zzals) {
                            zzaluVar = (zzals) queryLocalInterface3;
                        } else {
                            zzaluVar = new zzalu(readStrongBinder3);
                        }
                    }
                    zza(readString4, readString5, zztxVar2, asInterface3, zzaluVar, zzakc.zzab(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zzac = zzac(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfp.writeBoolean(parcel2, zzac);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zztx zztxVar3 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof zzaly) {
                            zzamaVar = (zzaly) queryLocalInterface4;
                        } else {
                            zzamaVar = new zzama(readStrongBinder4);
                        }
                    }
                    zza(readString6, readString7, zztxVar3, asInterface4, zzamaVar, zzakc.zzab(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zzad = zzad(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfp.writeBoolean(parcel2, zzad);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zztx zztxVar4 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof zzalx) {
                            zzalzVar = (zzalx) queryLocalInterface5;
                        } else {
                            zzalzVar = new zzalz(readStrongBinder5);
                        }
                    }
                    zza(readString8, readString9, zztxVar4, asInterface5, zzalzVar, zzakc.zzab(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzdh(parcel.readString());
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
