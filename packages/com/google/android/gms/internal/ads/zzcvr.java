package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvr {
    public final String zzaex;
    public final boolean zzble;
    public final List<String> zzdby;
    public final List<String> zzdbz;
    public final String zzdce;
    public final boolean zzdcl;
    public final boolean zzdcm;
    public final boolean zzdcn;
    public final String zzdcu;
    public final String zzddf;
    public final String zzddg;
    public final String zzdeu;
    public final List<String> zzdks;
    public final String zzdkv;
    public final String zzdky;
    public final zzaqt zzdle;
    public final List<String> zzdlf;
    public final List<String> zzdlg;
    public final boolean zzdlo;
    public final boolean zzdlr;
    public final boolean zzdls;
    public final boolean zzdnj;
    public final boolean zzegg;
    public final String zzeij;
    public final int zzfdf;
    public final int zzfis;
    public final List<String> zzgiy;
    public final int zzgiz;
    public final List<String> zzgja;
    public final List<String> zzgjb;
    public final List<String> zzgjc;
    public final List<zzcvu> zzgjd;
    public final zzcvv zzgje;
    public final List<String> zzgjf;
    public final List<zzcvu> zzgjg;
    public final JSONObject zzgjh;
    public final zzasd zzgji;
    public final JSONObject zzgjj;
    public final JSONObject zzgjk;
    public final boolean zzgjl;
    public final int zzgjm;
    public final int zzgjn;
    public final JSONObject zzgjo;
    public final int zzgjp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvr(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> list;
        char c;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<zzcvu> emptyList10 = Collections.emptyList();
        List<String> emptyList11 = Collections.emptyList();
        List<zzcvu> emptyList12 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jsonReader.beginObject();
        List<String> list2 = emptyList11;
        List<zzcvu> list3 = emptyList12;
        JSONObject jSONObject5 = jSONObject;
        JSONObject jSONObject6 = jSONObject4;
        zzasd zzasdVar = null;
        zzcvv zzcvvVar = null;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i3 = -1;
        int i4 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i5 = 0;
        boolean z10 = false;
        int i6 = -1;
        JSONObject jSONObject7 = jSONObject3;
        zzaqt zzaqtVar = null;
        JSONObject jSONObject8 = jSONObject2;
        String str9 = str8;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str10 = nextName == null ? "" : nextName;
            List<zzcvu> list4 = emptyList10;
            switch (str10.hashCode()) {
                case -1980587809:
                    list = emptyList9;
                    if (str10.equals("debug_signals")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    if (str10.equals("omid_settings")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    if (str10.equals("is_custom_close_blocked")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    if (str10.equals("orientation")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    if (str10.equals("enable_omid")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    if (str10.equals("showable_impression_type")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    if (str10.equals("ad_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    if (str10.equals("adapters")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    if (str10.equals("extras")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    if (str10.equals("allow_pub_rendered_attribution")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1181000426:
                    list = emptyList9;
                    if (str10.equals("is_augmented_reality_ad")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    if (str10.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    if (str10.equals("is_scroll_aware")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    if (str10.equals("fill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    if (str10.equals("allocation_id")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    if (str10.equals("video_complete_urls")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    if (str10.equals("active_view")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    if (str10.equals("valid_from_timestamp")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    if (str10.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    if (str10.equals("safe_browsing")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    if (str10.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    if (str10.equals("render_timeout_ms")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    if (str10.equals("ad_close_time_ms")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    if (str10.equals("watermark")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    if (str10.equals("allow_custom_click_gesture")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    if (str10.equals("ad")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    if (str10.equals("id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    if (str10.equals("data")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    if (str10.equals("render_test_label")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    if (str10.equals("qdata")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    if (str10.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    if (str10.equals("is_closable_area_disabled")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    if (str10.equals("debug_dialog_string")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 673261304:
                    list = emptyList9;
                    if (str10.equals("reward_granted_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    if (str10.equals("container_sizes")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    if (str10.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    if (str10.equals("transaction_id")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    if (str10.equals("rewards")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    if (str10.equals("allow_pub_owned_ad_view")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    if (str10.equals("bid_response")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    if (str10.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    if (str10.equals("video_reward_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    if (str10.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    if (str10.equals("is_analytics_logging_enabled")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list = emptyList9;
                    if (str10.equals("manual_tracking_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    emptyList = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if ("banner".equals(nextString)) {
                        i2 = 1;
                    } else if ("interstitial".equals(nextString)) {
                        i2 = 2;
                    } else if ("native_express".equals(nextString)) {
                        i2 = 3;
                    } else if ("native".equals(nextString)) {
                        i2 = 4;
                    } else {
                        i2 = "rewarded".equals(nextString) ? 5 : 0;
                    }
                    emptyList10 = list4;
                    break;
                case 2:
                    emptyList2 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case 3:
                    emptyList3 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case 4:
                    emptyList4 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case 5:
                    int nextInt = jsonReader.nextInt();
                    i = (nextInt == 0 || nextInt == 1) ? nextInt : 0;
                    emptyList10 = list4;
                    break;
                case 6:
                    emptyList5 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case 7:
                    zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case '\b':
                    emptyList6 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case '\t':
                    emptyList7 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case '\n':
                    str = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                case 11:
                    str9 = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                case '\f':
                    zzaqtVar = zzaqt.zza(zzawg.zzd(jsonReader));
                    emptyList10 = list4;
                    break;
                case '\r':
                    emptyList8 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case 14:
                    emptyList9 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    continue;
                case 15:
                    emptyList10 = zzcvu.zze(jsonReader);
                    break;
                case 16:
                    zzcvvVar = new zzcvv(jsonReader);
                    emptyList10 = list4;
                    break;
                case 17:
                    list3 = zzcvu.zze(jsonReader);
                    emptyList10 = list4;
                    break;
                case 18:
                    list2 = zzawg.zza(jsonReader);
                    emptyList10 = list4;
                    break;
                case 19:
                    str2 = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                case 20:
                    jSONObject5 = zzawg.zzc(jsonReader);
                    emptyList10 = list4;
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                case 22:
                    str4 = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                case 23:
                    str5 = zzawg.zzc(jsonReader).toString();
                    emptyList10 = list4;
                    break;
                case 24:
                    zzasdVar = zzasd.zzg(zzawg.zzc(jsonReader));
                    emptyList10 = list4;
                    break;
                case 25:
                    str6 = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                case 26:
                    jSONObject8 = zzawg.zzc(jsonReader);
                    emptyList10 = list4;
                    break;
                case 27:
                    jSONObject7 = zzawg.zzc(jsonReader);
                    emptyList10 = list4;
                    break;
                case 28:
                    z = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case 29:
                    z2 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case 30:
                    z3 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case 31:
                    z4 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case ' ':
                    z5 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case '!':
                    z6 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case '\"':
                    String nextString2 = jsonReader.nextString();
                    if ("landscape".equalsIgnoreCase(nextString2)) {
                        com.google.android.gms.ads.internal.zzq.zzkl();
                        i3 = 6;
                    } else if ("portrait".equalsIgnoreCase(nextString2)) {
                        com.google.android.gms.ads.internal.zzq.zzkl();
                        i3 = 7;
                    } else {
                        i3 = -1;
                    }
                    emptyList10 = list4;
                    break;
                case '#':
                    i4 = jsonReader.nextInt();
                    emptyList10 = list4;
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case '%':
                    str7 = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                case '&':
                    jSONObject6 = zzawg.zzc(jsonReader);
                    emptyList10 = list4;
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case '(':
                    z9 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case ')':
                    i5 = jsonReader.nextInt();
                    emptyList10 = list4;
                    break;
                case '*':
                    z10 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    break;
                case '+':
                    i6 = jsonReader.nextInt();
                    emptyList10 = list4;
                    break;
                case ',':
                    str8 = jsonReader.nextString();
                    emptyList10 = list4;
                    break;
                default:
                    jsonReader.skipValue();
                    emptyList10 = list4;
                    break;
            }
            emptyList9 = list;
        }
        jsonReader.endObject();
        this.zzgiy = emptyList;
        this.zzfis = i2;
        this.zzdby = emptyList2;
        this.zzdbz = emptyList3;
        this.zzgja = emptyList4;
        this.zzgiz = i;
        this.zzdlf = emptyList5;
        this.zzdlg = emptyList6;
        this.zzgjb = emptyList7;
        this.zzddf = str;
        this.zzddg = str9;
        this.zzdle = zzaqtVar;
        this.zzgjc = emptyList8;
        this.zzdks = emptyList9;
        this.zzgjd = emptyList10;
        this.zzgje = zzcvvVar;
        this.zzgjf = list2;
        this.zzgjg = list3;
        this.zzdcu = str2;
        this.zzgjh = jSONObject5;
        this.zzaex = str3;
        this.zzdce = str4;
        this.zzdky = str5;
        this.zzgji = zzasdVar;
        this.zzdkv = str6;
        this.zzgjj = jSONObject8;
        this.zzgjk = jSONObject7;
        this.zzdcl = z;
        this.zzdcm = z2;
        this.zzdcn = z3;
        this.zzdnj = z4;
        this.zzgjl = z5;
        this.zzble = z6;
        this.zzgjm = i3;
        this.zzgjn = i4;
        this.zzdlo = z7;
        this.zzeij = str7;
        this.zzgjo = jSONObject6;
        this.zzdlr = z8;
        this.zzdls = z9;
        this.zzgjp = i5;
        this.zzegg = z10;
        this.zzdeu = str8;
        this.zzfdf = i6;
    }
}
