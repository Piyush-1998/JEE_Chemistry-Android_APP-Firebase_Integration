package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvv implements zzawh {
    public final String zzdhz;
    public final String zzdib;
    public final JSONObject zzfjj;
    private final JSONObject zzgjw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvv(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = zzawg.zzc(jsonReader);
        this.zzgjw = zzc;
        this.zzdib = zzc.optString("ad_html", null);
        this.zzdhz = this.zzgjw.optString("ad_base_url", null);
        this.zzfjj = this.zzgjw.optJSONObject("ad_json");
    }

    @Override // com.google.android.gms.internal.ads.zzawh
    public final void zza(JsonWriter jsonWriter) throws IOException {
        zzawg.zza(jsonWriter, this.zzgjw);
    }
}
