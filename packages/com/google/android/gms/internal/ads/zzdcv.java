package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdby;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdcv<V> extends zzdcs<V> implements zzdby.zzg<V> {
    @Override // com.google.android.gms.internal.ads.zzdby, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (V) super.get(j, timeUnit);
    }
}
