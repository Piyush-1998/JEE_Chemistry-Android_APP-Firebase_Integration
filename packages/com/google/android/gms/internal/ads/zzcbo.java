package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbo {
    private final Executor executor;
    private final String packageName;
    private final zzaxm zzduy;
    private final Context zzlk;
    private final String zzcub = (String) zzuv.zzon().zzd(zzza.zzcil);
    private final Map<String, String> zzfse = new HashMap();

    public zzcbo(Executor executor, zzaxm zzaxmVar, Context context) {
        this.executor = executor;
        this.zzduy = zzaxmVar;
        this.zzlk = context;
        this.packageName = context.getPackageName();
        this.zzfse.put("s", "gmob_sdk");
        this.zzfse.put("v", "3");
        this.zzfse.put("os", Build.VERSION.RELEASE);
        this.zzfse.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.zzfse;
        com.google.android.gms.ads.internal.zzq.zzkj();
        map.put("device", zzaul.zzvn());
        this.zzfse.put("app", this.packageName);
        Map<String, String> map2 = this.zzfse;
        com.google.android.gms.ads.internal.zzq.zzkj();
        map2.put("is_lite_sdk", zzaul.zzay(this.zzlk) ? "1" : "0");
        this.zzfse.put("e", TextUtils.join(",", zzza.zzps()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.zzcub
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.appendQueryParameter(r2, r1)
            goto L12
        L2e:
            android.net.Uri r4 = r0.build()
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzyp<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzza.zzcik
            com.google.android.gms.internal.ads.zzyw r1 = com.google.android.gms.internal.ads.zzuv.zzon()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.zzyp<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzza.zzcmt
            com.google.android.gms.internal.ads.zzyw r1 = com.google.android.gms.internal.ads.zzuv.zzon()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5b
            goto L5d
        L5b:
            r0 = 0
            goto L5e
        L5d:
            r0 = 1
        L5e:
            if (r0 == 0) goto L6a
            java.util.concurrent.Executor r0 = r3.executor
            com.google.android.gms.internal.ads.zzcbr r1 = new com.google.android.gms.internal.ads.zzcbr
            r1.<init>(r3, r4)
            r0.execute(r1)
        L6a:
            com.google.android.gms.internal.ads.zzaug.zzdy(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbo.zzm(java.util.Map):void");
    }

    public final Map<String, String> zzajv() {
        return new HashMap(this.zzfse);
    }

    public final ConcurrentHashMap<String, String> zzajw() {
        return new ConcurrentHashMap<>(this.zzfse);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfx(String str) {
        this.zzduy.zzei(str);
    }
}
