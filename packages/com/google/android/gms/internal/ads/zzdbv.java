package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdbv<E> extends zzdbg<E> {
    private final transient E zzgpx;
    private transient int zzgpy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbv(E e) {
        this.zzgpx = (E) zzdaq.checkNotNull(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final boolean zzaoo() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbv(E e, int i) {
        this.zzgpx = e;
        this.zzgpy = i;
    }

    @Override // com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zzgpx.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final zzdbu<E> zzaoj() {
        return new zzdbi(this.zzgpx);
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    final zzdbd<E> zzaor() {
        return zzdbd.zzad(this.zzgpx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zzgpx;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdbg, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzgpy;
        if (i == 0) {
            int hashCode = this.zzgpx.hashCode();
            this.zzgpy = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    final boolean zzaoq() {
        return this.zzgpy != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zzgpx.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdbg, com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
