package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcop implements zzcrr<Bundle> {
    private final boolean zzgeo = false;
    private final boolean zzgep = false;
    private final boolean zzgeq;

    public zzcop(boolean z, boolean z2, boolean z3) {
        this.zzgeq = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("c_pcbg", this.zzgeo);
        bundle2.putBoolean("c_phbg", this.zzgep);
        bundle2.putBoolean("ar_lr", this.zzgeq);
    }
}
