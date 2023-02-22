package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzatl implements zzatn {
    @Override // com.google.android.gms.internal.ads.zzatn
    public final zzddi<String> zza(String str, PackageInfo packageInfo) {
        return zzdcy.zzah(str);
    }

    @Override // com.google.android.gms.internal.ads.zzatn
    public final zzddi<AdvertisingIdClient.Info> zzak(Context context) {
        zzaxv zzaxvVar = new zzaxv();
        zzuv.zzoj();
        if (zzawy.zzbk(context)) {
            zzaxn.zzdwi.execute(new zzato(this, context, zzaxvVar));
        }
        return zzaxvVar;
    }
}
