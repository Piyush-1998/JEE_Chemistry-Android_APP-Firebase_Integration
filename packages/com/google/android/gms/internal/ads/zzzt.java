package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzzt {
    public static void zza(zzzr zzzrVar, zzzo zzzoVar) {
        if (zzzoVar.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzzoVar.zzkd())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzzrVar.zza(zzzoVar.getContext(), zzzoVar.zzkd(), zzzoVar.zzpv(), zzzoVar.zzpw());
    }
}
