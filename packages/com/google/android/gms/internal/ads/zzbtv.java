package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbtv implements zzaer<Object> {
    private WeakReference<zzbtq> zzfke;

    private zzbtv(zzbtq zzbtqVar) {
        this.zzfke = new WeakReference<>(zzbtqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        zzbtq zzbtqVar = this.zzfke.get();
        if (zzbtqVar == null) {
            return;
        }
        zzbtq.zza(zzbtqVar).onAdImpression();
    }
}
