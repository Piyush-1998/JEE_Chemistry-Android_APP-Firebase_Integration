package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclr {
    private final Executor executor;
    private final Map<String, zzclu> zzgbh = new ConcurrentHashMap();
    private final Map<String, Map<String, List<zzclu>>> zzgbi = new ConcurrentHashMap();
    private JSONObject zzgbj;

    public zzclr(Executor executor) {
        this.executor = executor;
    }

    public final void zzaky() {
        com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzb(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzclq
            private final zzclr zzgbg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbg = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgbg.zzalb();
            }
        });
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzclt
            private final zzclr zzgbg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbg = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgbg.zzala();
            }
        });
    }

    public final Map<String, List<Bundle>> zzs(String str, String str2) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Collections.emptyMap();
        }
        Map<String, List<zzclu>> map = this.zzgbi.get(str);
        if (map == null) {
            return Collections.emptyMap();
        }
        List<zzclu> list = map.get(str2);
        if (list == null) {
            String str3 = "";
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcmk)).booleanValue() && (jSONObject = this.zzgbj) != null && (optJSONArray = jSONObject.optJSONArray(str)) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                        if (zza(optJSONArray2, str2) && !zza(optJSONArray3, str2)) {
                            str3 = optJSONObject.optString("effective_ad_unit_id", "");
                            break;
                        }
                    }
                    i++;
                }
            }
            list = map.get(str3);
        }
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (zzclu zzcluVar : list) {
            String str4 = zzcluVar.zzffi;
            if (!hashMap.containsKey(str4)) {
                hashMap.put(str4, new ArrayList());
            }
            ((List) hashMap.get(str4)).add(zzcluVar.zzeik);
        }
        return hashMap;
    }

    public final void zzgd(String str) {
        if (TextUtils.isEmpty(str) || this.zzgbh.containsKey(str)) {
            return;
        }
        this.zzgbh.put(str, new zzclu(str, "", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzakz */
    public final synchronized void zzalc() {
        JSONArray optJSONArray;
        JSONObject zzuq = com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzve().zzuq();
        if (zzuq != null) {
            try {
                JSONArray optJSONArray2 = zzuq.optJSONArray("ad_unit_id_settings");
                this.zzgbj = zzuq.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject.optString("ad_unit_id", "");
                        String optString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys = optJSONObject2.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            bundle.putString(next, optJSONObject2.optString(next, ""));
                                        }
                                    }
                                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                            String optString3 = optJSONArray3.optString(i3, "");
                                            if (!TextUtils.isEmpty(optString3)) {
                                                arrayList3.add(optString3);
                                            }
                                        }
                                        ArrayList arrayList4 = arrayList3;
                                        int size = arrayList4.size();
                                        int i4 = 0;
                                        while (i4 < size) {
                                            Object obj = arrayList4.get(i4);
                                            i4++;
                                            String str = (String) obj;
                                            zzgd(str);
                                            if (this.zzgbh.get(str) != null) {
                                                arrayList2.add(new zzclu(str, optString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                            Map<String, List<zzclu>> map = this.zzgbi.get(optString2);
                            if (map == null) {
                                map = new ConcurrentHashMap<>();
                            }
                            this.zzgbi.put(optString2, map);
                            List<zzclu> list = map.get(optString);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.addAll(arrayList);
                            map.put(optString, list);
                        }
                    }
                }
            } catch (JSONException e) {
                zzaug.zza("Malformed config loading JSON.", e);
            }
        }
    }

    private static boolean zza(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                } catch (PatternSyntaxException e) {
                    com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if (Pattern.compile(jSONArray.optString(i)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzalb() {
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcls
            private final zzclr zzgbg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbg = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgbg.zzalc();
            }
        });
    }
}
