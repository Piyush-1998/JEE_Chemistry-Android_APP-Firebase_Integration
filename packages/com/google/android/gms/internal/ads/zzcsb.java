package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsb implements zzcrr<Bundle> {
    private final String zzdmh;
    private final int zzdms;
    private final int zzdmt;
    private final int zzdmu;
    private final boolean zzdmz;
    private final int zzdna;

    public zzcsb(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zzdmh = str;
        this.zzdms = i;
        this.zzdmt = i2;
        this.zzdmu = i3;
        this.zzdmz = z;
        this.zzdna = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.zzdmh;
        zzcwk.zza(bundle2, "carrier", str, !TextUtils.isEmpty(str));
        zzcwk.zza(bundle2, "cnt", Integer.valueOf(this.zzdms), this.zzdms != -2);
        bundle2.putInt("gnt", this.zzdmt);
        bundle2.putInt("pt", this.zzdmu);
        Bundle zza = zzcwk.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzcwk.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzdna);
        zza2.putBoolean("active_network_metered", this.zzdmz);
    }
}
