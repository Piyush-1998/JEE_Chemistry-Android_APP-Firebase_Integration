package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzdjn;
import com.google.android.gms.internal.ads.zzdjx;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdek implements zzdeo {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final InputStream zzbey;
    private boolean zzgsk = false;
    private final JSONObject zzgsj = null;

    private zzdek(InputStream inputStream) {
        this.zzbey = inputStream;
    }

    public static zzdeo zzf(InputStream inputStream) throws IOException {
        return new zzdek(inputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final zzdjx zzapn() throws IOException {
        zzdjr zzdjrVar;
        zzdkj zzdkjVar;
        zzdjn.zzb zzbVar;
        try {
            JSONObject jSONObject = new JSONObject(new String(zzdfb.zzg(this.zzbey), UTF_8));
            if (!jSONObject.has("key") || jSONObject.getJSONArray("key").length() == 0) {
                throw new JSONException("invalid keyset");
            }
            zzdjx.zzb zzaul = zzdjx.zzaul();
            if (jSONObject.has("primaryKeyId")) {
                zzaul.zzet(jSONObject.getInt("primaryKeyId"));
            }
            JSONArray jSONArray = jSONObject.getJSONArray("key");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!jSONObject2.has("keyData") || !jSONObject2.has(NotificationCompat.CATEGORY_STATUS) || !jSONObject2.has("keyId") || !jSONObject2.has("outputPrefixType")) {
                    throw new JSONException("invalid key");
                }
                zzdjx.zza.C0010zza zzauq = zzdjx.zza.zzauq();
                String string = jSONObject2.getString(NotificationCompat.CATEGORY_STATUS);
                if (string.equals("ENABLED")) {
                    zzdjrVar = zzdjr.ENABLED;
                } else if (string.equals("DISABLED")) {
                    zzdjrVar = zzdjr.DISABLED;
                } else {
                    String valueOf = String.valueOf(string);
                    throw new JSONException(valueOf.length() != 0 ? "unknown status: ".concat(valueOf) : new String("unknown status: "));
                }
                zzdjx.zza.C0010zza zzeu = zzauq.zzb(zzdjrVar).zzeu(jSONObject2.getInt("keyId"));
                String string2 = jSONObject2.getString("outputPrefixType");
                if (string2.equals("TINK")) {
                    zzdkjVar = zzdkj.TINK;
                } else if (string2.equals("RAW")) {
                    zzdkjVar = zzdkj.RAW;
                } else if (string2.equals("LEGACY")) {
                    zzdkjVar = zzdkj.LEGACY;
                } else if (string2.equals("CRUNCHY")) {
                    zzdkjVar = zzdkj.CRUNCHY;
                } else {
                    String valueOf2 = String.valueOf(string2);
                    throw new JSONException(valueOf2.length() != 0 ? "unknown output prefix type: ".concat(valueOf2) : new String("unknown output prefix type: "));
                }
                zzdjx.zza.C0010zza zzb = zzeu.zzb(zzdkjVar);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("keyData");
                if (!jSONObject3.has("typeUrl") || !jSONObject3.has(AppMeasurementSdk.ConditionalUserProperty.VALUE) || !jSONObject3.has("keyMaterialType")) {
                    throw new JSONException("invalid keyData");
                }
                zzdjn.zza zzbo = zzdjn.zzatx().zzgw(jSONObject3.getString("typeUrl")).zzbo(zzdpm.zzy(zzdmm.decode(jSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE))));
                String string3 = jSONObject3.getString("keyMaterialType");
                if (string3.equals("SYMMETRIC")) {
                    zzbVar = zzdjn.zzb.SYMMETRIC;
                } else if (string3.equals("ASYMMETRIC_PRIVATE")) {
                    zzbVar = zzdjn.zzb.ASYMMETRIC_PRIVATE;
                } else if (string3.equals("ASYMMETRIC_PUBLIC")) {
                    zzbVar = zzdjn.zzb.ASYMMETRIC_PUBLIC;
                } else if (string3.equals("REMOTE")) {
                    zzbVar = zzdjn.zzb.REMOTE;
                } else {
                    String valueOf3 = String.valueOf(string3);
                    throw new JSONException(valueOf3.length() != 0 ? "unknown key material type: ".concat(valueOf3) : new String("unknown key material type: "));
                }
                zzaul.zzb((zzdjx.zza) ((zzdqw) zzb.zzb((zzdjn) ((zzdqw) zzbo.zzb(zzbVar).zzazr())).zzazr()));
            }
            return (zzdjx) ((zzdqw) zzaul.zzazr());
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
