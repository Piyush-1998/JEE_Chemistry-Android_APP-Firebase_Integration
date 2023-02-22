package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctg implements zzcrr<JSONObject> {
    private List<String> zzdjf;

    public zzctg(List<String> list) {
        this.zzdjf = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.zzdjf));
        } catch (JSONException unused) {
            zzaug.zzdy("Failed putting experiment ids.");
        }
    }
}
