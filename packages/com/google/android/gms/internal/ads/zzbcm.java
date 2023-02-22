package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbcm implements zzaer<zzbbw> {
    private final /* synthetic */ zzbck zzehj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcm(zzbck zzbckVar) {
        this.zzehj = zzbckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzbbw zzbbwVar, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zzehj) {
                    i = this.zzehj.zzeha;
                    if (i != parseInt) {
                        this.zzehj.zzeha = parseInt;
                        this.zzehj.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzaug.zzd("Exception occurred while getting webview content height", e);
            }
        }
    }
}
