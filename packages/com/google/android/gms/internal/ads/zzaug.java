package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaug extends zzaxi {
    public static void zzdy(String str) {
        if (zzuu()) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    public static void zza(String str, Throwable th) {
        if (zzuu()) {
            Log.v(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzuu() {
        if (isLoggable(2)) {
            return ((Boolean) zzuv.zzon().zzd(zzza.zzclv)).booleanValue();
        }
        return false;
    }
}
