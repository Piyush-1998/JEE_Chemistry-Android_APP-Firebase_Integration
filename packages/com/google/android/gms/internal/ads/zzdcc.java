package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdcc<I, O> extends zzdca<I, O, zzdal<? super I, ? extends O>, O> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdcc(zzddi<? extends I> zzddiVar, zzdal<? super I, ? extends O> zzdalVar) {
        super(zzddiVar, zzdalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    final void setResult(@NullableDecl O o) {
        set(o);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    @NullableDecl
    final /* synthetic */ Object zzc(Object obj, @NullableDecl Object obj2) throws Exception {
        return ((zzdal) obj).apply(obj2);
    }
}
