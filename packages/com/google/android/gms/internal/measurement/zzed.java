package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzed extends zzeb {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzadx;
    private int zzady;
    private int zzadz;
    private int zzaea;
    private int zzaeb;

    private zzed(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzaeb = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzadz = i;
        this.zzadx = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzsg() throws IOException {
        if (zzsw()) {
            this.zzaea = 0;
            return 0;
        }
        int zzta = zzta();
        this.zzaea = zzta;
        if ((zzta >>> 3) != 0) {
            return zzta;
        }
        throw zzfi.zzuw();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final void zzat(int i) throws zzfi {
        if (this.zzaea != i) {
            throw zzfi.zzux();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final boolean zzau(int i) throws IOException {
        int zzsg;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzfi.zzuv();
            }
            while (i3 < 10) {
                if (zztf() < 0) {
                    i3++;
                }
            }
            throw zzfi.zzuv();
            return true;
        } else if (i2 == 1) {
            zzay(8);
            return true;
        } else if (i2 == 2) {
            zzay(zzta());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzay(4);
                    return true;
                }
                throw zzfi.zzuy();
            }
            return false;
        } else {
            do {
                zzsg = zzsg();
                if (zzsg == 0) {
                    break;
                }
            } while (zzau(zzsg));
            zzat(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zztd());
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zztc());
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzsh() throws IOException {
        return zztb();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzsi() throws IOException {
        return zztb();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzsj() throws IOException {
        return zzta();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzsk() throws IOException {
        return zztd();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzsl() throws IOException {
        return zztc();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final boolean zzsm() throws IOException {
        return zztb() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final String readString() throws IOException {
        int zzta = zzta();
        if (zzta > 0 && zzta <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzta, zzez.UTF_8);
            this.pos += zzta;
            return str;
        } else if (zzta == 0) {
            return "";
        } else {
            if (zzta < 0) {
                throw zzfi.zzuu();
            }
            throw zzfi.zzut();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final String zzsn() throws IOException {
        int zzta = zzta();
        if (zzta > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzta <= i - i2) {
                String zzh = zzhy.zzh(this.buffer, i2, zzta);
                this.pos += zzta;
                return zzh;
            }
        }
        if (zzta == 0) {
            return "";
        }
        if (zzta <= 0) {
            throw zzfi.zzuu();
        }
        throw zzfi.zzut();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final <T extends zzgi> T zza(zzgr<T> zzgrVar, zzel zzelVar) throws IOException {
        int zzta = zzta();
        if (this.zzadp >= this.zzadq) {
            throw zzfi.zzuz();
        }
        int zzaw = zzaw(zzta);
        this.zzadp++;
        T zzc = zzgrVar.zzc(this, zzelVar);
        zzat(0);
        this.zzadp--;
        zzax(zzaw);
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final zzdp zzso() throws IOException {
        byte[] bArr;
        int zzta = zzta();
        if (zzta > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzta <= i - i2) {
                zzdp zzb = zzdp.zzb(this.buffer, i2, zzta);
                this.pos += zzta;
                return zzb;
            }
        }
        if (zzta == 0) {
            return zzdp.zzadh;
        }
        if (zzta > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzta <= i3 - i4) {
                int i5 = zzta + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzdp.zze(bArr);
            }
        }
        if (zzta <= 0) {
            if (zzta == 0) {
                bArr = zzez.zzair;
                return zzdp.zze(bArr);
            }
            throw zzfi.zzuu();
        }
        throw zzfi.zzut();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzsp() throws IOException {
        return zzta();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzsq() throws IOException {
        return zzta();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzsr() throws IOException {
        return zztc();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzss() throws IOException {
        return zztd();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzst() throws IOException {
        return zzaz(zzta());
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzsu() throws IOException {
        return zzbm(zztb());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzta() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L6b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.pos = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.pos = r1
            return r0
        L6b:
            long r0 = r5.zzsv()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzed.zzta():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r2[r0] >= 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zztb() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzed.zztb():long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzsv() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zztf = zztf();
            j |= (zztf & Byte.MAX_VALUE) << i;
            if ((zztf & 128) == 0) {
                return j;
            }
        }
        throw zzfi.zzuv();
    }

    private final int zztc() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzfi.zzut();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zztd() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzfi.zzut();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzaw(int i) throws zzfi {
        if (i < 0) {
            throw zzfi.zzuu();
        }
        int zzsx = i + zzsx();
        int i2 = this.zzaeb;
        if (zzsx > i2) {
            throw zzfi.zzut();
        }
        this.zzaeb = zzsx;
        zzte();
        return i2;
    }

    private final void zzte() {
        int i = this.limit + this.zzady;
        this.limit = i;
        int i2 = i - this.zzadz;
        int i3 = this.zzaeb;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzady = i4;
            this.limit = i - i4;
            return;
        }
        this.zzady = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final void zzax(int i) {
        this.zzaeb = i;
        zzte();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final boolean zzsw() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzsx() {
        return this.pos - this.zzadz;
    }

    private final byte zztf() throws IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw zzfi.zzut();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final void zzay(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzfi.zzuu();
        }
        throw zzfi.zzut();
    }
}
