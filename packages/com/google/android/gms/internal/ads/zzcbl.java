package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbl {
    private ConcurrentHashMap<String, String> zzfry;

    public zzcbl(zzcbo zzcboVar) {
        this.zzfry = zzcboVar.zzajw();
    }

    public final void zzb(zzcvz zzcvzVar) {
        if (zzcvzVar.zzgkb.zzgjx.size() > 0) {
            int i = zzcvzVar.zzgkb.zzgjx.get(0).zzfis;
            if (i == 1) {
                this.zzfry.put("ad_format", "banner");
            } else if (i == 2) {
                this.zzfry.put("ad_format", "interstitial");
            } else if (i == 3) {
                this.zzfry.put("ad_format", "native_express");
            } else if (i == 4) {
                this.zzfry.put("ad_format", "native_advanced");
            } else if (i == 5) {
                this.zzfry.put("ad_format", "rewarded");
            } else {
                this.zzfry.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
            }
            if (TextUtils.isEmpty(zzcvzVar.zzgkb.zzgjy.zzbzn)) {
                return;
            }
            this.zzfry.put("gqi", zzcvzVar.zzgkb.zzgjy.zzbzn);
        }
    }

    public final void zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zzfry.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zzfry.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzqd() {
        return this.zzfry;
    }
}
