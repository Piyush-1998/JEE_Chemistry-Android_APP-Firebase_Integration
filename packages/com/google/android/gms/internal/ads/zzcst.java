package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcst implements zzcrr<JSONObject> {
    private JSONObject zzghb;

    public zzcst(JSONObject jSONObject) {
        this.zzghb = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.zzghb);
        } catch (JSONException unused) {
            zzaug.zzdy("Unable to get cache_state");
        }
    }
}
