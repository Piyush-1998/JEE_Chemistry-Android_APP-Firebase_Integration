package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcpl implements zzcrr<Bundle> {
    private final String zzdkk;
    private final Bundle zzgfe;

    private zzcpl(String str, Bundle bundle) {
        this.zzdkk = str;
        this.zzgfe = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.zzdkk);
        bundle2.putBundle("iab_consent_info", this.zzgfe);
    }
}
