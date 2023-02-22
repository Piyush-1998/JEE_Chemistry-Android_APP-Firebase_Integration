package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbas implements zzbbf {
    @Override // com.google.android.gms.internal.ads.zzbbf
    public final zzbax zza(zzazj zzazjVar, int i, String str, zzazk zzazkVar) {
        if (Build.VERSION.SDK_INT >= 16 && i > 0 && Arrays.asList(zzazkVar.zzeam.split(",")).contains("3")) {
            int zzyq = zzbag.zzyq();
            if (zzyq < zzazkVar.zzeap) {
                return new zzbbm(zzazjVar, zzazkVar);
            }
            if (zzyq < zzazkVar.zzeaj) {
                return new zzbbj(zzazjVar, zzazkVar);
            }
            return new zzbbh(zzazjVar);
        }
        return new zzbbi(zzazjVar);
    }
}
