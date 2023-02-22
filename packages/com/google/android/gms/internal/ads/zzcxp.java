package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxp<E, V> implements zzddi<V> {
    private final E zzgll;
    private final String zzglm;
    private final zzddi<V> zzgln;

    public zzcxp(E e, String str, zzddi<V> zzddiVar) {
        this.zzgll = e;
        this.zzglm = str;
        this.zzgln = zzddiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzgln.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zzgln.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.zzgln.get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzgln.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzgln.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzgln.isDone();
    }

    public final E zzanq() {
        return this.zzgll;
    }

    public final String zzanr() {
        return this.zzglm;
    }

    public final String toString() {
        String str = this.zzglm;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
