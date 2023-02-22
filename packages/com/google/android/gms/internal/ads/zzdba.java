package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdba<E> {
    public abstract zzdba<E> zzab(E e);

    public zzdba<E> zze(Iterable<? extends E> iterable) {
        for (E e : iterable) {
            zzab(e);
        }
        return this;
    }

    public zzdba<E> zza(Iterator<? extends E> it) {
        while (it.hasNext()) {
            zzab(it.next());
        }
        return this;
    }
}
