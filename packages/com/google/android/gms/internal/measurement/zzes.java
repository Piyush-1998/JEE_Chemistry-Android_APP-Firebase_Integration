package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final /* synthetic */ class zzes {
    static final /* synthetic */ int[] zzafe;
    static final /* synthetic */ int[] zzaff;

    static {
        int[] iArr = new int[zzfk.values().length];
        zzaff = iArr;
        try {
            iArr[zzfk.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzaff[zzfk.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzaff[zzfk.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzev.values().length];
        zzafe = iArr2;
        try {
            iArr2[zzev.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzafe[zzev.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzafe[zzev.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
