package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zznz {
    private byte[] data;
    private int zzbgg;
    private int zzbgh;
    private int zzbgi;

    public zznz() {
    }

    public zznz(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zznz(byte[] bArr, int i) {
        this.data = bArr;
        this.zzbgi = i;
    }

    public final int zzbc(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i6 = i / 8;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.zzbgh;
            if (i9 != 0) {
                byte[] bArr = this.data;
                int i10 = this.zzbgg;
                i5 = ((bArr[i10 + 1] & 255) >>> (8 - i9)) | ((bArr[i10] & 255) << i9);
            } else {
                i5 = this.data[this.zzbgg];
            }
            i -= 8;
            i7 |= (255 & i5) << i;
            this.zzbgg++;
        }
        if (i > 0) {
            int i11 = this.zzbgh + i;
            byte b = (byte) (255 >> (8 - i));
            if (i11 > 8) {
                byte[] bArr2 = this.data;
                int i12 = this.zzbgg;
                i4 = (b & (((255 & bArr2[i12 + 1]) >> (16 - i11)) | ((bArr2[i12] & 255) << (i11 - 8)))) | i7;
                this.zzbgg = i12 + 1;
            } else {
                byte[] bArr3 = this.data;
                int i13 = this.zzbgg;
                i4 = (b & ((255 & bArr3[i13]) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.zzbgg = i13 + 1;
                }
            }
            i7 = i4;
            this.zzbgh = i11 % 8;
        }
        int i14 = this.zzbgg;
        if (i14 >= 0 && (i2 = this.zzbgh) >= 0 && i2 < 8 && (i14 < (i3 = this.zzbgi) || (i14 == i3 && i2 == 0))) {
            z = true;
        }
        zznr.checkState(z);
        return i7;
    }
}
