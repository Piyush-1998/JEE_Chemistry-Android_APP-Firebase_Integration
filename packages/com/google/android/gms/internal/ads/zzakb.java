package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzakb extends zzfm implements zzajy {
    public zzakb() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzakd zzakdVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzua zzuaVar = (zzua) zzfp.zza(parcel, zzua.CREATOR);
                zztx zztxVar = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzakd) {
                        zzakdVar = (zzakd) queryLocalInterface;
                    } else {
                        zzakdVar = new zzakf(readStrongBinder);
                    }
                }
                zza(asInterface, zzuaVar, zztxVar, readString, zzakdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzro = zzro();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzro);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zztx zztxVar2 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzakd) {
                        zzakdVar = (zzakd) queryLocalInterface2;
                    } else {
                        zzakdVar = new zzakf(readStrongBinder2);
                    }
                }
                zza(asInterface2, zztxVar2, readString2, zzakdVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzua zzuaVar2 = (zzua) zzfp.zza(parcel, zzua.CREATOR);
                zztx zztxVar3 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzakd) {
                        zzakdVar = (zzakd) queryLocalInterface3;
                    } else {
                        zzakdVar = new zzakf(readStrongBinder3);
                    }
                }
                zza(asInterface3, zzuaVar2, zztxVar3, readString3, readString4, zzakdVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zztx zztxVar4 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzakd) {
                        zzakdVar = (zzakd) queryLocalInterface4;
                    } else {
                        zzakdVar = new zzakf(readStrongBinder4);
                    }
                }
                zza(asInterface4, zztxVar4, readString5, readString6, zzakdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                pause();
                parcel2.writeNoException();
                return true;
            case 9:
                resume();
                parcel2.writeNoException();
                return true;
            case 10:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zztx) zzfp.zza(parcel, zztx.CREATOR), parcel.readString(), zzaqs.zzak(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zza((zztx) zzfp.zza(parcel, zztx.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean isInitialized = isInitialized();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, isInitialized);
                return true;
            case 14:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zztx zztxVar5 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzakd) {
                        zzakdVar = (zzakd) queryLocalInterface5;
                    } else {
                        zzakdVar = new zzakf(readStrongBinder5);
                    }
                }
                zza(asInterface5, zztxVar5, readString7, readString8, zzakdVar, (zzaay) zzfp.zza(parcel, zzaay.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                zzakg zzrp = zzrp();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzrp);
                return true;
            case 16:
                zzakl zzrq = zzrq();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzrq);
                return true;
            case 17:
                Bundle zzrr = zzrr();
                parcel2.writeNoException();
                zzfp.zzb(parcel2, zzrr);
                return true;
            case 18:
                Bundle interstitialAdapterInfo = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                zzfp.zzb(parcel2, interstitialAdapterInfo);
                return true;
            case 19:
                Bundle zzrs = zzrs();
                parcel2.writeNoException();
                zzfp.zzb(parcel2, zzrs);
                return true;
            case 20:
                zza((zztx) zzfp.zza(parcel, zztx.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzrt = zzrt();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, zzrt);
                return true;
            case 23:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzaqs.zzak(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzace zzru = zzru();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzru);
                return true;
            case 25:
                setImmersiveMode(zzfp.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzwr videoController = getVideoController();
                parcel2.writeNoException();
                zzfp.zza(parcel2, videoController);
                return true;
            case 27:
                zzakm zzrv = zzrv();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzrv);
                return true;
            case 28:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zztx zztxVar6 = (zztx) zzfp.zza(parcel, zztx.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzakd) {
                        zzakdVar = (zzakd) queryLocalInterface6;
                    } else {
                        zzakdVar = new zzakf(readStrongBinder6);
                    }
                }
                zzb(asInterface6, zztxVar6, readString9, zzakdVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                zzx(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzafs.zzx(parcel.readStrongBinder()), parcel.createTypedArrayList(zzagb.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
