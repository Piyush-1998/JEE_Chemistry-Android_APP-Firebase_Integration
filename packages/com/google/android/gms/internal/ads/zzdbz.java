package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdbz<V, X extends Throwable> extends zzdbw<V, X, zzdcj<? super X, ? extends V>, zzddi<? extends V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbz(zzddi<? extends V> zzddiVar, Class<X> cls, zzdcj<? super X, ? extends V> zzdcjVar) {
        super(zzddiVar, cls, zzdcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzddi) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        zzdcj zzdcjVar = (zzdcj) obj;
        zzddi zzf = zzdcjVar.zzf(th);
        zzdaq.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdcjVar);
        return zzf;
    }
}
