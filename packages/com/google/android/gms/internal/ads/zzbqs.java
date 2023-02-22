package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqs<T> {
    public Executor executor;
    public T zzfhz;

    public static <T> zzbqs<T> zzb(T t, Executor executor) {
        return new zzbqs<>(t, executor);
    }

    public zzbqs(T t, Executor executor) {
        this.zzfhz = t;
        this.executor = executor;
    }
}
