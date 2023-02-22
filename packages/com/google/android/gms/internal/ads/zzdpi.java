package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdpi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzdpl zzdplVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzdplVar.zzhfx = b;
            return i2;
        }
        return zza(b, bArr, i2, zzdplVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, zzdpl zzdplVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzdplVar.zzhfx = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzdplVar.zzhfx = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzdplVar.zzhfx = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzdplVar.zzhfx = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzdplVar.zzhfx = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i, zzdpl zzdplVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzdplVar.zzhfy = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzdplVar.zzhfy = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzg(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzh(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzg(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzi(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzf(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzdpl zzdplVar) throws zzdrg {
        int zza = zza(bArr, i, zzdplVar);
        int i2 = zzdplVar.zzhfx;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdplVar.zzhfz = "";
                return zza;
            }
            zzdplVar.zzhfz = new String(bArr, zza, i2, zzdqx.UTF_8);
            return zza + i2;
        }
        throw zzdrg.zzbad();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i, zzdpl zzdplVar) throws zzdrg {
        int zza = zza(bArr, i, zzdplVar);
        int i2 = zzdplVar.zzhfx;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdplVar.zzhfz = "";
                return zza;
            }
            zzdplVar.zzhfz = zzdtw.zzn(bArr, zza, i2);
            return zza + i2;
        }
        throw zzdrg.zzbad();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i, zzdpl zzdplVar) throws zzdrg {
        int zza = zza(bArr, i, zzdplVar);
        int i2 = zzdplVar.zzhfx;
        if (i2 < 0) {
            throw zzdrg.zzbad();
        }
        if (i2 <= bArr.length - zza) {
            if (i2 == 0) {
                zzdplVar.zzhfz = zzdpm.zzhgb;
                return zza;
            }
            zzdplVar.zzhfz = zzdpm.zzh(bArr, zza, i2);
            return zza + i2;
        }
        throw zzdrg.zzbac();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzdsv zzdsvVar, byte[] bArr, int i, int i2, zzdpl zzdplVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzdplVar);
            i4 = zzdplVar.zzhfx;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzdrg.zzbac();
        }
        Object newInstance = zzdsvVar.newInstance();
        int i6 = i4 + i5;
        zzdsvVar.zza(newInstance, bArr, i5, i6, zzdplVar);
        zzdsvVar.zzak(newInstance);
        zzdplVar.zzhfz = newInstance;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzdsv zzdsvVar, byte[] bArr, int i, int i2, int i3, zzdpl zzdplVar) throws IOException {
        zzdsk zzdskVar = (zzdsk) zzdsvVar;
        Object newInstance = zzdskVar.newInstance();
        int zza = zzdskVar.zza((zzdsk) newInstance, bArr, i, i2, i3, zzdplVar);
        zzdskVar.zzak(newInstance);
        zzdplVar.zzhfz = newInstance;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzdrd<?> zzdrdVar, zzdpl zzdplVar) {
        zzdqy zzdqyVar = (zzdqy) zzdrdVar;
        int zza = zza(bArr, i2, zzdplVar);
        zzdqyVar.zzgp(zzdplVar.zzhfx);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdplVar);
            if (i != zzdplVar.zzhfx) {
                break;
            }
            zza = zza(bArr, zza2, zzdplVar);
            zzdqyVar.zzgp(zzdplVar.zzhfx);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzdrd<?> zzdrdVar, zzdpl zzdplVar) throws IOException {
        zzdqy zzdqyVar = (zzdqy) zzdrdVar;
        int zza = zza(bArr, i, zzdplVar);
        int i2 = zzdplVar.zzhfx + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzdplVar);
            zzdqyVar.zzgp(zzdplVar.zzhfx);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzdrg.zzbac();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzdsv<?> zzdsvVar, int i, byte[] bArr, int i2, int i3, zzdrd<?> zzdrdVar, zzdpl zzdplVar) throws IOException {
        int zza = zza(zzdsvVar, bArr, i2, i3, zzdplVar);
        zzdrdVar.add(zzdplVar.zzhfz);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdplVar);
            if (i != zzdplVar.zzhfx) {
                break;
            }
            zza = zza(zzdsvVar, bArr, zza2, i3, zzdplVar);
            zzdrdVar.add(zzdplVar.zzhfz);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzdtq zzdtqVar, zzdpl zzdplVar) throws zzdrg {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzdplVar);
                zzdtqVar.zzc(i, Long.valueOf(zzdplVar.zzhfy));
                return zzb;
            } else if (i4 == 1) {
                zzdtqVar.zzc(i, Long.valueOf(zzg(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzdplVar);
                int i5 = zzdplVar.zzhfx;
                if (i5 < 0) {
                    throw zzdrg.zzbad();
                }
                if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzdtqVar.zzc(i, zzdpm.zzhgb);
                    } else {
                        zzdtqVar.zzc(i, zzdpm.zzh(bArr, zza, i5));
                    }
                    return zza + i5;
                }
                throw zzdrg.zzbac();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzdtqVar.zzc(i, Integer.valueOf(zzf(bArr, i2)));
                    return i2 + 4;
                }
                throw zzdrg.zzbaf();
            } else {
                zzdtq zzbby = zzdtq.zzbby();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzdplVar);
                    int i8 = zzdplVar.zzhfx;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzbby, zzdplVar);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzdrg.zzbai();
                }
                zzdtqVar.zzc(i, zzbby);
                return i2;
            }
        }
        throw zzdrg.zzbaf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzdpl zzdplVar) throws zzdrg {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzdrg.zzbaf();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zza(bArr, i2, zzdplVar);
                            i6 = zzdplVar.zzhfx;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zza(i6, bArr, i2, i3, zzdplVar);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzdrg.zzbai();
                        }
                        return i2;
                    }
                    return zza(bArr, i2, zzdplVar) + zzdplVar.zzhfx;
                }
                return i2 + 8;
            }
            return zzb(bArr, i2, zzdplVar);
        }
        throw zzdrg.zzbaf();
    }
}
