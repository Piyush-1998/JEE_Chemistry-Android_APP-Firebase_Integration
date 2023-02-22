package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdsk<T> implements zzdsv<T> {
    private final int[] zzhna;
    private final Object[] zzhnb;
    private final int zzhnc;
    private final int zzhnd;
    private final zzdsg zzhne;
    private final boolean zzhnf;
    private final boolean zzhng;
    private final boolean zzhnh;
    private final boolean zzhni;
    private final int[] zzhnj;
    private final int zzhnk;
    private final int zzhnl;
    private final zzdso zzhnm;
    private final zzdrq zzhnn;
    private final zzdtn<?, ?> zzhno;
    private final zzdql<?> zzhnp;
    private final zzdrz zzhnq;
    private static final int[] zzhmz = new int[0];
    private static final Unsafe zzgqj = zzdtt.zzbcc();

    private zzdsk(int[] iArr, Object[] objArr, int i, int i2, zzdsg zzdsgVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzdso zzdsoVar, zzdrq zzdrqVar, zzdtn<?, ?> zzdtnVar, zzdql<?> zzdqlVar, zzdrz zzdrzVar) {
        this.zzhna = iArr;
        this.zzhnb = objArr;
        this.zzhnc = i;
        this.zzhnd = i2;
        this.zzhng = zzdsgVar instanceof zzdqw;
        this.zzhnh = z;
        this.zzhnf = zzdqlVar != null && zzdqlVar.zzm(zzdsgVar);
        this.zzhni = false;
        this.zzhnj = iArr2;
        this.zzhnk = i3;
        this.zzhnl = i4;
        this.zzhnm = zzdsoVar;
        this.zzhnn = zzdrqVar;
        this.zzhno = zzdtnVar;
        this.zzhnp = zzdqlVar;
        this.zzhne = zzdsgVar;
        this.zzhnq = zzdrzVar;
    }

    private static boolean zzgw(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzdsk<T> zza(Class<T> cls, zzdse zzdseVar, zzdso zzdsoVar, zzdrq zzdrqVar, zzdtn<?, ?> zzdtnVar, zzdql<?> zzdqlVar, zzdrz zzdrzVar) {
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
        zzdst zzdstVar;
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
        if (zzdseVar instanceof zzdst) {
            zzdst zzdstVar2 = (zzdst) zzdseVar;
            int i29 = 0;
            boolean z2 = zzdstVar2.zzbay() == zzdqw.zzd.zzhle;
            String zzbbg = zzdstVar2.zzbbg();
            int length = zzbbg.length();
            int charAt17 = zzbbg.charAt(0);
            if (charAt17 >= 55296) {
                int i30 = charAt17 & 8191;
                int i31 = 1;
                int i32 = 13;
                while (true) {
                    i = i31 + 1;
                    charAt16 = zzbbg.charAt(i31);
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
            int charAt18 = zzbbg.charAt(i);
            if (charAt18 >= 55296) {
                int i34 = charAt18 & 8191;
                int i35 = 13;
                while (true) {
                    i28 = i33 + 1;
                    charAt15 = zzbbg.charAt(i33);
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
                iArr = zzhmz;
                i6 = 0;
                i3 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
            } else {
                int i36 = i33 + 1;
                int charAt19 = zzbbg.charAt(i33);
                if (charAt19 >= 55296) {
                    int i37 = charAt19 & 8191;
                    int i38 = 13;
                    while (true) {
                        i14 = i36 + 1;
                        charAt10 = zzbbg.charAt(i36);
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
                int charAt20 = zzbbg.charAt(i36);
                if (charAt20 >= 55296) {
                    int i40 = charAt20 & 8191;
                    int i41 = 13;
                    while (true) {
                        i13 = i39 + 1;
                        charAt9 = zzbbg.charAt(i39);
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
                charAt = zzbbg.charAt(i39);
                if (charAt >= 55296) {
                    int i43 = charAt & 8191;
                    int i44 = 13;
                    while (true) {
                        i12 = i42 + 1;
                        charAt8 = zzbbg.charAt(i42);
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
                int charAt21 = zzbbg.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i11 = i45 + 1;
                        charAt7 = zzbbg.charAt(i45);
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
                charAt2 = zzbbg.charAt(i45);
                if (charAt2 >= 55296) {
                    int i49 = charAt2 & 8191;
                    int i50 = 13;
                    while (true) {
                        i10 = i48 + 1;
                        charAt6 = zzbbg.charAt(i48);
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
                int charAt22 = zzbbg.charAt(i48);
                if (charAt22 >= 55296) {
                    int i52 = charAt22 & 8191;
                    int i53 = 13;
                    while (true) {
                        i9 = i51 + 1;
                        charAt5 = zzbbg.charAt(i51);
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
                int charAt23 = zzbbg.charAt(i51);
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i54;
                    int i57 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        charAt4 = zzbbg.charAt(i56);
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
                int charAt24 = zzbbg.charAt(i2);
                if (charAt24 >= 55296) {
                    int i59 = charAt24 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i7 = i60 + 1;
                        charAt3 = zzbbg.charAt(i60);
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
            Unsafe unsafe = zzgqj;
            Object[] zzbbh = zzdstVar2.zzbbh();
            Class<?> cls3 = zzdstVar2.zzbba().getClass();
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
                int charAt25 = zzbbg.charAt(i67);
                int i72 = length;
                if (charAt25 >= 55296) {
                    int i73 = charAt25 & 8191;
                    int i74 = i71;
                    int i75 = 13;
                    while (true) {
                        i27 = i74 + 1;
                        charAt14 = zzbbg.charAt(i74);
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
                int charAt26 = zzbbg.charAt(i16);
                if (charAt26 >= 55296) {
                    int i77 = charAt26 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i26 = i78 + 1;
                        charAt13 = zzbbg.charAt(i78);
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
                    int charAt27 = zzbbg.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i84 = charAt27 & 8191;
                        int i85 = 13;
                        while (true) {
                            i25 = i83 + 1;
                            charAt12 = zzbbg.charAt(i83);
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
                        objArr[((i70 / 3) << 1) + 1] = zzbbh[i4];
                        i4++;
                    } else if (i86 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i70 / 3) << 1) + 1] = zzbbh[i4];
                        i4++;
                    }
                    int i88 = charAt27 << 1;
                    Object obj = zzbbh[i88];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls3, (String) obj);
                        zzbbh[i88] = zza2;
                    }
                    zzdstVar = zzdstVar2;
                    String str2 = zzbbg;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza2);
                    int i89 = i88 + 1;
                    Object obj2 = zzbbh[i89];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls3, (String) obj2);
                        zzbbh[i89] = zza3;
                    }
                    cls2 = cls3;
                    i19 = i4;
                    i17 = i87;
                    str = str2;
                    i22 = 0;
                    i21 = (int) unsafe.objectFieldOffset(zza3);
                    i20 = i29;
                } else {
                    zzdstVar = zzdstVar2;
                    String str3 = zzbbg;
                    int i90 = i4 + 1;
                    Field zza4 = zza(cls3, (String) zzbbh[i4]);
                    if (i80 == 9 || i80 == 17) {
                        i18 = 1;
                        objArr[((i70 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i18 = 1;
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = zzbbh[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i18 = 1;
                            if ((charAt17 & 1) == 1) {
                                i24 = i90 + 1;
                                objArr[((i70 / 3) << 1) + 1] = zzbbh[i90];
                            }
                        } else {
                            if (i80 == 50) {
                                int i91 = i66 + 1;
                                iArr[i66] = i70;
                                int i92 = (i70 / 3) << 1;
                                int i93 = i90 + 1;
                                objArr[i92] = zzbbh[i90];
                                if ((charAt26 & 2048) != 0) {
                                    i90 = i93 + 1;
                                    objArr[i92 + 1] = zzbbh[i93];
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
                        Object obj3 = zzbbh[i97];
                        i19 = i90;
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls3, (String) obj3);
                            zzbbh[i97] = zza;
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
                zzbbg = str;
                i67 = i17;
                cls3 = cls2;
                i3 = i81;
                length = i72;
                i5 = i15;
                z2 = z;
                charAt = i82;
                i4 = i19;
                zzdstVar2 = zzdstVar;
            }
            return new zzdsk<>(iArr2, objArr, charAt, i3, zzdstVar2.zzbba(), z2, false, iArr, i5, i65, zzdsoVar, zzdrqVar, zzdtnVar, zzdqlVar, zzdrzVar);
        }
        ((zzdtk) zzdseVar).zzbay();
        int i100 = zzdqw.zzd.zzhle;
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

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final T newInstance() {
        return (T) this.zzhnm.newInstance(this.zzhne);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzdtt.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzdtt.zzo(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.ads.zzdsx.zzg(com.google.android.gms.internal.ads.zzdtt.zzp(r10, r6), com.google.android.gms.internal.ads.zzdtt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.ads.zzdsx.zzg(com.google.android.gms.internal.ads.zzdtt.zzp(r10, r6), com.google.android.gms.internal.ads.zzdtt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.zzdsx.zzg(com.google.android.gms.internal.ads.zzdtt.zzp(r10, r6), com.google.android.gms.internal.ads.zzdtt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.ads.zzdsx.zzg(com.google.android.gms.internal.ads.zzdtt.zzp(r10, r6), com.google.android.gms.internal.ads.zzdtt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.ads.zzdsx.zzg(com.google.android.gms.internal.ads.zzdtt.zzp(r10, r6), com.google.android.gms.internal.ads.zzdtt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzm(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzm(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.ads.zzdtt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzdtt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzdtt.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzdtt.zzn(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.ads.zzdsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsk.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final int hashCode(T t) {
        int i;
        int zzfk;
        int length = this.zzhna.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzgu = zzgu(i3);
            int i4 = this.zzhna[i3];
            long j = 1048575 & zzgu;
            int i5 = 37;
            switch ((zzgu & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzfk = zzdqx.zzfk(Double.doubleToLongBits(zzdtt.zzo(t, j)));
                    i2 = i + zzfk;
                    break;
                case 1:
                    i = i2 * 53;
                    zzfk = Float.floatToIntBits(zzdtt.zzn(t, j));
                    i2 = i + zzfk;
                    break;
                case 2:
                    i = i2 * 53;
                    zzfk = zzdqx.zzfk(zzdtt.zzl(t, j));
                    i2 = i + zzfk;
                    break;
                case 3:
                    i = i2 * 53;
                    zzfk = zzdqx.zzfk(zzdtt.zzl(t, j));
                    i2 = i + zzfk;
                    break;
                case 4:
                    i = i2 * 53;
                    zzfk = zzdtt.zzk(t, j);
                    i2 = i + zzfk;
                    break;
                case 5:
                    i = i2 * 53;
                    zzfk = zzdqx.zzfk(zzdtt.zzl(t, j));
                    i2 = i + zzfk;
                    break;
                case 6:
                    i = i2 * 53;
                    zzfk = zzdtt.zzk(t, j);
                    i2 = i + zzfk;
                    break;
                case 7:
                    i = i2 * 53;
                    zzfk = zzdqx.zzbj(zzdtt.zzm(t, j));
                    i2 = i + zzfk;
                    break;
                case 8:
                    i = i2 * 53;
                    zzfk = ((String) zzdtt.zzp(t, j)).hashCode();
                    i2 = i + zzfk;
                    break;
                case 9:
                    Object zzp = zzdtt.zzp(t, j);
                    if (zzp != null) {
                        i5 = zzp.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzfk = zzdtt.zzp(t, j).hashCode();
                    i2 = i + zzfk;
                    break;
                case 11:
                    i = i2 * 53;
                    zzfk = zzdtt.zzk(t, j);
                    i2 = i + zzfk;
                    break;
                case 12:
                    i = i2 * 53;
                    zzfk = zzdtt.zzk(t, j);
                    i2 = i + zzfk;
                    break;
                case 13:
                    i = i2 * 53;
                    zzfk = zzdtt.zzk(t, j);
                    i2 = i + zzfk;
                    break;
                case 14:
                    i = i2 * 53;
                    zzfk = zzdqx.zzfk(zzdtt.zzl(t, j));
                    i2 = i + zzfk;
                    break;
                case 15:
                    i = i2 * 53;
                    zzfk = zzdtt.zzk(t, j);
                    i2 = i + zzfk;
                    break;
                case 16:
                    i = i2 * 53;
                    zzfk = zzdqx.zzfk(zzdtt.zzl(t, j));
                    i2 = i + zzfk;
                    break;
                case 17:
                    Object zzp2 = zzdtt.zzp(t, j);
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
                    zzfk = zzdtt.zzp(t, j).hashCode();
                    i2 = i + zzfk;
                    break;
                case 50:
                    i = i2 * 53;
                    zzfk = zzdtt.zzp(t, j).hashCode();
                    i2 = i + zzfk;
                    break;
                case 51:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdqx.zzfk(Double.doubleToLongBits(zzf(t, j)));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = Float.floatToIntBits(zzg(t, j));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdqx.zzfk(zzi(t, j));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdqx.zzfk(zzi(t, j));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzh(t, j);
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdqx.zzfk(zzi(t, j));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzh(t, j);
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdqx.zzbj(zzj(t, j));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = ((String) zzdtt.zzp(t, j)).hashCode();
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdtt.zzp(t, j).hashCode();
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdtt.zzp(t, j).hashCode();
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzh(t, j);
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzh(t, j);
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzh(t, j);
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdqx.zzfk(zzi(t, j));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzh(t, j);
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdqx.zzfk(zzi(t, j));
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzdsk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfk = zzdtt.zzp(t, j).hashCode();
                        i2 = i + zzfk;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzhno.zzay(t).hashCode();
        return this.zzhnf ? (hashCode * 53) + this.zzhnp.zzai(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final void zzf(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zzhna.length; i += 3) {
            int zzgu = zzgu(i);
            long j = 1048575 & zzgu;
            int i2 = this.zzhna[i];
            switch ((zzgu & 267386880) >>> 20) {
                case 0:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza(t, j, zzdtt.zzo(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza((Object) t, j, zzdtt.zzn(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza((Object) t, j, zzdtt.zzl(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza((Object) t, j, zzdtt.zzl(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zzb(t, j, zzdtt.zzk(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza((Object) t, j, zzdtt.zzl(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zzb(t, j, zzdtt.zzk(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza(t, j, zzdtt.zzm(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza(t, j, zzdtt.zzp(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza(t, j, zzdtt.zzp(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zzb(t, j, zzdtt.zzk(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zzb(t, j, zzdtt.zzk(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zzb(t, j, zzdtt.zzk(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza((Object) t, j, zzdtt.zzl(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zzb(t, j, zzdtt.zzk(t2, j));
                        zzf((zzdsk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zze((zzdsk<T>) t2, i)) {
                        zzdtt.zza((Object) t, j, zzdtt.zzl(t2, j));
                        zzf((zzdsk<T>) t, i);
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
                    this.zzhnn.zza(t, t2, j);
                    break;
                case 50:
                    zzdsx.zza(this.zzhnq, t, t2, j);
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
                    if (zza((zzdsk<T>) t2, i2, i)) {
                        zzdtt.zza(t, j, zzdtt.zzp(t2, j));
                        zzb((zzdsk<T>) t, i2, i);
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
                    if (zza((zzdsk<T>) t2, i2, i)) {
                        zzdtt.zza(t, j, zzdtt.zzp(t2, j));
                        zzb((zzdsk<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzhnh) {
            return;
        }
        zzdsx.zza(this.zzhno, t, t2);
        if (this.zzhnf) {
            zzdsx.zza(this.zzhnp, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzgu = zzgu(i) & 1048575;
        if (zze((zzdsk<T>) t2, i)) {
            Object zzp = zzdtt.zzp(t, zzgu);
            Object zzp2 = zzdtt.zzp(t2, zzgu);
            if (zzp != null && zzp2 != null) {
                zzdtt.zza(t, zzgu, zzdqx.zzd(zzp, zzp2));
                zzf((zzdsk<T>) t, i);
            } else if (zzp2 != null) {
                zzdtt.zza(t, zzgu, zzp2);
                zzf((zzdsk<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzgu = zzgu(i);
        int i2 = this.zzhna[i];
        long j = zzgu & 1048575;
        if (zza((zzdsk<T>) t2, i2, i)) {
            Object zzp = zzdtt.zzp(t, j);
            Object zzp2 = zzdtt.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzdtt.zza(t, j, zzdqx.zzd(zzp, zzp2));
                zzb((zzdsk<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzdtt.zza(t, j, zzp2);
                zzb((zzdsk<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzdsv
    public final int zzau(T t) {
        int i;
        int i2;
        long j;
        int zzj;
        int zzh;
        int zzai;
        int zzv;
        int zzai2;
        int zzgd;
        int zzgf;
        int zzc;
        int zzai3;
        int zzgd2;
        int zzgf2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzhnh) {
            Unsafe unsafe = zzgqj;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzhna.length) {
                int zzgu = zzgu(i5);
                int i7 = (zzgu & i3) >>> 20;
                int i8 = this.zzhna[i5];
                long j2 = zzgu & 1048575;
                int i9 = (i7 < zzdqr.DOUBLE_LIST_PACKED.id() || i7 > zzdqr.SINT64_LIST_PACKED.id()) ? 0 : this.zzhna[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzc(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 1:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 2:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzj(i8, zzdtt.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 3:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzk(i8, zzdtt.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 4:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzae(i8, zzdtt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 5:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzm(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 6:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzah(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 7:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzh(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 8:
                        if (zze((zzdsk<T>) t, i5)) {
                            Object zzp = zzdtt.zzp(t, j2);
                            if (zzp instanceof zzdpm) {
                                zzc = zzdqf.zzc(i8, (zzdpm) zzp);
                                break;
                            } else {
                                zzc = zzdqf.zzh(i8, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 9:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdsx.zzc(i8, zzdtt.zzp(t, j2), zzgr(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 10:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzc(i8, (zzdpm) zzdtt.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 11:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzaf(i8, zzdtt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 12:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzaj(i8, zzdtt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 13:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzai(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 14:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzn(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 15:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzag(i8, zzdtt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 16:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzl(i8, zzdtt.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 17:
                        if (zze((zzdsk<T>) t, i5)) {
                            zzc = zzdqf.zzc(i8, (zzdsg) zzdtt.zzp(t, j2), zzgr(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 18:
                        zzc = zzdsx.zzw(i8, zze(t, j2), false);
                        break;
                    case 19:
                        zzc = zzdsx.zzv(i8, zze(t, j2), false);
                        break;
                    case 20:
                        zzc = zzdsx.zzo(i8, zze(t, j2), false);
                        break;
                    case 21:
                        zzc = zzdsx.zzp(i8, zze(t, j2), false);
                        break;
                    case 22:
                        zzc = zzdsx.zzs(i8, zze(t, j2), false);
                        break;
                    case 23:
                        zzc = zzdsx.zzw(i8, zze(t, j2), false);
                        break;
                    case 24:
                        zzc = zzdsx.zzv(i8, zze(t, j2), false);
                        break;
                    case 25:
                        zzc = zzdsx.zzx(i8, zze(t, j2), false);
                        break;
                    case 26:
                        zzc = zzdsx.zzc(i8, zze(t, j2));
                        break;
                    case 27:
                        zzc = zzdsx.zzc(i8, zze(t, j2), zzgr(i5));
                        break;
                    case 28:
                        zzc = zzdsx.zzd(i8, zze(t, j2));
                        break;
                    case 29:
                        zzc = zzdsx.zzt(i8, zze(t, j2), false);
                        break;
                    case 30:
                        zzc = zzdsx.zzr(i8, zze(t, j2), false);
                        break;
                    case 31:
                        zzc = zzdsx.zzv(i8, zze(t, j2), false);
                        break;
                    case 32:
                        zzc = zzdsx.zzw(i8, zze(t, j2), false);
                        break;
                    case 33:
                        zzc = zzdsx.zzu(i8, zze(t, j2), false);
                        break;
                    case 34:
                        zzc = zzdsx.zzq(i8, zze(t, j2), false);
                        break;
                    case 35:
                        zzai3 = zzdsx.zzai((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 36:
                        zzai3 = zzdsx.zzah((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 37:
                        zzai3 = zzdsx.zzaa((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 38:
                        zzai3 = zzdsx.zzab((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 39:
                        zzai3 = zzdsx.zzae((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 40:
                        zzai3 = zzdsx.zzai((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 41:
                        zzai3 = zzdsx.zzah((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 42:
                        zzai3 = zzdsx.zzaj((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 43:
                        zzai3 = zzdsx.zzaf((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 44:
                        zzai3 = zzdsx.zzad((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 45:
                        zzai3 = zzdsx.zzah((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 46:
                        zzai3 = zzdsx.zzai((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 47:
                        zzai3 = zzdsx.zzag((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 48:
                        zzai3 = zzdsx.zzac((List) unsafe.getObject(t, j2));
                        if (zzai3 > 0) {
                            if (this.zzhni) {
                                unsafe.putInt(t, i9, zzai3);
                            }
                            zzgd2 = zzdqf.zzgd(i8);
                            zzgf2 = zzdqf.zzgf(zzai3);
                            zzc = zzgd2 + zzgf2 + zzai3;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 49:
                        zzc = zzdsx.zzd(i8, zze(t, j2), zzgr(i5));
                        break;
                    case 50:
                        zzc = this.zzhnq.zzb(i8, zzdtt.zzp(t, j2), zzgs(i5));
                        break;
                    case 51:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzc(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 52:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 53:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzj(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 54:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzk(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 55:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzae(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 56:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzm(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 57:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzah(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 58:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzh(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 59:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            Object zzp2 = zzdtt.zzp(t, j2);
                            if (zzp2 instanceof zzdpm) {
                                zzc = zzdqf.zzc(i8, (zzdpm) zzp2);
                                break;
                            } else {
                                zzc = zzdqf.zzh(i8, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 60:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdsx.zzc(i8, zzdtt.zzp(t, j2), zzgr(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 61:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzc(i8, (zzdpm) zzdtt.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 62:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzaf(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 63:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzaj(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 64:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzai(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 65:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzn(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 66:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzag(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 67:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzl(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 68:
                        if (zza((zzdsk<T>) t, i8, i5)) {
                            zzc = zzdqf.zzc(i8, (zzdsg) zzdtt.zzp(t, j2), zzgr(i5));
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
                i6 += zzc;
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza(this.zzhno, t);
        }
        Unsafe unsafe2 = zzgqj;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zzhna.length) {
            int zzgu2 = zzgu(i11);
            int[] iArr = this.zzhna;
            int i14 = iArr[i11];
            int i15 = (zzgu2 & 267386880) >>> 20;
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
                i = (!this.zzhni || i15 < zzdqr.DOUBLE_LIST_PACKED.id() || i15 > zzdqr.SINT64_LIST_PACKED.id()) ? 0 : this.zzhna[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzgu2 & 1048575;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzdqf.zzc(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzdqf.zzb(i14, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzj = zzdqf.zzj(i14, unsafe2.getLong(t, j3));
                        i12 += zzj;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzj = zzdqf.zzk(i14, unsafe2.getLong(t, j3));
                        i12 += zzj;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzj = zzdqf.zzae(i14, unsafe2.getInt(t, j3));
                        i12 += zzj;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzj = zzdqf.zzm(i14, 0L);
                        i12 += zzj;
                    }
                    break;
                case 6:
                    if ((i13 & i2) != 0) {
                        i12 += zzdqf.zzah(i14, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i13 & i2) != 0) {
                        i12 += zzdqf.zzh(i14, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i13 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzdpm) {
                            zzh = zzdqf.zzc(i14, (zzdpm) object);
                        } else {
                            zzh = zzdqf.zzh(i14, (String) object);
                        }
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i2) != 0) {
                        zzh = zzdsx.zzc(i14, unsafe2.getObject(t, j3), zzgr(i11));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i2) != 0) {
                        zzh = zzdqf.zzc(i14, (zzdpm) unsafe2.getObject(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i2) != 0) {
                        zzh = zzdqf.zzaf(i14, unsafe2.getInt(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i2) != 0) {
                        zzh = zzdqf.zzaj(i14, unsafe2.getInt(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i2) != 0) {
                        zzai = zzdqf.zzai(i14, 0);
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i2) != 0) {
                        zzh = zzdqf.zzn(i14, 0L);
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i2) != 0) {
                        zzh = zzdqf.zzag(i14, unsafe2.getInt(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i2) != 0) {
                        zzh = zzdqf.zzl(i14, unsafe2.getLong(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i2) != 0) {
                        zzh = zzdqf.zzc(i14, (zzdsg) unsafe2.getObject(t, j3), zzgr(i11));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 18:
                    zzh = zzdsx.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 19:
                    zzv = zzdsx.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 20:
                    zzv = zzdsx.zzo(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 21:
                    zzv = zzdsx.zzp(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 22:
                    zzv = zzdsx.zzs(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 23:
                    zzv = zzdsx.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 24:
                    zzv = zzdsx.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 25:
                    zzv = zzdsx.zzx(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 26:
                    zzh = zzdsx.zzc(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzh;
                    j = 0;
                    break;
                case 27:
                    zzh = zzdsx.zzc(i14, (List<?>) unsafe2.getObject(t, j3), zzgr(i11));
                    i12 += zzh;
                    j = 0;
                    break;
                case 28:
                    zzh = zzdsx.zzd(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzh;
                    j = 0;
                    break;
                case 29:
                    zzh = zzdsx.zzt(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 30:
                    zzv = zzdsx.zzr(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 31:
                    zzv = zzdsx.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 32:
                    zzv = zzdsx.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 33:
                    zzv = zzdsx.zzu(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 34:
                    zzv = zzdsx.zzq(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 35:
                    zzai2 = zzdsx.zzai((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 36:
                    zzai2 = zzdsx.zzah((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 37:
                    zzai2 = zzdsx.zzaa((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 38:
                    zzai2 = zzdsx.zzab((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 39:
                    zzai2 = zzdsx.zzae((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 40:
                    zzai2 = zzdsx.zzai((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 41:
                    zzai2 = zzdsx.zzah((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 42:
                    zzai2 = zzdsx.zzaj((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 43:
                    zzai2 = zzdsx.zzaf((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 44:
                    zzai2 = zzdsx.zzad((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 45:
                    zzai2 = zzdsx.zzah((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 46:
                    zzai2 = zzdsx.zzai((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 47:
                    zzai2 = zzdsx.zzag((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 48:
                    zzai2 = zzdsx.zzac((List) unsafe2.getObject(t, j3));
                    if (zzai2 > 0) {
                        if (this.zzhni) {
                            unsafe2.putInt(t, i, zzai2);
                        }
                        zzgd = zzdqf.zzgd(i14);
                        zzgf = zzdqf.zzgf(zzai2);
                        zzai = zzgd + zzgf + zzai2;
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 49:
                    zzh = zzdsx.zzd(i14, (List) unsafe2.getObject(t, j3), zzgr(i11));
                    i12 += zzh;
                    j = 0;
                    break;
                case 50:
                    zzh = this.zzhnq.zzb(i14, unsafe2.getObject(t, j3), zzgs(i11));
                    i12 += zzh;
                    j = 0;
                    break;
                case 51:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzc(i14, 0.0d);
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzai = zzdqf.zzb(i14, 0.0f);
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzj(i14, zzi(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzk(i14, zzi(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzae(i14, zzh(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzm(i14, 0L);
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzai = zzdqf.zzah(i14, 0);
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzai = zzdqf.zzh(i14, true);
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzdpm) {
                            zzh = zzdqf.zzc(i14, (zzdpm) object2);
                        } else {
                            zzh = zzdqf.zzh(i14, (String) object2);
                        }
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdsx.zzc(i14, unsafe2.getObject(t, j3), zzgr(i11));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzc(i14, (zzdpm) unsafe2.getObject(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzaf(i14, zzh(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzaj(i14, zzh(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzai = zzdqf.zzai(i14, 0);
                        i12 += zzai;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzn(i14, 0L);
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzag(i14, zzh(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzl(i14, zzi(t, j3));
                        i12 += zzh;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((zzdsk<T>) t, i14, i11)) {
                        zzh = zzdqf.zzc(i14, (zzdsg) unsafe2.getObject(t, j3), zzgr(i11));
                        i12 += zzh;
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
        int zza = i12 + zza(this.zzhno, t);
        if (this.zzhnf) {
            zzdqm<?> zzai4 = this.zzhnp.zzai(t);
            for (int i19 = 0; i19 < zzai4.zzhhp.zzbbo(); i19++) {
                Map.Entry<?, Object> zzgz = zzai4.zzhhp.zzgz(i19);
                i18 += zzdqm.zzb((zzdqo) zzgz.getKey(), zzgz.getValue());
            }
            for (Map.Entry<?, Object> entry : zzai4.zzhhp.zzbbp()) {
                i18 += zzdqm.zzb((zzdqo) entry.getKey(), entry.getValue());
            }
            return zza + i18;
        }
        return zza;
    }

    private static <UT, UB> int zza(zzdtn<UT, UB> zzdtnVar, T t) {
        return zzdtnVar.zzau(zzdtnVar.zzay(t));
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzdtt.zzp(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.ads.zzdsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.ads.zzduk r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsk.zza(java.lang.Object, com.google.android.gms.internal.ads.zzduk):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r19, com.google.android.gms.internal.ads.zzduk r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsk.zzb(java.lang.Object, com.google.android.gms.internal.ads.zzduk):void");
    }

    private final <K, V> void zza(zzduk zzdukVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzdukVar.zza(i, this.zzhnq.zzas(zzgs(i2)), this.zzhnq.zzao(obj));
        }
    }

    private static <UT, UB> void zza(zzdtn<UT, UB> zzdtnVar, T t, zzduk zzdukVar) throws IOException {
        zzdtnVar.zza((zzdtn<UT, UB>) zzdtnVar.zzay(t), zzdukVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final void zza(T t, zzdsw zzdswVar, zzdqj zzdqjVar) throws IOException {
        if (zzdqjVar == null) {
            throw null;
        }
        zzdtn zzdtnVar = this.zzhno;
        zzdql<?> zzdqlVar = this.zzhnp;
        zzdqm<?> zzdqmVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzays = zzdswVar.zzays();
                int zzgx = zzgx(zzays);
                if (zzgx >= 0) {
                    int zzgu = zzgu(zzgx);
                    switch ((267386880 & zzgu) >>> 20) {
                        case 0:
                            zzdtt.zza(t, zzgu & 1048575, zzdswVar.readDouble());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 1:
                            zzdtt.zza((Object) t, zzgu & 1048575, zzdswVar.readFloat());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 2:
                            zzdtt.zza((Object) t, zzgu & 1048575, zzdswVar.zzaxw());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 3:
                            zzdtt.zza((Object) t, zzgu & 1048575, zzdswVar.zzaxv());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 4:
                            zzdtt.zzb(t, zzgu & 1048575, zzdswVar.zzaxx());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 5:
                            zzdtt.zza((Object) t, zzgu & 1048575, zzdswVar.zzaxy());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 6:
                            zzdtt.zzb(t, zzgu & 1048575, zzdswVar.zzaxz());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 7:
                            zzdtt.zza(t, zzgu & 1048575, zzdswVar.zzaya());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 8:
                            zza(t, zzgu, zzdswVar);
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 9:
                            if (zze((zzdsk<T>) t, zzgx)) {
                                long j = zzgu & 1048575;
                                zzdtt.zza(t, j, zzdqx.zzd(zzdtt.zzp(t, j), zzdswVar.zza(zzgr(zzgx), zzdqjVar)));
                                break;
                            } else {
                                zzdtt.zza(t, zzgu & 1048575, zzdswVar.zza(zzgr(zzgx), zzdqjVar));
                                zzf((zzdsk<T>) t, zzgx);
                                continue;
                            }
                        case 10:
                            zzdtt.zza(t, zzgu & 1048575, zzdswVar.zzayc());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 11:
                            zzdtt.zzb(t, zzgu & 1048575, zzdswVar.zzayd());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 12:
                            int zzaye = zzdswVar.zzaye();
                            zzdrc zzgt = zzgt(zzgx);
                            if (zzgt != null && !zzgt.zzf(zzaye)) {
                                obj = zzdsx.zza(zzays, zzaye, obj, zzdtnVar);
                                break;
                            }
                            zzdtt.zzb(t, zzgu & 1048575, zzaye);
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 13:
                            zzdtt.zzb(t, zzgu & 1048575, zzdswVar.zzayf());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 14:
                            zzdtt.zza((Object) t, zzgu & 1048575, zzdswVar.zzayg());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 15:
                            zzdtt.zzb(t, zzgu & 1048575, zzdswVar.zzayh());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 16:
                            zzdtt.zza((Object) t, zzgu & 1048575, zzdswVar.zzayi());
                            zzf((zzdsk<T>) t, zzgx);
                            continue;
                        case 17:
                            if (zze((zzdsk<T>) t, zzgx)) {
                                long j2 = zzgu & 1048575;
                                zzdtt.zza(t, j2, zzdqx.zzd(zzdtt.zzp(t, j2), zzdswVar.zzb(zzgr(zzgx), zzdqjVar)));
                                break;
                            } else {
                                zzdtt.zza(t, zzgu & 1048575, zzdswVar.zzb(zzgr(zzgx), zzdqjVar));
                                zzf((zzdsk<T>) t, zzgx);
                                continue;
                            }
                        case 18:
                            zzdswVar.zzk(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 19:
                            zzdswVar.zzl(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 20:
                            zzdswVar.zzn(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 21:
                            zzdswVar.zzm(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 22:
                            zzdswVar.zzo(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 23:
                            zzdswVar.zzp(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 24:
                            zzdswVar.zzq(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 25:
                            zzdswVar.zzr(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 26:
                            if (zzgw(zzgu)) {
                                zzdswVar.zzs(this.zzhnn.zza(t, zzgu & 1048575));
                                break;
                            } else {
                                zzdswVar.readStringList(this.zzhnn.zza(t, zzgu & 1048575));
                                continue;
                            }
                        case 27:
                            zzdswVar.zza(this.zzhnn.zza(t, zzgu & 1048575), zzgr(zzgx), zzdqjVar);
                            continue;
                        case 28:
                            zzdswVar.zzt(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 29:
                            zzdswVar.zzu(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 30:
                            List<Integer> zza = this.zzhnn.zza(t, zzgu & 1048575);
                            zzdswVar.zzv(zza);
                            obj = zzdsx.zza(zzays, zza, zzgt(zzgx), obj, zzdtnVar);
                            continue;
                        case 31:
                            zzdswVar.zzw(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 32:
                            zzdswVar.zzx(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 33:
                            zzdswVar.zzy(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 34:
                            zzdswVar.zzz(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 35:
                            zzdswVar.zzk(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 36:
                            zzdswVar.zzl(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 37:
                            zzdswVar.zzn(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 38:
                            zzdswVar.zzm(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 39:
                            zzdswVar.zzo(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 40:
                            zzdswVar.zzp(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 41:
                            zzdswVar.zzq(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 42:
                            zzdswVar.zzr(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 43:
                            zzdswVar.zzu(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza2 = this.zzhnn.zza(t, zzgu & 1048575);
                            zzdswVar.zzv(zza2);
                            obj = zzdsx.zza(zzays, zza2, zzgt(zzgx), obj, zzdtnVar);
                            continue;
                        case 45:
                            zzdswVar.zzw(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 46:
                            zzdswVar.zzx(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 47:
                            zzdswVar.zzy(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 48:
                            zzdswVar.zzz(this.zzhnn.zza(t, zzgu & 1048575));
                            continue;
                        case 49:
                            zzdswVar.zzb(this.zzhnn.zza(t, zzgu & 1048575), zzgr(zzgx), zzdqjVar);
                            continue;
                        case 50:
                            Object zzgs = zzgs(zzgx);
                            long zzgu2 = zzgu(zzgx) & 1048575;
                            Object zzp = zzdtt.zzp(t, zzgu2);
                            if (zzp == null) {
                                zzp = this.zzhnq.zzar(zzgs);
                                zzdtt.zza(t, zzgu2, zzp);
                            } else if (this.zzhnq.zzap(zzp)) {
                                Object zzar = this.zzhnq.zzar(zzgs);
                                this.zzhnq.zze(zzar, zzp);
                                zzdtt.zza(t, zzgu2, zzar);
                                zzp = zzar;
                            }
                            zzdswVar.zza(this.zzhnq.zzan(zzp), this.zzhnq.zzas(zzgs), zzdqjVar);
                            continue;
                        case 51:
                            zzdtt.zza(t, zzgu & 1048575, Double.valueOf(zzdswVar.readDouble()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 52:
                            zzdtt.zza(t, zzgu & 1048575, Float.valueOf(zzdswVar.readFloat()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 53:
                            zzdtt.zza(t, zzgu & 1048575, Long.valueOf(zzdswVar.zzaxw()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 54:
                            zzdtt.zza(t, zzgu & 1048575, Long.valueOf(zzdswVar.zzaxv()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 55:
                            zzdtt.zza(t, zzgu & 1048575, Integer.valueOf(zzdswVar.zzaxx()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 56:
                            zzdtt.zza(t, zzgu & 1048575, Long.valueOf(zzdswVar.zzaxy()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 57:
                            zzdtt.zza(t, zzgu & 1048575, Integer.valueOf(zzdswVar.zzaxz()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 58:
                            zzdtt.zza(t, zzgu & 1048575, Boolean.valueOf(zzdswVar.zzaya()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 59:
                            zza(t, zzgu, zzdswVar);
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 60:
                            if (zza((zzdsk<T>) t, zzays, zzgx)) {
                                long j3 = zzgu & 1048575;
                                zzdtt.zza(t, j3, zzdqx.zzd(zzdtt.zzp(t, j3), zzdswVar.zza(zzgr(zzgx), zzdqjVar)));
                            } else {
                                zzdtt.zza(t, zzgu & 1048575, zzdswVar.zza(zzgr(zzgx), zzdqjVar));
                                zzf((zzdsk<T>) t, zzgx);
                            }
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 61:
                            zzdtt.zza(t, zzgu & 1048575, zzdswVar.zzayc());
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 62:
                            zzdtt.zza(t, zzgu & 1048575, Integer.valueOf(zzdswVar.zzayd()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 63:
                            int zzaye2 = zzdswVar.zzaye();
                            zzdrc zzgt2 = zzgt(zzgx);
                            if (zzgt2 != null && !zzgt2.zzf(zzaye2)) {
                                obj = zzdsx.zza(zzays, zzaye2, obj, zzdtnVar);
                                break;
                            }
                            zzdtt.zza(t, zzgu & 1048575, Integer.valueOf(zzaye2));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 64:
                            zzdtt.zza(t, zzgu & 1048575, Integer.valueOf(zzdswVar.zzayf()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 65:
                            zzdtt.zza(t, zzgu & 1048575, Long.valueOf(zzdswVar.zzayg()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 66:
                            zzdtt.zza(t, zzgu & 1048575, Integer.valueOf(zzdswVar.zzayh()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 67:
                            zzdtt.zza(t, zzgu & 1048575, Long.valueOf(zzdswVar.zzayi()));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        case 68:
                            zzdtt.zza(t, zzgu & 1048575, zzdswVar.zzb(zzgr(zzgx), zzdqjVar));
                            zzb((zzdsk<T>) t, zzays, zzgx);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzdtnVar.zzbbw();
                                } catch (zzdrf unused) {
                                    zzdtnVar.zza(zzdswVar);
                                    if (obj == null) {
                                        obj = zzdtnVar.zzaz(t);
                                    }
                                    if (!zzdtnVar.zza((zzdtn) obj, zzdswVar)) {
                                        for (int i = this.zzhnk; i < this.zzhnl; i++) {
                                            obj = zza((Object) t, this.zzhnj[i], (int) obj, (zzdtn<UT, int>) zzdtnVar);
                                        }
                                        if (obj != null) {
                                            zzdtnVar.zzi(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzdtnVar.zza((zzdtn) obj, zzdswVar)) {
                                for (int i2 = this.zzhnk; i2 < this.zzhnl; i2++) {
                                    obj = zza((Object) t, this.zzhnj[i2], (int) obj, (zzdtn<UT, int>) zzdtnVar);
                                }
                                if (obj != null) {
                                    zzdtnVar.zzi(t, obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zzays == Integer.MAX_VALUE) {
                    for (int i3 = this.zzhnk; i3 < this.zzhnl; i3++) {
                        obj = zza((Object) t, this.zzhnj[i3], (int) obj, (zzdtn<UT, int>) zzdtnVar);
                    }
                    if (obj != null) {
                        zzdtnVar.zzi(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zza3 = !this.zzhnf ? null : zzdqlVar.zza(zzdqjVar, this.zzhne, zzays);
                    if (zza3 != null) {
                        if (zzdqmVar == null) {
                            zzdqmVar = zzdqlVar.zzaj(t);
                        }
                        zzdqm<?> zzdqmVar2 = zzdqmVar;
                        obj = zzdqlVar.zza(zzdswVar, zza3, zzdqjVar, zzdqmVar2, obj, zzdtnVar);
                        zzdqmVar = zzdqmVar2;
                    } else {
                        zzdtnVar.zza(zzdswVar);
                        if (obj == null) {
                            obj = zzdtnVar.zzaz(t);
                        }
                        if (!zzdtnVar.zza((zzdtn) obj, zzdswVar)) {
                            for (int i4 = this.zzhnk; i4 < this.zzhnl; i4++) {
                                obj = zza((Object) t, this.zzhnj[i4], (int) obj, (zzdtn<UT, int>) zzdtnVar);
                            }
                            if (obj != null) {
                                zzdtnVar.zzi(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzhnk; i5 < this.zzhnl; i5++) {
                    obj = zza((Object) t, this.zzhnj[i5], (int) obj, (zzdtn<UT, int>) zzdtnVar);
                }
                if (obj != null) {
                    zzdtnVar.zzi(t, obj);
                }
                throw th;
            }
        }
    }

    private static zzdtq zzav(Object obj) {
        zzdqw zzdqwVar = (zzdqw) obj;
        zzdtq zzdtqVar = zzdqwVar.zzhkr;
        if (zzdtqVar == zzdtq.zzbbx()) {
            zzdtq zzbby = zzdtq.zzbby();
            zzdqwVar.zzhkr = zzbby;
            return zzbby;
        }
        return zzdtqVar;
    }

    private static int zza(byte[] bArr, int i, int i2, zzdue zzdueVar, Class<?> cls, zzdpl zzdplVar) throws IOException {
        switch (zzdsj.zzhgt[zzdueVar.ordinal()]) {
            case 1:
                int zzb = zzdpi.zzb(bArr, i, zzdplVar);
                zzdplVar.zzhfz = Boolean.valueOf(zzdplVar.zzhfy != 0);
                return zzb;
            case 2:
                return zzdpi.zze(bArr, i, zzdplVar);
            case 3:
                zzdplVar.zzhfz = Double.valueOf(zzdpi.zzh(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzdplVar.zzhfz = Integer.valueOf(zzdpi.zzf(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzdplVar.zzhfz = Long.valueOf(zzdpi.zzg(bArr, i));
                return i + 8;
            case 8:
                zzdplVar.zzhfz = Float.valueOf(zzdpi.zzi(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzdpi.zza(bArr, i, zzdplVar);
                zzdplVar.zzhfz = Integer.valueOf(zzdplVar.zzhfx);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzdpi.zzb(bArr, i, zzdplVar);
                zzdplVar.zzhfz = Long.valueOf(zzdplVar.zzhfy);
                return zzb2;
            case 14:
                return zzdpi.zza(zzdsr.zzbbf().zzh(cls), bArr, i, i2, zzdplVar);
            case 15:
                int zza2 = zzdpi.zza(bArr, i, zzdplVar);
                zzdplVar.zzhfz = Integer.valueOf(zzdpy.zzft(zzdplVar.zzhfx));
                return zza2;
            case 16:
                int zzb3 = zzdpi.zzb(bArr, i, zzdplVar);
                zzdplVar.zzhfz = Long.valueOf(zzdpy.zzez(zzdplVar.zzhfy));
                return zzb3;
            case 17:
                return zzdpi.zzd(bArr, i, zzdplVar);
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
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.zzdpl r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsk.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzdpl):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzdpl zzdplVar) throws IOException {
        Unsafe unsafe = zzgqj;
        Object zzgs = zzgs(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzhnq.zzap(object)) {
            Object zzar = this.zzhnq.zzar(zzgs);
            this.zzhnq.zze(zzar, object);
            unsafe.putObject(t, j, zzar);
            object = zzar;
        }
        zzdrx<?, ?> zzas = this.zzhnq.zzas(zzgs);
        Map<?, ?> zzan = this.zzhnq.zzan(object);
        int zza = zzdpi.zza(bArr, i, zzdplVar);
        int i4 = zzdplVar.zzhfx;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzdrg.zzbac();
        }
        int i5 = i4 + zza;
        Object obj = (K) zzas.zzhmu;
        Object obj2 = (V) zzas.zzcfq;
        while (zza < i5) {
            int i6 = zza + 1;
            int i7 = bArr[zza];
            if (i7 < 0) {
                i6 = zzdpi.zza(i7, bArr, i6, zzdplVar);
                i7 = zzdplVar.zzhfx;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzas.zzhmt.zzbch()) {
                    zza = zza(bArr, i8, i2, zzas.zzhmt, (Class<?>) null, zzdplVar);
                    obj = (K) zzdplVar.zzhfz;
                } else {
                    zza = zzdpi.zza(i7, bArr, i8, i2, zzdplVar);
                }
            } else {
                if (i9 == 2 && i10 == zzas.zzhmv.zzbch()) {
                    zza = zza(bArr, i8, i2, zzas.zzhmv, zzas.zzcfq.getClass(), zzdplVar);
                    obj2 = zzdplVar.zzhfz;
                }
                zza = zzdpi.zza(i7, bArr, i8, i2, zzdplVar);
            }
        }
        if (zza != i5) {
            throw zzdrg.zzbai();
        }
        zzan.put(obj, obj2);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzdpl zzdplVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzgqj;
        long j2 = this.zzhna[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzdpi.zzh(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzdpi.zzi(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzdpi.zzb(bArr, i, zzdplVar);
                    unsafe.putObject(t, j, Long.valueOf(zzdplVar.zzhfy));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzdpi.zza(bArr, i, zzdplVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzdplVar.zzhfx));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzdpi.zzg(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzdpi.zzf(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzdpi.zzb(bArr, i, zzdplVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzdplVar.zzhfy != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzdpi.zza(bArr, i, zzdplVar);
                    int i9 = zzdplVar.zzhfx;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzdtw.zzl(bArr, zza, zza + i9)) {
                        throw zzdrg.zzbaj();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza, i9, zzdqx.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zzdpi.zza(zzgr(i8), bArr, i, i2, zzdplVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzdplVar.zzhfz);
                    } else {
                        unsafe.putObject(t, j, zzdqx.zzd(object, zzdplVar.zzhfz));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzdpi.zze(bArr, i, zzdplVar);
                    unsafe.putObject(t, j, zzdplVar.zzhfz);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzdpi.zza(bArr, i, zzdplVar);
                    int i10 = zzdplVar.zzhfx;
                    zzdrc zzgt = zzgt(i8);
                    if (zzgt == null || zzgt.zzf(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb = zza3;
                        unsafe.putInt(t, j2, i4);
                        return zzb;
                    }
                    zzav(t).zzc(i3, Long.valueOf(i10));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzdpi.zza(bArr, i, zzdplVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzdpy.zzft(zzdplVar.zzhfx)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzdpi.zzb(bArr, i, zzdplVar);
                    unsafe.putObject(t, j, Long.valueOf(zzdpy.zzez(zzdplVar.zzhfy)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zzdpi.zza(zzgr(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdplVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzdplVar.zzhfz);
                    } else {
                        unsafe.putObject(t, j, zzdqx.zzd(object2, zzdplVar.zzhfz));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzdsv zzgr(int i) {
        int i2 = (i / 3) << 1;
        zzdsv zzdsvVar = (zzdsv) this.zzhnb[i2];
        if (zzdsvVar != null) {
            return zzdsvVar;
        }
        zzdsv<T> zzh = zzdsr.zzbbf().zzh((Class) this.zzhnb[i2 + 1]);
        this.zzhnb[i2] = zzh;
        return zzh;
    }

    private final Object zzgs(int i) {
        return this.zzhnb[(i / 3) << 1];
    }

    private final zzdrc zzgt(int i) {
        return (zzdrc) this.zzhnb[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzdpl zzdplVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        zzdsk<T> zzdskVar;
        byte b;
        int i5;
        int zzgx;
        int i6;
        int i7;
        int i8;
        int i9;
        T t3;
        zzdpl zzdplVar2;
        int i10;
        int i11;
        int i12;
        zzdpl zzdplVar3;
        int i13;
        zzdpl zzdplVar4;
        int i14;
        int i15;
        zzdpl zzdplVar5;
        int i16;
        int i17;
        int i18;
        zzdsk<T> zzdskVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i19 = i2;
        int i20 = i3;
        zzdpl zzdplVar6 = zzdplVar;
        Unsafe unsafe2 = zzgqj;
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
                    i5 = zzdpi.zza(b2, bArr2, i27, zzdplVar6);
                    b = zzdplVar6.zzhfx;
                } else {
                    b = b2;
                    i5 = i27;
                }
                int i28 = b >>> 3;
                int i29 = b & 7;
                if (i28 > i22) {
                    zzgx = zzdskVar2.zzam(i28, i23 / 3);
                } else {
                    zzgx = zzdskVar2.zzgx(i28);
                }
                int i30 = zzgx;
                if (i30 == -1) {
                    i6 = i28;
                    i7 = i5;
                    i8 = b;
                    unsafe = unsafe2;
                    i4 = i20;
                    i9 = 0;
                } else {
                    int[] iArr = zzdskVar2.zzhna;
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
                                zzdplVar4 = zzdplVar;
                                i14 = i5;
                                if (i29 == 1) {
                                    zzdtt.zza(t4, j, zzdpi.zzh(bArr2, i14));
                                    i21 = i14 + 8;
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar4;
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
                                zzdplVar4 = zzdplVar;
                                i14 = i5;
                                if (i29 == 5) {
                                    zzdtt.zza((Object) t4, j, zzdpi.zzi(bArr2, i14));
                                    i21 = i14 + 4;
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar4;
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
                                    int zzb = zzdpi.zzb(bArr2, i14, zzdplVar);
                                    unsafe2.putLong(t, j, zzdplVar.zzhfy);
                                    i25 |= i35;
                                    i21 = zzb;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar;
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
                                zzdplVar4 = zzdplVar;
                                i14 = i5;
                                if (i29 == 0) {
                                    i21 = zzdpi.zza(bArr2, i14, zzdplVar4);
                                    unsafe2.putInt(t4, j, zzdplVar4.zzhfx);
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar4;
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
                                zzdplVar4 = zzdplVar;
                                if (i29 == 1) {
                                    i13 = i26;
                                    i14 = i5;
                                    unsafe2.putLong(t, j, zzdpi.zzg(bArr2, i5));
                                    i21 = i14 + 8;
                                    i25 |= i35;
                                    i26 = i13;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar4;
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
                                zzdplVar5 = zzdplVar;
                                if (i29 == 5) {
                                    unsafe2.putInt(t4, j, zzdpi.zzf(bArr2, i5));
                                    i21 = i5 + 4;
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar5;
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
                                zzdplVar5 = zzdplVar;
                                if (i29 == 0) {
                                    int zzb2 = zzdpi.zzb(bArr2, i5, zzdplVar5);
                                    zzdtt.zza(t4, j, zzdplVar5.zzhfy != 0);
                                    i25 |= i35;
                                    i21 = zzb2;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar5;
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
                                zzdplVar5 = zzdplVar;
                                if (i29 == 2) {
                                    if ((i31 & 536870912) == 0) {
                                        i21 = zzdpi.zzc(bArr2, i5, zzdplVar5);
                                    } else {
                                        i21 = zzdpi.zzd(bArr2, i5, zzdplVar5);
                                    }
                                    unsafe2.putObject(t4, j, zzdplVar5.zzhfz);
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar5;
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
                                zzdplVar5 = zzdplVar;
                                if (i29 == 2) {
                                    i15 = i2;
                                    i21 = zzdpi.zza(zzdskVar2.zzgr(i10), bArr2, i5, i15, zzdplVar5);
                                    if ((i25 & i35) == 0) {
                                        unsafe2.putObject(t4, j, zzdplVar5.zzhfz);
                                    } else {
                                        unsafe2.putObject(t4, j, zzdqx.zzd(unsafe2.getObject(t4, j), zzdplVar5.zzhfz));
                                    }
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar5;
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
                                zzdplVar4 = zzdplVar;
                                if (i29 == 2) {
                                    i21 = zzdpi.zze(bArr2, i5, zzdplVar4);
                                    unsafe2.putObject(t4, j, zzdplVar4.zzhfz);
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar4;
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
                                zzdplVar4 = zzdplVar;
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
                                    i21 = zzdpi.zza(bArr2, i5, zzdplVar4);
                                    int i37 = zzdplVar4.zzhfx;
                                    zzdrc zzgt = zzdskVar2.zzgt(i10);
                                    if (zzgt == null || zzgt.zzf(i37)) {
                                        unsafe2.putInt(t4, j, i37);
                                        i25 |= i35;
                                        i24 = i12;
                                        i23 = i10;
                                        i22 = i11;
                                        zzdplVar6 = zzdplVar4;
                                        i19 = i2;
                                        i20 = i3;
                                        break;
                                    } else {
                                        zzav(t).zzc(i12, Long.valueOf(i37));
                                        i24 = i12;
                                        i23 = i10;
                                        i22 = i11;
                                        zzdplVar6 = zzdplVar4;
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
                                zzdplVar4 = zzdplVar;
                                if (i29 == 0) {
                                    i21 = zzdpi.zza(bArr2, i5, zzdplVar4);
                                    unsafe2.putInt(t4, j, zzdpy.zzft(zzdplVar4.zzhfx));
                                    i25 |= i35;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar4;
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
                                    int zzb3 = zzdpi.zzb(bArr2, i5, zzdplVar);
                                    zzdplVar4 = zzdplVar;
                                    unsafe2.putLong(t, j, zzdpy.zzez(zzdplVar.zzhfy));
                                    i25 |= i35;
                                    i21 = zzb3;
                                    i24 = i12;
                                    i23 = i10;
                                    i22 = i11;
                                    zzdplVar6 = zzdplVar4;
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
                                    i21 = zzdpi.zza(zzdskVar2.zzgr(i30), bArr, i5, i2, (i28 << 3) | 4, zzdplVar);
                                    if ((i25 & i35) == 0) {
                                        zzdplVar3 = zzdplVar;
                                        unsafe2.putObject(t4, j, zzdplVar3.zzhfz);
                                    } else {
                                        zzdplVar3 = zzdplVar;
                                        unsafe2.putObject(t4, j, zzdqx.zzd(unsafe2.getObject(t4, j), zzdplVar3.zzhfz));
                                    }
                                    i25 |= i35;
                                    bArr2 = bArr;
                                    i19 = i2;
                                    i24 = i33;
                                    i23 = i30;
                                    i22 = i28;
                                    i20 = i3;
                                    zzdplVar6 = zzdplVar3;
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
                        zzdpl zzdplVar7 = zzdplVar6;
                        if (i32 != 27) {
                            i16 = i25;
                            if (i32 <= 49) {
                                i6 = i28;
                                i18 = i33;
                                i9 = i30;
                                unsafe = unsafe2;
                                i21 = zza((zzdsk<T>) t, bArr, i39, i2, i33, i28, i29, i30, i31, i32, j, zzdplVar);
                                if (i21 == i39) {
                                    i4 = i3;
                                    i7 = i21;
                                } else {
                                    zzdskVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i19 = i2;
                                    i20 = i3;
                                    zzdplVar6 = zzdplVar;
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
                                    i21 = zza((zzdsk<T>) t, bArr, i17, i2, i18, i6, i29, i31, i32, j, i9, zzdplVar);
                                    if (i21 != i17) {
                                        zzdskVar2 = this;
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
                                        zzdplVar6 = zzdplVar;
                                    }
                                } else if (i29 == 2) {
                                    i21 = zza((zzdsk<T>) t, bArr, i17, i2, i9, j, zzdplVar);
                                    if (i21 != i17) {
                                        zzdskVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i19 = i2;
                                        i20 = i3;
                                        zzdplVar6 = zzdplVar;
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
                            zzdrd zzdrdVar = (zzdrd) unsafe2.getObject(t4, j);
                            if (!zzdrdVar.zzaxi()) {
                                int size = zzdrdVar.size();
                                zzdrdVar = zzdrdVar.zzfl(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, zzdrdVar);
                            }
                            i21 = zzdpi.zza(zzdskVar2.zzgr(i30), i33, bArr, i39, i2, zzdrdVar, zzdplVar);
                            i20 = i3;
                            i22 = i28;
                            i24 = i33;
                            i23 = i30;
                            zzdplVar6 = zzdplVar7;
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
                    if (this.zzhnf) {
                        zzdplVar2 = zzdplVar;
                        if (zzdplVar2.zzhga != zzdqj.zzaza()) {
                            int i40 = i6;
                            if (zzdplVar2.zzhga.zza(this.zzhne, i40) == null) {
                                i21 = zzdpi.zza(i8, bArr, i7, i2, zzav(t), zzdplVar);
                                t4 = t;
                                i19 = i2;
                                i24 = i8;
                                zzdskVar2 = this;
                                zzdplVar6 = zzdplVar2;
                                i22 = i40;
                                i23 = i9;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i20 = i4;
                            } else {
                                zzdqw.zzb zzbVar = (zzdqw.zzb) t;
                                zzbVar.zzazz();
                                zzdqm<Object> zzdqmVar = zzbVar.zzhku;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                        }
                    } else {
                        t3 = t;
                        zzdplVar2 = zzdplVar;
                    }
                    i21 = zzdpi.zza(i8, bArr, i7, i2, zzav(t), zzdplVar);
                    i24 = i8;
                    zzdskVar2 = this;
                    zzdplVar6 = zzdplVar2;
                    i22 = i6;
                    t4 = t3;
                    i23 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i19 = i2;
                    i20 = i4;
                } else {
                    zzdskVar = this;
                    t2 = t;
                    i21 = i7;
                    i24 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i20;
                t2 = t4;
                zzdskVar = zzdskVar2;
            }
        }
        if (i26 != -1) {
            unsafe.putInt(t2, i26, i25);
        }
        zzdtq zzdtqVar = null;
        for (int i41 = zzdskVar.zzhnk; i41 < zzdskVar.zzhnl; i41++) {
            zzdtqVar = (zzdtq) zzdskVar.zza((Object) t2, zzdskVar.zzhnj[i41], (int) zzdtqVar, (zzdtn<UT, int>) zzdskVar.zzhno);
        }
        if (zzdtqVar != null) {
            zzdskVar.zzhno.zzi(t2, zzdtqVar);
        }
        if (i4 == 0) {
            if (i21 != i2) {
                throw zzdrg.zzbai();
            }
        } else if (i21 > i2 || i24 != i4) {
            throw zzdrg.zzbai();
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
    @Override // com.google.android.gms.internal.ads.zzdsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.zzdpl r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsk.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzdpl):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdsv
    public final void zzak(T t) {
        int i;
        int i2 = this.zzhnk;
        while (true) {
            i = this.zzhnl;
            if (i2 >= i) {
                break;
            }
            long zzgu = zzgu(this.zzhnj[i2]) & 1048575;
            Object zzp = zzdtt.zzp(t, zzgu);
            if (zzp != null) {
                zzdtt.zza(t, zzgu, this.zzhnq.zzaq(zzp));
            }
            i2++;
        }
        int length = this.zzhnj.length;
        while (i < length) {
            this.zzhnn.zzb(t, this.zzhnj[i]);
            i++;
        }
        this.zzhno.zzak(t);
        if (this.zzhnf) {
            this.zzhnp.zzak(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzdtn<UT, UB> zzdtnVar) {
        zzdrc zzgt;
        int i2 = this.zzhna[i];
        Object zzp = zzdtt.zzp(obj, zzgu(i) & 1048575);
        return (zzp == null || (zzgt = zzgt(i)) == null) ? ub : (UB) zza(i, i2, this.zzhnq.zzan(zzp), zzgt, (zzdrc) ub, (zzdtn<UT, zzdrc>) zzdtnVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzdrc zzdrcVar, UB ub, zzdtn<UT, UB> zzdtnVar) {
        zzdrx<?, ?> zzas = this.zzhnq.zzas(zzgs(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzdrcVar.zzf(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzdtnVar.zzbbw();
                }
                zzdpu zzfo = zzdpm.zzfo(zzdry.zza(zzas, next.getKey(), next.getValue()));
                try {
                    zzdry.zza(zzfo.zzaxt(), zzas, next.getKey(), next.getValue());
                    zzdtnVar.zza((zzdtn<UT, UB>) ub, i2, zzfo.zzaxs());
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
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.zzdsv] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.zzdsv] */
    @Override // com.google.android.gms.internal.ads.zzdsv
    public final boolean zzaw(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.zzhnk) {
                return !this.zzhnf || this.zzhnp.zzai(t).isInitialized();
            }
            int i5 = this.zzhnj[i3];
            int i6 = this.zzhna[i5];
            int zzgu = zzgu(i5);
            if (this.zzhnh) {
                i = 0;
            } else {
                int i7 = this.zzhna[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = zzgqj.getInt(t, i8);
                    i2 = i8;
                }
            }
            if (((268435456 & zzgu) != 0) && !zza((zzdsk<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzgu) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (zza((zzdsk<T>) t, i5, i4, i) && !zza(t, zzgu, zzgr(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((zzdsk<T>) t, i6, i5) && !zza(t, zzgu, zzgr(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzao = this.zzhnq.zzao(zzdtt.zzp(t, zzgu & 1048575));
                            if (!zzao.isEmpty()) {
                                if (this.zzhnq.zzas(zzgs(i5)).zzhmv.zzbcg() == zzduh.MESSAGE) {
                                    zzdsv<T> zzdsvVar = 0;
                                    Iterator<?> it = zzao.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzdsvVar == null) {
                                            zzdsvVar = zzdsr.zzbbf().zzh(next.getClass());
                                        }
                                        boolean zzaw = zzdsvVar.zzaw(next);
                                        zzdsvVar = zzdsvVar;
                                        if (!zzaw) {
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
                List list = (List) zzdtt.zzp(t, zzgu & 1048575);
                if (!list.isEmpty()) {
                    ?? zzgr = zzgr(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zzgr.zzaw(list.get(i10))) {
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
    private static boolean zza(Object obj, int i, zzdsv zzdsvVar) {
        return zzdsvVar.zzaw(zzdtt.zzp(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzduk zzdukVar) throws IOException {
        if (obj instanceof String) {
            zzdukVar.zzg(i, (String) obj);
        } else {
            zzdukVar.zza(i, (zzdpm) obj);
        }
    }

    private final void zza(Object obj, int i, zzdsw zzdswVar) throws IOException {
        if (zzgw(i)) {
            zzdtt.zza(obj, i & 1048575, zzdswVar.zzayb());
        } else if (this.zzhng) {
            zzdtt.zza(obj, i & 1048575, zzdswVar.readString());
        } else {
            zzdtt.zza(obj, i & 1048575, zzdswVar.zzayc());
        }
    }

    private final int zzgu(int i) {
        return this.zzhna[i + 1];
    }

    private final int zzgv(int i) {
        return this.zzhna[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzdtt.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzdtt.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzdtt.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzdtt.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzdtt.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zze((zzdsk<T>) t, i) == zze((zzdsk<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzhnh) {
            return zze((zzdsk<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zze(T t, int i) {
        if (this.zzhnh) {
            int zzgu = zzgu(i);
            long j = zzgu & 1048575;
            switch ((zzgu & 267386880) >>> 20) {
                case 0:
                    return zzdtt.zzo(t, j) != 0.0d;
                case 1:
                    return zzdtt.zzn(t, j) != 0.0f;
                case 2:
                    return zzdtt.zzl(t, j) != 0;
                case 3:
                    return zzdtt.zzl(t, j) != 0;
                case 4:
                    return zzdtt.zzk(t, j) != 0;
                case 5:
                    return zzdtt.zzl(t, j) != 0;
                case 6:
                    return zzdtt.zzk(t, j) != 0;
                case 7:
                    return zzdtt.zzm(t, j);
                case 8:
                    Object zzp = zzdtt.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    } else if (zzp instanceof zzdpm) {
                        return !zzdpm.zzhgb.equals(zzp);
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return zzdtt.zzp(t, j) != null;
                case 10:
                    return !zzdpm.zzhgb.equals(zzdtt.zzp(t, j));
                case 11:
                    return zzdtt.zzk(t, j) != 0;
                case 12:
                    return zzdtt.zzk(t, j) != 0;
                case 13:
                    return zzdtt.zzk(t, j) != 0;
                case 14:
                    return zzdtt.zzl(t, j) != 0;
                case 15:
                    return zzdtt.zzk(t, j) != 0;
                case 16:
                    return zzdtt.zzl(t, j) != 0;
                case 17:
                    return zzdtt.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zzgv = zzgv(i);
        return (zzdtt.zzk(t, (long) (zzgv & 1048575)) & (1 << (zzgv >>> 20))) != 0;
    }

    private final void zzf(T t, int i) {
        if (this.zzhnh) {
            return;
        }
        int zzgv = zzgv(i);
        long j = zzgv & 1048575;
        zzdtt.zzb(t, j, zzdtt.zzk(t, j) | (1 << (zzgv >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzdtt.zzk(t, (long) (zzgv(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzdtt.zzb(t, zzgv(i2) & 1048575, i);
    }

    private final int zzgx(int i) {
        if (i < this.zzhnc || i > this.zzhnd) {
            return -1;
        }
        return zzan(i, 0);
    }

    private final int zzam(int i, int i2) {
        if (i < this.zzhnc || i > this.zzhnd) {
            return -1;
        }
        return zzan(i, i2);
    }

    private final int zzan(int i, int i2) {
        int length = (this.zzhna.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzhna[i4];
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
