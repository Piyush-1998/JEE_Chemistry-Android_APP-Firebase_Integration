package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzdr implements Comparator<zzdp> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdp zzdpVar, zzdp zzdpVar2) {
        int zza;
        int zza2;
        zzdp zzdpVar3 = zzdpVar;
        zzdp zzdpVar4 = zzdpVar2;
        zzdu zzduVar = (zzdu) zzdpVar3.iterator();
        zzdu zzduVar2 = (zzdu) zzdpVar4.iterator();
        while (zzduVar.hasNext() && zzduVar2.hasNext()) {
            zza = zzdp.zza(zzduVar.nextByte());
            zza2 = zzdp.zza(zzduVar2.nextByte());
            int compare = Integer.compare(zza, zza2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzdpVar3.size(), zzdpVar4.size());
    }
}
