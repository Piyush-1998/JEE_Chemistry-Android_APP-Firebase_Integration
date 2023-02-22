package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjv implements zzcge<zzcwm, zzchn> {
    private final zzchm zzfsy;
    private final Map<String, zzcgf<zzcwm, zzchn>> zzfzq = new HashMap();

    public zzcjv(zzchm zzchmVar) {
        this.zzfsy = zzchmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzcgf<zzcwm, zzchn> zzd(String str, JSONObject jSONObject) throws zzcwh {
        synchronized (this) {
            zzcgf<zzcwm, zzchn> zzcgfVar = this.zzfzq.get(str);
            if (zzcgfVar == null) {
                zzcwm zze = this.zzfsy.zze(str, jSONObject);
                if (zze == null) {
                    return null;
                }
                zzcgfVar = new zzcgf<>(zze, new zzchn(), str);
                this.zzfzq.put(str, zzcgfVar);
            }
            return zzcgfVar;
        }
    }
}
