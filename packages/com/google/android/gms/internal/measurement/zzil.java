package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzil {
    private final byte[] buffer;
    private int zzadp;
    private int zzady;
    private int zzaea;
    private final int zzaoh;
    private int zzaoi;
    private zzeb zzaok;
    private int zzaeb = Integer.MAX_VALUE;
    private int zzadq = 64;
    private int zzadr = 67108864;
    private final int zzaog = 0;
    private int zzaoj = 0;

    public static zzil zzj(byte[] bArr, int i, int i2) {
        return new zzil(bArr, 0, i2);
    }

    public final int zzsg() throws IOException {
        if (this.zzaoj == this.zzaoi) {
            this.zzaea = 0;
            return 0;
        }
        int zzta = zzta();
        this.zzaea = zzta;
        if (zzta != 0) {
            return zzta;
        }
        throw new zzit("Protocol message contained an invalid tag (zero).");
    }

    private final void zzat(int i) throws zzit {
        if (this.zzaea != i) {
            throw new zzit("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzau(int i) throws IOException {
        int zzsg;
        int i2 = i & 7;
        if (i2 == 0) {
            zzta();
            return true;
        } else if (i2 == 1) {
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            return true;
        } else if (i2 == 2) {
            zzay(zzta());
            return true;
        } else if (i2 == 3) {
            do {
                zzsg = zzsg();
                if (zzsg == 0) {
                    break;
                }
            } while (zzau(zzsg));
            zzat(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 != 4) {
            if (i2 == 5) {
                zztf();
                zztf();
                zztf();
                zztf();
                return true;
            }
            throw new zzit("Protocol message tag had invalid wire type.");
        } else {
            return false;
        }
    }

    public final boolean zzsm() throws IOException {
        return zzta() != 0;
    }

    public final String readString() throws IOException {
        int zzta = zzta();
        if (zzta < 0) {
            throw zzit.zzxe();
        }
        if (zzta > this.zzaoi - this.zzaoj) {
            throw zzit.zzxd();
        }
        String str = new String(this.buffer, this.zzaoj, zzta, zziu.UTF_8);
        this.zzaoj += zzta;
        return str;
    }

    public final void zza(zziw zziwVar) throws IOException {
        int zzta = zzta();
        if (this.zzadp >= this.zzadq) {
            throw new zzit("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        if (zzta < 0) {
            throw zzit.zzxe();
        }
        int i = zzta + this.zzaoj;
        int i2 = this.zzaeb;
        if (i > i2) {
            throw zzit.zzxd();
        }
        this.zzaeb = i;
        zzte();
        this.zzadp++;
        zziwVar.zza(this);
        zzat(0);
        this.zzadp--;
        this.zzaeb = i2;
        zzte();
    }

    public final int zzta() throws IOException {
        int i;
        byte zztf = zztf();
        if (zztf >= 0) {
            return zztf;
        }
        int i2 = zztf & Byte.MAX_VALUE;
        byte zztf2 = zztf();
        if (zztf2 >= 0) {
            i = zztf2 << 7;
        } else {
            i2 |= (zztf2 & Byte.MAX_VALUE) << 7;
            byte zztf3 = zztf();
            if (zztf3 >= 0) {
                i = zztf3 << 14;
            } else {
                i2 |= (zztf3 & Byte.MAX_VALUE) << 14;
                byte zztf4 = zztf();
                if (zztf4 < 0) {
                    int i3 = i2 | ((zztf4 & Byte.MAX_VALUE) << 21);
                    byte zztf5 = zztf();
                    int i4 = i3 | (zztf5 << 28);
                    if (zztf5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (zztf() >= 0) {
                                return i4;
                            }
                        }
                        throw zzit.zzxf();
                    }
                    return i4;
                }
                i = zztf4 << 21;
            }
        }
        return i2 | i;
    }

    public final long zztb() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zztf = zztf();
            j |= (zztf & Byte.MAX_VALUE) << i;
            if ((zztf & 128) == 0) {
                return j;
            }
        }
        throw zzit.zzxf();
    }

    private zzil(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        int i3 = i2 + 0;
        this.zzaoi = i3;
        this.zzaoh = i3;
    }

    public final <T extends zzey<T, ?>> T zza(zzgr<T> zzgrVar) throws IOException {
        try {
            if (this.zzaok == null) {
                this.zzaok = zzeb.zzd(this.buffer, this.zzaog, this.zzaoh);
            }
            int zzsx = this.zzaok.zzsx();
            int i = this.zzaoj - this.zzaog;
            if (zzsx > i) {
                throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(zzsx), Integer.valueOf(i)));
            }
            this.zzaok.zzay(i - zzsx);
            this.zzaok.zzav(this.zzadq - this.zzadp);
            T t = (T) this.zzaok.zza(zzgrVar, zzel.zztq());
            zzau(this.zzaea);
            return t;
        } catch (zzfi e) {
            throw new zzit("", e);
        }
    }

    private final void zzte() {
        int i = this.zzaoi + this.zzady;
        this.zzaoi = i;
        int i2 = this.zzaeb;
        if (i > i2) {
            int i3 = i - i2;
            this.zzady = i3;
            this.zzaoi = i - i3;
            return;
        }
        this.zzady = 0;
    }

    public final int getPosition() {
        return this.zzaoj - this.zzaog;
    }

    public final byte[] zzt(int i, int i2) {
        if (i2 == 0) {
            return zzix.zzaph;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzaog + i, bArr, 0, i2);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(int i, int i2) {
        int i3 = this.zzaoj;
        int i4 = this.zzaog;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.zzaoj - this.zzaog);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0) {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.zzaoj = i4 + i;
            this.zzaea = i2;
        }
    }

    private final byte zztf() throws IOException {
        int i = this.zzaoj;
        if (i == this.zzaoi) {
            throw zzit.zzxd();
        }
        byte[] bArr = this.buffer;
        this.zzaoj = i + 1;
        return bArr[i];
    }

    private final void zzay(int i) throws IOException {
        if (i < 0) {
            throw zzit.zzxe();
        }
        int i2 = this.zzaoj;
        int i3 = i2 + i;
        int i4 = this.zzaeb;
        if (i3 > i4) {
            zzay(i4 - i2);
            throw zzit.zzxd();
        } else if (i <= this.zzaoi - i2) {
            this.zzaoj = i2 + i;
        } else {
            throw zzit.zzxd();
        }
    }
}
