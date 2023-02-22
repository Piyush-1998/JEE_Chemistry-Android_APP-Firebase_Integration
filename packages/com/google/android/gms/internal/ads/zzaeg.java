package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzaeg implements zzaer<zzbbw> {
    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzbbw zzbbwVar, Map map) {
        zzbbw zzbbwVar2 = zzbbwVar;
        if (zzbbwVar2.zzaad() != null) {
            zzbbwVar2.zzaad().zzmf();
        }
        com.google.android.gms.ads.internal.overlay.zzc zzzl = zzbbwVar2.zzzl();
        if (zzzl != null) {
            zzzl.close();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzc zzzm = zzbbwVar2.zzzm();
        if (zzzm != null) {
            zzzm.close();
        } else {
            zzaug.zzeu("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
