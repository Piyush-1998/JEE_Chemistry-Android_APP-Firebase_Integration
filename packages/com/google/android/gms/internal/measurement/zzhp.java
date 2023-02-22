package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class zzhp<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzdp zzdpVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzim zzimVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzgy zzgyVar);

    abstract void zzb(B b, int i, long j);

    abstract void zzc(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t, zzim zzimVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zze(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzg(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzj(Object obj);

    abstract T zzp(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzt(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzwp();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzx(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzy(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzz(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzgy zzgyVar) throws IOException {
        int tag = zzgyVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zzhp<T, B>) b, i, zzgyVar.zzsi());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzgyVar.zzsk());
            return true;
        } else if (i2 == 2) {
            zza((zzhp<T, B>) b, i, zzgyVar.zzso());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b, i, zzgyVar.zzsl());
                    return true;
                }
                throw zzfi.zzuy();
            }
            return false;
        } else {
            B zzwp = zzwp();
            int i3 = 4 | (i << 3);
            while (zzgyVar.zzsy() != Integer.MAX_VALUE && zza((zzhp<T, B>) zzwp, zzgyVar)) {
            }
            if (i3 != zzgyVar.getTag()) {
                throw zzfi.zzux();
            }
            zza((zzhp<T, B>) b, i, (int) zzp(zzwp));
            return true;
        }
    }
}
