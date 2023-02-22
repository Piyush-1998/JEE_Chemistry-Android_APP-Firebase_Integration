package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcwl<T> {
    private final zzddl zzfoa;
    private final Deque<zzddi<T>> zzgkp = new LinkedBlockingDeque();
    private final Callable<T> zzgkq;

    public zzcwl(Callable<T> callable, zzddl zzddlVar) {
        this.zzgkq = callable;
        this.zzfoa = zzddlVar;
    }

    public final synchronized void zzdj(int i) {
        int size = i - this.zzgkp.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zzgkp.add(this.zzfoa.zzd(this.zzgkq));
        }
    }

    public final synchronized zzddi<T> zzanf() {
        zzdj(1);
        return this.zzgkp.poll();
    }

    public final synchronized void zza(zzddi<T> zzddiVar) {
        this.zzgkp.addFirst(zzddiVar);
    }
}
