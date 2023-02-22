package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdju;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdee {
    public static zzdju zza(String str, String str2, String str3, int i, boolean z) {
        zzdju.zza zzgz = zzdju.zzaug().zzgz(str2);
        String valueOf = String.valueOf(str3);
        return (zzdju) ((zzdqw) zzgz.zzha(valueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(valueOf) : new String("type.googleapis.com/google.crypto.tink.")).zzeq(0).zzbg(true).zzhb(str).zzazr());
    }

    public static void zza(zzdkl zzdklVar) throws GeneralSecurityException {
        for (zzdju zzdjuVar : zzdklVar.zzavj()) {
            if (zzdjuVar.zzatu().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            }
            if (zzdjuVar.zzauc().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            }
            if (zzdjuVar.zzauf().isEmpty()) {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
            zzdef<?> zzgt = zzdey.zzgt(zzdjuVar.zzauf());
            zzdey.zza(zzgt.zzapm());
            zzdey.zza(zzgt.zzb(zzdjuVar.zzatu(), zzdjuVar.zzauc(), zzdjuVar.zzaud()), zzdjuVar.zzaue());
        }
    }
}
