package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzaep implements zzaer<zzbbw> {
    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzbbw zzbbwVar, Map map) {
        zzbbw zzbbwVar2 = zzbbwVar;
        if (map.keySet().contains("start")) {
            zzbbwVar2.zzau(true);
        }
        if (map.keySet().contains("stop")) {
            zzbbwVar2.zzau(false);
        }
    }
}
