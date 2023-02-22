package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdbw<V, X extends Throwable, F, T> extends zzdcv<V> implements Runnable {
    @NullableDecl
    private zzddi<? extends V> zzgpz;
    @NullableDecl
    private Class<X> zzgqa;
    @NullableDecl
    private F zzgqb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <X extends Throwable, V> zzddi<V> zza(zzddi<? extends V> zzddiVar, Class<X> cls, zzdcj<? super X, ? extends V> zzdcjVar, Executor executor) {
        zzdbz zzdbzVar = new zzdbz(zzddiVar, cls, zzdcjVar);
        zzddiVar.addListener(zzdbzVar, zzddk.zza(executor, zzdbzVar));
        return zzdbzVar;
    }

    abstract void setResult(@NullableDecl T t);

    @NullableDecl
    abstract T zza(F f, X x) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbw(zzddi<? extends V> zzddiVar, Class<X> cls, F f) {
        this.zzgpz = (zzddi) zzdaq.checkNotNull(zzddiVar);
        this.zzgqa = (Class) zzdaq.checkNotNull(cls);
        this.zzgqb = (F) zzdaq.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzddi<? extends V> r0 = r7.zzgpz
            java.lang.Class<X extends java.lang.Throwable> r1 = r7.zzgqa
            F r2 = r7.zzgqb
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            boolean r4 = r7.isCancelled()
            r3 = r3 | r4
            if (r3 == 0) goto L20
            return
        L20:
            r3 = 0
            r7.zzgpz = r3
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzdcy.zzb(r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.ExecutionException -> L2c
            r5 = r4
            r4 = r3
            goto L38
        L2a:
            r4 = move-exception
            goto L37
        L2c:
            r4 = move-exception
            java.lang.Throwable r4 = r4.getCause()
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzdaq.checkNotNull(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
        L37:
            r5 = r3
        L38:
            if (r4 != 0) goto L3e
            r7.set(r5)
            return
        L3e:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L48
            r7.setFuture(r0)
            return
        L48:
            java.lang.Object r0 = r7.zza(r2, r4)     // Catch: java.lang.Throwable -> L54
            r7.zzgqa = r3
            r7.zzgqb = r3
            r7.setResult(r0)
            return
        L54:
            r0 = move-exception
            r7.setException(r0)     // Catch: java.lang.Throwable -> L5d
            r7.zzgqa = r3
            r7.zzgqb = r3
            return
        L5d:
            r0 = move-exception
            r7.zzgqa = r3
            r7.zzgqb = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdbw.run():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final String pendingToString() {
        String str;
        zzddi<? extends V> zzddiVar = this.zzgpz;
        Class<X> cls = this.zzgqa;
        F f = this.zzgqb;
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
        if (cls == null || f == null) {
            if (pendingToString != null) {
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(pendingToString);
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            return null;
        }
        String valueOf4 = String.valueOf(cls);
        String valueOf5 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(valueOf4);
        sb2.append("], fallback=[");
        sb2.append(valueOf5);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdby
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzgpz);
        this.zzgpz = null;
        this.zzgqa = null;
        this.zzgqb = null;
    }
}
