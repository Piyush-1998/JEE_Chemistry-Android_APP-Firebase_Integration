package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdbp<K, V> extends zzdbg<Map.Entry<K, V>> {
    private final transient int size;
    private final transient Object[] zzgpo;
    private final transient zzdbh<K, V> zzgps;
    private final transient int zzgpt = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbp(zzdbh<K, V> zzdbhVar, Object[] objArr, int i, int i2) {
        this.zzgps = zzdbhVar;
        this.zzgpo = objArr;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final boolean zzaoo() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final zzdbu<Map.Entry<K, V>> zzaoj() {
        return (zzdbu) zzaon().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final int zza(Object[] objArr, int i) {
        return zzaon().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    final zzdbd<Map.Entry<K, V>> zzaor() {
        return new zzdbo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zzgps.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdbg, com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
