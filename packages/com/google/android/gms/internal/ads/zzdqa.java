package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdqa extends zzdpy {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzhgo;
    private int zzhgp;
    private int zzhgq;
    private int zzhgr;
    private int zzhgs;

    private zzdqa(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzhgs = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzhgq = i;
        this.zzhgo = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzaxu() throws IOException {
        if (zzayk()) {
            this.zzhgr = 0;
            return 0;
        }
        int zzaym = zzaym();
        this.zzhgr = zzaym;
        if ((zzaym >>> 3) != 0) {
            return zzaym;
        }
        throw zzdrg.zzbaf();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final void zzfp(int i) throws zzdrg {
        if (this.zzhgr != i) {
            throw zzdrg.zzbag();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final boolean zzfq(int i) throws IOException {
        int zzaxu;
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
                throw zzdrg.zzbae();
            }
            while (i3 < 10) {
                if (zzayr() < 0) {
                    i3++;
                }
            }
            throw zzdrg.zzbae();
            return true;
        } else if (i2 == 1) {
            zzfu(8);
            return true;
        } else if (i2 == 2) {
            zzfu(zzaym());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzfu(4);
                    return true;
                }
                throw zzdrg.zzbah();
            }
            return false;
        } else {
            do {
                zzaxu = zzaxu();
                if (zzaxu == 0) {
                    break;
                }
            } while (zzfq(zzaxu));
            zzfp(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzayp());
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzayo());
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final long zzaxv() throws IOException {
        return zzayn();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final long zzaxw() throws IOException {
        return zzayn();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzaxx() throws IOException {
        return zzaym();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final long zzaxy() throws IOException {
        return zzayp();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzaxz() throws IOException {
        return zzayo();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final boolean zzaya() throws IOException {
        return zzayn() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final String readString() throws IOException {
        int zzaym = zzaym();
        if (zzaym > 0 && zzaym <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzaym, zzdqx.UTF_8);
            this.pos += zzaym;
            return str;
        } else if (zzaym == 0) {
            return "";
        } else {
            if (zzaym < 0) {
                throw zzdrg.zzbad();
            }
            throw zzdrg.zzbac();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final String zzayb() throws IOException {
        int zzaym = zzaym();
        if (zzaym > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzaym <= i - i2) {
                String zzn = zzdtw.zzn(this.buffer, i2, zzaym);
                this.pos += zzaym;
                return zzn;
            }
        }
        if (zzaym == 0) {
            return "";
        }
        if (zzaym <= 0) {
            throw zzdrg.zzbad();
        }
        throw zzdrg.zzbac();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final zzdpm zzayc() throws IOException {
        byte[] bArr;
        int zzaym = zzaym();
        if (zzaym > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzaym <= i - i2) {
                zzdpm zzh = zzdpm.zzh(this.buffer, i2, zzaym);
                this.pos += zzaym;
                return zzh;
            }
        }
        if (zzaym == 0) {
            return zzdpm.zzhgb;
        }
        if (zzaym > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzaym <= i3 - i4) {
                int i5 = zzaym + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzdpm.zzz(bArr);
            }
        }
        if (zzaym <= 0) {
            if (zzaym == 0) {
                bArr = zzdqx.zzhlj;
                return zzdpm.zzz(bArr);
            }
            throw zzdrg.zzbad();
        }
        throw zzdrg.zzbac();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzayd() throws IOException {
        return zzaym();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzaye() throws IOException {
        return zzaym();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzayf() throws IOException {
        return zzayo();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final long zzayg() throws IOException {
        return zzayp();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzayh() throws IOException {
        return zzft(zzaym());
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final long zzayi() throws IOException {
        return zzez(zzayn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzaym() throws java.io.IOException {
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
            long r0 = r5.zzayj()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqa.zzaym():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r2[r0] >= 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzayn() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqa.zzayn():long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdpy
    public final long zzayj() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzayr = zzayr();
            j |= (zzayr & Byte.MAX_VALUE) << i;
            if ((zzayr & 128) == 0) {
                return j;
            }
        }
        throw zzdrg.zzbae();
    }

    private final int zzayo() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzdrg.zzbac();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzayp() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzdrg.zzbac();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzfr(int i) throws zzdrg {
        if (i < 0) {
            throw zzdrg.zzbad();
        }
        int zzayl = i + zzayl();
        int i2 = this.zzhgs;
        if (zzayl > i2) {
            throw zzdrg.zzbac();
        }
        this.zzhgs = zzayl;
        zzayq();
        return i2;
    }

    private final void zzayq() {
        int i = this.limit + this.zzhgp;
        this.limit = i;
        int i2 = i - this.zzhgq;
        int i3 = this.zzhgs;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzhgp = i4;
            this.limit = i - i4;
            return;
        }
        this.zzhgp = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final void zzfs(int i) {
        this.zzhgs = i;
        zzayq();
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final boolean zzayk() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final int zzayl() {
        return this.pos - this.zzhgq;
    }

    private final byte zzayr() throws IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw zzdrg.zzbac();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    private final void zzfu(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzdrg.zzbad();
        }
        throw zzdrg.zzbac();
    }
}
