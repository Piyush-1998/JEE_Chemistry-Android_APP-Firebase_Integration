package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfb implements zzcxn<zzcfa, zzcfd> {
    private final String zzdjp;
    private final zzapr zzfvf;
    private final String zzfvs;
    private final Context zzlk;

    public zzcfb(Context context, String str, zzapr zzaprVar, String str2) {
        this.zzlk = context;
        this.zzfvs = str;
        this.zzfvf = zzaprVar;
        this.zzdjp = str2;
    }

    private final zzcfd zza(String str, zzapk zzapkVar, JSONObject jSONObject, String str2) throws zzcek {
        byte[] bArr;
        int responseCode;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        String str3 = "doritos_v2";
        String str4 = "doritos";
        String str5 = "";
        try {
            boolean z = false;
            if (zzapkVar.getErrorCode() != -2) {
                if (zzapkVar.getErrorCode() == 1) {
                    if (zzapkVar.zztd() != null) {
                        zzaug.zzes(TextUtils.join(", ", zzapkVar.zztd()));
                    }
                    throw new zzcek("Error building request URL.", zzapkVar.getErrorCode());
                }
                throw new zzcek("Internal error.", 0);
            }
            zzcfd zzcfdVar = new zzcfd();
            String valueOf = String.valueOf(this.zzfvs);
            zzaug.zzet(valueOf.length() != 0 ? "SDK version: ".concat(valueOf) : new String("SDK version: "));
            String valueOf2 = String.valueOf(str);
            zzaug.zzdv(valueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf2) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
            int i = 0;
            while (true) {
                this.zzfvf.zztk();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                com.google.android.gms.ads.internal.zzq.zzkj().zza(this.zzlk, this.zzfvs, z, httpURLConnection);
                if (!TextUtils.isEmpty(str2)) {
                    httpURLConnection.addRequestProperty("Cookie", str2);
                }
                if (zzapkVar.zztg()) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("pii");
                    if (optJSONObject != null) {
                        if (!TextUtils.isEmpty(optJSONObject.optString(str4, str5))) {
                            httpURLConnection.addRequestProperty("x-afma-drt-cookie", optJSONObject.optString(str4, str5));
                        }
                        if (!TextUtils.isEmpty(optJSONObject.optString(str3, str5))) {
                            httpURLConnection.addRequestProperty("x-afma-drt-v2-cookie", optJSONObject.optString(str3, str5));
                        }
                    } else {
                        zzaug.zzdy("DSID signal does not exist.");
                    }
                }
                if (zzapkVar == null || TextUtils.isEmpty(zzapkVar.zztf())) {
                    bArr = null;
                } else {
                    httpURLConnection.setDoOutput(true);
                    bArr = zzapkVar.zztf().getBytes();
                    httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                    try {
                        bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = null;
                    }
                    try {
                        bufferedOutputStream2.write(bArr);
                        IOUtils.closeQuietly(bufferedOutputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        IOUtils.closeQuietly(bufferedOutputStream);
                        throw th;
                    }
                }
                zzaxc zzaxcVar = new zzaxc();
                zzaxcVar.zza(httpURLConnection, bArr);
                responseCode = httpURLConnection.getResponseCode();
                for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                    String str6 = str3;
                    String key = entry.getKey();
                    String str7 = str4;
                    List<String> value = entry.getValue();
                    if (hashMap.containsKey(key)) {
                        ((List) hashMap.get(key)).addAll(value);
                    } else {
                        hashMap.put(key, new ArrayList(value));
                        str5 = str5;
                    }
                    str4 = str7;
                    str3 = str6;
                }
                String str8 = str3;
                String str9 = str4;
                String str10 = str5;
                zzaxcVar.zza(httpURLConnection, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    try {
                        inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = null;
                    }
                    try {
                        com.google.android.gms.ads.internal.zzq.zzkj();
                        String zza = zzaul.zza(inputStreamReader2);
                        IOUtils.closeQuietly(inputStreamReader2);
                        zzaxcVar.zzep(zza);
                        zzcfdVar.zzfvt = responseCode;
                        zzcfdVar.zzdko = zza;
                        zzcfdVar.zzab = hashMap;
                        if (TextUtils.isEmpty(zza)) {
                            if (!((Boolean) zzuv.zzon().zzd(zzza.zzcrn)).booleanValue()) {
                                throw new zzcek("No Fill", 3);
                            }
                        }
                        zzcfdVar.zzfvu = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - elapsedRealtime;
                        httpURLConnection.disconnect();
                        this.zzfvf.zztl();
                        return zzcfdVar;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = inputStreamReader2;
                        IOUtils.closeQuietly(inputStreamReader);
                        throw th;
                    }
                } else if (responseCode < 300 || responseCode >= 400) {
                    break;
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        zzaug.zzeu("No location header to follow redirect.");
                        throw new zzcek("No location header to follow redirect");
                    }
                    URL url2 = new URL(headerField);
                    i++;
                    if (i > ((Integer) zzuv.zzon().zzd(zzza.zzcqt)).intValue()) {
                        zzaug.zzeu("Too many redirects.");
                        throw new zzcek("Too many redirects");
                    }
                    httpURLConnection.disconnect();
                    this.zzfvf.zztl();
                    url = url2;
                    str5 = str10;
                    str4 = str9;
                    str3 = str8;
                    z = false;
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Received error HTTP response code: ");
            sb.append(responseCode);
            zzaug.zzeu(sb.toString());
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Received error HTTP response code: ");
            sb2.append(responseCode);
            throw new zzcek(sb2.toString());
        } catch (IOException e) {
            String valueOf3 = String.valueOf(e.getMessage());
            zzaug.zzeu(valueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf3) : new String("Error while connecting to ad server: "));
            String valueOf4 = String.valueOf(e.getMessage());
            throw new zzcek(valueOf4.length() != 0 ? "Error connecting to ad server:".concat(valueOf4) : new String("Error connecting to ad server:"), 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final /* synthetic */ zzcfd apply(zzcfa zzcfaVar) throws Exception {
        zzapk zzapkVar;
        zzapk zzapkVar2;
        JSONObject jSONObject;
        zzcfa zzcfaVar2 = zzcfaVar;
        zzapkVar = zzcfaVar2.zzfvm;
        String url = zzapkVar.getUrl();
        zzapkVar2 = zzcfaVar2.zzfvm;
        jSONObject = zzcfaVar2.zzfvl;
        return zza(url, zzapkVar2, jSONObject, this.zzdjp);
    }
}
