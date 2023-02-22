package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcua implements zzcrr<JSONObject> {
    private final Map<String, Object> zzghs;

    public zzcua(Map<String, Object> map) {
        this.zzghs = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", com.google.android.gms.ads.internal.zzq.zzkj().zzi(this.zzghs));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzaug.zzdy(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
