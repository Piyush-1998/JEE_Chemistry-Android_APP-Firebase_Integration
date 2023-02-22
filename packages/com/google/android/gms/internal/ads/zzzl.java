package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.consent.ConsentSdkUtil;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzl {
    private static zzzl zzcty;
    private final zzzg zzctz;

    public static synchronized zzzl zzj(Context context) {
        zzzg zzzpVar;
        zzzl zzzlVar;
        synchronized (zzzl.class) {
            if (zzcty == null) {
                try {
                    zzzpVar = (zzzg) zzaxh.zza(context, "com.google.android.gms.ads.consent.DynamiteConsentUtil", zzzk.zzbty);
                } catch (zzaxj e) {
                    zzaxi.zzb("Loading exception", e);
                    zzzpVar = new zzzp();
                }
                try {
                    zzzpVar.zzr(ObjectWrapper.wrap(context.getApplicationContext()));
                } catch (RemoteException unused) {
                }
                zzcty = new zzzl(zzzpVar);
            }
            zzzlVar = zzcty;
        }
        return zzzlVar;
    }

    private zzzl(zzzg zzzgVar) {
        this.zzctz = zzzgVar;
    }

    public final void zza(Map<String, String> map, ConsentSdkUtil.ConsentInformationCallback consentInformationCallback) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        zzzm zzzmVar = new zzzm(consentInformationCallback);
        try {
            this.zzctz.zza(bundle, zzzmVar);
        } catch (RemoteException e) {
            zzaxi.zzb("Remote exception: ", e);
            zzzmVar.onFailure(3);
        }
    }
}
