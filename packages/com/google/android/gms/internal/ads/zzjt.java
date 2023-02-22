package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzkx;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzjt {
    private static final int zzaum = zzof.zzbi("vide");
    private static final int zzaun = zzof.zzbi("soun");
    private static final int zzauo = zzof.zzbi("text");
    private static final int zzaup = zzof.zzbi("sbtl");
    private static final int zzauq = zzof.zzbi("subt");
    private static final int zzaur = zzof.zzbi("clcp");
    private static final int zzaus = zzof.zzbi("cenc");
    private static final int zzaty = zzof.zzbi("meta");

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
        if (r14 == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0485 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzkh zza(com.google.android.gms.internal.ads.zzjr r50, com.google.android.gms.internal.ads.zzju r51, long r52, com.google.android.gms.internal.ads.zzin r54, boolean r55) throws com.google.android.gms.internal.ads.zzgv {
        /*
            Method dump skipped, instructions count: 1829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zza(com.google.android.gms.internal.ads.zzjr, com.google.android.gms.internal.ads.zzju, long, com.google.android.gms.internal.ads.zzin, boolean):com.google.android.gms.internal.ads.zzkh");
    }

    public static zzkj zza(zzkh zzkhVar, zzjr zzjrVar, zzja zzjaVar) throws zzgv {
        zzjv zzkaVar;
        boolean z;
        int i;
        int i2;
        zzkh zzkhVar2;
        int i3;
        long[] jArr;
        int[] iArr;
        int i4;
        long[] jArr2;
        int[] iArr2;
        long j;
        boolean z2;
        long[] jArr3;
        int[] iArr3;
        int i5;
        long[] jArr4;
        int[] iArr4;
        int i6;
        int i7;
        int i8;
        int i9;
        zzju zzak = zzjrVar.zzak(zzjs.zzatn);
        if (zzak != null) {
            zzkaVar = new zzjx(zzak);
        } else {
            zzju zzak2 = zzjrVar.zzak(zzjs.zzato);
            if (zzak2 == null) {
                throw new zzgv("Track has no sample table size information");
            }
            zzkaVar = new zzka(zzak2);
        }
        int zzgj = zzkaVar.zzgj();
        if (zzgj == 0) {
            return new zzkj(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzju zzak3 = zzjrVar.zzak(zzjs.zzatp);
        if (zzak3 == null) {
            zzak3 = zzjrVar.zzak(zzjs.zzatq);
            z = true;
        } else {
            z = false;
        }
        zzoc zzocVar = zzak3.zzaut;
        zzoc zzocVar2 = zzjrVar.zzak(zzjs.zzatm).zzaut;
        zzoc zzocVar3 = zzjrVar.zzak(zzjs.zzatj).zzaut;
        zzju zzak4 = zzjrVar.zzak(zzjs.zzatk);
        zzoc zzocVar4 = null;
        zzoc zzocVar5 = zzak4 != null ? zzak4.zzaut : null;
        zzju zzak5 = zzjrVar.zzak(zzjs.zzatl);
        zzoc zzocVar6 = zzak5 != null ? zzak5.zzaut : null;
        zzjw zzjwVar = new zzjw(zzocVar2, zzocVar, z);
        zzocVar3.zzbg(12);
        int zzir = zzocVar3.zzir() - 1;
        int zzir2 = zzocVar3.zzir();
        int zzir3 = zzocVar3.zzir();
        if (zzocVar6 != null) {
            zzocVar6.zzbg(12);
            i = zzocVar6.zzir();
        } else {
            i = 0;
        }
        int i10 = -1;
        if (zzocVar5 != null) {
            zzocVar5.zzbg(12);
            i2 = zzocVar5.zzir();
            if (i2 > 0) {
                i10 = zzocVar5.zzir() - 1;
                zzocVar4 = zzocVar5;
            }
        } else {
            zzocVar4 = zzocVar5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(zzkaVar.zzgl() && "audio/raw".equals(zzkhVar.zzafx.zzafc) && zzir == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[zzgj];
            iArr = new int[zzgj];
            jArr2 = new long[zzgj];
            int i11 = i2;
            iArr2 = new int[zzgj];
            int i12 = i10;
            long j3 = 0;
            j = 0;
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = i;
            int i18 = zzir3;
            int i19 = zzir2;
            int i20 = zzir;
            int i21 = i11;
            while (i13 < zzgj) {
                while (i15 == 0) {
                    zznr.checkState(zzjwVar.zzgm());
                    j3 = zzjwVar.zzauv;
                    i15 = zzjwVar.zzauu;
                    i18 = i18;
                    i19 = i19;
                }
                int i22 = i19;
                int i23 = i18;
                if (zzocVar6 != null) {
                    while (i14 == 0 && i17 > 0) {
                        i14 = zzocVar6.zzir();
                        i16 = zzocVar6.readInt();
                        i17--;
                    }
                    i14--;
                }
                int i24 = i16;
                jArr5[i13] = j3;
                iArr[i13] = zzkaVar.zzgk();
                if (iArr[i13] > i4) {
                    i4 = iArr[i13];
                }
                int i25 = zzgj;
                zzjv zzjvVar = zzkaVar;
                jArr2[i13] = j + i24;
                iArr2[i13] = zzocVar4 == null ? 1 : 0;
                if (i13 == i12) {
                    iArr2[i13] = 1;
                    i21--;
                    if (i21 > 0) {
                        i12 = zzocVar4.zzir() - 1;
                    }
                }
                long[] jArr6 = jArr5;
                j += i23;
                int i26 = i22 - 1;
                if (i26 != 0 || i20 <= 0) {
                    i8 = i23;
                    i9 = i26;
                } else {
                    i9 = zzocVar3.zzir();
                    i8 = zzocVar3.zzir();
                    i20--;
                }
                int i27 = i9;
                j3 += iArr[i13];
                i15--;
                i13++;
                zzgj = i25;
                jArr5 = jArr6;
                i12 = i12;
                i16 = i24;
                i19 = i27;
                i18 = i8;
                zzkaVar = zzjvVar;
            }
            i3 = zzgj;
            long[] jArr7 = jArr5;
            int i28 = i19;
            zznr.checkArgument(i14 == 0);
            while (i17 > 0) {
                zznr.checkArgument(zzocVar6.zzir() == 0);
                zzocVar6.readInt();
                i17--;
            }
            if (i21 == 0 && i28 == 0) {
                i7 = i15;
                if (i7 == 0 && i20 == 0) {
                    zzkhVar2 = zzkhVar;
                    jArr = jArr7;
                }
            } else {
                i7 = i15;
            }
            zzkhVar2 = zzkhVar;
            int i29 = zzkhVar2.id;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i29);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i21);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i28);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i20);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr7;
        } else {
            zzkhVar2 = zzkhVar;
            i3 = zzgj;
            zzjv zzjvVar2 = zzkaVar;
            long[] jArr8 = new long[zzjwVar.length];
            int i30 = zzjwVar.length;
            int[] iArr5 = new int[i30];
            while (zzjwVar.zzgm()) {
                jArr8[zzjwVar.index] = zzjwVar.zzauv;
                iArr5[zzjwVar.index] = zzjwVar.zzauu;
            }
            int zzgk = zzjvVar2.zzgk();
            long j4 = zzir3;
            int i31 = 8192 / zzgk;
            int i32 = 0;
            for (int i33 = 0; i33 < i30; i33++) {
                i32 += zzof.zze(iArr5[i33], i31);
            }
            long[] jArr9 = new long[i32];
            int[] iArr6 = new int[i32];
            long[] jArr10 = new long[i32];
            int[] iArr7 = new int[i32];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i34 < i30) {
                int i38 = iArr5[i34];
                long j5 = jArr8[i34];
                long[] jArr11 = jArr8;
                int i39 = i38;
                while (i39 > 0) {
                    int min = Math.min(i31, i39);
                    jArr9[i36] = j5;
                    iArr6[i36] = zzgk * min;
                    i37 = Math.max(i37, iArr6[i36]);
                    jArr10[i36] = i35 * j4;
                    iArr7[i36] = 1;
                    j5 += iArr6[i36];
                    i35 += min;
                    i39 -= min;
                    i36++;
                    i30 = i30;
                    iArr5 = iArr5;
                }
                i34++;
                jArr8 = jArr11;
            }
            zzkb zzkbVar = new zzkb(jArr9, iArr6, i37, jArr10, iArr7);
            jArr = zzkbVar.zzamv;
            iArr = zzkbVar.zzamu;
            i4 = zzkbVar.zzavi;
            jArr2 = zzkbVar.zzavj;
            iArr2 = zzkbVar.zzavk;
            j = 0;
        }
        if (zzkhVar2.zzaxf == null || zzjaVar.zzgf()) {
            zzof.zza(jArr2, 1000000L, zzkhVar2.zzct);
            return new zzkj(jArr, iArr, i4, jArr2, iArr2);
        }
        if (zzkhVar2.zzaxf.length == 1 && zzkhVar2.type == 1 && jArr2.length >= 2) {
            long j6 = zzkhVar2.zzaxg[0];
            long zza = zzof.zza(zzkhVar2.zzaxf[0], zzkhVar2.zzct, zzkhVar2.zzaxc) + j6;
            if (jArr2[0] <= j6 && j6 < jArr2[1] && jArr2[jArr2.length - 1] < zza && zza <= j) {
                long j7 = j - zza;
                long zza2 = zzof.zza(j6 - jArr2[0], zzkhVar2.zzafx.zzafn, zzkhVar2.zzct);
                long zza3 = zzof.zza(j7, zzkhVar2.zzafx.zzafn, zzkhVar2.zzct);
                if ((zza2 != 0 || zza3 != 0) && zza2 <= 2147483647L && zza3 <= 2147483647L) {
                    zzjaVar.zzafp = (int) zza2;
                    zzjaVar.zzafq = (int) zza3;
                    zzof.zza(jArr2, 1000000L, zzkhVar2.zzct);
                    return new zzkj(jArr, iArr, i4, jArr2, iArr2);
                }
            }
        }
        if (zzkhVar2.zzaxf.length == 1) {
            char c = 0;
            if (zzkhVar2.zzaxf[0] == 0) {
                int i40 = 0;
                while (i40 < jArr2.length) {
                    jArr2[i40] = zzof.zza(jArr2[i40] - zzkhVar2.zzaxg[c], 1000000L, zzkhVar2.zzct);
                    i40++;
                    c = 0;
                }
                return new zzkj(jArr, iArr, i4, jArr2, iArr2);
            }
        }
        boolean z3 = zzkhVar2.type == 1;
        boolean z4 = false;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (i42 < zzkhVar2.zzaxf.length) {
            long j8 = zzkhVar2.zzaxg[i42];
            if (j8 != -1) {
                i6 = i4;
                long zza4 = zzof.zza(zzkhVar2.zzaxf[i42], zzkhVar2.zzct, zzkhVar2.zzaxc);
                int zzb = zzof.zzb(jArr2, j8, true, true);
                int zzb2 = zzof.zzb(jArr2, j8 + zza4, z3, false);
                i41 += zzb2 - zzb;
                z4 |= i43 != zzb;
                i43 = zzb2;
            } else {
                i6 = i4;
            }
            i42++;
            i4 = i6;
        }
        int i44 = i4;
        boolean z5 = z4 | (i41 != i3);
        long[] jArr12 = z5 ? new long[i41] : jArr;
        int[] iArr8 = z5 ? new int[i41] : iArr;
        int i45 = z5 ? 0 : i44;
        int[] iArr9 = z5 ? new int[i41] : iArr2;
        long[] jArr13 = new long[i41];
        int i46 = i45;
        int i47 = 0;
        int i48 = 0;
        while (i47 < zzkhVar2.zzaxf.length) {
            long j9 = zzkhVar2.zzaxg[i47];
            long j10 = zzkhVar2.zzaxf[i47];
            if (j9 != -1) {
                int[] iArr10 = iArr9;
                i5 = i47;
                long[] jArr14 = jArr12;
                long[] jArr15 = jArr;
                int zzb3 = zzof.zzb(jArr2, j9, true, true);
                int zzb4 = zzof.zzb(jArr2, zzof.zza(j10, zzkhVar2.zzct, zzkhVar2.zzaxc) + j9, z3, false);
                if (z5) {
                    int i49 = zzb4 - zzb3;
                    jArr3 = jArr14;
                    jArr4 = jArr15;
                    System.arraycopy(jArr4, zzb3, jArr3, i48, i49);
                    System.arraycopy(iArr, zzb3, iArr8, i48, i49);
                    z2 = z3;
                    iArr4 = iArr10;
                    System.arraycopy(iArr2, zzb3, iArr4, i48, i49);
                } else {
                    jArr3 = jArr14;
                    z2 = z3;
                    iArr4 = iArr10;
                    jArr4 = jArr15;
                }
                int i50 = i46;
                while (zzb3 < zzb4) {
                    int[] iArr11 = iArr4;
                    int i51 = zzb4;
                    long j11 = j9;
                    jArr13[i48] = zzof.zza(j2, 1000000L, zzkhVar2.zzaxc) + zzof.zza(jArr2[zzb3] - j9, 1000000L, zzkhVar2.zzct);
                    if (z5 && iArr8[i48] > i50) {
                        i50 = iArr[zzb3];
                    }
                    i48++;
                    zzb3++;
                    j9 = j11;
                    zzb4 = i51;
                    iArr4 = iArr11;
                }
                iArr3 = iArr4;
                i46 = i50;
            } else {
                z2 = z3;
                jArr3 = jArr12;
                iArr3 = iArr9;
                i5 = i47;
                jArr4 = jArr;
            }
            j2 += j10;
            i47 = i5 + 1;
            jArr = jArr4;
            jArr12 = jArr3;
            z3 = z2;
            iArr9 = iArr3;
        }
        long[] jArr16 = jArr12;
        int[] iArr12 = iArr9;
        boolean z6 = false;
        for (int i52 = 0; i52 < iArr12.length && !z6; i52++) {
            z6 |= (iArr12[i52] & 1) != 0;
        }
        if (!z6) {
            throw new zzgv("The edited sample sequence does not contain a sync sample.");
        }
        return new zzkj(jArr16, iArr8, i46, jArr13, iArr12);
    }

    public static zzkx zza(zzju zzjuVar, boolean z) {
        if (z) {
            return null;
        }
        zzoc zzocVar = zzjuVar.zzaut;
        zzocVar.zzbg(8);
        while (zzocVar.zzim() >= 8) {
            int position = zzocVar.getPosition();
            int readInt = zzocVar.readInt();
            if (zzocVar.readInt() == zzjs.zzaty) {
                zzocVar.zzbg(position);
                int i = position + readInt;
                zzocVar.zzbh(12);
                while (true) {
                    if (zzocVar.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzocVar.getPosition();
                    int readInt2 = zzocVar.readInt();
                    if (zzocVar.readInt() == zzjs.zzatz) {
                        zzocVar.zzbg(position2);
                        int i2 = position2 + readInt2;
                        zzocVar.zzbh(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzocVar.getPosition() < i2) {
                            zzkx.zza zzd = zzke.zzd(zzocVar);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzkx(arrayList);
                        }
                    } else {
                        zzocVar.zzbh(readInt2 - 8);
                    }
                }
                return null;
            }
            zzocVar.zzbh(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzoc zzocVar, int i) {
        zzocVar.zzbg(i + 8 + 4);
        zzocVar.zzbh(1);
        zzc(zzocVar);
        zzocVar.zzbh(2);
        int readUnsignedByte = zzocVar.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzocVar.zzbh(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzocVar.zzbh(zzocVar.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzocVar.zzbh(2);
        }
        zzocVar.zzbh(1);
        zzc(zzocVar);
        int readUnsignedByte2 = zzocVar.readUnsignedByte();
        String str = null;
        if (readUnsignedByte2 == 32) {
            str = "video/mp4v-es";
        } else if (readUnsignedByte2 == 33) {
            str = "video/avc";
        } else if (readUnsignedByte2 != 35) {
            if (readUnsignedByte2 != 64) {
                if (readUnsignedByte2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (readUnsignedByte2 == 165) {
                    str = "audio/ac3";
                } else if (readUnsignedByte2 != 166) {
                    switch (readUnsignedByte2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (readUnsignedByte2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzocVar.zzbh(12);
        zzocVar.zzbh(1);
        int zzc = zzc(zzocVar);
        byte[] bArr = new byte[zzc];
        zzocVar.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzoc zzocVar, int i, int i2, zzjy zzjyVar, int i3) {
        int position = zzocVar.getPosition();
        while (true) {
            if (position - i >= i2) {
                return 0;
            }
            zzocVar.zzbg(position);
            int readInt = zzocVar.readInt();
            zznr.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzocVar.readInt() == zzjs.zzass) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzkk zzkkVar = null;
                boolean z = false;
                while (i4 - position < readInt) {
                    zzocVar.zzbg(i4);
                    int readInt2 = zzocVar.readInt();
                    int readInt3 = zzocVar.readInt();
                    if (readInt3 == zzjs.zzasy) {
                        num = Integer.valueOf(zzocVar.readInt());
                    } else if (readInt3 == zzjs.zzast) {
                        zzocVar.zzbh(4);
                        z = zzocVar.readInt() == zzaus;
                    } else if (readInt3 == zzjs.zzasu) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzkkVar = null;
                                break;
                            }
                            zzocVar.zzbg(i5);
                            int readInt4 = zzocVar.readInt();
                            if (zzocVar.readInt() == zzjs.zzasv) {
                                zzocVar.zzbh(6);
                                boolean z2 = zzocVar.readUnsignedByte() == 1;
                                int readUnsignedByte = zzocVar.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzocVar.zze(bArr, 0, 16);
                                zzkkVar = new zzkk(z2, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                    }
                    i4 += readInt2;
                }
                if (z) {
                    zznr.checkArgument(num != null, "frma atom is mandatory");
                    zznr.checkArgument(zzkkVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzkkVar);
                }
                if (pair != null) {
                    zzjyVar.zzavd[i3] = (zzkk) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            position += readInt;
        }
    }

    private static int zzc(zzoc zzocVar) {
        int readUnsignedByte = zzocVar.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzocVar.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
