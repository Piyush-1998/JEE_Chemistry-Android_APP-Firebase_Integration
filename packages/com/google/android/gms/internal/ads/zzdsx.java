package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdsx {
    private static final Class<?> zzhnx = zzbbm();
    private static final zzdtn<?, ?> zzhny = zzbk(false);
    private static final zzdtn<?, ?> zzhnz = zzbk(true);
    private static final zzdtn<?, ?> zzhoa = new zzdtp();

    public static void zzi(Class<?> cls) {
        Class<?> cls2;
        if (!zzdqw.class.isAssignableFrom(cls) && (cls2 = zzhnx) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzduk zzdukVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzduk zzdukVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zza(i, list);
    }

    public static void zzb(int i, List<zzdpm> list, zzduk zzdukVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzduk zzdukVar, zzdsv zzdsvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zza(i, list, zzdsvVar);
    }

    public static void zzb(int i, List<?> list, zzduk zzdukVar, zzdsv zzdsvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdukVar.zzb(i, list, zzdsvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaa(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzfd(zzdruVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzfd(list.get(i2).longValue());
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
        return zzaa(list) + (list.size() * zzdqf.zzgd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzab(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzfe(zzdruVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzfe(list.get(i2).longValue());
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
        return zzab(list) + (size * zzdqf.zzgd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzac(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzff(zzdruVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzff(list.get(i2).longValue());
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
        return zzac(list) + (size * zzdqf.zzgd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzad(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzgj(zzdqyVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzgj(list.get(i2).intValue());
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
        return zzad(list) + (size * zzdqf.zzgd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzae(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzge(zzdqyVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzge(list.get(i2).intValue());
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
        return zzae(list) + (size * zzdqf.zzgd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzgf(zzdqyVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzgf(list.get(i2).intValue());
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
        return zzaf(list) + (size * zzdqf.zzgd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzgg(zzdqyVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdqf.zzgg(list.get(i2).intValue());
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
        return zzag(list) + (size * zzdqf.zzgd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzah(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdqf.zzah(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzai(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdqf.zzm(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaj(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdqf.zzh(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list) {
        int zzhj;
        int zzhj2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzgd = zzdqf.zzgd(i) * size;
        if (list instanceof zzdrn) {
            zzdrn zzdrnVar = (zzdrn) list;
            while (i2 < size) {
                Object zzgq = zzdrnVar.zzgq(i2);
                if (zzgq instanceof zzdpm) {
                    zzhj2 = zzdqf.zzda((zzdpm) zzgq);
                } else {
                    zzhj2 = zzdqf.zzhj((String) zzgq);
                }
                zzgd += zzhj2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzdpm) {
                    zzhj = zzdqf.zzda((zzdpm) obj);
                } else {
                    zzhj = zzdqf.zzhj((String) obj);
                }
                zzgd += zzhj;
                i2++;
            }
        }
        return zzgd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, Object obj, zzdsv zzdsvVar) {
        if (obj instanceof zzdrl) {
            return zzdqf.zza(i, (zzdrl) obj);
        }
        return zzdqf.zzb(i, (zzdsg) obj, zzdsvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list, zzdsv zzdsvVar) {
        int zzb;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgd = zzdqf.zzgd(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzdrl) {
                zzb = zzdqf.zza((zzdrl) obj);
            } else {
                zzb = zzdqf.zzb((zzdsg) obj, zzdsvVar);
            }
            zzgd += zzb;
        }
        return zzgd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzdpm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgd = size * zzdqf.zzgd(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgd += zzdqf.zzda(list.get(i2));
        }
        return zzgd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzdsg> list, zzdsv zzdsvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzdqf.zzc(i, list.get(i3), zzdsvVar);
        }
        return i2;
    }

    public static zzdtn<?, ?> zzbbj() {
        return zzhny;
    }

    public static zzdtn<?, ?> zzbbk() {
        return zzhnz;
    }

    public static zzdtn<?, ?> zzbbl() {
        return zzhoa;
    }

    private static zzdtn<?, ?> zzbk(boolean z) {
        try {
            Class<?> zzbbn = zzbbn();
            if (zzbbn == null) {
                return null;
            }
            return (zzdtn) zzbbn.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbbm() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbbn() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzg(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzdrz zzdrzVar, T t, T t2, long j) {
        zzdtt.zza(t, j, zzdrzVar.zze(zzdtt.zzp(t, j), zzdtt.zzp(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzdqo<FT>> void zza(zzdql<FT> zzdqlVar, T t, T t2) {
        zzdqm<FT> zzai = zzdqlVar.zzai(t2);
        if (zzai.zzhhp.isEmpty()) {
            return;
        }
        zzdqlVar.zzaj(t).zza(zzai);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzdtn<UT, UB> zzdtnVar, T t, T t2) {
        zzdtnVar.zzh(t, zzdtnVar.zzj(zzdtnVar.zzay(t), zzdtnVar.zzay(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzdrc zzdrcVar, UB ub, zzdtn<UT, UB> zzdtnVar) {
        if (zzdrcVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzdrcVar.zzf(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzdtnVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzdrcVar.zzf(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzdtnVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzdtn<UT, UB> zzdtnVar) {
        if (ub == null) {
            ub = zzdtnVar.zzbbw();
        }
        zzdtnVar.zza((zzdtn<UT, UB>) ub, i, i2);
        return ub;
    }
}
