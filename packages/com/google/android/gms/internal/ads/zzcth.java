package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcth implements zzcrr<JSONObject> {
    private final Location zzng;

    public zzcth(Location location) {
        this.zzng = location;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (this.zzng != null) {
                JSONObject jSONObject3 = new JSONObject();
                Float valueOf = Float.valueOf(this.zzng.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.zzng.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.zzng.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.zzng.getLongitude() * 1.0E7d));
                jSONObject3.put("radius", valueOf);
                jSONObject3.put("lat", valueOf3);
                jSONObject3.put("long", valueOf4);
                jSONObject3.put("time", valueOf2);
                jSONObject2.put("uule", jSONObject3);
            }
        } catch (JSONException e) {
            zzaug.zza("Failed adding location to the request JSON.", e);
        }
    }
}
