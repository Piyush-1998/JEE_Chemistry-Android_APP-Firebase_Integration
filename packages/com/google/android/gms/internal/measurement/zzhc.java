package com.google.android.gms.internal.measurement;

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
/* loaded from: classes.dex */
public class zzhc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzaey;
    private final int zzalk;
    private List<zzhh> zzall;
    private Map<K, V> zzalm;
    private volatile zzhj zzaln;
    private Map<K, V> zzalo;
    private volatile zzhd zzalp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzeq<FieldDescriptorType>> zzhc<FieldDescriptorType, Object> zzce(int i) {
        return new zzhb(i);
    }

    private zzhc(int i) {
        this.zzalk = i;
        this.zzall = Collections.emptyList();
        this.zzalm = Collections.emptyMap();
        this.zzalo = Collections.emptyMap();
    }

    public void zzry() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzaey) {
            return;
        }
        if (this.zzalm.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzalm);
        }
        this.zzalm = unmodifiableMap;
        if (this.zzalo.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzalo);
        }
        this.zzalo = unmodifiableMap2;
        this.zzaey = true;
    }

    public final boolean isImmutable() {
        return this.zzaey;
    }

    public final int zzwh() {
        return this.zzall.size();
    }

    public final Map.Entry<K, V> zzcf(int i) {
        return this.zzall.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzwi() {
        if (this.zzalm.isEmpty()) {
            return zzhg.zzwn();
        }
        return this.zzalm.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzall.size() + this.zzalm.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzhc<K, V>) comparable) >= 0 || this.zzalm.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzhc<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzall.get(zza).getValue();
        }
        return this.zzalm.get(comparable);
    }

    public final V zza(K k, V v) {
        zzwk();
        int zza = zza((zzhc<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzall.get(zza).setValue(v);
        }
        zzwk();
        if (this.zzall.isEmpty() && !(this.zzall instanceof ArrayList)) {
            this.zzall = new ArrayList(this.zzalk);
        }
        int i = -(zza + 1);
        if (i >= this.zzalk) {
            return zzwl().put(k, v);
        }
        int size = this.zzall.size();
        int i2 = this.zzalk;
        if (size == i2) {
            zzhh remove = this.zzall.remove(i2 - 1);
            zzwl().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzall.add(i, new zzhh(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzwk();
        if (!this.zzall.isEmpty()) {
            this.zzall.clear();
        }
        if (this.zzalm.isEmpty()) {
            return;
        }
        this.zzalm.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzwk();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzhc<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzcg(zza);
        }
        if (this.zzalm.isEmpty()) {
            return null;
        }
        return this.zzalm.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzcg(int i) {
        zzwk();
        V v = (V) this.zzall.remove(i).getValue();
        if (!this.zzalm.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzwl().entrySet().iterator();
            this.zzall.add(new zzhh(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzall.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzall.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.zzall.get(i2).getKey());
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
        if (this.zzaln == null) {
            this.zzaln = new zzhj(this, null);
        }
        return this.zzaln;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzwj() {
        if (this.zzalp == null) {
            this.zzalp = new zzhd(this, null);
        }
        return this.zzalp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzwk() {
        if (this.zzaey) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzwl() {
        zzwk();
        if (this.zzalm.isEmpty() && !(this.zzalm instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzalm = treeMap;
            this.zzalo = treeMap.descendingMap();
        }
        return (SortedMap) this.zzalm;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhc)) {
            return super.equals(obj);
        }
        zzhc zzhcVar = (zzhc) obj;
        int size = size();
        if (size != zzhcVar.size()) {
            return false;
        }
        int zzwh = zzwh();
        if (zzwh != zzhcVar.zzwh()) {
            return entrySet().equals(zzhcVar.entrySet());
        }
        for (int i = 0; i < zzwh; i++) {
            if (!zzcf(i).equals(zzhcVar.zzcf(i))) {
                return false;
            }
        }
        if (zzwh != size) {
            return this.zzalm.equals(zzhcVar.zzalm);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzwh = zzwh();
        int i = 0;
        for (int i2 = 0; i2 < zzwh; i2++) {
            i += this.zzall.get(i2).hashCode();
        }
        return this.zzalm.size() > 0 ? i + this.zzalm.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzhc<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhc(int i, zzhb zzhbVar) {
        this(i);
    }
}
