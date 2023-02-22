package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdbi extends zzdbu<T> {
    private boolean zzgpj;
    private final /* synthetic */ Object zzgpk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbi(Object obj) {
        this.zzgpk = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzgpj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final T next() {
        if (this.zzgpj) {
            throw new NoSuchElementException();
        }
        this.zzgpj = true;
        return this.zzgpk;
    }
}
