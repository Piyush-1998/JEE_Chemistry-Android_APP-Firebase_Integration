package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzaul;
import com.google.android.gms.internal.ads.zzuv;
import com.google.android.gms.internal.ads.zzza;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzb {
    public static boolean zza(Context context, zzd zzdVar, zzt zztVar) {
        int i = 0;
        if (zzdVar == null) {
            zzaug.zzeu("No intent data for launcher overlay.");
            return false;
        }
        zzza.initialize(context);
        if (zzdVar.intent != null) {
            return zza(context, zzdVar.intent, zztVar);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzdVar.url)) {
            zzaug.zzeu("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzdVar.mimeType)) {
            intent.setDataAndType(Uri.parse(zzdVar.url), zzdVar.mimeType);
        } else {
            intent.setData(Uri.parse(zzdVar.url));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzdVar.packageName)) {
            intent.setPackage(zzdVar.packageName);
        }
        if (!TextUtils.isEmpty(zzdVar.zzdhn)) {
            String[] split = zzdVar.zzdhn.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzdVar.zzdhn);
                zzaug.zzeu(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str = zzdVar.zzdho;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzaug.zzeu("Could not parse intent flags.");
            }
            intent.addFlags(i);
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcpz)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcpy)).booleanValue()) {
                com.google.android.gms.ads.internal.zzq.zzkj();
                zzaul.zzb(context, intent);
            }
        }
        return zza(context, intent, zztVar);
    }

    private static boolean zza(Context context, Intent intent, zzt zztVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzaug.zzdy(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.zzq.zzkj();
            zzaul.zza(context, intent);
            if (zztVar != null) {
                zztVar.zzsy();
                return true;
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzaug.zzeu(e.getMessage());
            return false;
        }
    }
}
