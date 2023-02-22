package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zztv extends RemoteCreator<zzvm> {
    public zztv() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final zzvl zza(Context context, zzua zzuaVar, String str, zzajx zzajxVar, int i) {
        try {
            IBinder zza = getRemoteCreatorInstance(context).zza(ObjectWrapper.wrap(context), zzuaVar, str, zzajxVar, 15601000, i);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvl) {
                return (zzvl) queryLocalInterface;
            }
            return new zzvn(zza);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzaxi.zzb("Could not create remote AdManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzvm getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzvm) {
            return (zzvm) queryLocalInterface;
        }
        return new zzvp(iBinder);
    }
}
