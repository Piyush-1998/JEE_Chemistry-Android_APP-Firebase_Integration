package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public class zzdta<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzhhq;
    private final int zzhob;
    private List<zzdtf> zzhoc;
    private Map<K, V> zzhod;
    private volatile zzdth zzhoe;
    private Map<K, V> zzhof;
    private volatile zzdtb zzhog;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzdqo<FieldDescriptorType>> zzdta<FieldDescriptorType, Object> zzgy(int i) {
        return new zzdsz(i);
    }

    private zzdta(int i) {
        this.zzhob = i;
        this.zzhoc = Collections.emptyList();
        this.zzhod = Collections.emptyMap();
        this.zzhof = Collections.emptyMap();
    }

    public void zzaxj() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzhhq) {
            return;
        }
        if (this.zzhod.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzhod);
        }
        this.zzhod = unmodifiableMap;
        if (this.zzhof.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzhof);
        }
        this.zzhof = unmodifiableMap2;
        this.zzhhq = true;
    }

    public final boolean isImmutable() {
        return this.zzhhq;
    }

    public final int zzbbo() {
        return this.zzhoc.size();
    }

    public final Map.Entry<K, V> zzgz(int i) {
        return this.zzhoc.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzbbp() {
        if (this.zzhod.isEmpty()) {
            return zzdte.zzbbu();
        }
        return this.zzhod.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzhoc.size() + this.zzhod.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzdta<K, V>) comparable) >= 0 || this.zzhod.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzdta<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzhoc.get(zza).getValue();
        }
        return this.zzhod.get(comparable);
    }

    public final V zza(K k, V v) {
        zzbbr();
        int zza = zza((zzdta<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzhoc.get(zza).setValue(v);
        }
        zzbbr();
        if (this.zzhoc.isEmpty() && !(this.zzhoc instanceof ArrayList)) {
            this.zzhoc = new ArrayList(this.zzhob);
        }
        int i = -(zza + 1);
        if (i >= this.zzhob) {
            return zzbbs().put(k, v);
        }
        int size = this.zzhoc.size();
        int i2 = this.zzhob;
        if (size == i2) {
            zzdtf remove = this.zzhoc.remove(i2 - 1);
            zzbbs().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzhoc.add(i, new zzdtf(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzbbr();
        if (!this.zzhoc.isEmpty()) {
            this.zzhoc.clear();
        }
        if (this.zzhod.isEmpty()) {
            return;
        }
        this.zzhod.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzbbr();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzdta<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzha(zza);
        }
        if (this.zzhod.isEmpty()) {
            return null;
        }
        return this.zzhod.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzha(int i) {
        zzbbr();
        V v = (V) this.zzhoc.remove(i).getValue();
        if (!this.zzhod.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzbbs().entrySet().iterator();
            this.zzhoc.add(new zzdtf(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzhoc.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzhoc.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzhoc.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzhoe == null) {
            this.zzhoe = new zzdth(this, null);
        }
        return this.zzhoe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzbbq() {
        if (this.zzhog == null) {
            this.zzhog = new zzdtb(this, null);
        }
        return this.zzhog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbbr() {
        if (this.zzhhq) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzbbs() {
        zzbbr();
        if (this.zzhod.isEmpty() && !(this.zzhod instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzhod = treeMap;
            this.zzhof = treeMap.descendingMap();
        }
        return (SortedMap) this.zzhod;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdta)) {
            return super.equals(obj);
        }
        zzdta zzdtaVar = (zzdta) obj;
        int size = size();
        if (size != zzdtaVar.size()) {
            return false;
        }
        int zzbbo = zzbbo();
        if (zzbbo != zzdtaVar.zzbbo()) {
            return entrySet().equals(zzdtaVar.entrySet());
        }
        for (int i = 0; i < zzbbo; i++) {
            if (!zzgz(i).equals(zzdtaVar.zzgz(i))) {
                return false;
            }
        }
        if (zzbbo != size) {
            return this.zzhod.equals(zzdtaVar.zzhod);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzbbo = zzbbo();
        int i = 0;
        for (int i2 = 0; i2 < zzbbo; i2++) {
            i += this.zzhoc.get(i2).hashCode();
        }
        return this.zzhod.size() > 0 ? i + this.zzhod.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzdta<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdta(int i, zzdsz zzdszVar) {
        this(i);
    }
}
