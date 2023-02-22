package com.google.android.gms.internal.ads;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzauz extends zzava {
    @Override // com.google.android.gms.internal.ads.zzaur
    public final zzsv zza(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzq.zzkj();
        if (zzaul.zzq(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzsv.ENUM_TRUE : zzsv.ENUM_FALSE;
        }
        return zzsv.ENUM_FALSE;
    }
}
