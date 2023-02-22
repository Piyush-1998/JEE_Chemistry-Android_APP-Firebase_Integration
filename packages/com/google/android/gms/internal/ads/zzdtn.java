package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
abstract class zzdtn<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzdpm zzdpmVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzduk zzdukVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzdsw zzdswVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzak(Object obj);

    abstract T zzaq(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzau(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzay(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzaz(Object obj);

    abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzba(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzbbw();

    abstract void zzc(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t, zzduk zzdukVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzh(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzi(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzj(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzdsw zzdswVar) throws IOException {
        int tag = zzdswVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zzdtn<T, B>) b, i, zzdswVar.zzaxw());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzdswVar.zzaxy());
            return true;
        } else if (i2 == 2) {
            zza((zzdtn<T, B>) b, i, zzdswVar.zzayc());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b, i, zzdswVar.zzaxz());
                    return true;
                }
                throw zzdrg.zzbah();
            }
            return false;
        } else {
            B zzbbw = zzbbw();
            int i3 = 4 | (i << 3);
            while (zzdswVar.zzays() != Integer.MAX_VALUE && zza((zzdtn<T, B>) zzbbw, zzdswVar)) {
            }
            if (i3 != zzdswVar.getTag()) {
                throw zzdrg.zzbag();
            }
            zza((zzdtn<T, B>) b, i, (int) zzaq(zzbbw));
            return true;
        }
    }
}
