package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzanb {
    private final zzbbw zzczi;
    private final boolean zzdgc;
    private final String zzdgd;

    public zzanb(zzbbw zzbbwVar, Map<String, String> map) {
        this.zzczi = zzbbwVar;
        this.zzdgd = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzdgc = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.zzdgc = true;
        }
    }

    public final void execute() {
        int zzvq;
        if (this.zzczi == null) {
            zzaug.zzeu("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.zzdgd)) {
            com.google.android.gms.ads.internal.zzq.zzkl();
            zzvq = 7;
        } else if ("landscape".equalsIgnoreCase(this.zzdgd)) {
            com.google.android.gms.ads.internal.zzq.zzkl();
            zzvq = 6;
        } else {
            zzvq = this.zzdgc ? -1 : com.google.android.gms.ads.internal.zzq.zzkl().zzvq();
        }
        this.zzczi.setRequestedOrientation(zzvq);
    }
}
