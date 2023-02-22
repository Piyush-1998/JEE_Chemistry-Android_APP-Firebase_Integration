package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzaxl;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzd {
    private long zzbku = 0;
    private Context zzlk;

    public final void zza(Context context, zzaxl zzaxlVar, String str, Runnable runnable) {
        zza(context, zzaxlVar, true, null, str, null, runnable);
    }

    public final void zza(Context context, zzaxl zzaxlVar, String str, zzats zzatsVar) {
        zza(context, zzaxlVar, false, zzatsVar, zzatsVar != null ? zzatsVar.zzuo() : null, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r11.zzum() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zza(android.content.Context r8, com.google.android.gms.internal.ads.zzaxl r9, boolean r10, com.google.android.gms.internal.ads.zzats r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) {
        /*
            r7 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzq.zzkq()
            long r0 = r0.elapsedRealtime()
            long r2 = r7.zzbku
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            java.lang.String r8 = "Not retrying to fetch app settings"
            com.google.android.gms.internal.ads.zzaug.zzeu(r8)
            return
        L17:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzq.zzkq()
            long r0 = r0.elapsedRealtime()
            r7.zzbku = r0
            r0 = 0
            r1 = 1
            if (r11 != 0) goto L27
        L25:
            r0 = 1
            goto L54
        L27:
            long r2 = r11.zzul()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzq.zzkq()
            long r4 = r4.currentTimeMillis()
            long r4 = r4 - r2
            com.google.android.gms.internal.ads.zzyp<java.lang.Long> r2 = com.google.android.gms.internal.ads.zzza.zzcoy
            com.google.android.gms.internal.ads.zzyw r3 = com.google.android.gms.internal.ads.zzuv.zzon()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 != 0) goto L25
            boolean r11 = r11.zzum()
            if (r11 != 0) goto L54
            goto L25
        L54:
            if (r0 != 0) goto L57
            return
        L57:
            if (r8 != 0) goto L5f
            java.lang.String r8 = "Context not provided to fetch application settings"
            com.google.android.gms.internal.ads.zzaug.zzeu(r8)
            return
        L5f:
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 == 0) goto L71
            boolean r11 = android.text.TextUtils.isEmpty(r13)
            if (r11 == 0) goto L71
            java.lang.String r8 = "App settings could not be fetched. Required parameters missing"
            com.google.android.gms.internal.ads.zzaug.zzeu(r8)
            return
        L71:
            android.content.Context r11 = r8.getApplicationContext()
            if (r11 == 0) goto L78
            goto L79
        L78:
            r11 = r8
        L79:
            r7.zzlk = r11
            com.google.android.gms.internal.ads.zzaio r11 = com.google.android.gms.ads.internal.zzq.zzkw()
            android.content.Context r0 = r7.zzlk
            com.google.android.gms.internal.ads.zzaix r9 = r11.zzb(r0, r9)
            com.google.android.gms.internal.ads.zzait<org.json.JSONObject> r11 = com.google.android.gms.internal.ads.zzais.zzday
            com.google.android.gms.internal.ads.zzait<org.json.JSONObject> r0 = com.google.android.gms.internal.ads.zzais.zzday
            java.lang.String r1 = "google.afma.config.fetchAppSettings"
            com.google.android.gms.internal.ads.zzaip r9 = r9.zza(r1, r11, r0)
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld2
            r11.<init>()     // Catch: java.lang.Exception -> Ld2
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Ld2
            if (r0 != 0) goto La0
            java.lang.String r13 = "app_id"
            r11.put(r13, r12)     // Catch: java.lang.Exception -> Ld2
            goto Lab
        La0:
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Ld2
            if (r12 != 0) goto Lab
            java.lang.String r12 = "ad_unit_id"
            r11.put(r12, r13)     // Catch: java.lang.Exception -> Ld2
        Lab:
            java.lang.String r12 = "is_init"
            r11.put(r12, r10)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r10 = "pn"
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> Ld2
            r11.put(r10, r8)     // Catch: java.lang.Exception -> Ld2
            com.google.android.gms.internal.ads.zzddi r8 = r9.zzi(r11)     // Catch: java.lang.Exception -> Ld2
            com.google.android.gms.internal.ads.zzdcj r9 = com.google.android.gms.ads.internal.zzf.zzbkv     // Catch: java.lang.Exception -> Ld2
            com.google.android.gms.internal.ads.zzddl r10 = com.google.android.gms.internal.ads.zzaxn.zzdwn     // Catch: java.lang.Exception -> Ld2
            com.google.android.gms.internal.ads.zzddi r9 = com.google.android.gms.internal.ads.zzdcy.zzb(r8, r9, r10)     // Catch: java.lang.Exception -> Ld2
            if (r14 == 0) goto Lcc
            com.google.android.gms.internal.ads.zzddl r10 = com.google.android.gms.internal.ads.zzaxn.zzdwn     // Catch: java.lang.Exception -> Ld2
            r8.addListener(r14, r10)     // Catch: java.lang.Exception -> Ld2
        Lcc:
            java.lang.String r8 = "ConfigLoader.maybeFetchNewAppSettings"
            com.google.android.gms.internal.ads.zzaxr.zza(r9, r8)     // Catch: java.lang.Exception -> Ld2
            return
        Ld2:
            r8 = move-exception
            java.lang.String r9 = "Error requesting application settings"
            com.google.android.gms.internal.ads.zzaug.zzc(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.zza(android.content.Context, com.google.android.gms.internal.ads.zzaxl, boolean, com.google.android.gms.internal.ads.zzats, java.lang.String, java.lang.String, java.lang.Runnable):void");
    }
}
