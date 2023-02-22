package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzarq {
    public static zzara zzd(Context context, String str, zzajx zzajxVar) {
        try {
            IBinder zzd = ((zzarg) zzaxh.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzarp.zzbty)).zzd(ObjectWrapper.wrap(context), str, zzajxVar, 15601000);
            if (zzd == null) {
                return null;
            }
            IInterface queryLocalInterface = zzd.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzara) {
                return (zzara) queryLocalInterface;
            }
            return new zzarc(zzd);
        } catch (RemoteException | zzaxj e) {
            zzaxi.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
