package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgt {
    private static final zzgt zzalc = new zzgt();
    private final ConcurrentMap<Class<?>, zzgx<?>> zzale = new ConcurrentHashMap();
    private final zzha zzald = new zzfv();

    public static zzgt zzvy() {
        return zzalc;
    }

    public final <T> zzgx<T> zzf(Class<T> cls) {
        zzez.zza(cls, "messageType");
        zzgx<T> zzgxVar = (zzgx<T>) this.zzale.get(cls);
        if (zzgxVar == null) {
            zzgx<T> zze = this.zzald.zze(cls);
            zzez.zza(cls, "messageType");
            zzez.zza(zze, "schema");
            zzgx<T> zzgxVar2 = (zzgx<T>) this.zzale.putIfAbsent(cls, zze);
            return zzgxVar2 != null ? zzgxVar2 : zze;
        }
        return zzgxVar;
    }

    public final <T> zzgx<T> zzw(T t) {
        return zzf(t.getClass());
    }

    private zzgt() {
    }
}
