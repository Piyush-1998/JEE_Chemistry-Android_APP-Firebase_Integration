package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgz {
    private static final Class<?> zzalg = zzwf();
    private static final zzhp<?, ?> zzalh = zzt(false);
    private static final zzhp<?, ?> zzali = zzt(true);
    private static final zzhp<?, ?> zzalj = new zzhr();

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzey.class.isAssignableFrom(cls) && (cls2 = zzalg) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzim zzimVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzim zzimVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zza(i, list);
    }

    public static void zzb(int i, List<zzdp> list, zzim zzimVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzim zzimVar, zzgx zzgxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zza(i, list, zzgxVar);
    }

    public static void zzb(int i, List<?> list, zzim zzimVar, zzgx zzgxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzimVar.zzb(i, list, zzgxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            i = 0;
            while (i2 < size) {
                i += zzee.zzbq(zzfwVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.zzbq(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzu(list) + (list.size() * zzee.zzbi(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            i = 0;
            while (i2 < size) {
                i += zzee.zzbr(zzfwVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.zzbr(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzee.zzbi(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            i = 0;
            while (i2 < size) {
                i += zzee.zzbs(zzfwVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.zzbs(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzee.zzbi(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzee.zzbo(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.zzbo(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzee.zzbi(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzee.zzbj(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.zzbj(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzee.zzbi(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzz(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzee.zzbk(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.zzbk(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzz(list) + (size * zzee.zzbi(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaa(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzee.zzbl(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzee.zzbl(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaa(list) + (size * zzee.zzbi(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzab(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzee.zzj(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzac(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzee.zzg(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzad(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzee.zzc(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list) {
        int zzds;
        int zzds2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzbi = zzee.zzbi(i) * size;
        if (list instanceof zzfp) {
            zzfp zzfpVar = (zzfp) list;
            while (i2 < size) {
                Object zzbw = zzfpVar.zzbw(i2);
                if (zzbw instanceof zzdp) {
                    zzds2 = zzee.zzb((zzdp) zzbw);
                } else {
                    zzds2 = zzee.zzds((String) zzbw);
                }
                zzbi += zzds2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzdp) {
                    zzds = zzee.zzb((zzdp) obj);
                } else {
                    zzds = zzee.zzds((String) obj);
                }
                zzbi += zzds;
                i2++;
            }
        }
        return zzbi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, Object obj, zzgx zzgxVar) {
        if (obj instanceof zzfn) {
            return zzee.zza(i, (zzfn) obj);
        }
        return zzee.zzb(i, (zzgi) obj, zzgxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list, zzgx zzgxVar) {
        int zzb;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzbi = zzee.zzbi(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzfn) {
                zzb = zzee.zza((zzfn) obj);
            } else {
                zzb = zzee.zzb((zzgi) obj, zzgxVar);
            }
            zzbi += zzb;
        }
        return zzbi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzdp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzbi = size * zzee.zzbi(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzbi += zzee.zzb(list.get(i2));
        }
        return zzbi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzgi> list, zzgx zzgxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzee.zzc(i, list.get(i3), zzgxVar);
        }
        return i2;
    }

    public static zzhp<?, ?> zzwc() {
        return zzalh;
    }

    public static zzhp<?, ?> zzwd() {
        return zzali;
    }

    public static zzhp<?, ?> zzwe() {
        return zzalj;
    }

    private static zzhp<?, ?> zzt(boolean z) {
        try {
            Class<?> zzwg = zzwg();
            if (zzwg == null) {
                return null;
            }
            return (zzhp) zzwg.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzwf() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzwg() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzgb zzgbVar, T t, T t2, long j) {
        zzhv.zza(t, j, zzgbVar.zzb(zzhv.zzp(t, j), zzhv.zzp(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzeq<FT>> void zza(zzen<FT> zzenVar, T t, T t2) {
        zzeo<FT> zzh = zzenVar.zzh(t2);
        if (zzh.zzaex.isEmpty()) {
            return;
        }
        zzenVar.zzi(t).zza(zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzhp<UT, UB> zzhpVar, T t, T t2) {
        zzhpVar.zze(t, zzhpVar.zzg(zzhpVar.zzx(t), zzhpVar.zzx(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzfe zzfeVar, UB ub, zzhp<UT, UB> zzhpVar) {
        if (zzfeVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzfeVar.zzg(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzhpVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfeVar.zzg(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzhpVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzhp<UT, UB> zzhpVar) {
        if (ub == null) {
            ub = zzhpVar.zzwp();
        }
        zzhpVar.zza((zzhp<UT, UB>) ub, i, i2);
        return ub;
    }
}
