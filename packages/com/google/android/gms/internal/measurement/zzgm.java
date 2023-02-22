package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgm<T> implements zzgx<T> {
    private static final int[] zzakh = new int[0];
    private static final Unsafe zzaki = zzhv.zzwv();
    private final int[] zzakj;
    private final Object[] zzakk;
    private final int zzakl;
    private final int zzakm;
    private final zzgi zzakn;
    private final boolean zzako;
    private final boolean zzakp;
    private final boolean zzakq;
    private final boolean zzakr;
    private final int[] zzaks;
    private final int zzakt;
    private final int zzaku;
    private final zzgq zzakv;
    private final zzfs zzakw;
    private final zzhp<?, ?> zzakx;
    private final zzen<?> zzaky;
    private final zzgb zzakz;

    private zzgm(int[] iArr, Object[] objArr, int i, int i2, zzgi zzgiVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgq zzgqVar, zzfs zzfsVar, zzhp<?, ?> zzhpVar, zzen<?> zzenVar, zzgb zzgbVar) {
        this.zzakj = iArr;
        this.zzakk = objArr;
        this.zzakl = i;
        this.zzakm = i2;
        this.zzakp = zzgiVar instanceof zzey;
        this.zzakq = z;
        this.zzako = zzenVar != null && zzenVar.zze(zzgiVar);
        this.zzakr = false;
        this.zzaks = iArr2;
        this.zzakt = i3;
        this.zzaku = i4;
        this.zzakv = zzgqVar;
        this.zzakw = zzfsVar;
        this.zzakx = zzhpVar;
        this.zzaky = zzenVar;
        this.zzakn = zzgiVar;
        this.zzakz = zzgbVar;
    }

    private static boolean zzcc(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzgm<T> zza(Class<T> cls, zzgg zzggVar, zzgq zzgqVar, zzfs zzfsVar, zzhp<?, ?> zzhpVar, zzen<?> zzenVar, zzgb zzgbVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z;
        int i17;
        zzgv zzgvVar;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int i21;
        int i22;
        Field zza;
        int i23;
        char charAt11;
        int i24;
        Field zza2;
        Field zza3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        char charAt16;
        if (zzggVar instanceof zzgv) {
            zzgv zzgvVar2 = (zzgv) zzggVar;
            int i29 = 0;
            boolean z2 = zzgvVar2.zzvr() == zzey.zzd.zzaim;
            String zzvz = zzgvVar2.zzvz();
            int length = zzvz.length();
            int charAt17 = zzvz.charAt(0);
            if (charAt17 >= 55296) {
                int i30 = charAt17 & 8191;
                int i31 = 1;
                int i32 = 13;
                while (true) {
                    i = i31 + 1;
                    charAt16 = zzvz.charAt(i31);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i30 |= (charAt16 & 8191) << i32;
                    i32 += 13;
                    i31 = i;
                }
                charAt17 = i30 | (charAt16 << i32);
            } else {
                i = 1;
            }
            int i33 = i + 1;
            int charAt18 = zzvz.charAt(i);
            if (charAt18 >= 55296) {
                int i34 = charAt18 & 8191;
                int i35 = 13;
                while (true) {
                    i28 = i33 + 1;
                    charAt15 = zzvz.charAt(i33);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i34 |= (charAt15 & 8191) << i35;
                    i35 += 13;
                    i33 = i28;
                }
                charAt18 = i34 | (charAt15 << i35);
                i33 = i28;
            }
            if (charAt18 == 0) {
                iArr = zzakh;
                i6 = 0;
                i3 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
            } else {
                int i36 = i33 + 1;
                int charAt19 = zzvz.charAt(i33);
                if (charAt19 >= 55296) {
                    int i37 = charAt19 & 8191;
                    int i38 = 13;
                    while (true) {
                        i14 = i36 + 1;
                        charAt10 = zzvz.charAt(i36);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i37 |= (charAt10 & 8191) << i38;
                        i38 += 13;
                        i36 = i14;
                    }
                    charAt19 = i37 | (charAt10 << i38);
                    i36 = i14;
                }
                int i39 = i36 + 1;
                int charAt20 = zzvz.charAt(i36);
                if (charAt20 >= 55296) {
                    int i40 = charAt20 & 8191;
                    int i41 = 13;
                    while (true) {
                        i13 = i39 + 1;
                        charAt9 = zzvz.charAt(i39);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i40 |= (charAt9 & 8191) << i41;
                        i41 += 13;
                        i39 = i13;
                    }
                    charAt20 = i40 | (charAt9 << i41);
                    i39 = i13;
                }
                int i42 = i39 + 1;
                charAt = zzvz.charAt(i39);
                if (charAt >= 55296) {
                    int i43 = charAt & 8191;
                    int i44 = 13;
                    while (true) {
                        i12 = i42 + 1;
                        charAt8 = zzvz.charAt(i42);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i43 |= (charAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i12;
                    }
                    charAt = i43 | (charAt8 << i44);
                    i42 = i12;
                }
                int i45 = i42 + 1;
                int charAt21 = zzvz.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i11 = i45 + 1;
                        charAt7 = zzvz.charAt(i45);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i46 |= (charAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i11;
                    }
                    charAt21 = i46 | (charAt7 << i47);
                    i45 = i11;
                }
                int i48 = i45 + 1;
                charAt2 = zzvz.charAt(i45);
                if (charAt2 >= 55296) {
                    int i49 = charAt2 & 8191;
                    int i50 = 13;
                    while (true) {
                        i10 = i48 + 1;
                        charAt6 = zzvz.charAt(i48);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i49 |= (charAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i10;
                    }
                    charAt2 = i49 | (charAt6 << i50);
                    i48 = i10;
                }
                int i51 = i48 + 1;
                int charAt22 = zzvz.charAt(i48);
                if (charAt22 >= 55296) {
                    int i52 = charAt22 & 8191;
                    int i53 = 13;
                    while (true) {
                        i9 = i51 + 1;
                        charAt5 = zzvz.charAt(i51);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i52 |= (charAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i9;
                    }
                    charAt22 = i52 | (charAt5 << i53);
                    i51 = i9;
                }
                int i54 = i51 + 1;
                int charAt23 = zzvz.charAt(i51);
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i54;
                    int i57 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        charAt4 = zzvz.charAt(i56);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i8;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i2 = i8;
                } else {
                    i2 = i54;
                }
                int i58 = i2 + 1;
                int charAt24 = zzvz.charAt(i2);
                if (charAt24 >= 55296) {
                    int i59 = charAt24 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i7 = i60 + 1;
                        charAt3 = zzvz.charAt(i60);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i59 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i7;
                    }
                    charAt24 = i59 | (charAt3 << i61);
                    i58 = i7;
                }
                int i62 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i62;
                i5 = charAt24;
                i29 = charAt19;
                i33 = i58;
                int i63 = charAt22;
                iArr = new int[charAt24 + charAt22 + charAt23];
                i6 = i63;
            }
            Unsafe unsafe = zzaki;
            Object[] zzwa = zzgvVar2.zzwa();
            Class<?> cls3 = zzgvVar2.zzvt().getClass();
            int i64 = i33;
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i65 = i5 + i6;
            int i66 = i5;
            int i67 = i64;
            int i68 = i65;
            int i69 = 0;
            int i70 = 0;
            while (i67 < length) {
                int i71 = i67 + 1;
                int charAt25 = zzvz.charAt(i67);
                int i72 = length;
                if (charAt25 >= 55296) {
                    int i73 = charAt25 & 8191;
                    int i74 = i71;
                    int i75 = 13;
                    while (true) {
                        i27 = i74 + 1;
                        charAt14 = zzvz.charAt(i74);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i73 |= (charAt14 & 8191) << i75;
                        i75 += 13;
                        i74 = i27;
                        i5 = i15;
                    }
                    charAt25 = i73 | (charAt14 << i75);
                    i16 = i27;
                } else {
                    i15 = i5;
                    i16 = i71;
                }
                int i76 = i16 + 1;
                int charAt26 = zzvz.charAt(i16);
                if (charAt26 >= 55296) {
                    int i77 = charAt26 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i26 = i78 + 1;
                        charAt13 = zzvz.charAt(i78);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i77 |= (charAt13 & 8191) << i79;
                        i79 += 13;
                        i78 = i26;
                        z2 = z;
                    }
                    charAt26 = i77 | (charAt13 << i79);
                    i17 = i26;
                } else {
                    z = z2;
                    i17 = i76;
                }
                int i80 = charAt26 & 255;
                int i81 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i69] = i70;
                    i69++;
                }
                int i82 = charAt;
                if (i80 >= 51) {
                    int i83 = i17 + 1;
                    int charAt27 = zzvz.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i84 = charAt27 & 8191;
                        int i85 = 13;
                        while (true) {
                            i25 = i83 + 1;
                            charAt12 = zzvz.charAt(i83);
                            if (charAt12 < c) {
                                break;
                            }
                            i84 |= (charAt12 & 8191) << i85;
                            i85 += 13;
                            i83 = i25;
                            c = 55296;
                        }
                        charAt27 = i84 | (charAt12 << i85);
                        i83 = i25;
                    }
                    int i86 = i80 - 51;
                    int i87 = i83;
                    if (i86 == 9 || i86 == 17) {
                        objArr[((i70 / 3) << 1) + 1] = zzwa[i4];
                        i4++;
                    } else if (i86 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i70 / 3) << 1) + 1] = zzwa[i4];
                        i4++;
                    }
                    int i88 = charAt27 << 1;
                    Object obj = zzwa[i88];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls3, (String) obj);
                        zzwa[i88] = zza2;
                    }
                    zzgvVar = zzgvVar2;
                    String str2 = zzvz;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza2);
                    int i89 = i88 + 1;
                    Object obj2 = zzwa[i89];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls3, (String) obj2);
                        zzwa[i89] = zza3;
                    }
                    cls2 = cls3;
                    i19 = i4;
                    i17 = i87;
                    str = str2;
                    i22 = 0;
                    i21 = (int) unsafe.objectFieldOffset(zza3);
                    i20 = i29;
                } else {
                    zzgvVar = zzgvVar2;
                    String str3 = zzvz;
                    int i90 = i4 + 1;
                    Field zza4 = zza(cls3, (String) zzwa[i4]);
                    if (i80 == 9 || i80 == 17) {
                        i18 = 1;
                        objArr[((i70 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i18 = 1;
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = zzwa[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i18 = 1;
                            if ((charAt17 & 1) == 1) {
                                i24 = i90 + 1;
                                objArr[((i70 / 3) << 1) + 1] = zzwa[i90];
                            }
                        } else {
                            if (i80 == 50) {
                                int i91 = i66 + 1;
                                iArr[i66] = i70;
                                int i92 = (i70 / 3) << 1;
                                int i93 = i90 + 1;
                                objArr[i92] = zzwa[i90];
                                if ((charAt26 & 2048) != 0) {
                                    i90 = i93 + 1;
                                    objArr[i92 + 1] = zzwa[i93];
                                    i66 = i91;
                                } else {
                                    i90 = i93;
                                    i18 = 1;
                                    i66 = i91;
                                }
                            }
                            i18 = 1;
                        }
                        i90 = i24;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((charAt17 & 1) != i18 || i80 > 17) {
                        i19 = i90;
                        i20 = i29;
                        cls2 = cls3;
                        str = str3;
                        i21 = 0;
                        i22 = 0;
                    } else {
                        int i94 = i17 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i17);
                        if (charAt28 >= 55296) {
                            int i95 = charAt28 & 8191;
                            int i96 = 13;
                            while (true) {
                                i23 = i94 + 1;
                                charAt11 = str.charAt(i94);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i95 |= (charAt11 & 8191) << i96;
                                i96 += 13;
                                i94 = i23;
                            }
                            charAt28 = i95 | (charAt11 << i96);
                            i94 = i23;
                        }
                        int i97 = (i29 << 1) + (charAt28 / 32);
                        Object obj3 = zzwa[i97];
                        i19 = i90;
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls3, (String) obj3);
                            zzwa[i97] = zza;
                        }
                        i20 = i29;
                        cls2 = cls3;
                        i21 = (int) unsafe.objectFieldOffset(zza);
                        i22 = charAt28 % 32;
                        i17 = i94;
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                }
                int i98 = i70 + 1;
                iArr2[i70] = charAt25;
                int i99 = i98 + 1;
                iArr2[i98] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i80 << 20);
                i70 = i99 + 1;
                iArr2[i99] = (i22 << 20) | i21;
                i29 = i20;
                zzvz = str;
                i67 = i17;
                cls3 = cls2;
                i3 = i81;
                length = i72;
                i5 = i15;
                z2 = z;
                charAt = i82;
                i4 = i19;
                zzgvVar2 = zzgvVar;
            }
            return new zzgm<>(iArr2, objArr, charAt, i3, zzgvVar2.zzvt(), z2, false, iArr, i5, i65, zzgqVar, zzfsVar, zzhpVar, zzenVar, zzgbVar);
        }
        ((zzhm) zzggVar).zzvr();
        int i100 = zzey.zzd.zzaim;
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final T newInstance() {
        return (T) this.zzakv.newInstance(this.zzakn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzhv.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzhv.zzo(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.zzgz.zzd(com.google.android.gms.internal.measurement.zzhv.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhv.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.zzgz.zzd(com.google.android.gms.internal.measurement.zzhv.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhv.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.zzgz.zzd(com.google.android.gms.internal.measurement.zzhv.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhv.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.zzgz.zzd(com.google.android.gms.internal.measurement.zzhv.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhv.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.zzgz.zzd(com.google.android.gms.internal.measurement.zzhv.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhv.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzm(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzm(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.zzhv.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhv.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzhv.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzhv.zzn(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.measurement.zzgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgm.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int hashCode(T t) {
        int i;
        int zzbx;
        int length = this.zzakj.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzca = zzca(i3);
            int i4 = this.zzakj[i3];
            long j = 1048575 & zzca;
            int i5 = 37;
            switch ((zzca & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzbx = zzez.zzbx(Double.doubleToLongBits(zzhv.zzo(t, j)));
                    i2 = i + zzbx;
                    break;
                case 1:
                    i = i2 * 53;
                    zzbx = Float.floatToIntBits(zzhv.zzn(t, j));
                    i2 = i + zzbx;
                    break;
                case 2:
                    i = i2 * 53;
                    zzbx = zzez.zzbx(zzhv.zzl(t, j));
                    i2 = i + zzbx;
                    break;
                case 3:
                    i = i2 * 53;
                    zzbx = zzez.zzbx(zzhv.zzl(t, j));
                    i2 = i + zzbx;
                    break;
                case 4:
                    i = i2 * 53;
                    zzbx = zzhv.zzk(t, j);
                    i2 = i + zzbx;
                    break;
                case 5:
                    i = i2 * 53;
                    zzbx = zzez.zzbx(zzhv.zzl(t, j));
                    i2 = i + zzbx;
                    break;
                case 6:
                    i = i2 * 53;
                    zzbx = zzhv.zzk(t, j);
                    i2 = i + zzbx;
                    break;
                case 7:
                    i = i2 * 53;
                    zzbx = zzez.zzs(zzhv.zzm(t, j));
                    i2 = i + zzbx;
                    break;
                case 8:
                    i = i2 * 53;
                    zzbx = ((String) zzhv.zzp(t, j)).hashCode();
                    i2 = i + zzbx;
                    break;
                case 9:
                    Object zzp = zzhv.zzp(t, j);
                    if (zzp != null) {
                        i5 = zzp.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzbx = zzhv.zzp(t, j).hashCode();
                    i2 = i + zzbx;
                    break;
                case 11:
                    i = i2 * 53;
                    zzbx = zzhv.zzk(t, j);
                    i2 = i + zzbx;
                    break;
                case 12:
                    i = i2 * 53;
                    zzbx = zzhv.zzk(t, j);
                    i2 = i + zzbx;
                    break;
                case 13:
                    i = i2 * 53;
                    zzbx = zzhv.zzk(t, j);
                    i2 = i + zzbx;
                    break;
                case 14:
                    i = i2 * 53;
                    zzbx = zzez.zzbx(zzhv.zzl(t, j));
                    i2 = i + zzbx;
                    break;
                case 15:
                    i = i2 * 53;
                    zzbx = zzhv.zzk(t, j);
                    i2 = i + zzbx;
                    break;
                case 16:
                    i = i2 * 53;
                    zzbx = zzez.zzbx(zzhv.zzl(t, j));
                    i2 = i + zzbx;
                    break;
                case 17:
                    Object zzp2 = zzhv.zzp(t, j);
                    if (zzp2 != null) {
                        i5 = zzp2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzbx = zzhv.zzp(t, j).hashCode();
                    i2 = i + zzbx;
                    break;
                case 50:
                    i = i2 * 53;
                    zzbx = zzhv.zzp(t, j).hashCode();
                    i2 = i + zzbx;
                    break;
                case 51:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzez.zzbx(Double.doubleToLongBits(zzf(t, j)));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = Float.floatToIntBits(zzg(t, j));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzez.zzbx(zzi(t, j));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzez.zzbx(zzi(t, j));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzh(t, j);
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzez.zzbx(zzi(t, j));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzh(t, j);
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzez.zzs(zzj(t, j));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = ((String) zzhv.zzp(t, j)).hashCode();
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzhv.zzp(t, j).hashCode();
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzhv.zzp(t, j).hashCode();
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzh(t, j);
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzh(t, j);
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzh(t, j);
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzez.zzbx(zzi(t, j));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzh(t, j);
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzez.zzbx(zzi(t, j));
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzgm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzbx = zzhv.zzp(t, j).hashCode();
                        i2 = i + zzbx;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzakx.zzx(t).hashCode();
        return this.zzako ? (hashCode * 53) + this.zzaky.zzh(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzc(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zzakj.length; i += 3) {
            int zzca = zzca(i);
            long j = 1048575 & zzca;
            int i2 = this.zzakj[i];
            switch ((zzca & 267386880) >>> 20) {
                case 0:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza(t, j, zzhv.zzo(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza((Object) t, j, zzhv.zzn(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza((Object) t, j, zzhv.zzl(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza((Object) t, j, zzhv.zzl(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zzb(t, j, zzhv.zzk(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza((Object) t, j, zzhv.zzl(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zzb(t, j, zzhv.zzk(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza(t, j, zzhv.zzm(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza(t, j, zzhv.zzp(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza(t, j, zzhv.zzp(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zzb(t, j, zzhv.zzk(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zzb(t, j, zzhv.zzk(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zzb(t, j, zzhv.zzk(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza((Object) t, j, zzhv.zzl(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zzb(t, j, zzhv.zzk(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzgm<T>) t2, i)) {
                        zzhv.zza((Object) t, j, zzhv.zzl(t2, j));
                        zzb((zzgm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzakw.zza(t, t2, j);
                    break;
                case 50:
                    zzgz.zza(this.zzakz, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzgm<T>) t2, i2, i)) {
                        zzhv.zza(t, j, zzhv.zzp(t2, j));
                        zzb((zzgm<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzgm<T>) t2, i2, i)) {
                        zzhv.zza(t, j, zzhv.zzp(t2, j));
                        zzb((zzgm<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzakq) {
            return;
        }
        zzgz.zza(this.zzakx, t, t2);
        if (this.zzako) {
            zzgz.zza(this.zzaky, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzca = zzca(i) & 1048575;
        if (zza((zzgm<T>) t2, i)) {
            Object zzp = zzhv.zzp(t, zzca);
            Object zzp2 = zzhv.zzp(t2, zzca);
            if (zzp != null && zzp2 != null) {
                zzhv.zza(t, zzca, zzez.zza(zzp, zzp2));
                zzb((zzgm<T>) t, i);
            } else if (zzp2 != null) {
                zzhv.zza(t, zzca, zzp2);
                zzb((zzgm<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzca = zzca(i);
        int i2 = this.zzakj[i];
        long j = zzca & 1048575;
        if (zza((zzgm<T>) t2, i2, i)) {
            Object zzp = zzhv.zzp(t, j);
            Object zzp2 = zzhv.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzhv.zza(t, j, zzez.zza(zzp, zzp2));
                zzb((zzgm<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzhv.zza(t, j, zzp2);
                zzb((zzgm<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzt(T t) {
        int i;
        int i2;
        long j;
        int zzd;
        int zzc;
        int zzk;
        int zzv;
        int zzac;
        int zzbi;
        int zzbk;
        int zzb;
        int zzac2;
        int zzbi2;
        int zzbk2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzakq) {
            Unsafe unsafe = zzaki;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzakj.length) {
                int zzca = zzca(i5);
                int i7 = (zzca & i3) >>> 20;
                int i8 = this.zzakj[i5];
                long j2 = zzca & 1048575;
                int i9 = (i7 < zzet.DOUBLE_LIST_PACKED.id() || i7 > zzet.SINT64_LIST_PACKED.id()) ? 0 : this.zzakj[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 1:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 2:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzd(i8, zzhv.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 3:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zze(i8, zzhv.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 4:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzg(i8, zzhv.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 5:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 6:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 7:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzc(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 8:
                        if (zza((zzgm<T>) t, i5)) {
                            Object zzp = zzhv.zzp(t, j2);
                            if (zzp instanceof zzdp) {
                                zzb = zzee.zzc(i8, (zzdp) zzp);
                                break;
                            } else {
                                zzb = zzee.zzc(i8, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 9:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzgz.zzc(i8, zzhv.zzp(t, j2), zzbx(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 10:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzc(i8, (zzdp) zzhv.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 11:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzh(i8, zzhv.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 12:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzl(i8, zzhv.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 13:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzk(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 14:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 15:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzi(i8, zzhv.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 16:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzf(i8, zzhv.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 17:
                        if (zza((zzgm<T>) t, i5)) {
                            zzb = zzee.zzc(i8, (zzgi) zzhv.zzp(t, j2), zzbx(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 18:
                        zzb = zzgz.zzw(i8, zze(t, j2), false);
                        break;
                    case 19:
                        zzb = zzgz.zzv(i8, zze(t, j2), false);
                        break;
                    case 20:
                        zzb = zzgz.zzo(i8, zze(t, j2), false);
                        break;
                    case 21:
                        zzb = zzgz.zzp(i8, zze(t, j2), false);
                        break;
                    case 22:
                        zzb = zzgz.zzs(i8, zze(t, j2), false);
                        break;
                    case 23:
                        zzb = zzgz.zzw(i8, zze(t, j2), false);
                        break;
                    case 24:
                        zzb = zzgz.zzv(i8, zze(t, j2), false);
                        break;
                    case 25:
                        zzb = zzgz.zzx(i8, zze(t, j2), false);
                        break;
                    case 26:
                        zzb = zzgz.zzc(i8, zze(t, j2));
                        break;
                    case 27:
                        zzb = zzgz.zzc(i8, zze(t, j2), zzbx(i5));
                        break;
                    case 28:
                        zzb = zzgz.zzd(i8, (List<zzdp>) zze(t, j2));
                        break;
                    case 29:
                        zzb = zzgz.zzt(i8, zze(t, j2), false);
                        break;
                    case 30:
                        zzb = zzgz.zzr(i8, zze(t, j2), false);
                        break;
                    case 31:
                        zzb = zzgz.zzv(i8, zze(t, j2), false);
                        break;
                    case 32:
                        zzb = zzgz.zzw(i8, zze(t, j2), false);
                        break;
                    case 33:
                        zzb = zzgz.zzu(i8, zze(t, j2), false);
                        break;
                    case 34:
                        zzb = zzgz.zzq(i8, zze(t, j2), false);
                        break;
                    case 35:
                        zzac2 = zzgz.zzac((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 36:
                        zzac2 = zzgz.zzab((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 37:
                        zzac2 = zzgz.zzu((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 38:
                        zzac2 = zzgz.zzv((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 39:
                        zzac2 = zzgz.zzy((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 40:
                        zzac2 = zzgz.zzac((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 41:
                        zzac2 = zzgz.zzab((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 42:
                        zzac2 = zzgz.zzad((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 43:
                        zzac2 = zzgz.zzz((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 44:
                        zzac2 = zzgz.zzx((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 45:
                        zzac2 = zzgz.zzab((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 46:
                        zzac2 = zzgz.zzac((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 47:
                        zzac2 = zzgz.zzaa((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 48:
                        zzac2 = zzgz.zzw((List) unsafe.getObject(t, j2));
                        if (zzac2 > 0) {
                            if (this.zzakr) {
                                unsafe.putInt(t, i9, zzac2);
                            }
                            zzbi2 = zzee.zzbi(i8);
                            zzbk2 = zzee.zzbk(zzac2);
                            zzb = zzbi2 + zzbk2 + zzac2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 49:
                        zzb = zzgz.zzd(i8, zze(t, j2), zzbx(i5));
                        break;
                    case 50:
                        zzb = this.zzakz.zzb(i8, zzhv.zzp(t, j2), zzby(i5));
                        break;
                    case 51:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 52:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 53:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzd(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 54:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zze(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 55:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzg(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 56:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 57:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 58:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzc(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 59:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            Object zzp2 = zzhv.zzp(t, j2);
                            if (zzp2 instanceof zzdp) {
                                zzb = zzee.zzc(i8, (zzdp) zzp2);
                                break;
                            } else {
                                zzb = zzee.zzc(i8, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 60:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzgz.zzc(i8, zzhv.zzp(t, j2), zzbx(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 61:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzc(i8, (zzdp) zzhv.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 62:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzh(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 63:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzl(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 64:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzk(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 65:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 66:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzi(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 67:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzf(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 68:
                        if (zza((zzgm<T>) t, i8, i5)) {
                            zzb = zzee.zzc(i8, (zzgi) zzhv.zzp(t, j2), zzbx(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    default:
                        i5 += 3;
                        i3 = 267386880;
                }
                i6 += zzb;
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza(this.zzakx, t);
        }
        Unsafe unsafe2 = zzaki;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zzakj.length) {
            int zzca2 = zzca(i11);
            int[] iArr = this.zzakj;
            int i14 = iArr[i11];
            int i15 = (zzca2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & 1048575;
                i2 = i4 << (i16 >>> 20);
                if (i17 != i10) {
                    i13 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
                i = i16;
            } else {
                i = (!this.zzakr || i15 < zzet.DOUBLE_LIST_PACKED.id() || i15 > zzet.SINT64_LIST_PACKED.id()) ? 0 : this.zzakj[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzca2 & 1048575;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzee.zzb(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzee.zzb(i14, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzee.zzd(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzee.zze(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzee.zzg(i14, unsafe2.getInt(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzee.zzg(i14, 0L);
                        i12 += zzd;
                    }
                    break;
                case 6:
                    if ((i13 & i2) != 0) {
                        i12 += zzee.zzj(i14, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i13 & i2) != 0) {
                        i12 += zzee.zzc(i14, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i13 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzdp) {
                            zzc = zzee.zzc(i14, (zzdp) object);
                        } else {
                            zzc = zzee.zzc(i14, (String) object);
                        }
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i2) != 0) {
                        zzc = zzgz.zzc(i14, unsafe2.getObject(t, j3), zzbx(i11));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i2) != 0) {
                        zzc = zzee.zzc(i14, (zzdp) unsafe2.getObject(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i2) != 0) {
                        zzc = zzee.zzh(i14, unsafe2.getInt(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i2) != 0) {
                        zzc = zzee.zzl(i14, unsafe2.getInt(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i2) != 0) {
                        zzk = zzee.zzk(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i2) != 0) {
                        zzc = zzee.zzh(i14, 0L);
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i2) != 0) {
                        zzc = zzee.zzi(i14, unsafe2.getInt(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i2) != 0) {
                        zzc = zzee.zzf(i14, unsafe2.getLong(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i2) != 0) {
                        zzc = zzee.zzc(i14, (zzgi) unsafe2.getObject(t, j3), zzbx(i11));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 18:
                    zzc = zzgz.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzc;
                    j = 0;
                    break;
                case 19:
                    zzv = zzgz.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 20:
                    zzv = zzgz.zzo(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 21:
                    zzv = zzgz.zzp(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 22:
                    zzv = zzgz.zzs(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 23:
                    zzv = zzgz.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 24:
                    zzv = zzgz.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 25:
                    zzv = zzgz.zzx(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 26:
                    zzc = zzgz.zzc(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzc;
                    j = 0;
                    break;
                case 27:
                    zzc = zzgz.zzc(i14, (List<?>) unsafe2.getObject(t, j3), zzbx(i11));
                    i12 += zzc;
                    j = 0;
                    break;
                case 28:
                    zzc = zzgz.zzd(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzc;
                    j = 0;
                    break;
                case 29:
                    zzc = zzgz.zzt(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzc;
                    j = 0;
                    break;
                case 30:
                    zzv = zzgz.zzr(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 31:
                    zzv = zzgz.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 32:
                    zzv = zzgz.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 33:
                    zzv = zzgz.zzu(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 34:
                    zzv = zzgz.zzq(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 35:
                    zzac = zzgz.zzac((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 36:
                    zzac = zzgz.zzab((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 37:
                    zzac = zzgz.zzu((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 38:
                    zzac = zzgz.zzv((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 39:
                    zzac = zzgz.zzy((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 40:
                    zzac = zzgz.zzac((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 41:
                    zzac = zzgz.zzab((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 42:
                    zzac = zzgz.zzad((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 43:
                    zzac = zzgz.zzz((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 44:
                    zzac = zzgz.zzx((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 45:
                    zzac = zzgz.zzab((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 46:
                    zzac = zzgz.zzac((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 47:
                    zzac = zzgz.zzaa((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 48:
                    zzac = zzgz.zzw((List) unsafe2.getObject(t, j3));
                    if (zzac > 0) {
                        if (this.zzakr) {
                            unsafe2.putInt(t, i, zzac);
                        }
                        zzbi = zzee.zzbi(i14);
                        zzbk = zzee.zzbk(zzac);
                        zzk = zzbi + zzbk + zzac;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 49:
                    zzc = zzgz.zzd(i14, (List) unsafe2.getObject(t, j3), zzbx(i11));
                    i12 += zzc;
                    j = 0;
                    break;
                case 50:
                    zzc = this.zzakz.zzb(i14, unsafe2.getObject(t, j3), zzby(i11));
                    i12 += zzc;
                    j = 0;
                    break;
                case 51:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzb(i14, 0.0d);
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzk = zzee.zzb(i14, 0.0f);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzd(i14, zzi(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zze(i14, zzi(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzg(i14, zzh(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzg(i14, 0L);
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzk = zzee.zzj(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzk = zzee.zzc(i14, true);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzdp) {
                            zzc = zzee.zzc(i14, (zzdp) object2);
                        } else {
                            zzc = zzee.zzc(i14, (String) object2);
                        }
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzgz.zzc(i14, unsafe2.getObject(t, j3), zzbx(i11));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzc(i14, (zzdp) unsafe2.getObject(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzh(i14, zzh(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzl(i14, zzh(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzk = zzee.zzk(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzh(i14, 0L);
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzi(i14, zzh(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzf(i14, zzi(t, j3));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((zzgm<T>) t, i14, i11)) {
                        zzc = zzee.zzc(i14, (zzgi) unsafe2.getObject(t, j3), zzbx(i11));
                        i12 += zzc;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i11 += 3;
            i4 = 1;
        }
        int i18 = 0;
        int zza = i12 + zza(this.zzakx, t);
        if (this.zzako) {
            zzeo<?> zzh = this.zzaky.zzh(t);
            for (int i19 = 0; i19 < zzh.zzaex.zzwh(); i19++) {
                Map.Entry<?, Object> zzcf = zzh.zzaex.zzcf(i19);
                i18 += zzeo.zzb((zzeq) zzcf.getKey(), zzcf.getValue());
            }
            for (Map.Entry<?, Object> entry : zzh.zzaex.zzwi()) {
                i18 += zzeo.zzb((zzeq) entry.getKey(), entry.getValue());
            }
            return zza + i18;
        }
        return zza;
    }

    private static <UT, UB> int zza(zzhp<UT, UB> zzhpVar, T t) {
        return zzhpVar.zzt(zzhpVar.zzx(t));
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzhv.zzp(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.measurement.zzgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.measurement.zzim r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgm.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzim):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r19, com.google.android.gms.internal.measurement.zzim r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgm.zzb(java.lang.Object, com.google.android.gms.internal.measurement.zzim):void");
    }

    private final <K, V> void zza(zzim zzimVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzimVar.zza(i, this.zzakz.zzr(zzby(i2)), this.zzakz.zzn(obj));
        }
    }

    private static <UT, UB> void zza(zzhp<UT, UB> zzhpVar, T t, zzim zzimVar) throws IOException {
        zzhpVar.zza((zzhp<UT, UB>) zzhpVar.zzx(t), zzimVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zza(T t, zzgy zzgyVar, zzel zzelVar) throws IOException {
        if (zzelVar == null) {
            throw null;
        }
        zzhp zzhpVar = this.zzakx;
        zzen<?> zzenVar = this.zzaky;
        zzeo<?> zzeoVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzsy = zzgyVar.zzsy();
                int zzcd = zzcd(zzsy);
                if (zzcd >= 0) {
                    int zzca = zzca(zzcd);
                    switch ((267386880 & zzca) >>> 20) {
                        case 0:
                            zzhv.zza(t, zzca & 1048575, zzgyVar.readDouble());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 1:
                            zzhv.zza((Object) t, zzca & 1048575, zzgyVar.readFloat());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 2:
                            zzhv.zza((Object) t, zzca & 1048575, zzgyVar.zzsi());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 3:
                            zzhv.zza((Object) t, zzca & 1048575, zzgyVar.zzsh());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 4:
                            zzhv.zzb(t, zzca & 1048575, zzgyVar.zzsj());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 5:
                            zzhv.zza((Object) t, zzca & 1048575, zzgyVar.zzsk());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 6:
                            zzhv.zzb(t, zzca & 1048575, zzgyVar.zzsl());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 7:
                            zzhv.zza(t, zzca & 1048575, zzgyVar.zzsm());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 8:
                            zza(t, zzca, zzgyVar);
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 9:
                            if (zza((zzgm<T>) t, zzcd)) {
                                long j = zzca & 1048575;
                                zzhv.zza(t, j, zzez.zza(zzhv.zzp(t, j), zzgyVar.zza(zzbx(zzcd), zzelVar)));
                                break;
                            } else {
                                zzhv.zza(t, zzca & 1048575, zzgyVar.zza(zzbx(zzcd), zzelVar));
                                zzb((zzgm<T>) t, zzcd);
                                continue;
                            }
                        case 10:
                            zzhv.zza(t, zzca & 1048575, zzgyVar.zzso());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 11:
                            zzhv.zzb(t, zzca & 1048575, zzgyVar.zzsp());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 12:
                            int zzsq = zzgyVar.zzsq();
                            zzfe zzbz = zzbz(zzcd);
                            if (zzbz != null && !zzbz.zzg(zzsq)) {
                                obj = zzgz.zza(zzsy, zzsq, obj, zzhpVar);
                                break;
                            }
                            zzhv.zzb(t, zzca & 1048575, zzsq);
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 13:
                            zzhv.zzb(t, zzca & 1048575, zzgyVar.zzsr());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 14:
                            zzhv.zza((Object) t, zzca & 1048575, zzgyVar.zzss());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 15:
                            zzhv.zzb(t, zzca & 1048575, zzgyVar.zzst());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 16:
                            zzhv.zza((Object) t, zzca & 1048575, zzgyVar.zzsu());
                            zzb((zzgm<T>) t, zzcd);
                            continue;
                        case 17:
                            if (zza((zzgm<T>) t, zzcd)) {
                                long j2 = zzca & 1048575;
                                zzhv.zza(t, j2, zzez.zza(zzhv.zzp(t, j2), zzgyVar.zzb(zzbx(zzcd), zzelVar)));
                                break;
                            } else {
                                zzhv.zza(t, zzca & 1048575, zzgyVar.zzb(zzbx(zzcd), zzelVar));
                                zzb((zzgm<T>) t, zzcd);
                                continue;
                            }
                        case 18:
                            zzgyVar.zze(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 19:
                            zzgyVar.zzf(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 20:
                            zzgyVar.zzh(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 21:
                            zzgyVar.zzg(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 22:
                            zzgyVar.zzi(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 23:
                            zzgyVar.zzj(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 24:
                            zzgyVar.zzk(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 25:
                            zzgyVar.zzl(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 26:
                            if (zzcc(zzca)) {
                                zzgyVar.zzm(this.zzakw.zza(t, zzca & 1048575));
                                break;
                            } else {
                                zzgyVar.readStringList(this.zzakw.zza(t, zzca & 1048575));
                                continue;
                            }
                        case 27:
                            zzgyVar.zza(this.zzakw.zza(t, zzca & 1048575), zzbx(zzcd), zzelVar);
                            continue;
                        case 28:
                            zzgyVar.zzn(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 29:
                            zzgyVar.zzo(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 30:
                            List<Integer> zza = this.zzakw.zza(t, zzca & 1048575);
                            zzgyVar.zzp(zza);
                            obj = zzgz.zza(zzsy, zza, zzbz(zzcd), obj, zzhpVar);
                            continue;
                        case 31:
                            zzgyVar.zzq(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 32:
                            zzgyVar.zzr(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 33:
                            zzgyVar.zzs(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 34:
                            zzgyVar.zzt(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 35:
                            zzgyVar.zze(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 36:
                            zzgyVar.zzf(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 37:
                            zzgyVar.zzh(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 38:
                            zzgyVar.zzg(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 39:
                            zzgyVar.zzi(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 40:
                            zzgyVar.zzj(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 41:
                            zzgyVar.zzk(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 42:
                            zzgyVar.zzl(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 43:
                            zzgyVar.zzo(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza2 = this.zzakw.zza(t, zzca & 1048575);
                            zzgyVar.zzp(zza2);
                            obj = zzgz.zza(zzsy, zza2, zzbz(zzcd), obj, zzhpVar);
                            continue;
                        case 45:
                            zzgyVar.zzq(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 46:
                            zzgyVar.zzr(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 47:
                            zzgyVar.zzs(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 48:
                            zzgyVar.zzt(this.zzakw.zza(t, zzca & 1048575));
                            continue;
                        case 49:
                            zzgyVar.zzb(this.zzakw.zza(t, zzca & 1048575), zzbx(zzcd), zzelVar);
                            continue;
                        case 50:
                            Object zzby = zzby(zzcd);
                            long zzca2 = zzca(zzcd) & 1048575;
                            Object zzp = zzhv.zzp(t, zzca2);
                            if (zzp == null) {
                                zzp = this.zzakz.zzq(zzby);
                                zzhv.zza(t, zzca2, zzp);
                            } else if (this.zzakz.zzo(zzp)) {
                                Object zzq = this.zzakz.zzq(zzby);
                                this.zzakz.zzb(zzq, zzp);
                                zzhv.zza(t, zzca2, zzq);
                                zzp = zzq;
                            }
                            zzgyVar.zza(this.zzakz.zzm(zzp), this.zzakz.zzr(zzby), zzelVar);
                            continue;
                        case 51:
                            zzhv.zza(t, zzca & 1048575, Double.valueOf(zzgyVar.readDouble()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 52:
                            zzhv.zza(t, zzca & 1048575, Float.valueOf(zzgyVar.readFloat()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 53:
                            zzhv.zza(t, zzca & 1048575, Long.valueOf(zzgyVar.zzsi()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 54:
                            zzhv.zza(t, zzca & 1048575, Long.valueOf(zzgyVar.zzsh()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 55:
                            zzhv.zza(t, zzca & 1048575, Integer.valueOf(zzgyVar.zzsj()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 56:
                            zzhv.zza(t, zzca & 1048575, Long.valueOf(zzgyVar.zzsk()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 57:
                            zzhv.zza(t, zzca & 1048575, Integer.valueOf(zzgyVar.zzsl()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 58:
                            zzhv.zza(t, zzca & 1048575, Boolean.valueOf(zzgyVar.zzsm()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 59:
                            zza(t, zzca, zzgyVar);
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 60:
                            if (zza((zzgm<T>) t, zzsy, zzcd)) {
                                long j3 = zzca & 1048575;
                                zzhv.zza(t, j3, zzez.zza(zzhv.zzp(t, j3), zzgyVar.zza(zzbx(zzcd), zzelVar)));
                            } else {
                                zzhv.zza(t, zzca & 1048575, zzgyVar.zza(zzbx(zzcd), zzelVar));
                                zzb((zzgm<T>) t, zzcd);
                            }
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 61:
                            zzhv.zza(t, zzca & 1048575, zzgyVar.zzso());
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 62:
                            zzhv.zza(t, zzca & 1048575, Integer.valueOf(zzgyVar.zzsp()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 63:
                            int zzsq2 = zzgyVar.zzsq();
                            zzfe zzbz2 = zzbz(zzcd);
                            if (zzbz2 != null && !zzbz2.zzg(zzsq2)) {
                                obj = zzgz.zza(zzsy, zzsq2, obj, zzhpVar);
                                break;
                            }
                            zzhv.zza(t, zzca & 1048575, Integer.valueOf(zzsq2));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 64:
                            zzhv.zza(t, zzca & 1048575, Integer.valueOf(zzgyVar.zzsr()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 65:
                            zzhv.zza(t, zzca & 1048575, Long.valueOf(zzgyVar.zzss()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 66:
                            zzhv.zza(t, zzca & 1048575, Integer.valueOf(zzgyVar.zzst()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 67:
                            zzhv.zza(t, zzca & 1048575, Long.valueOf(zzgyVar.zzsu()));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        case 68:
                            zzhv.zza(t, zzca & 1048575, zzgyVar.zzb(zzbx(zzcd), zzelVar));
                            zzb((zzgm<T>) t, zzsy, zzcd);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzhpVar.zzwp();
                                } catch (zzfh unused) {
                                    zzhpVar.zza(zzgyVar);
                                    if (obj == null) {
                                        obj = zzhpVar.zzy(t);
                                    }
                                    if (!zzhpVar.zza((zzhp) obj, zzgyVar)) {
                                        for (int i = this.zzakt; i < this.zzaku; i++) {
                                            obj = zza((Object) t, this.zzaks[i], (int) obj, (zzhp<UT, int>) zzhpVar);
                                        }
                                        if (obj != null) {
                                            zzhpVar.zzf(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzhpVar.zza((zzhp) obj, zzgyVar)) {
                                for (int i2 = this.zzakt; i2 < this.zzaku; i2++) {
                                    obj = zza((Object) t, this.zzaks[i2], (int) obj, (zzhp<UT, int>) zzhpVar);
                                }
                                if (obj != null) {
                                    zzhpVar.zzf(t, obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zzsy == Integer.MAX_VALUE) {
                    for (int i3 = this.zzakt; i3 < this.zzaku; i3++) {
                        obj = zza((Object) t, this.zzaks[i3], (int) obj, (zzhp<UT, int>) zzhpVar);
                    }
                    if (obj != null) {
                        zzhpVar.zzf(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zza3 = !this.zzako ? null : zzenVar.zza(zzelVar, this.zzakn, zzsy);
                    if (zza3 != null) {
                        if (zzeoVar == null) {
                            zzeoVar = zzenVar.zzi(t);
                        }
                        zzeo<?> zzeoVar2 = zzeoVar;
                        obj = zzenVar.zza(zzgyVar, zza3, zzelVar, zzeoVar2, obj, zzhpVar);
                        zzeoVar = zzeoVar2;
                    } else {
                        zzhpVar.zza(zzgyVar);
                        if (obj == null) {
                            obj = zzhpVar.zzy(t);
                        }
                        if (!zzhpVar.zza((zzhp) obj, zzgyVar)) {
                            for (int i4 = this.zzakt; i4 < this.zzaku; i4++) {
                                obj = zza((Object) t, this.zzaks[i4], (int) obj, (zzhp<UT, int>) zzhpVar);
                            }
                            if (obj != null) {
                                zzhpVar.zzf(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzakt; i5 < this.zzaku; i5++) {
                    obj = zza((Object) t, this.zzaks[i5], (int) obj, (zzhp<UT, int>) zzhpVar);
                }
                if (obj != null) {
                    zzhpVar.zzf(t, obj);
                }
                throw th;
            }
        }
    }

    private static zzhs zzu(Object obj) {
        zzey zzeyVar = (zzey) obj;
        zzhs zzhsVar = zzeyVar.zzahz;
        if (zzhsVar == zzhs.zzwq()) {
            zzhs zzwr = zzhs.zzwr();
            zzeyVar.zzahz = zzwr;
            return zzwr;
        }
        return zzhsVar;
    }

    private static int zza(byte[] bArr, int i, int i2, zzig zzigVar, Class<?> cls, zzdk zzdkVar) throws IOException {
        switch (zzgl.zzaee[zzigVar.ordinal()]) {
            case 1:
                int zzb = zzdl.zzb(bArr, i, zzdkVar);
                zzdkVar.zzadc = Boolean.valueOf(zzdkVar.zzadb != 0);
                return zzb;
            case 2:
                return zzdl.zze(bArr, i, zzdkVar);
            case 3:
                zzdkVar.zzadc = Double.valueOf(zzdl.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzdkVar.zzadc = Integer.valueOf(zzdl.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzdkVar.zzadc = Long.valueOf(zzdl.zzb(bArr, i));
                return i + 8;
            case 8:
                zzdkVar.zzadc = Float.valueOf(zzdl.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzdl.zza(bArr, i, zzdkVar);
                zzdkVar.zzadc = Integer.valueOf(zzdkVar.zzada);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzdl.zzb(bArr, i, zzdkVar);
                zzdkVar.zzadc = Long.valueOf(zzdkVar.zzadb);
                return zzb2;
            case 14:
                return zzdl.zza(zzgt.zzvy().zzf(cls), bArr, i, i2, zzdkVar);
            case 15:
                int zza2 = zzdl.zza(bArr, i, zzdkVar);
                zzdkVar.zzadc = Integer.valueOf(zzeb.zzaz(zzdkVar.zzada));
                return zza2;
            case 16:
                int zzb3 = zzdl.zzb(bArr, i, zzdkVar);
                zzdkVar.zzadc = Long.valueOf(zzeb.zzbm(zzdkVar.zzadb));
                return zzb3;
            case 17:
                return zzdl.zzd(bArr, i, zzdkVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0236 -> B:116:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016e -> B:67:0x016f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e8 -> B:96:0x01e9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.zzdk r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgm.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzdk):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzdk zzdkVar) throws IOException {
        Unsafe unsafe = zzaki;
        Object zzby = zzby(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzakz.zzo(object)) {
            Object zzq = this.zzakz.zzq(zzby);
            this.zzakz.zzb(zzq, object);
            unsafe.putObject(t, j, zzq);
            object = zzq;
        }
        zzfz<?, ?> zzr = this.zzakz.zzr(zzby);
        Map<?, ?> zzm = this.zzakz.zzm(object);
        int zza = zzdl.zza(bArr, i, zzdkVar);
        int i4 = zzdkVar.zzada;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzfi.zzut();
        }
        int i5 = i4 + zza;
        Object obj = (K) zzr.zzakc;
        Object obj2 = (V) zzr.zzaba;
        while (zza < i5) {
            int i6 = zza + 1;
            int i7 = bArr[zza];
            if (i7 < 0) {
                i6 = zzdl.zza(i7, bArr, i6, zzdkVar);
                i7 = zzdkVar.zzada;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzr.zzakb.zzxa()) {
                    zza = zza(bArr, i8, i2, zzr.zzakb, (Class<?>) null, zzdkVar);
                    obj = (K) zzdkVar.zzadc;
                } else {
                    zza = zzdl.zza(i7, bArr, i8, i2, zzdkVar);
                }
            } else {
                if (i9 == 2 && i10 == zzr.zzakd.zzxa()) {
                    zza = zza(bArr, i8, i2, zzr.zzakd, zzr.zzaba.getClass(), zzdkVar);
                    obj2 = zzdkVar.zzadc;
                }
                zza = zzdl.zza(i7, bArr, i8, i2, zzdkVar);
            }
        }
        if (zza != i5) {
            throw zzfi.zzva();
        }
        zzm.put(obj, obj2);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzdk zzdkVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzaki;
        long j2 = this.zzakj[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzdl.zzc(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzdl.zzd(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzdl.zzb(bArr, i, zzdkVar);
                    unsafe.putObject(t, j, Long.valueOf(zzdkVar.zzadb));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzdl.zza(bArr, i, zzdkVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzdkVar.zzada));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzdl.zzb(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzdl.zza(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzdl.zzb(bArr, i, zzdkVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzdkVar.zzadb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzdl.zza(bArr, i, zzdkVar);
                    int i9 = zzdkVar.zzada;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzhy.zzf(bArr, zza, zza + i9)) {
                        throw zzfi.zzvb();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza, i9, zzez.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zzdl.zza(zzbx(i8), bArr, i, i2, zzdkVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzdkVar.zzadc);
                    } else {
                        unsafe.putObject(t, j, zzez.zza(object, zzdkVar.zzadc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzdl.zze(bArr, i, zzdkVar);
                    unsafe.putObject(t, j, zzdkVar.zzadc);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzdl.zza(bArr, i, zzdkVar);
                    int i10 = zzdkVar.zzada;
                    zzfe zzbz = zzbz(i8);
                    if (zzbz == null || zzbz.zzg(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb = zza3;
                        unsafe.putInt(t, j2, i4);
                        return zzb;
                    }
                    zzu(t).zzb(i3, Long.valueOf(i10));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzdl.zza(bArr, i, zzdkVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzeb.zzaz(zzdkVar.zzada)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzdl.zzb(bArr, i, zzdkVar);
                    unsafe.putObject(t, j, Long.valueOf(zzeb.zzbm(zzdkVar.zzadb)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zzdl.zza(zzbx(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdkVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzdkVar.zzadc);
                    } else {
                        unsafe.putObject(t, j, zzez.zza(object2, zzdkVar.zzadc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzgx zzbx(int i) {
        int i2 = (i / 3) << 1;
        zzgx zzgxVar = (zzgx) this.zzakk[i2];
        if (zzgxVar != null) {
            return zzgxVar;
        }
        zzgx<T> zzf = zzgt.zzvy().zzf((Class) this.zzakk[i2 + 1]);
        this.zzakk[i2] = zzf;
        return zzf;
    }

    private final Object zzby(int i) {
        return this.zzakk[(i / 3) << 1];
    }

    private final zzfe zzbz(int i) {
        return (zzfe) this.zzakk[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzdk zzdkVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        zzgm<T> zzgmVar;
        byte b;
        int i5;
        int zzcd;
        int i6;
        int i7;
        int i8;
        int i9;
        T t3;
        zzdk zzdkVar2;
        int i10;
        int i11;
        int i12;
        zzdk zzdkVar3;
        int i13;
        zzdk zzdkVar4;
        int i14;
        int i15;
        zzdk zzdkVar5;
        int i16;
        int i17;
        int i18;
        zzgm<T> zzgmVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i19 = i2;
        int i20 = i3;
        zzdk zzdkVar6 = zzdkVar;
        Unsafe unsafe2 = zzaki;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        while (true) {
            if (i21 < i19) {
                int i27 = i21 + 1;
                byte b2 = bArr2[i21];
                if (b2 < 0) {
                    i5 = zzdl.zza(b2, bArr2, i27, zzdkVar6);
                    b = zzdkVar6.zzada;
                } else {
                    b = b2;
                    i5 = i27;
                }
                int i28 = b >>> 3;
                int i29 = b & 7;
                if (i28 > i22) {
                    zzcd = zzgmVar2.zzp(i28, i23 / 3);
                } else {
                    zzcd = zzgmVar2.zzcd(i28);
                }
                int i30 = zzcd;
                if (i30 == -1) {
                    i6 = i28;
                    i7 = i5;
                    i8 = b;
                    unsafe = unsafe2;
                    i4 = i20;
                    i9 = 0;
                } else {
                    int[] iArr = zzgmVar2.zzakj;
                    int i31 = iArr[i30 + 1];
                    int i32 = (i31 & 267386880) >>> 20;
                    int i33 = b;
                    long j = i31 & 1048575;
                    if (i32 <= 17) {
                        int i34 = iArr[i30 + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i26) {
                            if (i26 != -1) {
                                unsafe2.putInt(t4, i26, i25);
                            }
                            i25 = unsafe2.getInt(t4, i36);
                            i26 = i36;
                        }
                        switch (i32) {
                            case 0:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar4 = zzdkVar;
                                i14 = i5;
                                if (i29 == 1) {
                                    zzhv.zza(t4, j, zzdl.zzc(bArr2, i14));
                                    i21 = i14 + 8;
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar4 = zzdkVar;
                                i14 = i5;
                                if (i29 == 5) {
                                    zzhv.zza((Object) t4, j, zzdl.zzd(bArr2, i14));
                                    i21 = i14 + 4;
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                i14 = i5;
                                if (i29 == 0) {
                                    int zzb = zzdl.zzb(bArr2, i14, zzdkVar);
                                    unsafe2.putLong(t, j, zzdkVar.zzadb);
                                    i25 |= i35;
                                    i21 = zzb;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar;
                                    i26 = i13;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar4 = zzdkVar;
                                i14 = i5;
                                if (i29 == 0) {
                                    i21 = zzdl.zza(bArr2, i14, zzdkVar4);
                                    unsafe2.putInt(t4, j, zzdkVar4.zzada);
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar4 = zzdkVar;
                                if (i29 == 1) {
                                    i13 = i26;
                                    i14 = i5;
                                    unsafe2.putLong(t, j, zzdl.zzb(bArr2, i5));
                                    i21 = i14 + 8;
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = i2;
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar5 = zzdkVar;
                                if (i29 == 5) {
                                    unsafe2.putInt(t4, j, zzdl.zza(bArr2, i5));
                                    i21 = i5 + 4;
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i15 = i2;
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar5 = zzdkVar;
                                if (i29 == 0) {
                                    int zzb2 = zzdl.zzb(bArr2, i5, zzdkVar5);
                                    zzhv.zza(t4, j, zzdkVar5.zzadb != 0);
                                    i25 |= i35;
                                    i21 = zzb2;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i15 = i2;
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar5 = zzdkVar;
                                if (i29 == 2) {
                                    if ((i31 & 536870912) == 0) {
                                        i21 = zzdl.zzc(bArr2, i5, zzdkVar5);
                                    } else {
                                        i21 = zzdl.zzd(bArr2, i5, zzdkVar5);
                                    }
                                    unsafe2.putObject(t4, j, zzdkVar5.zzadc);
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar5 = zzdkVar;
                                if (i29 == 2) {
                                    i15 = i2;
                                    i21 = zzdl.zza(zzgmVar2.zzbx(i10), bArr2, i5, i15, zzdkVar5);
                                    if ((i25 & i35) == 0) {
                                        unsafe2.putObject(t4, j, zzdkVar5.zzadc);
                                    } else {
                                        unsafe2.putObject(t4, j, zzez.zza(unsafe2.getObject(t4, j), zzdkVar5.zzadc));
                                    }
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar4 = zzdkVar;
                                if (i29 == 2) {
                                    i21 = zzdl.zze(bArr2, i5, zzdkVar4);
                                    unsafe2.putObject(t4, j, zzdkVar4.zzadc);
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar4 = zzdkVar;
                                if (i29 != 0) {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    i21 = zzdl.zza(bArr2, i5, zzdkVar4);
                                    int i37 = zzdkVar4.zzada;
                                    zzfe zzbz = zzgmVar2.zzbz(i10);
                                    if (zzbz == null || zzbz.zzg(i37)) {
                                        unsafe2.putInt(t4, j, i37);
                                        i25 |= i35;
                                        i24 = i12;
                                        i23 = i10;
                                        i22 = i11;
                                        zzdkVar6 = zzdkVar4;
                                        i19 = i2;
                                        i20 = i3;
                                        break;
                                    } else {
                                        zzu(t).zzb(i12, Long.valueOf(i37));
                                        i24 = i12;
                                        i23 = i10;
                                        i22 = i11;
                                        zzdkVar6 = zzdkVar4;
                                        i19 = i2;
                                        i20 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdkVar4 = zzdkVar;
                                if (i29 == 0) {
                                    i21 = zzdl.zza(bArr2, i5, zzdkVar4);
                                    unsafe2.putInt(t4, j, zzeb.zzaz(zzdkVar4.zzada));
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                if (i29 == 0) {
                                    bArr2 = bArr;
                                    int zzb3 = zzdl.zzb(bArr2, i5, zzdkVar);
                                    zzdkVar4 = zzdkVar;
                                    unsafe2.putLong(t, j, zzeb.zzbm(zzdkVar.zzadb));
                                    i25 |= i35;
                                    i21 = zzb3;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdkVar6 = zzdkVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i29 == 3) {
                                    i21 = zzdl.zza(zzgmVar2.zzbx(i30), bArr, i5, i2, (i28 << 3) | 4, zzdkVar);
                                    if ((i25 & i35) == 0) {
                                        zzdkVar3 = zzdkVar;
                                        unsafe2.putObject(t4, j, zzdkVar3.zzadc);
                                    } else {
                                        zzdkVar3 = zzdkVar;
                                        unsafe2.putObject(t4, j, zzez.zza(unsafe2.getObject(t4, j), zzdkVar3.zzadc));
                                    }
                                    i25 |= i35;
                                    bArr2 = bArr;
                                    i19 = i2;
                                    i24 = i33;
                                    i23 = i30;
                                    i22 = i28;
                                    i20 = i3;
                                    zzdkVar6 = zzdkVar3;
                                    break;
                                } else {
                                    i10 = i30;
                                    i11 = i28;
                                    i12 = i33;
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                i14 = i5;
                                i7 = i14;
                                i9 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                                i26 = i13;
                                i8 = i12;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i38 = i26;
                        int i39 = i5;
                        bArr2 = bArr;
                        zzdk zzdkVar7 = zzdkVar6;
                        if (i32 != 27) {
                            i16 = i25;
                            if (i32 <= 49) {
                                i6 = i28;
                                i18 = i33;
                                i9 = i30;
                                unsafe = unsafe2;
                                i21 = zza((zzgm<T>) t, bArr, i39, i2, i33, i28, i29, i30, i31, i32, j, zzdkVar);
                                if (i21 == i39) {
                                    i4 = i3;
                                    i7 = i21;
                                } else {
                                    zzgmVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i19 = i2;
                                    i20 = i3;
                                    zzdkVar6 = zzdkVar;
                                    i26 = i38;
                                    i23 = i9;
                                    i25 = i16;
                                    i22 = i6;
                                    i24 = i18;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i6 = i28;
                                i17 = i39;
                                i18 = i33;
                                i9 = i30;
                                unsafe = unsafe2;
                                if (i32 != 50) {
                                    i21 = zza((zzgm<T>) t, bArr, i17, i2, i18, i6, i29, i31, i32, j, i9, zzdkVar);
                                    if (i21 != i17) {
                                        zzgmVar2 = this;
                                        t4 = t;
                                        i19 = i2;
                                        i20 = i3;
                                        i24 = i18;
                                        i22 = i6;
                                        i26 = i38;
                                        i23 = i9;
                                        i25 = i16;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        zzdkVar6 = zzdkVar;
                                    }
                                } else if (i29 == 2) {
                                    i21 = zza((zzgm<T>) t, bArr, i17, i2, i9, j, zzdkVar);
                                    if (i21 != i17) {
                                        zzgmVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i19 = i2;
                                        i20 = i3;
                                        zzdkVar6 = zzdkVar;
                                        i26 = i38;
                                        i23 = i9;
                                        i25 = i16;
                                        i22 = i6;
                                        i24 = i18;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i7 = i17;
                                }
                                i4 = i3;
                                i7 = i21;
                            }
                        } else if (i29 == 2) {
                            zzff zzffVar = (zzff) unsafe2.getObject(t4, j);
                            if (!zzffVar.zzrx()) {
                                int size = zzffVar.size();
                                zzffVar = zzffVar.zzap(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, zzffVar);
                            }
                            i21 = zzdl.zza(zzgmVar2.zzbx(i30), i33, bArr, i39, i2, zzffVar, zzdkVar);
                            i20 = i3;
                            i22 = i28;
                            i24 = i33;
                            i23 = i30;
                            zzdkVar6 = zzdkVar7;
                            i26 = i38;
                            i25 = i25;
                            i19 = i2;
                        } else {
                            i16 = i25;
                            i6 = i28;
                            i17 = i39;
                            i18 = i33;
                            i9 = i30;
                            unsafe = unsafe2;
                            i4 = i3;
                            i7 = i17;
                        }
                        i26 = i38;
                        i25 = i16;
                        i8 = i18;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.zzako) {
                        zzdkVar2 = zzdkVar;
                        if (zzdkVar2.zzadd != zzel.zztp()) {
                            int i40 = i6;
                            if (zzdkVar2.zzadd.zza(this.zzakn, i40) == null) {
                                i21 = zzdl.zza(i8, bArr, i7, i2, zzu(t), zzdkVar);
                                t4 = t;
                                i19 = i2;
                                i24 = i8;
                                zzgmVar2 = this;
                                zzdkVar6 = zzdkVar2;
                                i22 = i40;
                                i23 = i9;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i20 = i4;
                            } else {
                                zzey.zzb zzbVar = (zzey.zzb) t;
                                zzbVar.zzuq();
                                zzeo<Object> zzeoVar = zzbVar.zzaic;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                        }
                    } else {
                        t3 = t;
                        zzdkVar2 = zzdkVar;
                    }
                    i21 = zzdl.zza(i8, bArr, i7, i2, zzu(t), zzdkVar);
                    i24 = i8;
                    zzgmVar2 = this;
                    zzdkVar6 = zzdkVar2;
                    i22 = i6;
                    t4 = t3;
                    i23 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i19 = i2;
                    i20 = i4;
                } else {
                    zzgmVar = this;
                    t2 = t;
                    i21 = i7;
                    i24 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i20;
                t2 = t4;
                zzgmVar = zzgmVar2;
            }
        }
        if (i26 != -1) {
            unsafe.putInt(t2, i26, i25);
        }
        zzhs zzhsVar = null;
        for (int i41 = zzgmVar.zzakt; i41 < zzgmVar.zzaku; i41++) {
            zzhsVar = (zzhs) zzgmVar.zza((Object) t2, zzgmVar.zzaks[i41], (int) zzhsVar, (zzhp<UT, int>) zzgmVar.zzakx);
        }
        if (zzhsVar != null) {
            zzgmVar.zzakx.zzf(t2, zzhsVar);
        }
        if (i4 == 0) {
            if (i21 != i2) {
                throw zzfi.zzva();
            }
        } else if (i21 > i2 || i24 != i4) {
            throw zzfi.zzva();
        }
        return i21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.zzdk r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgm.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdk):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzj(T t) {
        int i;
        int i2 = this.zzakt;
        while (true) {
            i = this.zzaku;
            if (i2 >= i) {
                break;
            }
            long zzca = zzca(this.zzaks[i2]) & 1048575;
            Object zzp = zzhv.zzp(t, zzca);
            if (zzp != null) {
                zzhv.zza(t, zzca, this.zzakz.zzp(zzp));
            }
            i2++;
        }
        int length = this.zzaks.length;
        while (i < length) {
            this.zzakw.zzb(t, this.zzaks[i]);
            i++;
        }
        this.zzakx.zzj(t);
        if (this.zzako) {
            this.zzaky.zzj(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzhp<UT, UB> zzhpVar) {
        zzfe zzbz;
        int i2 = this.zzakj[i];
        Object zzp = zzhv.zzp(obj, zzca(i) & 1048575);
        return (zzp == null || (zzbz = zzbz(i)) == null) ? ub : (UB) zza(i, i2, this.zzakz.zzm(zzp), zzbz, (zzfe) ub, (zzhp<UT, zzfe>) zzhpVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzfe zzfeVar, UB ub, zzhp<UT, UB> zzhpVar) {
        zzfz<?, ?> zzr = this.zzakz.zzr(zzby(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzfeVar.zzg(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzhpVar.zzwp();
                }
                zzdx zzas = zzdp.zzas(zzga.zza(zzr, next.getKey(), next.getValue()));
                try {
                    zzga.zza(zzas.zzsf(), zzr, next.getKey(), next.getValue());
                    zzhpVar.zza((zzhp<UT, UB>) ub, i2, zzas.zzse());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.measurement.zzgx] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.zzgx] */
    @Override // com.google.android.gms.internal.measurement.zzgx
    public final boolean zzv(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.zzakt) {
                return !this.zzako || this.zzaky.zzh(t).isInitialized();
            }
            int i5 = this.zzaks[i3];
            int i6 = this.zzakj[i5];
            int zzca = zzca(i5);
            if (this.zzakq) {
                i = 0;
            } else {
                int i7 = this.zzakj[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = zzaki.getInt(t, i8);
                    i2 = i8;
                }
            }
            if (((268435456 & zzca) != 0) && !zza((zzgm<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzca) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (zza((zzgm<T>) t, i5, i4, i) && !zza(t, zzca, zzbx(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((zzgm<T>) t, i6, i5) && !zza(t, zzca, zzbx(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzn = this.zzakz.zzn(zzhv.zzp(t, zzca & 1048575));
                            if (!zzn.isEmpty()) {
                                if (this.zzakz.zzr(zzby(i5)).zzakd.zzwz() == zzij.MESSAGE) {
                                    zzgx<T> zzgxVar = 0;
                                    Iterator<?> it = zzn.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzgxVar == null) {
                                            zzgxVar = zzgt.zzvy().zzf(next.getClass());
                                        }
                                        boolean zzv = zzgxVar.zzv(next);
                                        zzgxVar = zzgxVar;
                                        if (!zzv) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzhv.zzp(t, zzca & 1048575);
                if (!list.isEmpty()) {
                    ?? zzbx = zzbx(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zzbx.zzv(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzgx zzgxVar) {
        return zzgxVar.zzv(zzhv.zzp(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzim zzimVar) throws IOException {
        if (obj instanceof String) {
            zzimVar.zzb(i, (String) obj);
        } else {
            zzimVar.zza(i, (zzdp) obj);
        }
    }

    private final void zza(Object obj, int i, zzgy zzgyVar) throws IOException {
        if (zzcc(i)) {
            zzhv.zza(obj, i & 1048575, zzgyVar.zzsn());
        } else if (this.zzakp) {
            zzhv.zza(obj, i & 1048575, zzgyVar.readString());
        } else {
            zzhv.zza(obj, i & 1048575, zzgyVar.zzso());
        }
    }

    private final int zzca(int i) {
        return this.zzakj[i + 1];
    }

    private final int zzcb(int i) {
        return this.zzakj[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzhv.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzhv.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzhv.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzhv.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzhv.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzgm<T>) t, i) == zza((zzgm<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzakq) {
            return zza((zzgm<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzakq) {
            int zzca = zzca(i);
            long j = zzca & 1048575;
            switch ((zzca & 267386880) >>> 20) {
                case 0:
                    return zzhv.zzo(t, j) != 0.0d;
                case 1:
                    return zzhv.zzn(t, j) != 0.0f;
                case 2:
                    return zzhv.zzl(t, j) != 0;
                case 3:
                    return zzhv.zzl(t, j) != 0;
                case 4:
                    return zzhv.zzk(t, j) != 0;
                case 5:
                    return zzhv.zzl(t, j) != 0;
                case 6:
                    return zzhv.zzk(t, j) != 0;
                case 7:
                    return zzhv.zzm(t, j);
                case 8:
                    Object zzp = zzhv.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    } else if (zzp instanceof zzdp) {
                        return !zzdp.zzadh.equals(zzp);
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return zzhv.zzp(t, j) != null;
                case 10:
                    return !zzdp.zzadh.equals(zzhv.zzp(t, j));
                case 11:
                    return zzhv.zzk(t, j) != 0;
                case 12:
                    return zzhv.zzk(t, j) != 0;
                case 13:
                    return zzhv.zzk(t, j) != 0;
                case 14:
                    return zzhv.zzl(t, j) != 0;
                case 15:
                    return zzhv.zzk(t, j) != 0;
                case 16:
                    return zzhv.zzl(t, j) != 0;
                case 17:
                    return zzhv.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zzcb = zzcb(i);
        return (zzhv.zzk(t, (long) (zzcb & 1048575)) & (1 << (zzcb >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzakq) {
            return;
        }
        int zzcb = zzcb(i);
        long j = zzcb & 1048575;
        zzhv.zzb(t, j, zzhv.zzk(t, j) | (1 << (zzcb >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzhv.zzk(t, (long) (zzcb(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzhv.zzb(t, zzcb(i2) & 1048575, i);
    }

    private final int zzcd(int i) {
        if (i < this.zzakl || i > this.zzakm) {
            return -1;
        }
        return zzq(i, 0);
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzakl || i > this.zzakm) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzakj.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzakj[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
