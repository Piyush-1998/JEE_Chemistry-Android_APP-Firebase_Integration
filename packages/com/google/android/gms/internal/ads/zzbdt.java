package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbdt implements zzaer<zzbbw> {
    private final /* synthetic */ zzbdr zzeie;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdt(zzbdr zzbdrVar) {
        this.zzeie = zzbdrVar;
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
                synchronized (this.zzeie) {
                    i = this.zzeie.zzeha;
                    if (i != parseInt) {
                        this.zzeie.zzeha = parseInt;
                        this.zzeie.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzaug.zzd("Exception occurred while getting webview content height", e);
            }
        }
    }
}
