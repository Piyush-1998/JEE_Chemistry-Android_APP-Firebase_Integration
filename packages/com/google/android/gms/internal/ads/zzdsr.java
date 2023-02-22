package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdsr {
    private static final zzdsr zzhnt = new zzdsr();
    private final ConcurrentMap<Class<?>, zzdsv<?>> zzhnv = new ConcurrentHashMap();
    private final zzdsy zzhnu = new zzdrt();

    public static zzdsr zzbbf() {
        return zzhnt;
    }

    public final <T> zzdsv<T> zzh(Class<T> cls) {
        zzdqx.zza(cls, "messageType");
        zzdsv<T> zzdsvVar = (zzdsv<T>) this.zzhnv.get(cls);
        if (zzdsvVar == null) {
            zzdsv<T> zzg = this.zzhnu.zzg(cls);
            zzdqx.zza(cls, "messageType");
            zzdqx.zza(zzg, "schema");
            zzdsv<T> zzdsvVar2 = (zzdsv<T>) this.zzhnv.putIfAbsent(cls, zzg);
            return zzdsvVar2 != null ? zzdsvVar2 : zzg;
        }
        return zzdsvVar;
    }

    public final <T> zzdsv<T> zzax(T t) {
        return zzh(t.getClass());
    }

    private zzdsr() {
    }
}
