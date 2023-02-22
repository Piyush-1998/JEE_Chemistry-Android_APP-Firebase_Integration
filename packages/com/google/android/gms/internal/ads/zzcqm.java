package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqm implements zzcrr<Bundle> {
    private final String zzlt;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    public zzcqm(String str) {
        this.zzlt = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        zzcwk.zza(bundle, "omid_v", this.zzlt);
    }
}
