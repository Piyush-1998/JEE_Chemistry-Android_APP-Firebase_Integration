package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxb {
    private final Executor executor;
    private final zzbwq zzfob;

    public zzbxb(Executor executor, zzbwq zzbwqVar) {
        this.executor = executor;
        this.zzfob = zzbwqVar;
    }

    public final zzddi<List<zzbxc>> zzg(JSONObject jSONObject, String str) {
        zzddi zzah;
        final String optString;
        char c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzdcy.zzah(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    c = 1;
                } else {
                    c = "image".equals(optString2) ? (char) 2 : (char) 0;
                }
                if (c == 1) {
                    zzah = zzdcy.zzah(new zzbxc(optString, optJSONObject.optString("string_value")));
                } else if (c == 2) {
                    zzah = zzdcy.zzb(this.zzfob.zzc(optJSONObject, "image_value"), new zzdal(optString) { // from class: com.google.android.gms.internal.ads.zzbxd
                        private final String zzczh;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzczh = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdal
                        public final Object apply(Object obj) {
                            return new zzbxc(this.zzczh, (zzaau) obj);
                        }
                    }, this.executor);
                }
                arrayList.add(zzah);
            }
            zzah = zzdcy.zzah(null);
            arrayList.add(zzah);
        }
        return zzdcy.zzb(zzdcy.zzg(arrayList), zzbxa.zzdos, this.executor);
    }
}
