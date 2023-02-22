package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcpv implements zzcrr<Bundle> {
    private final Bundle zzdjt;

    public zzcpv(Bundle bundle) {
        this.zzdjt = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzcwk.zza(bundle2, "device");
        zza.putBundle("android_mem_info", this.zzdjt);
        bundle2.putBundle("device", zza);
    }
}
