package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzvw extends zzfn implements zzvu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzvl zza(IObjectWrapper iObjectWrapper, zzua zzuaVar, String str, zzajx zzajxVar, int i) throws RemoteException {
        zzvl zzvnVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzuaVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzfp.zza(obtainAndWriteInterfaceToken, zzajxVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzvnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvl) {
                zzvnVar = (zzvl) queryLocalInterface;
            } else {
                zzvnVar = new zzvn(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzvl zzb(IObjectWrapper iObjectWrapper, zzua zzuaVar, String str, zzajx zzajxVar, int i) throws RemoteException {
        zzvl zzvnVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzuaVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzfp.zza(obtainAndWriteInterfaceToken, zzajxVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzvnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvl) {
                zzvnVar = (zzvl) queryLocalInterface;
            } else {
                zzvnVar = new zzvn(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzve zza(IObjectWrapper iObjectWrapper, String str, zzajx zzajxVar, int i) throws RemoteException {
        zzve zzvgVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzfp.zza(obtainAndWriteInterfaceToken, zzajxVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzvgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzve) {
                zzvgVar = (zzve) queryLocalInterface;
            } else {
                zzvgVar = new zzvg(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzwb zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzwb zzwdVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzwb) {
                zzwdVar = (zzwb) queryLocalInterface;
            } else {
                zzwdVar = new zzwd(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzabm zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper2);
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
        zzabm zzn = zzabp.zzn(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzaqb zza(IObjectWrapper iObjectWrapper, zzajx zzajxVar, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzajxVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
        zzaqb zzai = zzaqe.zzai(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzany zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        zzany zzag = zzanx.zzag(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzano zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
        zzano zzae = zzann.zzae(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzae;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzwb zza(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzwb zzwdVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzwb) {
                zzwdVar = (zzwb) queryLocalInterface;
            } else {
                zzwdVar = new zzwd(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzvl zza(IObjectWrapper iObjectWrapper, zzua zzuaVar, String str, int i) throws RemoteException {
        zzvl zzvnVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzuaVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzvnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvl) {
                zzvnVar = (zzvl) queryLocalInterface;
            } else {
                zzvnVar = new zzvn(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzabt zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper2);
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper3);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        zzabt zzo = zzabs.zzo(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzara zzb(IObjectWrapper iObjectWrapper, String str, zzajx zzajxVar, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzfp.zza(obtainAndWriteInterfaceToken, zzajxVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
        zzara zzam = zzaqz.zzam(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzam;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzvl zzc(IObjectWrapper iObjectWrapper, zzua zzuaVar, String str, zzajx zzajxVar, int i) throws RemoteException {
        zzvl zzvnVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzfp.zza(obtainAndWriteInterfaceToken, zzuaVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzfp.zza(obtainAndWriteInterfaceToken, zzajxVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzvnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvl) {
                zzvnVar = (zzvl) queryLocalInterface;
            } else {
                zzvnVar = new zzvn(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzvnVar;
    }
}
