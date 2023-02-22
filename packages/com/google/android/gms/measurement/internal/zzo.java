package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbk;

/* loaded from: classes.dex */
final /* synthetic */ class zzo {
    static final /* synthetic */ int[] zzdu;
    static final /* synthetic */ int[] zzdv;

    static {
        int[] iArr = new int[zzbk.zzc.zzb.values().length];
        zzdv = iArr;
        try {
            iArr[zzbk.zzc.zzb.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdv[zzbk.zzc.zzb.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzdv[zzbk.zzc.zzb.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzdv[zzbk.zzc.zzb.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzbk.zze.zza.values().length];
        zzdu = iArr2;
        try {
            iArr2[zzbk.zze.zza.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzdu[zzbk.zze.zza.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zzdu[zzbk.zze.zza.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zzdu[zzbk.zze.zza.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            zzdu[zzbk.zze.zza.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            zzdu[zzbk.zze.zza.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
