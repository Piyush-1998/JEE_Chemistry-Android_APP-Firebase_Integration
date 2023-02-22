package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzagu {
    public static void zza(zzagv zzagvVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzagvVar.zzk(str, jSONObject.toString());
    }

    public static void zza(zzagv zzagvVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzagvVar.zzct(sb.toString());
    }

    public static void zzb(zzagv zzagvVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzaug.zzdv(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzagvVar.zzct(sb.toString());
    }

    public static void zza(zzagv zzagvVar, String str, Map map) {
        try {
            zzagvVar.zzb(str, com.google.android.gms.ads.internal.zzq.zzkj().zzi(map));
        } catch (JSONException unused) {
            zzaug.zzeu("Could not convert parameters to JSON.");
        }
    }
}
