package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdwd<K, V> extends zzdvy<K, V, V> {
    private static final zzdwo<Map<Object, Object>> zzhxq = zzdwe.zzbb(Collections.emptyMap());

    public static <K, V> zzdwf<K, V> zzho(int i) {
        return new zzdwf<>(i);
    }

    private zzdwd(Map<K, zzdwo<V>> map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        LinkedHashMap zzhm = zzdwa.zzhm(zzbde().size());
        for (Map.Entry<K, zzdwo<V>> entry : zzbde().entrySet()) {
            zzhm.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(zzhm);
    }
}
