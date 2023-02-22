package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrm implements zzcrr<Bundle> {
    private final String zzblz;
    private final int zzdjl;
    private final boolean zzdki;
    private final boolean zzdwh;
    private final boolean zzggb;
    private final int zzggc;
    private final int zzggd;

    public zzcrm(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.zzggb = z;
        this.zzdwh = z2;
        this.zzblz = str;
        this.zzdki = z3;
        this.zzdjl = i;
        this.zzggc = i2;
        this.zzggd = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.zzblz);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) zzuv.zzon().zzd(zzza.zzcnv));
        bundle2.putInt("target_api", this.zzdjl);
        bundle2.putInt("dv", this.zzggc);
        bundle2.putInt("lv", this.zzggd);
        Bundle zza = zzcwk.zza(bundle2, "sdk_env");
        zza.putBoolean("mf", ((Boolean) zzuv.zzon().zzd(zzza.zzcnx)).booleanValue());
        zza.putBoolean("instant_app", this.zzggb);
        zza.putBoolean("lite", this.zzdwh);
        zza.putBoolean("is_privileged_process", this.zzdki);
        bundle2.putBundle("sdk_env", zza);
        Bundle zza2 = zzcwk.zza(zza, "build_meta");
        zza2.putString("cl", "265976736");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}
