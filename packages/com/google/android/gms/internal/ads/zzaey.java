package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaey implements zzaer<Object> {
    private final zzafb zzcyf;

    public static void zza(zzbbw zzbbwVar, zzafb zzafbVar) {
        zzbbwVar.zza("/reward", new zzaey(zzafbVar));
    }

    private zzaey(zzafb zzafbVar) {
        this.zzcyf = zzafbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzaqt zzaqtVar = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzaqtVar = new zzaqt(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzaug.zzd("Unable to parse reward amount.", e);
            }
            this.zzcyf.zza(zzaqtVar);
        } else if ("video_start".equals(str)) {
            this.zzcyf.zzra();
        } else if ("video_complete".equals(str)) {
            this.zzcyf.zzrb();
        }
    }
}
