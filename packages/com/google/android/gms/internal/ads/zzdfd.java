package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdkl;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdfd {
    @Deprecated
    public static final zzdkl zzgtc = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzdgl.zzgtc).zzb(zzdee.zza("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "AesEaxKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "AesGcmKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "KmsAeadKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).zzhe("TINK_AEAD_1_0_0").zzazr());
    @Deprecated
    private static final zzdkl zzgtd = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzgtc).zzhe("TINK_AEAD_1_1_0").zzazr());
    public static final zzdkl zzgte = (zzdkl) ((zzdqw) zzdkl.zzavk().zza((zzdkl.zza) zzdgl.zzgte).zzb(zzdee.zza("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "AesEaxKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "AesGcmKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "KmsAeadKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).zzb(zzdee.zza("TinkAead", "Aead", "XChaCha20Poly1305Key", 0, true)).zzhe("TINK_AEAD").zzazr());

    public static void zzapz() throws GeneralSecurityException {
        zzdgl.zzapz();
        zzdey.zza("TinkAead", new zzdfe());
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
