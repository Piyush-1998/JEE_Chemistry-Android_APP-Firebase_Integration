package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctl implements zzcrr<JSONObject> {
    private Bundle zzghm;

    public zzctl(Bundle bundle) {
        this.zzghm = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.zzghm != null) {
            try {
                zzawg.zzb(zzawg.zzb(jSONObject2, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.zzq.zzkj().zzd(this.zzghm));
            } catch (JSONException unused) {
                zzaug.zzdy("Failed putting parental controls bundle.");
            }
        }
    }
}
