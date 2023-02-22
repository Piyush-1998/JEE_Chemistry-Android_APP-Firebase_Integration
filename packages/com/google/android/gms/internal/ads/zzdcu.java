package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdcu<V> extends zzdaw implements Future<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdaw
    /* renamed from: zzapi */
    public abstract Future<? extends V> zzaoi();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zzaoi().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return zzaoi().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return zzaoi().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return zzaoi().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzaoi().get(j, timeUnit);
    }
}
