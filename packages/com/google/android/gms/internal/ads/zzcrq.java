package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrq implements zzcru<zzcrr<Bundle>> {
    private final boolean zzggg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrq(zzcuf zzcufVar) {
        if (zzcufVar != null) {
            this.zzggg = zzcufVar.zzggg;
        } else {
            this.zzggg = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcrr<Bundle>> zzalv() {
        return zzdcy.zzah(this.zzggg ? zzcrp.zzggf : null);
    }
}
