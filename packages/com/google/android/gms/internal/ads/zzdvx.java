package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdvx<K, V, V2> {
    final LinkedHashMap<K, zzdwo<V>> zzhxl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvx(int i) {
        this.zzhxl = zzdwa.zzhm(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzdvx<K, V, V2> zza(K k, zzdwo<V> zzdwoVar) {
        this.zzhxl.put(zzdwh.zza(k, "key"), zzdwh.zza(zzdwoVar, "provider"));
        return this;
    }
}
