package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzus<T> {
    private static final zzvu zzcdm = zzog();

    protected abstract T zza(zzvu zzvuVar) throws RemoteException;

    protected abstract T zzoe();

    protected abstract T zzof() throws RemoteException;

    private static zzvu zzog() {
        try {
            Object newInstance = zzug.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzaxi.zzeu("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof zzvu) {
                return (zzvu) queryLocalInterface;
            }
            return new zzvw(iBinder);
        } catch (Exception unused) {
            zzaxi.zzeu("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T zzoh() {
        zzvu zzvuVar = zzcdm;
        if (zzvuVar == null) {
            zzaxi.zzeu("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zza(zzvuVar);
        } catch (RemoteException e) {
            zzaxi.zzd("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T zzoi() {
        try {
            return zzof();
        } catch (RemoteException e) {
            zzaxi.zzd("Cannot invoke remote loader.", e);
            return null;
        }
    }

    public final T zzd(Context context, boolean z) {
        T zzoh;
        boolean z2 = z;
        if (!z2) {
            zzuv.zzoj();
            if (!zzawy.zzc(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzaxi.zzdv("Google Play Services is not available.");
                z2 = true;
            }
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)) {
            z2 = true;
        }
        zzza.initialize(context);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcqr)).booleanValue()) {
            z2 = false;
        }
        if (z2) {
            zzoh = zzoh();
            if (zzoh == null) {
                zzoh = zzoi();
            }
        } else {
            T zzoi = zzoi();
            int i = zzoi == null ? 1 : 0;
            if (i != 0) {
                if (zzuv.zzoq().nextInt(((Integer) zzuv.zzon().zzd(zzza.zzcta)).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    zzuv.zzoj().zza(context, zzuv.zzop().zzblz, "gmob-apps", bundle, true);
                }
            }
            zzoh = zzoi == null ? zzoh() : zzoi;
        }
        return zzoh == null ? zzoe() : zzoh;
    }
}
