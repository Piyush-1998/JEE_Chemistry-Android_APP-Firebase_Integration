package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzc {
    public static boolean zzck(String str) {
        return zzh((String) zzuv.zzon().zzd(zzza.zzcrg), str);
    }

    private static boolean zzh(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
