package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzgw<E> extends zzdj<E> {
    private static final zzgw<Object> zzalf;
    private final List<E> zzajs;

    public static <E> zzgw<E> zzwb() {
        return (zzgw<E>) zzalf;
    }

    zzgw() {
        this(new ArrayList(10));
    }

    private zzgw(List<E> list) {
        this.zzajs = list;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        zzrz();
        this.zzajs.add(i, e);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.zzajs.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzrz();
        E remove = this.zzajs.remove(i);
        this.modCount++;
        return remove;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzrz();
        E e2 = this.zzajs.set(i, e);
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzajs.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    public final /* synthetic */ zzff zzap(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzajs);
        return new zzgw(arrayList);
    }

    static {
        zzgw<Object> zzgwVar = new zzgw<>(new ArrayList(0));
        zzalf = zzgwVar;
        zzgwVar.zzry();
    }
}
