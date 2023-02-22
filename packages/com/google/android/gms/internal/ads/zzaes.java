package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaes implements zzaer<zzbbw> {
    private static final Map<String, Integer> zzcya = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzc zzcxx;
    private final zzamz zzcxy;
    private final zzani zzcxz;

    public zzaes(com.google.android.gms.ads.internal.zzc zzcVar, zzamz zzamzVar, zzani zzaniVar) {
        this.zzcxx = zzcVar;
        this.zzcxy = zzamzVar;
        this.zzcxz = zzaniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final /* synthetic */ void zza(zzbbw zzbbwVar, Map map) {
        com.google.android.gms.ads.internal.zzc zzcVar;
        zzbbw zzbbwVar2 = zzbbwVar;
        int intValue = zzcya.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzcVar = this.zzcxx) != null && !zzcVar.zzjk()) {
            this.zzcxx.zzbl(null);
        } else if (intValue == 1) {
            this.zzcxy.zzg(map);
        } else if (intValue == 3) {
            new zzana(zzbbwVar2, map).execute();
        } else if (intValue == 4) {
            new zzamu(zzbbwVar2, map).execute();
        } else if (intValue == 5) {
            new zzanb(zzbbwVar2, map).execute();
        } else if (intValue == 6) {
            this.zzcxy.zzv(true);
        } else if (intValue == 7) {
            this.zzcxz.zzsm();
        } else {
            zzaug.zzet("Unknown MRAID command called.");
        }
    }
}
