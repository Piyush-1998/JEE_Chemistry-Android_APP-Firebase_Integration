package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazb extends zzayt {
    @Override // com.google.android.gms.internal.ads.zzayt
    public final zzayu zza(Context context, zzazj zzazjVar, int i, boolean z, zzaab zzaabVar, zzazk zzazkVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        boolean z2 = true;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            zzazm zzazmVar = new zzazm(context, zzazjVar.zzxr(), zzazjVar.zzxp(), zzaabVar, zzazjVar.zzxm());
            if (((Build.VERSION.SDK_INT < 16 || i != 2) ? false : false) && Arrays.asList(zzazkVar.zzeam.split(",")).contains("3")) {
                return new zzazq(context, zzazmVar, zzazjVar, z, zza(zzazjVar), zzazkVar);
            }
            return new zzayh(context, z, zza(zzazjVar), zzazkVar, new zzazm(context, zzazjVar.zzxr(), zzazjVar.zzxp(), zzaabVar, zzazjVar.zzxm()));
        }
        return null;
    }
}
