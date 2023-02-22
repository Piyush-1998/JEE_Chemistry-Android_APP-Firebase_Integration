package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzddr<V> extends zzdcw<V> implements zzddi<V>, ScheduledFuture<V> {
    private final ScheduledFuture<?> zzgsb;

    public zzddr(zzddi<V> zzddiVar, ScheduledFuture<?> scheduledFuture) {
        super(zzddiVar);
        this.zzgsb = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzdcu, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.zzgsb.cancel(z);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zzgsb.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return this.zzgsb.compareTo(delayed);
    }
}
