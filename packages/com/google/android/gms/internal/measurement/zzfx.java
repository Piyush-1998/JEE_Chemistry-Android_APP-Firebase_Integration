package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzfx implements zzgf {
    private zzgf[] zzaka;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfx(zzgf... zzgfVarArr) {
        this.zzaka = zzgfVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzgf
    public final boolean zza(Class<?> cls) {
        for (zzgf zzgfVar : this.zzaka) {
            if (zzgfVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgf
    public final zzgg zzb(Class<?> cls) {
        zzgf[] zzgfVarArr;
        for (zzgf zzgfVar : this.zzaka) {
            if (zzgfVar.zza(cls)) {
                return zzgfVar.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
