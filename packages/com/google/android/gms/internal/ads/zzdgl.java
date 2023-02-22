package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdkl;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdgl {
    @Deprecated
    public static final zzdkl zzgtc = (zzdkl) ((zzdqw) zzdkl.zzavk().zzhe("TINK_MAC_1_0_0").zzb(zzdee.zza("TinkMac", "Mac", "HmacKey", 0, true)).zzazr());
    @Deprecated
    private static final zzdkl zzgtd = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzgtc).zzhe("TINK_MAC_1_1_0").zzazr());
    public static final zzdkl zzgte = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzgtc).zzhe("TINK_MAC").zzazr());

    public static void zzapz() throws GeneralSecurityException {
        zzdey.zza("TinkMac", new zzdgi());
        zzdee.zza(zzgte);
    }

    static {
        try {
            zzapz();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
