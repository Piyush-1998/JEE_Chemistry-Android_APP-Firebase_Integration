package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdos {
    public static String zza(zzdob zzdobVar) throws GeneralSecurityException {
        zzdou.zzc(zzdobVar);
        String valueOf = String.valueOf(zzdobVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append(valueOf);
        sb.append("withECDSA");
        return sb.toString();
    }

    public static String zzb(zzdob zzdobVar) throws GeneralSecurityException {
        int i = zzdor.zzhez[zzdobVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "SHA-512";
                    }
                    String valueOf = String.valueOf(zzdobVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    sb.append("Unsupported hash ");
                    sb.append(valueOf);
                    throw new GeneralSecurityException(sb.toString());
                }
                return "SHA-384";
            }
            return "SHA-256";
        }
        return "SHA-1";
    }

    public static boolean zzaxd() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static BigInteger zzw(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] zza(BigInteger bigInteger, int i) throws GeneralSecurityException {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i2) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
        return bArr;
    }

    public static byte[] zza(byte[] bArr, int i, zzdob zzdobVar) throws GeneralSecurityException {
        MessageDigest zzhf = zzdnu.zzhec.zzhf(zzb(zzdobVar));
        int digestLength = zzhf.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 <= (i - 1) / digestLength; i3++) {
            zzhf.reset();
            zzhf.update(bArr);
            zzhf.update(zza(BigInteger.valueOf(i3), 4));
            byte[] digest = zzhf.digest();
            System.arraycopy(digest, 0, bArr2, i2, Math.min(digest.length, i - i2));
            i2 += digest.length;
        }
        return bArr2;
    }
}
