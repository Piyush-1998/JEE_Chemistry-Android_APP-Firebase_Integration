package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdge {
    static final /* synthetic */ int[] zzgtk;
    static final /* synthetic */ int[] zzgtl;
    static final /* synthetic */ int[] zzgtm;

    static {
        int[] iArr = new int[zzdhz.values().length];
        zzgtm = iArr;
        try {
            iArr[zzdhz.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzgtm[zzdhz.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzgtm[zzdhz.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzdjb.values().length];
        zzgtl = iArr2;
        try {
            iArr2[zzdjb.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzgtl[zzdjb.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzgtl[zzdjb.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzdjg.values().length];
        zzgtk = iArr3;
        try {
            iArr3[zzdjg.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zzgtk[zzdjg.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            zzgtk[zzdjg.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
