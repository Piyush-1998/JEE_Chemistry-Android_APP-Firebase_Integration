package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public interface zzddi<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
