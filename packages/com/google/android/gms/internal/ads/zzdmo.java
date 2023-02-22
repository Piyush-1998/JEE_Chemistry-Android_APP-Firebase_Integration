package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdmo extends zzdml {
    private static final int[] zzhbl = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] zzhbm = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int state;
    private int value;
    private final int[] zzhbn;

    public zzdmo(int i, byte[] bArr) {
        this.zzhbj = bArr;
        this.zzhbn = (i & 8) == 0 ? zzhbl : zzhbm;
        this.state = 0;
        this.value = 0;
    }

    public final boolean zzb(byte[] bArr, int i, int i2, boolean z) {
        int i3 = this.state;
        if (i3 == 6) {
            return false;
        }
        byte[] bArr2 = this.zzhbj;
        int[] iArr = this.zzhbn;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i2) {
            if (i3 == 0) {
                while (true) {
                    int i7 = i4 + 4;
                    if (i7 > i2) {
                        break;
                    }
                    i5 = iArr[bArr[i4 + 3] & 255] | (iArr[bArr[i4 + 1] & 255] << 12) | (iArr[bArr[i4] & 255] << 18) | (iArr[bArr[i4 + 2] & 255] << 6);
                    if (i5 < 0) {
                        break;
                    }
                    bArr2[i6 + 2] = (byte) i5;
                    bArr2[i6 + 1] = (byte) (i5 >> 8);
                    bArr2[i6] = (byte) (i5 >> 16);
                    i6 += 3;
                    i4 = i7;
                }
                if (i4 >= i2) {
                    break;
                }
            }
            int i8 = i4 + 1;
            int i9 = iArr[bArr[i4] & 255];
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i9 < 0) {
                        if (i9 != -1) {
                            this.state = 6;
                            return false;
                        }
                    }
                    i5 = (i5 << 6) | i9;
                    i3++;
                } else if (i3 == 2) {
                    if (i9 < 0) {
                        if (i9 == -2) {
                            bArr2[i6] = (byte) (i5 >> 4);
                            i6++;
                            i4 = i8;
                            i3 = 4;
                        } else if (i9 != -1) {
                            this.state = 6;
                            return false;
                        }
                    }
                    i5 = (i5 << 6) | i9;
                    i3++;
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        if (i9 != -2) {
                            if (i9 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i3++;
                    } else if (i3 == 5 && i9 != -1) {
                        this.state = 6;
                        return false;
                    }
                } else if (i9 >= 0) {
                    i5 = (i5 << 6) | i9;
                    bArr2[i6 + 2] = (byte) i5;
                    bArr2[i6 + 1] = (byte) (i5 >> 8);
                    bArr2[i6] = (byte) (i5 >> 16);
                    i6 += 3;
                    i4 = i8;
                    i3 = 0;
                } else if (i9 == -2) {
                    bArr2[i6 + 1] = (byte) (i5 >> 2);
                    bArr2[i6] = (byte) (i5 >> 10);
                    i6 += 2;
                    i4 = i8;
                    i3 = 5;
                } else if (i9 != -1) {
                    this.state = 6;
                    return false;
                }
            } else if (i9 >= 0) {
                i3++;
                i5 = i9;
            } else if (i9 != -1) {
                this.state = 6;
                return false;
            }
            i4 = i8;
        }
        if (i3 == 1) {
            this.state = 6;
            return false;
        }
        if (i3 == 2) {
            bArr2[i6] = (byte) (i5 >> 4);
            i6++;
        } else if (i3 == 3) {
            int i10 = i6 + 1;
            bArr2[i6] = (byte) (i5 >> 10);
            i6 = i10 + 1;
            bArr2[i10] = (byte) (i5 >> 2);
        } else if (i3 == 4) {
            this.state = 6;
            return false;
        }
        this.state = i3;
        this.zzhbk = i6;
        return true;
    }
}
