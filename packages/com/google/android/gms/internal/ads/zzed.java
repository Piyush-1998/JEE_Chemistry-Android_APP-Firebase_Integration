package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzed {
    static zzdel zzyo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(zzdx zzdxVar) throws IllegalAccessException, InvocationTargetException {
        Method zzc;
        zzdel zza;
        if (zzyo != null) {
            return true;
        }
        String str = (String) zzuv.zzon().zzd(zzza.zzcnh);
        if (str == null || str.length() == 0) {
            str = (zzdxVar == null || (zzc = zzdxVar.zzc("OevwuCyaBOVW9Ln+QX7fmyTTWbeJYcctGFCVTrXabQZ00sMfUmORvoOrZvhdRFVu", "TTGXRr2x4uLkjJPzQqm9kQskRo6Bo/N0qnlRgwhhknY=")) == null) ? null : (String) zzc.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            zzdep zzj = zzdes.zzj(zzcg.zza(str, true));
            zzdee.zza(zzdfy.zzgtc);
            zza = zzdga.zza(zzj, null);
            zzyo = zza;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza != null;
    }
}
