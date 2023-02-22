package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdrs extends zzdrq {
    private static final Class<?> zzhmn = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdrs() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdrq
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdrq
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzdtt.zzp(obj, j);
        if (list instanceof zzdrn) {
            unmodifiableList = ((zzdrn) list).zzbao();
        } else if (zzhmn.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzdss) && (list instanceof zzdrd)) {
                zzdrd zzdrdVar = (zzdrd) list;
                if (zzdrdVar.zzaxi()) {
                    zzdrdVar.zzaxj();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzdtt.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzdro zzdroVar;
        List<L> arrayList;
        List<L> zzd = zzd(obj, j);
        if (zzd.isEmpty()) {
            if (zzd instanceof zzdrn) {
                arrayList = new zzdro(i);
            } else if ((zzd instanceof zzdss) && (zzd instanceof zzdrd)) {
                arrayList = ((zzdrd) zzd).zzfl(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzdtt.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zzhmn.isAssignableFrom(zzd.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzd.size() + i);
            arrayList2.addAll(zzd);
            zzdtt.zza(obj, j, arrayList2);
            zzdroVar = arrayList2;
        } else if (zzd instanceof zzdts) {
            zzdro zzdroVar2 = new zzdro(zzd.size() + i);
            zzdroVar2.addAll((zzdts) zzd);
            zzdtt.zza(obj, j, zzdroVar2);
            zzdroVar = zzdroVar2;
        } else if ((zzd instanceof zzdss) && (zzd instanceof zzdrd)) {
            zzdrd zzdrdVar = (zzdrd) zzd;
            if (zzdrdVar.zzaxi()) {
                return zzd;
            }
            zzdrd zzfl = zzdrdVar.zzfl(zzd.size() + i);
            zzdtt.zza(obj, j, zzfl);
            return zzfl;
        } else {
            return zzd;
        }
        return zzdroVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdrq
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
        zzdtt.zza(obj, j, zzd);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzdtt.zzp(obj, j);
    }
}
