package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zznu {
    private static final byte[] zzbfz = {0, 0, 0, 1};
    private static final int[] zzbga = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzbgb = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> zze(byte[] bArr) {
        zznz zznzVar = new zznz(bArr);
        int zza = zza(zznzVar);
        int zzb = zzb(zznzVar);
        int zzbc = zznzVar.zzbc(4);
        if (zza == 5 || zza == 29) {
            zzb = zzb(zznzVar);
            if (zza(zznzVar) == 22) {
                zzbc = zznzVar.zzbc(4);
            }
        }
        int i = zzbgb[zzbc];
        zznr.checkArgument(i != -1);
        return Pair.create(Integer.valueOf(zzb), Integer.valueOf(i));
    }

    public static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = zzbfz;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, zzbfz.length, i2);
        return bArr3;
    }

    private static int zza(zznz zznzVar) {
        int zzbc = zznzVar.zzbc(5);
        return zzbc == 31 ? zznzVar.zzbc(6) + 32 : zzbc;
    }

    private static int zzb(zznz zznzVar) {
        int zzbc = zznzVar.zzbc(4);
        if (zzbc == 15) {
            return zznzVar.zzbc(24);
        }
        zznr.checkArgument(zzbc < 13);
        return zzbga[zzbc];
    }
}
