package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzvk extends zzfm implements zzvl {
    public zzvk() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzvl zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzvl) {
            return (zzvl) queryLocalInterface;
        }
        return new zzvn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzuy zzuyVar = null;
        zzvo zzvoVar = null;
        zzvz zzvzVar = null;
        zzux zzuxVar = null;
        zzvt zzvtVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzjr = zzjr();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzjr);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isReady = isReady();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, isReady);
                return true;
            case 4:
                boolean zza = zza((zztx) zzfp.zza(parcel, zztx.CREATOR));
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, zza);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzuy) {
                        zzuyVar = (zzuy) queryLocalInterface;
                    } else {
                        zzuyVar = new zzva(readStrongBinder);
                    }
                }
                zza(zzuyVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzvt) {
                        zzvtVar = (zzvt) queryLocalInterface2;
                    } else {
                        zzvtVar = new zzvv(readStrongBinder2);
                    }
                }
                zza(zzvtVar);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                return true;
            case 11:
                zzjs();
                parcel2.writeNoException();
                return true;
            case 12:
                zzua zzjt = zzjt();
                parcel2.writeNoException();
                zzfp.zzb(parcel2, zzjt);
                return true;
            case 13:
                zza((zzua) zzfp.zza(parcel, zzua.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzanw.zzaf(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zza(zzaoc.zzah(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 19:
                zza(zzaag.zzk(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzux) {
                        zzuxVar = (zzux) queryLocalInterface3;
                    } else {
                        zzuxVar = new zzuz(readStrongBinder3);
                    }
                }
                zza(zzuxVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzvz) {
                        zzvzVar = (zzvz) queryLocalInterface4;
                    } else {
                        zzvzVar = new zzvy(readStrongBinder4);
                    }
                }
                zza(zzvzVar);
                parcel2.writeNoException();
                return true;
            case 22:
                setManualImpressionsEnabled(zzfp.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, isLoading);
                return true;
            case 24:
                zza(zzaqh.zzaj(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzwr videoController = getVideoController();
                parcel2.writeNoException();
                zzfp.zza(parcel2, videoController);
                return true;
            case 29:
                zza((zzyj) zzfp.zza(parcel, zzyj.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zza((zzwx) zzfp.zza(parcel, zzwx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String adUnitId = getAdUnitId();
                parcel2.writeNoException();
                parcel2.writeString(adUnitId);
                return true;
            case 32:
                zzvt zzjv = zzjv();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzjv);
                return true;
            case 33:
                zzuy zzjw = zzjw();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzjw);
                return true;
            case 34:
                setImmersiveMode(zzfp.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String zzju = zzju();
                parcel2.writeNoException();
                parcel2.writeString(zzju);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzvo) {
                        zzvoVar = (zzvo) queryLocalInterface5;
                    } else {
                        zzvoVar = new zzvq(readStrongBinder5);
                    }
                }
                zza(zzvoVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzfp.zzb(parcel2, adMetadata);
                return true;
            case 38:
                zzbm(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                zza((zzuf) zzfp.zza(parcel, zzuf.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zza(zzra.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
