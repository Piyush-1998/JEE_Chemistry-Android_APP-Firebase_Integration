package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadz implements zzaer<Object> {
    private final zzady zzcxd;

    public zzadz(zzady zzadyVar) {
        this.zzcxd = zzadyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzaug.zzeu("App event with no name parameter.");
        } else {
            this.zzcxd.onAppEvent(str, map.get("info"));
        }
    }
}
