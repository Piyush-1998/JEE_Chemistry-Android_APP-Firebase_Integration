package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdca<I, O, F, T> extends zzdcv<O> implements Runnable {
    @NullableDecl
    private zzddi<? extends I> zzgpz;
    @NullableDecl
    private F zzgqq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzddi<O> zza(zzddi<I> zzddiVar, zzdcj<? super I, ? extends O> zzdcjVar, Executor executor) {
        zzdaq.checkNotNull(executor);
        zzdcd zzdcdVar = new zzdcd(zzddiVar, zzdcjVar);
        zzddiVar.addListener(zzdcdVar, zzddk.zza(executor, zzdcdVar));
        return zzdcdVar;
    }

    abstract void setResult(@NullableDecl T t);

    @NullableDecl
    abstract T zzc(F f, @NullableDecl I i) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzddi<O> zza(zzddi<I> zzddiVar, zzdal<? super I, ? extends O> zzdalVar, Executor executor) {
        zzdaq.checkNotNull(zzdalVar);
        zzdcc zzdccVar = new zzdcc(zzddiVar, zzdalVar);
        zzddiVar.addListener(zzdccVar, zzddk.zza(executor, zzdccVar));
        return zzdccVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdca(zzddi<? extends I> zzddiVar, F f) {
        this.zzgpz = (zzddi) zzdaq.checkNotNull(zzddiVar);
        this.zzgqq = (F) zzdaq.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzddi<? extends I> zzddiVar = this.zzgpz;
        F f = this.zzgqq;
        if ((isCancelled() | (zzddiVar == null)) || (f == null)) {
            return;
        }
        this.zzgpz = null;
        if (zzddiVar.isCancelled()) {
            setFuture(zzddiVar);
            return;
        }
        try {
            try {
                Object zzc = zzc(f, zzdcy.zzb(zzddiVar));
                this.zzgqq = null;
                setResult(zzc);
            } catch (Throwable th) {
                try {
                    setException(th);
                } finally {
                    this.zzgqq = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            setException(e2);
        } catch (ExecutionException e3) {
            setException(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzgpz);
        this.zzgpz = null;
        this.zzgqq = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final String pendingToString() {
        String str;
        zzddi<? extends I> zzddiVar = this.zzgpz;
        F f = this.zzgqq;
        String pendingToString = super.pendingToString();
        if (zzddiVar != null) {
            String valueOf = String.valueOf(zzddiVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f == null) {
            if (pendingToString != null) {
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(pendingToString);
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            return null;
        }
        String valueOf4 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf4).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf4);
        sb2.append("]");
        return sb2.toString();
    }
}
