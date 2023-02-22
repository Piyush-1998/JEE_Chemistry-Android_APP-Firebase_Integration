package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzfq extends zzdj<String> implements zzfp, RandomAccess {
    private static final zzfq zzajq;
    private static final zzfp zzajr;
    private final List<Object> zzajs;

    public zzfq() {
        this(10);
    }

    public zzfq(int i) {
        this(new ArrayList(i));
    }

    private zzfq(ArrayList<Object> arrayList) {
        this.zzajs = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzajs.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzrz();
        if (collection instanceof zzfp) {
            collection = ((zzfp) collection).zzvf();
        }
        boolean addAll = this.zzajs.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzrz();
        this.zzajs.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzfp
    public final void zzc(zzdp zzdpVar) {
        zzrz();
        this.zzajs.add(zzdpVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzfp
    public final Object zzbw(int i) {
        return this.zzajs.get(i);
    }

    private static String zzl(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdp) {
            return ((zzdp) obj).zzsa();
        }
        return zzez.zzi((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzfp
    public final List<?> zzvf() {
        return Collections.unmodifiableList(this.zzajs);
    }

    @Override // com.google.android.gms.internal.measurement.zzfp
    public final zzfp zzvg() {
        return zzrx() ? new zzhu(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzrz();
        return zzl(this.zzajs.set(i, (String) obj));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzrz();
        Object remove = this.zzajs.remove(i);
        this.modCount++;
        return zzl(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, com.google.android.gms.internal.measurement.zzff
    public final /* bridge */ /* synthetic */ boolean zzrx() {
        return super.zzrx();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzrz();
        this.zzajs.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    public final /* synthetic */ zzff zzap(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzajs);
        return new zzfq(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzajs.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdp) {
            zzdp zzdpVar = (zzdp) obj;
            String zzsa = zzdpVar.zzsa();
            if (zzdpVar.zzsb()) {
                this.zzajs.set(i, zzsa);
            }
            return zzsa;
        }
        byte[] bArr = (byte[]) obj;
        String zzi = zzez.zzi(bArr);
        if (zzez.zzh(bArr)) {
            this.zzajs.set(i, zzi);
        }
        return zzi;
    }

    static {
        zzfq zzfqVar = new zzfq();
        zzajq = zzfqVar;
        zzfqVar.zzry();
        zzajr = zzajq;
    }
}
