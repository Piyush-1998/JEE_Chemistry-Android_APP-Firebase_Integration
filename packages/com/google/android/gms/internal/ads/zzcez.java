package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcez implements zzaiq<zzcew> {
    @Override // com.google.android.gms.internal.ads.zzaiq
    public final /* synthetic */ JSONObject zzj(zzcew zzcewVar) throws JSONException {
        zzcew zzcewVar2 = zzcewVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcewVar2.zzfvm.zzte());
        jSONObject2.put("signals", zzcewVar2.zzfvl);
        jSONObject3.put("body", zzcewVar2.zzfvk.zzdko);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.zzq.zzkj().zzi(zzcewVar2.zzfvk.zzab));
        jSONObject3.put("response_code", zzcewVar2.zzfvk.zzfvt);
        jSONObject3.put("latency", zzcewVar2.zzfvk.zzfvu);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcewVar2.zzfvm.zzth());
        return jSONObject;
    }
}
