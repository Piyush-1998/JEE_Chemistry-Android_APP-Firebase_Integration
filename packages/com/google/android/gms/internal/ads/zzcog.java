package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcog implements zzcrr<Bundle> {
    private final zzuf zzgej;

    public zzcog(zzuf zzufVar) {
        this.zzgej = zzufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzuf zzufVar = this.zzgej;
        if (zzufVar != null) {
            if (zzufVar.orientation == 1) {
                bundle2.putString("avo", "p");
            } else if (this.zzgej.orientation == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
