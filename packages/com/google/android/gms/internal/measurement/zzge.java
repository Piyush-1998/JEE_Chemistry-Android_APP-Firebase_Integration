package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzge implements zzgb {
    @Override // com.google.android.gms.internal.measurement.zzgb
    public final Map<?, ?> zzm(Object obj) {
        return (zzgc) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final zzfz<?, ?> zzr(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final Map<?, ?> zzn(Object obj) {
        return (zzgc) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final boolean zzo(Object obj) {
        return !((zzgc) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final Object zzp(Object obj) {
        ((zzgc) obj).zzry();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final Object zzq(Object obj) {
        return zzgc.zzvl().zzvm();
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final Object zzb(Object obj, Object obj2) {
        zzgc zzgcVar = (zzgc) obj;
        zzgc zzgcVar2 = (zzgc) obj2;
        if (!zzgcVar2.isEmpty()) {
            if (!zzgcVar.isMutable()) {
                zzgcVar = zzgcVar.zzvm();
            }
            zzgcVar.zza(zzgcVar2);
        }
        return zzgcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final int zzb(int i, Object obj, Object obj2) {
        zzgc zzgcVar = (zzgc) obj;
        if (zzgcVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgcVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
