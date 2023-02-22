package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdrj<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzdrh> zzhmd;

    private zzdrj(Map.Entry<K, zzdrh> entry) {
        this.zzhmd = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzhmd.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zzhmd.getValue() == null) {
            return null;
        }
        return zzdrh.zzbak();
    }

    public final zzdrh zzbam() {
        return this.zzhmd.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzdsg)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zzhmd.getValue().zzq((zzdsg) obj);
    }
}
