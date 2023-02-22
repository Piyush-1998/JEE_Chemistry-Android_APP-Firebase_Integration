package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaeb implements zzaer<zzbbw> {
    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzbbw zzbbwVar, Map map) {
        zzbbw zzbbwVar2 = zzbbwVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzaug.zzeu("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzaug.zzeu("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzbbwVar2.zzxq().zza(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e) {
                    zzaug.zzd("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                zzaug.zzeu("No value given for CSI experiment.");
                return;
            }
            zzaab zzpy = zzbbwVar2.zzxq().zzpy();
            if (zzpy == null) {
                zzaug.zzeu("No ticker for WebView, dropping experiment ID.");
            } else {
                zzpy.zzj("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                zzaug.zzeu("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzaug.zzeu("No name given for CSI extra.");
            } else {
                zzaab zzpy2 = zzbbwVar2.zzxq().zzpy();
                if (zzpy2 == null) {
                    zzaug.zzeu("No ticker for WebView, dropping extra parameter.");
                } else {
                    zzpy2.zzj(str6, str7);
                }
            }
        }
    }
}
