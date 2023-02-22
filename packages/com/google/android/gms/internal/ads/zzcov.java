package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcov implements zzcrr<Bundle> {
    private final float zzdjk;
    private final int zzdme;
    private final boolean zzdmm;
    private final boolean zzdmn;
    private final int zzdmr;
    private final int zzdmv;
    private final int zzdmw;
    private final boolean zzgeu;

    public zzcov(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.zzdme = i;
        this.zzdmm = z;
        this.zzdmn = z2;
        this.zzdmr = i2;
        this.zzdmv = i3;
        this.zzdmw = i4;
        this.zzdjk = f;
        this.zzgeu = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.zzdme);
        bundle2.putBoolean("ma", this.zzdmm);
        bundle2.putBoolean("sp", this.zzdmn);
        bundle2.putInt("muv", this.zzdmr);
        bundle2.putInt("rm", this.zzdmv);
        bundle2.putInt("riv", this.zzdmw);
        bundle2.putFloat("android_app_volume", this.zzdjk);
        bundle2.putBoolean("android_app_muted", this.zzgeu);
    }
}
