package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdry<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzdqf zzdqfVar, zzdrx<K, V> zzdrxVar, K k, V v) throws IOException {
        zzdqm.zza(zzdqfVar, zzdrxVar.zzhmt, 1, k);
        zzdqm.zza(zzdqfVar, zzdrxVar.zzhmv, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzdrx<K, V> zzdrxVar, K k, V v) {
        return zzdqm.zza(zzdrxVar.zzhmt, 1, k) + zzdqm.zza(zzdrxVar.zzhmv, 2, v);
    }
}
