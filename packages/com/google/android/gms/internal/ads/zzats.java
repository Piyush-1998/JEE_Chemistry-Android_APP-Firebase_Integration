package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzats {
    private String zzdjr;
    private final long zzdqu;
    private final List<String> zzdqv = new ArrayList();
    private final List<String> zzdqw = new ArrayList();
    private final Map<String, zzajs> zzdqx = new HashMap();
    private String zzdqy;
    private JSONObject zzdqz;
    private boolean zzdra;

    public zzats(String str, long j) {
        JSONObject optJSONObject;
        this.zzdra = false;
        this.zzdjr = str;
        this.zzdqu = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzdqz = jSONObject;
            if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                this.zzdra = false;
                zzaug.zzeu("App settings could not be fetched successfully.");
                return;
            }
            this.zzdra = true;
            this.zzdqy = this.zzdqz.optString("app_id");
            JSONArray optJSONArray = this.zzdqz.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.zzdqw.add(optString2);
                        } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.zzdqx.put(optString2, new zzajs(optJSONObject));
                        }
                    }
                }
            }
            JSONArray optJSONArray2 = this.zzdqz.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    this.zzdqv.add(optJSONArray2.optString(i2));
                }
            }
        } catch (JSONException e) {
            zzaug.zzd("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zzul() {
        return this.zzdqu;
    }

    public final boolean zzum() {
        return this.zzdra;
    }

    public final String zzun() {
        return this.zzdjr;
    }

    public final String zzuo() {
        return this.zzdqy;
    }

    public final Map<String, zzajs> zzup() {
        return this.zzdqx;
    }

    public final JSONObject zzuq() {
        return this.zzdqz;
    }
}
