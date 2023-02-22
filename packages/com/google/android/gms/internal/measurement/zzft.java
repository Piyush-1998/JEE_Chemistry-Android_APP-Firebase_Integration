package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zzft extends zzfs {
    private zzft() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfs
    public final <L> List<L> zza(Object obj, long j) {
        zzff zzc = zzc(obj, j);
        if (zzc.zzrx()) {
            return zzc;
        }
        int size = zzc.size();
        zzff zzap = zzc.zzap(size == 0 ? 10 : size << 1);
        zzhv.zza(obj, j, zzap);
        return zzap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfs
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzry();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.measurement.zzff] */
    @Override // com.google.android.gms.internal.measurement.zzfs
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzff<E> zzc = zzc(obj, j);
        zzff<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzff<E> zzffVar = zzc;
        zzffVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzrx = zzc.zzrx();
            zzff<E> zzffVar2 = zzc;
            if (!zzrx) {
                zzffVar2 = zzc.zzap(size2 + size);
            }
            zzffVar2.addAll(zzc2);
            zzffVar = zzffVar2;
        }
        if (size > 0) {
            zzc2 = zzffVar;
        }
        zzhv.zza(obj, j, zzc2);
    }

    private static <E> zzff<E> zzc(Object obj, long j) {
        return (zzff) zzhv.zzp(obj, j);
    }
}
