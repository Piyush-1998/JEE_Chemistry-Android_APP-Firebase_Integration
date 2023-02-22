package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsl implements zzcrr<JSONObject> {
    private final String zzggv;

    public zzcsl(String str) {
        this.zzggv = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.zzggv);
        } catch (JSONException e) {
            zzaug.zza("Failed putting Ad ID.", e);
        }
    }
}
