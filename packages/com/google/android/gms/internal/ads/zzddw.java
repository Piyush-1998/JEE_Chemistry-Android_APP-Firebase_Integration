package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzddw<V> extends zzdcv<V> implements RunnableFuture<V> {
    private volatile zzddh<?> zzgsf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzddw<V> zze(Callable<V> callable) {
        return new zzddw<>(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzddw<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzddw<>(Executors.callable(runnable, v));
    }

    private zzddw(Callable<V> callable) {
        this.zzgsf = new zzddz(this, callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzddh<?> zzddhVar = this.zzgsf;
        if (zzddhVar != null) {
            zzddhVar.run();
        }
        this.zzgsf = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final void afterDone() {
        zzddh<?> zzddhVar;
        super.afterDone();
        if (wasInterrupted() && (zzddhVar = this.zzgsf) != null) {
            zzddhVar.interruptTask();
        }
        this.zzgsf = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final String pendingToString() {
        zzddh<?> zzddhVar = this.zzgsf;
        if (zzddhVar != null) {
            String valueOf = String.valueOf(zzddhVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.pendingToString();
    }
}
