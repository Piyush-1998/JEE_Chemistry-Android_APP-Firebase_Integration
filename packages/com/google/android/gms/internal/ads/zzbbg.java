package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbbg implements zzaer<zzazj> {
    private static Integer zzb(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = map.get(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
                sb.append("Precache invalid numeric parameter '");
                sb.append(str);
                sb.append("': ");
                sb.append(str2);
                zzaug.zzeu(sb.toString());
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzazj zzazjVar, Map map) {
        zzbax zzbaxVar;
        zzazj zzazjVar2 = zzazjVar;
        if (zzaug.isLoggable(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            zzaug.zzdv(sb.toString());
        }
        com.google.android.gms.ads.internal.zzq.zzlf();
        if (map.containsKey("abort")) {
            if (zzbay.zzc(zzazjVar2)) {
                return;
            }
            zzaug.zzeu("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    String valueOf2 = String.valueOf(str2);
                    zzaug.zzeu(valueOf2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(valueOf2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzbay.zzd(zzazjVar2) != null) {
                zzaug.zzeu("Precache task is already running.");
                return;
            } else if (zzazjVar2.zzxo() == null) {
                zzaug.zzeu("Precache requires a dependency provider.");
                return;
            } else {
                zzazk zzazkVar = new zzazk((String) map.get("flags"));
                Integer zzb = zzb(map, "player");
                if (zzb == null) {
                    zzb = 0;
                }
                zzbaxVar = zzazjVar2.zzxo().zzbkn.zza(zzazjVar2, zzb.intValue(), null, zzazkVar);
                new zzbaw(zzazjVar2, zzbaxVar, str, strArr).zzut();
            }
        } else {
            zzbaw zzd = zzbay.zzd(zzazjVar2);
            if (zzd != null) {
                zzbaxVar = zzd.zzede;
            } else {
                zzaug.zzeu("Precache must specify a source.");
                return;
            }
        }
        Integer zzb2 = zzb(map, "minBufferMs");
        if (zzb2 != null) {
            zzbaxVar.zzcs(zzb2.intValue());
        }
        Integer zzb3 = zzb(map, "maxBufferMs");
        if (zzb3 != null) {
            zzbaxVar.zzct(zzb3.intValue());
        }
        Integer zzb4 = zzb(map, "bufferForPlaybackMs");
        if (zzb4 != null) {
            zzbaxVar.zzcu(zzb4.intValue());
        }
        Integer zzb5 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb5 != null) {
            zzbaxVar.zzcv(zzb5.intValue());
        }
    }
}
