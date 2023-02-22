package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgy implements zzbgs {
    private final zzaui zzdrp;

    public zzbgy(zzaui zzauiVar) {
        this.zzdrp = zzauiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzk(Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if ("auto_collect_location".equals(map.get("key"))) {
            this.zzdrp.zzaj(Boolean.parseBoolean(str));
        }
    }
}
