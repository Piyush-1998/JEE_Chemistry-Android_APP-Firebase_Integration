package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzduc extends zzdtx {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.zzdtx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzduc.zzb(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtx
    public final String zzn(byte[] bArr, int i, int i2) throws zzdrg {
        boolean zze;
        boolean zze2;
        boolean zzf;
        boolean zzg;
        boolean zze3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte zza = zzdtt.zza(bArr, i);
            zze3 = zzdty.zze(zza);
            if (!zze3) {
                break;
            }
            i++;
            zzdty.zza(zza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte zza2 = zzdtt.zza(bArr, i);
            zze = zzdty.zze(zza2);
            if (zze) {
                int i7 = i5 + 1;
                zzdty.zza(zza2, cArr, i5);
                while (i6 < i3) {
                    byte zza3 = zzdtt.zza(bArr, i6);
                    zze2 = zzdty.zze(zza3);
                    if (!zze2) {
                        break;
                    }
                    i6++;
                    zzdty.zza(zza3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else {
                zzf = zzdty.zzf(zza2);
                if (!zzf) {
                    zzg = zzdty.zzg(zza2);
                    if (zzg) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            zzdty.zza(zza2, zzdtt.zza(bArr, i6), zzdtt.zza(bArr, i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw zzdrg.zzbaj();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        zzdty.zza(zza2, zzdtt.zza(bArr, i6), zzdtt.zza(bArr, i9), zzdtt.zza(bArr, i10), cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw zzdrg.zzbaj();
                    }
                } else if (i6 < i3) {
                    zzdty.zza(zza2, zzdtt.zza(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw zzdrg.zzbaj();
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtx
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zzdtt.zza(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= c || j4 >= j5) {
                if (charAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    zzdtt.zza(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    zzdtt.zza(bArr, j6, (byte) ((charAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                    if (j4 <= j5 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j7 = j4 + 1;
                                zzdtt.zza(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                zzdtt.zza(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                zzdtt.zza(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                zzdtt.zza(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new zzdtz(i4 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        throw new zzdtz(i4, length);
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                } else {
                    long j10 = j4 + j;
                    zzdtt.zza(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    zzdtt.zza(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    zzdtt.zza(bArr, j11, (byte) ((charAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                i4++;
                c = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                zzdtt.zza(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j13;
            }
            i4++;
            c = 128;
            long j122 = j3;
            j4 = j2;
            j = j122;
        }
        return (int) j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtx
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c;
        long j;
        int i;
        char charAt;
        long zzn = zzdtt.zzn(byteBuffer);
        long position = byteBuffer.position() + zzn;
        long limit = byteBuffer.limit() + zzn;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i2 = 0;
        while (true) {
            c = 128;
            if (i2 >= length || (charAt = charSequence.charAt(i2)) >= 128) {
                break;
            }
            zzdtt.zza(position, (byte) charAt);
            i2++;
            position = 1 + position;
        }
        if (i2 == length) {
            byteBuffer.position((int) (position - zzn));
            return;
        }
        while (i2 < length) {
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 < c && position < limit) {
                zzdtt.zza(position, (byte) charAt3);
                position++;
                j = zzn;
            } else if (charAt3 >= 2048 || position > limit - 2) {
                j = zzn;
                if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                    if (position <= limit - 4) {
                        int i3 = i2 + 1;
                        if (i3 != length) {
                            char charAt4 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j2 = position + 1;
                                zzdtt.zza(position, (byte) ((codePoint >>> 18) | 240));
                                long j3 = j2 + 1;
                                zzdtt.zza(j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j3 + 1;
                                zzdtt.zza(j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j5 = j4 + 1;
                                zzdtt.zza(j4, (byte) ((codePoint & 63) | 128));
                                i2 = i3;
                                position = j5;
                            } else {
                                i2 = i3;
                            }
                        }
                        throw new zzdtz(i2 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i)))) {
                        throw new zzdtz(i2, length);
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(position);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                }
                long j6 = position + 1;
                zzdtt.zza(position, (byte) ((charAt3 >>> '\f') | 480));
                long j7 = j6 + 1;
                zzdtt.zza(j6, (byte) (((charAt3 >>> 6) & 63) | 128));
                zzdtt.zza(j7, (byte) ((charAt3 & '?') | 128));
                position = j7 + 1;
            } else {
                j = zzn;
                long j8 = position + 1;
                zzdtt.zza(position, (byte) ((charAt3 >>> 6) | 960));
                zzdtt.zza(j8, (byte) ((charAt3 & '?') | 128));
                position = j8 + 1;
            }
            i2++;
            zzn = j;
            c = 128;
        }
        byteBuffer.position((int) (position - zzn));
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzhb;
        int zzao;
        int zzi;
        if (i2 == 0) {
            zzhb = zzdtw.zzhb(i);
            return zzhb;
        } else if (i2 == 1) {
            zzao = zzdtw.zzao(i, zzdtt.zza(bArr, j));
            return zzao;
        } else if (i2 == 2) {
            zzi = zzdtw.zzi(i, zzdtt.zza(bArr, j), zzdtt.zza(bArr, j + 1));
            return zzi;
        } else {
            throw new AssertionError();
        }
    }
}
