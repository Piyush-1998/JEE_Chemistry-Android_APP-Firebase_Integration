package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaea {
    public static final zzaer<zzbbw> zzcxe = zzaed.zzcxw;
    public static final zzaer<zzbbw> zzcxf = zzaec.zzcxw;
    public static final zzaer<zzbbw> zzcxg = zzaef.zzcxw;
    public static final zzaer<zzbbw> zzcxh = new zzaeg();
    public static final zzaer<zzbbw> zzcxi = new zzaej();
    public static final zzaer<zzbbw> zzcxj = zzaee.zzcxw;
    public static final zzaer<Object> zzcxk = new zzaei();
    public static final zzaer<zzbbw> zzcxl = new zzael();
    public static final zzaer<zzbbw> zzcxm = zzaeh.zzcxw;
    public static final zzaer<zzbbw> zzcxn = new zzaek();
    public static final zzaer<zzbbw> zzcxo = new zzaen();
    public static final zzaer<zzazj> zzcxp = new zzbau();
    public static final zzaer<zzazj> zzcxq = new zzbat();
    public static final zzaer<zzbbw> zzcxr = new zzaeb();
    public static final zzaex zzcxs = new zzaex();
    public static final zzaer<zzbbw> zzcxt = new zzaem();
    public static final zzaer<zzbbw> zzcxu = new zzaep();
    public static final zzaer<zzbbw> zzcxv = new zzaeo();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzbdb zzbdbVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzdf zzzs = zzbdbVar.zzzs();
            if (zzzs != null) {
                zzzs.zzcd().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzaug.zzeu("Could not parse touch parameters from gmsg.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzbct zzbctVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzaug.zzeu("URL missing from httpTrack GMSG.");
        } else {
            new zzawl(zzbctVar.getContext(), ((zzbde) zzbctVar).zzxr().zzblz, str).zzut();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzagn zzagnVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzaug.zzeu("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzdf zzzs = ((zzbdb) zzagnVar).zzzs();
            if (zzzs != null && zzzs.zzc(parse)) {
                parse = zzzs.zza(parse, ((zzbct) zzagnVar).getContext(), ((zzbdd) zzagnVar).getView(), ((zzbct) zzagnVar).zzxn());
            }
        } catch (zzdi unused) {
            String valueOf = String.valueOf(str);
            zzaug.zzeu(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        zzbct zzbctVar = (zzbct) zzagnVar;
        new zzawl(zzbctVar.getContext(), ((zzbde) zzagnVar).zzxr().zzblz, zzate.zzc(parse, zzbctVar.getContext())).zzut();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzb(zzbct zzbctVar, Map map) {
        PackageManager packageManager = zzbctVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                String valueOf = String.valueOf(optString7);
                                zzaug.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e2) {
                            zzaug.zzc("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        zzaug.zzc("Error parsing the intent data.", e3);
                    }
                }
                ((zzagn) zzbctVar).zzb("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzagn) zzbctVar).zzb("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzagn) zzbctVar).zzb("openableIntents", new JSONObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzc(zzbct zzbctVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzaug.zzeu("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbctVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzagn) zzbctVar).zza("openableURLs", hashMap);
    }
}
