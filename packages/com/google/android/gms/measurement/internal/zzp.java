package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzp extends zzjh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzjg zzjgVar) {
        super(zzjgVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    protected final boolean zzbk() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x077c  */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzbs.zza> zza(java.lang.String r86, java.util.List<com.google.android.gms.internal.measurement.zzbs.zzc> r87, java.util.List<com.google.android.gms.internal.measurement.zzbs.zzk> r88) {
        /*
            Method dump skipped, instructions count: 4147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzp.zza(java.lang.String, java.util.List, java.util.List):java.util.List");
    }

    private final Boolean zza(zzbk.zza zzaVar, String str, List<zzbs.zze> list, long j) {
        Boolean zza;
        if (zzaVar.zzkd()) {
            Boolean zza2 = zza(j, zzaVar.zzke());
            if (zza2 == null) {
                return null;
            }
            if (!zza2.booleanValue()) {
                return false;
            }
        }
        HashSet hashSet = new HashSet();
        for (zzbk.zzb zzbVar : zzaVar.zzkc()) {
            if (zzbVar.zzkr().isEmpty()) {
                zzab().zzgn().zza("null or empty param name in filter. event", zzy().zzaj(str));
                return null;
            }
            hashSet.add(zzbVar.zzkr());
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zzbs.zze zzeVar : list) {
            if (hashSet.contains(zzeVar.getName())) {
                if (zzeVar.zzna()) {
                    arrayMap.put(zzeVar.getName(), zzeVar.zzna() ? Long.valueOf(zzeVar.zznb()) : null);
                } else if (zzeVar.zznd()) {
                    arrayMap.put(zzeVar.getName(), zzeVar.zznd() ? Double.valueOf(zzeVar.zzne()) : null);
                } else if (zzeVar.zzmx()) {
                    arrayMap.put(zzeVar.getName(), zzeVar.zzmy());
                } else {
                    zzab().zzgn().zza("Unknown value for param. event, param", zzy().zzaj(str), zzy().zzak(zzeVar.getName()));
                    return null;
                }
            }
        }
        Iterator<zzbk.zzb> it = zzaVar.zzkc().iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                zzbk.zzb next = it.next();
                z = (next.zzkp() && next.zzkq()) ? false : false;
                String zzkr = next.zzkr();
                if (zzkr.isEmpty()) {
                    zzab().zzgn().zza("Event has empty param name. event", zzy().zzaj(str));
                    return null;
                }
                V v = arrayMap.get(zzkr);
                if (v instanceof Long) {
                    if (!next.zzkn()) {
                        zzab().zzgn().zza("No number filter for long param. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                        return null;
                    }
                    Boolean zza3 = zza(((Long) v).longValue(), next.zzko());
                    if (zza3 == null) {
                        return null;
                    }
                    if (zza3.booleanValue() == z) {
                        return false;
                    }
                } else if (v instanceof Double) {
                    if (!next.zzkn()) {
                        zzab().zzgn().zza("No number filter for double param. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                        return null;
                    }
                    Boolean zza4 = zza(((Double) v).doubleValue(), next.zzko());
                    if (zza4 == null) {
                        return null;
                    }
                    if (zza4.booleanValue() == z) {
                        return false;
                    }
                } else if (v instanceof String) {
                    if (next.zzkl()) {
                        zza = zza((String) v, next.zzkm());
                    } else if (next.zzkn()) {
                        String str2 = (String) v;
                        if (zzjo.zzbj(str2)) {
                            zza = zza(str2, next.zzko());
                        } else {
                            zzab().zzgn().zza("Invalid param value for number filter. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                            return null;
                        }
                    } else {
                        zzab().zzgn().zza("No filter for String param. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                        return null;
                    }
                    if (zza == null) {
                        return null;
                    }
                    if (zza.booleanValue() == z) {
                        return false;
                    }
                } else {
                    if (v == 0) {
                        zzab().zzgs().zza("Missing param for filter. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                        return false;
                    }
                    zzab().zzgn().zza("Unknown param type. event, param", zzy().zzaj(str), zzy().zzak(zzkr));
                    return null;
                }
            } else {
                return true;
            }
        }
    }

    private final Boolean zza(zzbk.zzd zzdVar, zzbs.zzk zzkVar) {
        zzbk.zzb zzli = zzdVar.zzli();
        boolean zzkq = zzli.zzkq();
        if (zzkVar.zzna()) {
            if (!zzli.zzkn()) {
                zzab().zzgn().zza("No number filter for long property. property", zzy().zzal(zzkVar.getName()));
                return null;
            }
            return zza(zza(zzkVar.zznb(), zzli.zzko()), zzkq);
        } else if (zzkVar.zznd()) {
            if (!zzli.zzkn()) {
                zzab().zzgn().zza("No number filter for double property. property", zzy().zzal(zzkVar.getName()));
                return null;
            }
            return zza(zza(zzkVar.zzne(), zzli.zzko()), zzkq);
        } else if (zzkVar.zzmx()) {
            if (!zzli.zzkl()) {
                if (!zzli.zzkn()) {
                    zzab().zzgn().zza("No string or number filter defined. property", zzy().zzal(zzkVar.getName()));
                } else if (zzjo.zzbj(zzkVar.zzmy())) {
                    return zza(zza(zzkVar.zzmy(), zzli.zzko()), zzkq);
                } else {
                    zzab().zzgn().zza("Invalid user property value for Numeric number filter. property, value", zzy().zzal(zzkVar.getName()), zzkVar.zzmy());
                }
                return null;
            }
            return zza(zza(zzkVar.zzmy(), zzli.zzkm()), zzkq);
        } else {
            zzab().zzgn().zza("User property has no value, property", zzy().zzal(zzkVar.getName()));
            return null;
        }
    }

    private static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    private final Boolean zza(String str, zzbk.zze zzeVar) {
        String zzln;
        List<String> list;
        Preconditions.checkNotNull(zzeVar);
        if (str == null || !zzeVar.zzlk() || zzeVar.zzll() == zzbk.zze.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (zzeVar.zzll() == zzbk.zze.zza.IN_LIST) {
            if (zzeVar.zzlr() == 0) {
                return null;
            }
        } else if (!zzeVar.zzlm()) {
            return null;
        }
        zzbk.zze.zza zzll = zzeVar.zzll();
        boolean zzlp = zzeVar.zzlp();
        if (zzlp || zzll == zzbk.zze.zza.REGEXP || zzll == zzbk.zze.zza.IN_LIST) {
            zzln = zzeVar.zzln();
        } else {
            zzln = zzeVar.zzln().toUpperCase(Locale.ENGLISH);
        }
        String str2 = zzln;
        if (zzeVar.zzlr() == 0) {
            list = null;
        } else {
            List<String> zzlq = zzeVar.zzlq();
            if (!zzlp) {
                ArrayList arrayList = new ArrayList(zzlq.size());
                for (String str3 : zzlq) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                zzlq = Collections.unmodifiableList(arrayList);
            }
            list = zzlq;
        }
        return zza(str, zzll, zzlp, str2, list, zzll == zzbk.zze.zza.REGEXP ? str2 : null);
    }

    private final Boolean zza(String str, zzbk.zze.zza zzaVar, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (zzaVar == zzbk.zze.zza.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzaVar != zzbk.zze.zza.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzo.zzdu[zzaVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    zzab().zzgn().zza("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    private final Boolean zza(long j, zzbk.zzc zzcVar) {
        try {
            return zza(new BigDecimal(j), zzcVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(double d, zzbk.zzc zzcVar) {
        try {
            return zza(new BigDecimal(d), zzcVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(String str, zzbk.zzc zzcVar) {
        if (zzjo.zzbj(str)) {
            try {
                return zza(new BigDecimal(str), zzcVar, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (r2 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Boolean zza(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.zzbk.zzc r10, double r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzp.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzbk$zzc, double):java.lang.Boolean");
    }

    private static List<zzbs.zzb> zza(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            arrayList.add((zzbs.zzb) ((com.google.android.gms.internal.measurement.zzey) zzbs.zzb.zzmh().zzk(intValue).zzae(map.get(Integer.valueOf(intValue)).longValue()).zzug()));
        }
        return arrayList;
    }

    private static void zza(Map<Integer, Long> map, int i, long j) {
        Long l = map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    private static void zzb(Map<Integer, List<Long>> map, int i, long j) {
        List<Long> list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }
}
