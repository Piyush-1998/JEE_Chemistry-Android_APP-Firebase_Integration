package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzif {
    private final int zzafn;
    private final int zzala;
    private final int zzalb;
    private final int zzalc;
    private final int zzald;
    private final short[] zzale;
    private int zzalf;
    private short[] zzalg;
    private int zzalh;
    private short[] zzali;
    private int zzalj;
    private short[] zzalk;
    private int zzaln;
    private int zzalo;
    private int zzalp;
    private int zzalq;
    private int zzals;
    private int zzalt;
    private int zzalu;
    private int zzall = 0;
    private int zzalm = 0;
    private int zzalr = 0;
    private float zzaga = 1.0f;
    private float zzagb = 1.0f;

    public zzif(int i, int i2) {
        this.zzafn = i;
        this.zzala = i2;
        this.zzalb = i / 400;
        int i3 = i / 65;
        this.zzalc = i3;
        int i4 = i3 * 2;
        this.zzald = i4;
        this.zzale = new short[i4];
        this.zzalf = i4;
        this.zzalg = new short[i4 * i2];
        this.zzalh = i4;
        this.zzali = new short[i4 * i2];
        this.zzalj = i4;
        this.zzalk = new short[i4 * i2];
    }

    public final void setSpeed(float f) {
        this.zzaga = f;
    }

    public final void zzc(float f) {
        this.zzagb = f;
    }

    public final void zza(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzala;
        int i2 = remaining / i;
        zzu(i2);
        shortBuffer.get(this.zzalg, this.zzaln * this.zzala, ((i * i2) << 1) / 2);
        this.zzaln += i2;
        zzfs();
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzala, this.zzalo);
        shortBuffer.put(this.zzali, 0, this.zzala * min);
        int i = this.zzalo - min;
        this.zzalo = i;
        short[] sArr = this.zzali;
        int i2 = this.zzala;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zzev() {
        int i;
        int i2 = this.zzaln;
        float f = this.zzaga;
        float f2 = this.zzagb;
        int i3 = this.zzalo + ((int) ((((i2 / (f / f2)) + this.zzalp) / f2) + 0.5f));
        zzu((this.zzald * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.zzald;
            int i5 = this.zzala;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.zzalg[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.zzaln += i * 2;
        zzfs();
        if (this.zzalo > i3) {
            this.zzalo = i3;
        }
        this.zzaln = 0;
        this.zzalq = 0;
        this.zzalp = 0;
    }

    public final int zzfr() {
        return this.zzalo;
    }

    private final void zzt(int i) {
        int i2 = this.zzalo + i;
        int i3 = this.zzalh;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzalh = i4;
            this.zzali = Arrays.copyOf(this.zzali, i4 * this.zzala);
        }
    }

    private final void zzu(int i) {
        int i2 = this.zzaln + i;
        int i3 = this.zzalf;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzalf = i4;
            this.zzalg = Arrays.copyOf(this.zzalg, i4 * this.zzala);
        }
    }

    private final void zza(short[] sArr, int i, int i2) {
        zzt(i2);
        int i3 = this.zzala;
        System.arraycopy(sArr, i * i3, this.zzali, this.zzalo * i3, i3 * i2);
        this.zzalo += i2;
    }

    private final void zzb(short[] sArr, int i, int i2) {
        int i3 = this.zzald / i2;
        int i4 = this.zzala;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzale[i7] = (short) (i8 / i5);
        }
    }

    private final int zza(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzala;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.zzalt = i5 / i7;
        this.zzalu = i8 / i6;
        return i7;
    }

    private final void zzfs() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzalo;
        float f = this.zzaga / this.zzagb;
        double d = f;
        int i8 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.zzaln;
            if (i9 >= this.zzald) {
                int i10 = 0;
                while (true) {
                    int i11 = this.zzalq;
                    if (i11 > 0) {
                        int min = Math.min(this.zzald, i11);
                        zza(this.zzalg, i10, min);
                        this.zzalq -= min;
                        i10 += min;
                    } else {
                        short[] sArr = this.zzalg;
                        int i12 = this.zzafn;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.zzala == i8 && i13 == i8) {
                            i = zza(sArr, i10, this.zzalb, this.zzalc);
                        } else {
                            zzb(sArr, i10, i13);
                            int zza = zza(this.zzale, 0, this.zzalb / i13, this.zzalc / i13);
                            if (i13 != i8) {
                                int i14 = zza * i13;
                                int i15 = i13 << 2;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.zzalb;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.zzalc;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.zzala == i8) {
                                    i = zza(sArr, i10, i16, i17);
                                } else {
                                    zzb(sArr, i10, i8);
                                    i = zza(this.zzale, 0, i16, i17);
                                }
                            } else {
                                i = zza;
                            }
                        }
                        int i20 = this.zzalt;
                        int i21 = i20 != 0 && this.zzalr != 0 && this.zzalu <= i20 * 3 && (i20 << 1) > this.zzals * 3 ? this.zzalr : i;
                        this.zzals = this.zzalt;
                        this.zzalr = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzalg;
                            if (f >= 2.0f) {
                                i3 = (int) (i21 / (f - 1.0f));
                            } else {
                                this.zzalq = (int) ((i21 * (2.0f - f)) / (f - 1.0f));
                                i3 = i21;
                            }
                            zzt(i3);
                            int i22 = i3;
                            zza(i3, this.zzala, this.zzali, this.zzalo, sArr2, i10, sArr2, i10 + i21);
                            this.zzalo += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.zzalg;
                            if (f < 0.5f) {
                                i2 = (int) ((i23 * f) / (1.0f - f));
                            } else {
                                this.zzalq = (int) ((i23 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i2 = i23;
                            }
                            int i24 = i23 + i2;
                            zzt(i24);
                            int i25 = this.zzala;
                            System.arraycopy(sArr3, i10 * i25, this.zzali, this.zzalo * i25, i25 * i23);
                            zza(i2, this.zzala, this.zzali, this.zzalo + i23, sArr3, i23 + i10, sArr3, i10);
                            this.zzalo += i24;
                            i10 += i2;
                        }
                    }
                    if (this.zzald + i10 > i9) {
                        break;
                    }
                    i8 = 1;
                }
                int i26 = this.zzaln - i10;
                short[] sArr4 = this.zzalg;
                int i27 = this.zzala;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.zzaln = i26;
            }
        } else {
            zza(this.zzalg, 0, this.zzaln);
            this.zzaln = 0;
        }
        float f2 = this.zzagb;
        if (f2 == 1.0f || this.zzalo == i7) {
            return;
        }
        int i28 = this.zzafn;
        int i29 = (int) (i28 / f2);
        while (true) {
            if (i29 <= 16384 && i28 <= 16384) {
                break;
            }
            i29 /= 2;
            i28 /= 2;
        }
        int i30 = this.zzalo - i7;
        int i31 = this.zzalp + i30;
        int i32 = this.zzalj;
        if (i31 > i32) {
            int i33 = i32 + (i32 / 2) + i30;
            this.zzalj = i33;
            this.zzalk = Arrays.copyOf(this.zzalk, i33 * this.zzala);
        }
        short[] sArr5 = this.zzali;
        int i34 = this.zzala;
        System.arraycopy(sArr5, i7 * i34, this.zzalk, this.zzalp * i34, i34 * i30);
        this.zzalo = i7;
        this.zzalp += i30;
        int i35 = 0;
        while (true) {
            i4 = this.zzalp;
            if (i35 >= i4 - 1) {
                break;
            }
            while (true) {
                i5 = this.zzall;
                int i36 = (i5 + 1) * i29;
                i6 = this.zzalm;
                if (i36 <= i6 * i28) {
                    break;
                }
                zzt(1);
                int i37 = 0;
                while (true) {
                    int i38 = this.zzala;
                    if (i37 < i38) {
                        short[] sArr6 = this.zzalk;
                        int i39 = (i35 * i38) + i37;
                        short s = sArr6[i39];
                        short s2 = sArr6[i39 + i38];
                        int i40 = this.zzall;
                        int i41 = i40 * i29;
                        int i42 = (i40 + 1) * i29;
                        int i43 = i42 - (this.zzalm * i28);
                        int i44 = i42 - i41;
                        this.zzali[(this.zzalo * i38) + i37] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i37++;
                    }
                }
                this.zzalm++;
                this.zzalo++;
            }
            int i45 = i5 + 1;
            this.zzall = i45;
            if (i45 == i28) {
                this.zzall = 0;
                zznr.checkState(i6 == i29);
                this.zzalm = 0;
            }
            i35++;
        }
        int i46 = i4 - 1;
        if (i46 != 0) {
            short[] sArr7 = this.zzalk;
            int i47 = this.zzala;
            System.arraycopy(sArr7, i46 * i47, sArr7, 0, (i4 - i46) * i47);
            this.zzalp -= i46;
        }
    }

    private static void zza(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
