package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdkl;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdfy {
    @Deprecated
    public static final zzdkl zzgtc = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzdfd.zzgtc).zzb(zzdee.zza("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).zzb(zzdee.zza("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).zzhe("TINK_HYBRID_1_0_0").zzazr());
    @Deprecated
    public static final zzdkl zzgtd = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzgtc).zzhe("TINK_HYBRID_1_1_0").zzazr());
    public static final zzdkl zzgte = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzdfd.zzgte).zzb(zzdee.zza("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).zzb(zzdee.zza("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).zzhe("TINK_HYBRID").zzazr());

    public static void zzapz() throws GeneralSecurityException {
        zzdfd.zzapz();
        zzdey.zza("TinkHybridEncrypt", new zzdgb());
        zzdey.zza("TinkHybridDecrypt", new zzdfx());
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
