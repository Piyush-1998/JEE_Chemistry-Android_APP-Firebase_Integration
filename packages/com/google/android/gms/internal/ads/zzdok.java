package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdok {
    private static long zze(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static long zzg(byte[] bArr, int i, int i2) {
        return (zze(bArr, i) >> i2) & 67108863;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zzf(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zzg = zzg(bArr, 0, 0) & 67108863;
        int i = 3;
        long zzg2 = zzg(bArr, 3, 2) & 67108611;
        long zzg3 = zzg(bArr, 6, 4) & 67092735;
        long zzg4 = zzg(bArr, 9, 6) & 66076671;
        long zzg5 = zzg(bArr, 12, 8) & 1048575;
        long j = zzg2 * 5;
        long j2 = zzg3 * 5;
        long j3 = zzg4 * 5;
        long j4 = zzg5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i2, (byte) 0);
            }
            long zzg6 = j9 + zzg(bArr3, 0, 0);
            long zzg7 = j5 + zzg(bArr3, i, 2);
            long zzg8 = j6 + zzg(bArr3, 6, 4);
            long zzg9 = j7 + zzg(bArr3, 9, 6);
            long zzg10 = j8 + (zzg(bArr3, 12, 8) | (bArr3[16] << 24));
            long j10 = (zzg6 * zzg) + (zzg7 * j4) + (zzg8 * j3) + (zzg9 * j2) + (zzg10 * j);
            long j11 = (zzg6 * zzg2) + (zzg7 * zzg) + (zzg8 * j4) + (zzg9 * j3) + (zzg10 * j2) + (j10 >> 26);
            long j12 = (zzg6 * zzg3) + (zzg7 * zzg2) + (zzg8 * zzg) + (zzg9 * j4) + (zzg10 * j3) + (j11 >> 26);
            long j13 = (zzg6 * zzg4) + (zzg7 * zzg3) + (zzg8 * zzg2) + (zzg9 * zzg) + (zzg10 * j4) + (j12 >> 26);
            long j14 = (zzg6 * zzg5) + (zzg7 * zzg4) + (zzg8 * zzg3) + (zzg9 * zzg2) + (zzg10 * zzg) + (j13 >> 26);
            long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
            j5 = (j11 & 67108863) + (j15 >> 26);
            i3 += 16;
            j6 = j12 & 67108863;
            j7 = j13 & 67108863;
            j8 = j14 & 67108863;
            i2 = 17;
            i = 3;
            j9 = j15 & 67108863;
        }
        long j16 = j6 + (j5 >> 26);
        long j17 = j16 & 67108863;
        long j18 = j7 + (j16 >> 26);
        long j19 = j18 & 67108863;
        long j20 = j8 + (j18 >> 26);
        long j21 = j20 & 67108863;
        long j22 = j9 + ((j20 >> 26) * 5);
        long j23 = j22 & 67108863;
        long j24 = (j5 & 67108863) + (j22 >> 26);
        long j25 = j23 + 5;
        long j26 = j25 & 67108863;
        long j27 = (j25 >> 26) + j24;
        long j28 = j17 + (j27 >> 26);
        long j29 = j19 + (j28 >> 26);
        long j30 = j29 & 67108863;
        long j31 = (j21 + (j29 >> 26)) - 67108864;
        long j32 = j31 >> 63;
        long j33 = j23 & j32;
        long j34 = j24 & j32;
        long j35 = j17 & j32;
        long j36 = j19 & j32;
        long j37 = j21 & j32;
        long j38 = j32 ^ (-1);
        long j39 = (j27 & 67108863 & j38) | j34;
        long j40 = (j28 & 67108863 & j38) | j35;
        long j41 = (j30 & j38) | j36;
        long j42 = (j31 & j38) | j37;
        long zze = (((j39 << 26) | j33 | (j26 & j38)) & 4294967295L) + zze(bArr, 16);
        long zze2 = (((j39 >> 6) | (j40 << 20)) & 4294967295L) + zze(bArr, 20) + (zze >> 32);
        long zze3 = (((j40 >> 12) | (j41 << 14)) & 4294967295L) + zze(bArr, 24) + (zze2 >> 32);
        byte[] bArr4 = new byte[16];
        zza(bArr4, zze & 4294967295L, 0);
        zza(bArr4, zze2 & 4294967295L, 4);
        zza(bArr4, zze3 & 4294967295L, 8);
        zza(bArr4, ((((j41 >> 18) | (j42 << 8)) & 4294967295L) + zze(bArr, 28) + (zze3 >> 32)) & 4294967295L, 12);
        return bArr4;
    }
}
