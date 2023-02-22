package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdrr extends zzdrq {
    private zzdrr() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdrq
    public final <L> List<L> zza(Object obj, long j) {
        zzdrd zzc = zzc(obj, j);
        if (zzc.zzaxi()) {
            return zzc;
        }
        int size = zzc.size();
        zzdrd zzfl = zzc.zzfl(size == 0 ? 10 : size << 1);
        zzdtt.zza(obj, j, zzfl);
        return zzfl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdrq
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzaxj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzdrd] */
    @Override // com.google.android.gms.internal.ads.zzdrq
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzdrd<E> zzc = zzc(obj, j);
        zzdrd<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzdrd<E> zzdrdVar = zzc;
        zzdrdVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzaxi = zzc.zzaxi();
            zzdrd<E> zzdrdVar2 = zzc;
            if (!zzaxi) {
                zzdrdVar2 = zzc.zzfl(size2 + size);
            }
            zzdrdVar2.addAll(zzc2);
            zzdrdVar = zzdrdVar2;
        }
        if (size > 0) {
            zzc2 = zzdrdVar;
        }
        zzdtt.zza(obj, j, zzc2);
    }

    private static <E> zzdrd<E> zzc(Object obj, long j) {
        return (zzdrd) zzdtt.zzp(obj, j);
    }
}
