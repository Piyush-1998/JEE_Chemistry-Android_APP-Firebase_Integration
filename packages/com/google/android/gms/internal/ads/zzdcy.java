package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdde;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdcy extends zzddf {
    public static <V> zzddi<V> zzah(@NullableDecl V v) {
        if (v == null) {
            return zzdde.zza.zzgrp;
        }
        return new zzdde.zza(v);
    }

    public static <V> zzddi<V> zzi(Throwable th) {
        zzdaq.checkNotNull(th);
        return new zzdde.zzb(th);
    }

    public static <V, X extends Throwable> zzddi<V> zzb(zzddi<? extends V> zzddiVar, Class<X> cls, zzdcj<? super X, ? extends V> zzdcjVar, Executor executor) {
        return zzdbw.zza(zzddiVar, cls, zzdcjVar, executor);
    }

    public static <V> zzddi<V> zza(zzddi<V> zzddiVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzddiVar.isDone() ? zzddiVar : zzdds.zzb(zzddiVar, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> zzddi<O> zzb(zzddi<I> zzddiVar, zzdcj<? super I, ? extends O> zzdcjVar, Executor executor) {
        return zzdca.zza(zzddiVar, zzdcjVar, executor);
    }

    public static <I, O> zzddi<O> zzb(zzddi<I> zzddiVar, zzdal<? super I, ? extends O> zzdalVar, Executor executor) {
        return zzdca.zza(zzddiVar, zzdalVar, executor);
    }

    public static <V> zzddi<List<V>> zzg(Iterable<? extends zzddi<? extends V>> iterable) {
        return new zzdck(zzdbd.zzf(iterable), true);
    }

    @SafeVarargs
    public static <V> zzddd<V> zza(zzddi<? extends V>... zzddiVarArr) {
        return new zzddd<>(false, zzdbd.zzb(zzddiVarArr), null);
    }

    public static <V> zzddd<V> zzh(Iterable<? extends zzddi<? extends V>> iterable) {
        return new zzddd<>(false, zzdbd.zzf(iterable), null);
    }

    public static <V> void zza(zzddi<V> zzddiVar, zzdcz<? super V> zzdczVar, Executor executor) {
        zzdaq.checkNotNull(zzdczVar);
        zzddiVar.addListener(new zzdda(zzddiVar, zzdczVar), executor);
    }

    public static <V> V zzb(Future<V> future) throws ExecutionException {
        if (!future.isDone()) {
            throw new IllegalStateException(zzdas.zzb("Future was expected to be done: %s", future));
        }
        return (V) zzdeb.zza(future);
    }

    public static <V> V zzc(Future<V> future) {
        zzdaq.checkNotNull(future);
        try {
            return (V) zzdeb.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzdct((Error) cause);
            }
            throw new zzddy(cause);
        }
    }
}
