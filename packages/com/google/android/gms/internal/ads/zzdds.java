package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdds<V> extends zzdcv<V> {
    @NullableDecl
    private zzddi<V> zzgsc;
    @NullableDecl
    private ScheduledFuture<?> zzgsd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzddi<V> zzb(zzddi<V> zzddiVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdds zzddsVar = new zzdds(zzddiVar);
        zzddu zzdduVar = new zzddu(zzddsVar);
        zzddsVar.zzgsd = scheduledExecutorService.schedule(zzdduVar, j, timeUnit);
        zzddiVar.addListener(zzdduVar, zzdcq.INSTANCE);
        return zzddsVar;
    }

    private zzdds(zzddi<V> zzddiVar) {
        this.zzgsc = (zzddi) zzdaq.checkNotNull(zzddiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final String pendingToString() {
        zzddi<V> zzddiVar = this.zzgsc;
        ScheduledFuture<?> scheduledFuture = this.zzgsd;
        if (zzddiVar != null) {
            String valueOf = String.valueOf(zzddiVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("]");
            String sb2 = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    String valueOf2 = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                    sb3.append(valueOf2);
                    sb3.append(", remaining delay=[");
                    sb3.append(delay);
                    sb3.append(" ms]");
                    return sb3.toString();
                }
                return sb2;
            }
            return sb2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzgsc);
        ScheduledFuture<?> scheduledFuture = this.zzgsd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzgsc = null;
        this.zzgsd = null;
    }
}
