package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaex implements zzaer<Object> {
    private final Object lock = new Object();
    private final Map<String, zzaez> zzcye = new HashMap();

    public final void zza(String str, zzaez zzaezVar) {
        synchronized (this.lock) {
            this.zzcye.put(str, zzaezVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        String concat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            String valueOf = String.valueOf(str4);
            concat = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.lock) {
            zzaez remove = this.zzcye.remove(str);
            if (remove == null) {
                String valueOf2 = String.valueOf(str);
                zzaug.zzeu(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(str3);
                String valueOf4 = String.valueOf(concat);
                remove.onFailure(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str5 == null) {
                remove.zzc(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zzaug.zzuu()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        zzaug.zzdy(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.zzc(jSONObject);
                } catch (JSONException e) {
                    remove.onFailure(e.getMessage());
                }
            }
        }
    }

    public final <EngineT extends zzahk> zzddi<JSONObject> zza(EngineT enginet, String str, JSONObject jSONObject) {
        zzaxv zzaxvVar = new zzaxv();
        com.google.android.gms.ads.internal.zzq.zzkj();
        String zzvm = zzaul.zzvm();
        zza(zzvm, new zzaew(this, zzaxvVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", zzvm);
            jSONObject2.put("args", jSONObject);
            enginet.zza(str, jSONObject2);
        } catch (Exception e) {
            zzaxvVar.setException(e);
        }
        return zzaxvVar;
    }
}
