package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzfu extends zzfs {
    private static final Class<?> zzajv = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfu() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfs
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfs
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzhv.zzp(obj, j);
        if (list instanceof zzfp) {
            unmodifiableList = ((zzfp) list).zzvg();
        } else if (zzajv.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgu) && (list instanceof zzff)) {
                zzff zzffVar = (zzff) list;
                if (zzffVar.zzrx()) {
                    zzffVar.zzry();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhv.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzfq zzfqVar;
        List<L> arrayList;
        List<L> zzd = zzd(obj, j);
        if (zzd.isEmpty()) {
            if (zzd instanceof zzfp) {
                arrayList = new zzfq(i);
            } else if ((zzd instanceof zzgu) && (zzd instanceof zzff)) {
                arrayList = ((zzff) zzd).zzap(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzhv.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zzajv.isAssignableFrom(zzd.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzd.size() + i);
            arrayList2.addAll(zzd);
            zzhv.zza(obj, j, arrayList2);
            zzfqVar = arrayList2;
        } else if (zzd instanceof zzhu) {
            zzfq zzfqVar2 = new zzfq(zzd.size() + i);
            zzfqVar2.addAll((zzhu) zzd);
            zzhv.zza(obj, j, zzfqVar2);
            zzfqVar = zzfqVar2;
        } else if ((zzd instanceof zzgu) && (zzd instanceof zzff)) {
            zzff zzffVar = (zzff) zzd;
            if (zzffVar.zzrx()) {
                return zzd;
            }
            zzff zzap = zzffVar.zzap(zzd.size() + i);
            zzhv.zza(obj, j, zzap);
            return zzap;
        } else {
            return zzd;
        }
        return zzfqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfs
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzd = zzd(obj2, j);
        List zza = zza(obj, j, zzd.size());
        int size = zza.size();
        int size2 = zzd.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzd);
        }
        if (size > 0) {
            zzd = zza;
        }
        zzhv.zza(obj, j, zzd);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzhv.zzp(obj, j);
    }
}
