package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
abstract class zzdvy<K, V, V2> implements zzdwb<Map<K, V2>> {
    private final Map<K, zzdwo<V>> zzhxm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvy(Map<K, zzdwo<V>> map) {
        this.zzhxm = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, zzdwo<V>> zzbde() {
        return this.zzhxm;
    }
}
