package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcoz implements zzcrr<Bundle> {
    private final double zzdmx;
    private final boolean zzdmy;

    public zzcoz(double d, boolean z) {
        this.zzdmx = d;
        this.zzdmy = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzcwk.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzcwk.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzdmy);
        zza2.putDouble("battery_level", this.zzdmx);
    }
}
