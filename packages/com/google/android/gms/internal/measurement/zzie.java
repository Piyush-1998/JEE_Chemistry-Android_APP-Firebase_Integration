package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzie extends zzhz {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.zzhz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzie.zzb(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhz
    public final String zzh(byte[] bArr, int i, int i2) throws zzfi {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte zza = zzhv.zza(bArr, i);
            zzd3 = zzia.zzd(zza);
            if (!zzd3) {
                break;
            }
            i++;
            zzia.zza(zza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte zza2 = zzhv.zza(bArr, i);
            zzd = zzia.zzd(zza2);
            if (zzd) {
                int i7 = i5 + 1;
                zzia.zza(zza2, cArr, i5);
                while (i6 < i3) {
                    byte zza3 = zzhv.zza(bArr, i6);
                    zzd2 = zzia.zzd(zza3);
                    if (!zzd2) {
                        break;
                    }
                    i6++;
                    zzia.zza(zza3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else {
                zze = zzia.zze(zza2);
                if (!zze) {
                    zzf = zzia.zzf(zza2);
                    if (zzf) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            zzia.zza(zza2, zzhv.zza(bArr, i6), zzhv.zza(bArr, i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw zzfi.zzvb();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        zzia.zza(zza2, zzhv.zza(bArr, i6), zzhv.zza(bArr, i9), zzhv.zza(bArr, i10), cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw zzfi.zzvb();
                    }
                } else if (i6 < i3) {
                    zzia.zza(zza2, zzhv.zza(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw zzfi.zzvb();
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhz
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
            zzhv.zza(bArr, j4, (byte) charAt);
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
                    zzhv.zza(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    zzhv.zza(bArr, j6, (byte) ((charAt3 & '?') | 128));
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
                                zzhv.zza(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                zzhv.zza(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                zzhv.zza(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                zzhv.zza(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new zzib(i4 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        throw new zzib(i4, length);
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
                    zzhv.zza(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    zzhv.zza(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    zzhv.zza(bArr, j11, (byte) ((charAt3 & '?') | 128));
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
                zzhv.zza(bArr, j4, (byte) charAt3);
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
    @Override // com.google.android.gms.internal.measurement.zzhz
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c;
        long j;
        int i;
        char charAt;
        long zzb = zzhv.zzb(byteBuffer);
        long position = byteBuffer.position() + zzb;
        long limit = byteBuffer.limit() + zzb;
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
            zzhv.zza(position, (byte) charAt);
            i2++;
            position = 1 + position;
        }
        if (i2 == length) {
            byteBuffer.position((int) (position - zzb));
            return;
        }
        while (i2 < length) {
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 < c && position < limit) {
                zzhv.zza(position, (byte) charAt3);
                position++;
                j = zzb;
            } else if (charAt3 >= 2048 || position > limit - 2) {
                j = zzb;
                if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                    if (position <= limit - 4) {
                        int i3 = i2 + 1;
                        if (i3 != length) {
                            char charAt4 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j2 = position + 1;
                                zzhv.zza(position, (byte) ((codePoint >>> 18) | 240));
                                long j3 = j2 + 1;
                                zzhv.zza(j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j3 + 1;
                                zzhv.zza(j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j5 = j4 + 1;
                                zzhv.zza(j4, (byte) ((codePoint & 63) | 128));
                                i2 = i3;
                                position = j5;
                            } else {
                                i2 = i3;
                            }
                        }
                        throw new zzib(i2 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i)))) {
                        throw new zzib(i2, length);
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
                zzhv.zza(position, (byte) ((charAt3 >>> '\f') | 480));
                long j7 = j6 + 1;
                zzhv.zza(j6, (byte) (((charAt3 >>> 6) & 63) | 128));
                zzhv.zza(j7, (byte) ((charAt3 & '?') | 128));
                position = j7 + 1;
            } else {
                j = zzb;
                long j8 = position + 1;
                zzhv.zza(position, (byte) ((charAt3 >>> 6) | 960));
                zzhv.zza(j8, (byte) ((charAt3 & '?') | 128));
                position = j8 + 1;
            }
            i2++;
            zzb = j;
            c = 128;
        }
        byteBuffer.position((int) (position - zzb));
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzch;
        int zzr;
        int zzc;
        if (i2 == 0) {
            zzch = zzhy.zzch(i);
            return zzch;
        } else if (i2 == 1) {
            zzr = zzhy.zzr(i, zzhv.zza(bArr, j));
            return zzr;
        } else if (i2 == 2) {
            zzc = zzhy.zzc(i, zzhv.zza(bArr, j), zzhv.zza(bArr, j + 1));
            return zzc;
        } else {
            throw new AssertionError();
        }
    }
}
