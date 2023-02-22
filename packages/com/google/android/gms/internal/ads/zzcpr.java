package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcpr implements zzcrr<Bundle> {
    private final String zzdju;
    private final boolean zzdjw;

    public zzcpr(String str, boolean z) {
        this.zzdju = str;
        this.zzdjw = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.zzdju);
        if (this.zzdjw) {
            bundle2.putString("de", "1");
        }
    }
}
