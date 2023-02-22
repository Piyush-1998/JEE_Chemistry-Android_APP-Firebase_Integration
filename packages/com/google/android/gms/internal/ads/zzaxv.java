package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzaxv<T> implements zzddi<T> {
    private final zzddt<T> zzdws = zzddt.zzapl();

    public final boolean set(T t) {
        return zzal(this.zzdws.set(t));
    }

    public final boolean setException(Throwable th) {
        return zzal(this.zzdws.setException(th));
    }

    private static boolean zzal(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzq.zzkn().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public void addListener(Runnable runnable, Executor executor) {
        this.zzdws.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zzdws.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.zzdws.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.zzdws.isDone();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.zzdws.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzdws.get(j, timeUnit);
    }
}
