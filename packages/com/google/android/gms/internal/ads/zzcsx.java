package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcsx implements zzcru<zzcrr<JSONObject>> {
    private final JSONObject zzghe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsx(Context context) {
        this.zzghe = zzapq.zzy(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcrr<JSONObject>> zzalv() {
        return zzdcy.zzah(new zzcrr(this) { // from class: com.google.android.gms.internal.ads.zzcta
            private final zzcsx zzghf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghf = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcrr
            public final void zzr(Object obj) {
                this.zzghf.zzo((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zzghe);
        } catch (JSONException unused) {
            zzaug.zzdy("Failed putting version constants.");
        }
    }
}
