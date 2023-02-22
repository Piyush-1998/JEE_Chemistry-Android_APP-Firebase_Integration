package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdcd<I, O> extends zzdca<I, O, zzdcj<? super I, ? extends O>, zzddi<? extends O>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdcd(zzddi<? extends I> zzddiVar, zzdcj<? super I, ? extends O> zzdcjVar) {
        super(zzddiVar, zzdcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzddi) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    final /* synthetic */ Object zzc(Object obj, @NullableDecl Object obj2) throws Exception {
        zzdcj zzdcjVar = (zzdcj) obj;
        zzddi<O> zzf = zzdcjVar.zzf(obj2);
        zzdaq.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdcjVar);
        return zzf;
    }
}
