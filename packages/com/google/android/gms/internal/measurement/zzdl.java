package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzdk zzdkVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzdkVar.zzada = b;
            return i2;
        }
        return zza(b, bArr, i2, zzdkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, zzdk zzdkVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzdkVar.zzada = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzdkVar.zzada = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzdkVar.zzada = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzdkVar.zzada = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzdkVar.zzada = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i, zzdk zzdkVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzdkVar.zzadb = j;
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
        zzdkVar.zzadb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzb(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzdk zzdkVar) throws zzfi {
        int zza = zza(bArr, i, zzdkVar);
        int i2 = zzdkVar.zzada;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdkVar.zzadc = "";
                return zza;
            }
            zzdkVar.zzadc = new String(bArr, zza, i2, zzez.UTF_8);
            return zza + i2;
        }
        throw zzfi.zzuu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i, zzdk zzdkVar) throws zzfi {
        int zza = zza(bArr, i, zzdkVar);
        int i2 = zzdkVar.zzada;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdkVar.zzadc = "";
                return zza;
            }
            zzdkVar.zzadc = zzhy.zzh(bArr, zza, i2);
            return zza + i2;
        }
        throw zzfi.zzuu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i, zzdk zzdkVar) throws zzfi {
        int zza = zza(bArr, i, zzdkVar);
        int i2 = zzdkVar.zzada;
        if (i2 < 0) {
            throw zzfi.zzuu();
        }
        if (i2 <= bArr.length - zza) {
            if (i2 == 0) {
                zzdkVar.zzadc = zzdp.zzadh;
                return zza;
            }
            zzdkVar.zzadc = zzdp.zzb(bArr, zza, i2);
            return zza + i2;
        }
        throw zzfi.zzut();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzgx zzgxVar, byte[] bArr, int i, int i2, zzdk zzdkVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzdkVar);
            i4 = zzdkVar.zzada;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzfi.zzut();
        }
        Object newInstance = zzgxVar.newInstance();
        int i6 = i4 + i5;
        zzgxVar.zza(newInstance, bArr, i5, i6, zzdkVar);
        zzgxVar.zzj(newInstance);
        zzdkVar.zzadc = newInstance;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzgx zzgxVar, byte[] bArr, int i, int i2, int i3, zzdk zzdkVar) throws IOException {
        zzgm zzgmVar = (zzgm) zzgxVar;
        Object newInstance = zzgmVar.newInstance();
        int zza = zzgmVar.zza((zzgm) newInstance, bArr, i, i2, i3, zzdkVar);
        zzgmVar.zzj(newInstance);
        zzdkVar.zzadc = newInstance;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzff<?> zzffVar, zzdk zzdkVar) {
        zzfa zzfaVar = (zzfa) zzffVar;
        int zza = zza(bArr, i2, zzdkVar);
        zzfaVar.zzbu(zzdkVar.zzada);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdkVar);
            if (i != zzdkVar.zzada) {
                break;
            }
            zza = zza(bArr, zza2, zzdkVar);
            zzfaVar.zzbu(zzdkVar.zzada);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzff<?> zzffVar, zzdk zzdkVar) throws IOException {
        zzfa zzfaVar = (zzfa) zzffVar;
        int zza = zza(bArr, i, zzdkVar);
        int i2 = zzdkVar.zzada + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzdkVar);
            zzfaVar.zzbu(zzdkVar.zzada);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzfi.zzut();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzgx<?> zzgxVar, int i, byte[] bArr, int i2, int i3, zzff<?> zzffVar, zzdk zzdkVar) throws IOException {
        int zza = zza(zzgxVar, bArr, i2, i3, zzdkVar);
        zzffVar.add(zzdkVar.zzadc);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdkVar);
            if (i != zzdkVar.zzada) {
                break;
            }
            zza = zza(zzgxVar, bArr, zza2, i3, zzdkVar);
            zzffVar.add(zzdkVar.zzadc);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzhs zzhsVar, zzdk zzdkVar) throws zzfi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzdkVar);
                zzhsVar.zzb(i, Long.valueOf(zzdkVar.zzadb));
                return zzb;
            } else if (i4 == 1) {
                zzhsVar.zzb(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzdkVar);
                int i5 = zzdkVar.zzada;
                if (i5 < 0) {
                    throw zzfi.zzuu();
                }
                if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzhsVar.zzb(i, zzdp.zzadh);
                    } else {
                        zzhsVar.zzb(i, zzdp.zzb(bArr, zza, i5));
                    }
                    return zza + i5;
                }
                throw zzfi.zzut();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzhsVar.zzb(i, Integer.valueOf(zza(bArr, i2)));
                    return i2 + 4;
                }
                throw zzfi.zzuw();
            } else {
                zzhs zzwr = zzhs.zzwr();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzdkVar);
                    int i8 = zzdkVar.zzada;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzwr, zzdkVar);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzfi.zzva();
                }
                zzhsVar.zzb(i, zzwr);
                return i2;
            }
        }
        throw zzfi.zzuw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzdk zzdkVar) throws zzfi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzfi.zzuw();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zza(bArr, i2, zzdkVar);
                            i6 = zzdkVar.zzada;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zza(i6, bArr, i2, i3, zzdkVar);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzfi.zzva();
                        }
                        return i2;
                    }
                    return zza(bArr, i2, zzdkVar) + zzdkVar.zzada;
                }
                return i2 + 8;
            }
            return zzb(bArr, i2, zzdkVar);
        }
        throw zzfi.zzuw();
    }
}
