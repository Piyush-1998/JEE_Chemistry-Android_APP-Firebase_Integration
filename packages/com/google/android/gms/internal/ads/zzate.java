package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzate {
    public static String zzd(String str, Context context, boolean z) {
        String zzag;
        if ((!((Boolean) zzuv.zzon().zzd(zzza.zzcjq)).booleanValue() || z) && com.google.android.gms.ads.internal.zzq.zzlh().zzab(context) && !TextUtils.isEmpty(str) && (zzag = com.google.android.gms.ads.internal.zzq.zzlh().zzag(context)) != null) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcji)).booleanValue()) {
                CharSequence charSequence = (String) zzuv.zzon().zzd(zzza.zzcjj);
                if (str.contains(charSequence)) {
                    if (com.google.android.gms.ads.internal.zzq.zzkj().zzef(str)) {
                        com.google.android.gms.ads.internal.zzq.zzlh().zzh(context, zzag);
                        return str.replace(charSequence, zzag);
                    } else if (com.google.android.gms.ads.internal.zzq.zzkj().zzeg(str)) {
                        com.google.android.gms.ads.internal.zzq.zzlh().zzi(context, zzag);
                        return str.replace(charSequence, zzag);
                    } else {
                        return str;
                    }
                }
                return str;
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (com.google.android.gms.ads.internal.zzq.zzkj().zzef(str)) {
                    com.google.android.gms.ads.internal.zzq.zzlh().zzh(context, zzag);
                    return zza(str, "fbs_aeid", zzag).toString();
                } else if (com.google.android.gms.ads.internal.zzq.zzkj().zzeg(str)) {
                    com.google.android.gms.ads.internal.zzq.zzlh().zzi(context, zzag);
                    return zza(str, "fbs_aeid", zzag).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    public static String zzc(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzq.zzlh().zzab(context)) {
            return uri.toString();
        }
        String zzag = com.google.android.gms.ads.internal.zzq.zzlh().zzag(context);
        if (zzag == null) {
            return uri.toString();
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcji)).booleanValue()) {
            String str = (String) zzuv.zzon().zzd(zzza.zzcjj);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                com.google.android.gms.ads.internal.zzq.zzlh().zzh(context, zzag);
                return uri2.replace(str, zzag);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = zza(uri.toString(), "fbs_aeid", zzag);
            com.google.android.gms.ads.internal.zzq.zzlh().zzh(context, zzag);
        }
        return uri.toString();
    }

    private static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }
}
