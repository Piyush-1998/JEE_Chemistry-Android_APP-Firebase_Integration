package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
class zzdbb<E> extends zzdba<E> {
    int size;
    Object[] zzgoz;
    boolean zzgpa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbb(int i) {
        zzdax.zzf(i, "initialCapacity");
        this.zzgoz = new Object[i];
        this.size = 0;
    }

    private final void zzdq(int i) {
        Object[] objArr = this.zzgoz;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                i2 = Integer.highestOneBit(i - 1) << 1;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.zzgoz = Arrays.copyOf(objArr, i2);
            this.zzgpa = false;
        } else if (this.zzgpa) {
            this.zzgoz = (Object[]) objArr.clone();
            this.zzgpa = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    /* renamed from: zzac */
    public zzdbb<E> zzab(E e) {
        zzdaq.checkNotNull(e);
        zzdq(this.size + 1);
        Object[] objArr = this.zzgoz;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = e;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public zzdba<E> zze(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzdq(this.size + collection.size());
            if (collection instanceof zzday) {
                this.size = ((zzday) collection).zza(this.zzgoz, this.size);
                return this;
            }
        }
        super.zze(iterable);
        return this;
    }
}
