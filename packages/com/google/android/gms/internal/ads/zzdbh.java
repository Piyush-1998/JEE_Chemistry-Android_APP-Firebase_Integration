package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdbh<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zzgpf = new Map.Entry[0];
    private transient zzdbg<Map.Entry<K, V>> zzgpg;
    private transient zzdbg<K> zzgph;
    private transient zzday<V> zzgpi;

    public static <K, V> zzdbh<K, V> zza(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        zzdax.zzb(k, v);
        zzdax.zzb(k2, v2);
        zzdax.zzb(k3, v3);
        zzdax.zzb(k4, v4);
        zzdax.zzb(k5, v5);
        return zzdbm.zzc(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    abstract zzdbg<Map.Entry<K, V>> zzaos();

    abstract zzdbg<K> zzaot();

    abstract zzday<V> zzaou();

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzday) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzdbs.zzf((zzdbg) entrySet());
    }

    public String toString() {
        int size = size();
        zzdax.zzf(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzdbg<Map.Entry<K, V>> zzdbgVar = this.zzgpg;
        if (zzdbgVar == null) {
            zzdbg<Map.Entry<K, V>> zzaos = zzaos();
            this.zzgpg = zzaos;
            return zzaos;
        }
        return zzdbgVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzday<V> zzdayVar = this.zzgpi;
        if (zzdayVar == null) {
            zzday<V> zzaou = zzaou();
            this.zzgpi = zzaou;
            return zzaou;
        }
        return zzdayVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzdbg<K> zzdbgVar = this.zzgph;
        if (zzdbgVar == null) {
            zzdbg<K> zzaot = zzaot();
            this.zzgph = zzaot;
            return zzaot;
        }
        return zzdbgVar;
    }
}
