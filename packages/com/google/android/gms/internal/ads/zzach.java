package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzach extends zzfm implements zzace {
    public zzach() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzace zzp(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzace) {
            return (zzace) queryLocalInterface;
        }
        return new zzacg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfm
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String zzco = zzco(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(zzco);
                return true;
            case 2:
                zzabi zzcp = zzcp(parcel.readString());
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzcp);
                return true;
            case 3:
                List<String> availableAssetNames = getAvailableAssetNames();
                parcel2.writeNoException();
                parcel2.writeStringList(availableAssetNames);
                return true;
            case 4:
                String customTemplateId = getCustomTemplateId();
                parcel2.writeNoException();
                parcel2.writeString(customTemplateId);
                return true;
            case 5:
                performClick(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 7:
                zzwr videoController = getVideoController();
                parcel2.writeNoException();
                zzfp.zza(parcel2, videoController);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzqr = zzqr();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzqr);
                return true;
            case 10:
                boolean zzu = zzu(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, zzu);
                return true;
            case 11:
                IObjectWrapper zzqm = zzqm();
                parcel2.writeNoException();
                zzfp.zza(parcel2, zzqm);
                return true;
            case 12:
                boolean zzqs = zzqs();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, zzqs);
                return true;
            case 13:
                boolean zzqt = zzqt();
                parcel2.writeNoException();
                zzfp.writeBoolean(parcel2, zzqt);
                return true;
            case 14:
                zzv(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzqu();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
