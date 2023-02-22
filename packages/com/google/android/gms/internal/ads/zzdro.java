package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdro extends zzdpg<String> implements zzdrn, RandomAccess {
    private static final zzdro zzhmi;
    private static final zzdrn zzhmj;
    private final List<Object> zzhmk;

    public zzdro() {
        this(10);
    }

    public zzdro(int i) {
        this(new ArrayList(i));
    }

    private zzdro(ArrayList<Object> arrayList) {
        this.zzhmk = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzhmk.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzaxk();
        if (collection instanceof zzdrn) {
            collection = ((zzdrn) collection).zzban();
        }
        boolean addAll = this.zzhmk.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzaxk();
        this.zzhmk.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final void zzdb(zzdpm zzdpmVar) {
        zzaxk();
        this.zzhmk.add(zzdpmVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final Object zzgq(int i) {
        return this.zzhmk.get(i);
    }

    private static String zzam(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdpm) {
            return ((zzdpm) obj).zzaxn();
        }
        return zzdqx.zzad((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final List<?> zzban() {
        return Collections.unmodifiableList(this.zzhmk);
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final zzdrn zzbao() {
        return zzaxi() ? new zzdts(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzaxk();
        return zzam(this.zzhmk.set(i, (String) obj));
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzaxk();
        Object remove = this.zzhmk.remove(i);
        this.modCount++;
        return zzam(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, com.google.android.gms.internal.ads.zzdrd
    public final /* bridge */ /* synthetic */ boolean zzaxi() {
        return super.zzaxi();
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzaxk();
        this.zzhmk.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzdpg, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdrd
    public final /* synthetic */ zzdrd zzfl(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzhmk);
        return new zzdro(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzhmk.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdpm) {
            zzdpm zzdpmVar = (zzdpm) obj;
            String zzaxn = zzdpmVar.zzaxn();
            if (zzdpmVar.zzaxo()) {
                this.zzhmk.set(i, zzaxn);
            }
            return zzaxn;
        }
        byte[] bArr = (byte[]) obj;
        String zzad = zzdqx.zzad(bArr);
        if (zzdqx.zzac(bArr)) {
            this.zzhmk.set(i, zzad);
        }
        return zzad;
    }

    static {
        zzdro zzdroVar = new zzdro();
        zzhmi = zzdroVar;
        zzdroVar.zzaxj();
        zzhmj = zzhmi;
    }
}
