package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzo {
    private String zzblz;
    private String zzcub = (String) zzuv.zzon().zzd(zzza.zzcil);
    private Map<String, String> zzcuc;
    private Context zzlk;

    public zzzo(Context context, String str) {
        String packageName;
        this.zzlk = null;
        this.zzblz = null;
        this.zzlk = context;
        this.zzblz = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzcuc = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzcuc.put("v", "3");
        this.zzcuc.put("os", Build.VERSION.RELEASE);
        this.zzcuc.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.zzcuc;
        com.google.android.gms.ads.internal.zzq.zzkj();
        map.put("device", zzaul.zzvn());
        Map<String, String> map2 = this.zzcuc;
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        map2.put("app", packageName);
        Map<String, String> map3 = this.zzcuc;
        com.google.android.gms.ads.internal.zzq.zzkj();
        map3.put("is_lite_sdk", zzaul.zzay(context) ? "1" : "0");
        Future<zzapj> zzt = com.google.android.gms.ads.internal.zzq.zzku().zzt(this.zzlk);
        try {
            this.zzcuc.put("network_coarse", Integer.toString(zzt.get().zzdms));
            this.zzcuc.put("network_fine", Integer.toString(zzt.get().zzdmt));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzpv() {
        return this.zzcub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context getContext() {
        return this.zzlk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkd() {
        return this.zzblz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzpw() {
        return this.zzcuc;
    }
}
