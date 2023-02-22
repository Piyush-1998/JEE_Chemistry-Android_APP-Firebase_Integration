package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzga<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzee zzeeVar, zzfz<K, V> zzfzVar, K k, V v) throws IOException {
        zzeo.zza(zzeeVar, zzfzVar.zzakb, 1, k);
        zzeo.zza(zzeeVar, zzfzVar.zzakd, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzfz<K, V> zzfzVar, K k, V v) {
        return zzeo.zza(zzfzVar.zzakb, 1, k) + zzeo.zza(zzfzVar.zzakd, 2, v);
    }
}
