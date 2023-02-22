package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnl {
    public final String zzgdr;
    public String zzgds;

    public zzcnl(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            char c = 65535;
            if (nextName.hashCode() == -995427962 && nextName.equals("params")) {
                c = 0;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        this.zzgdr = str;
        jsonReader.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcnl zzn(Bundle bundle) {
        try {
            this.zzgds = com.google.android.gms.ads.internal.zzq.zzkj().zzd(bundle).toString();
        } catch (JSONException unused) {
            this.zzgds = "{}";
        }
        return this;
    }
}
