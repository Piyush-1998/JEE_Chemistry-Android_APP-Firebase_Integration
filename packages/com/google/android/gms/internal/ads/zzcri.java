package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcri implements zzcrr<Bundle> {
    private final String zzdpj;
    private final String zzgfw;
    private final String zzgfx;
    private final String zzgfy;
    private final Long zzgfz;

    public zzcri(String str, String str2, String str3, String str4, Long l) {
        this.zzdpj = str;
        this.zzgfw = str2;
        this.zzgfx = str3;
        this.zzgfy = str4;
        this.zzgfz = l;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzcwk.zza(bundle2, "gmp_app_id", this.zzdpj);
        zzcwk.zza(bundle2, "fbs_aiid", this.zzgfw);
        zzcwk.zza(bundle2, "fbs_aeid", this.zzgfx);
        zzcwk.zza(bundle2, "apm_id_origin", this.zzgfy);
        Long l = this.zzgfz;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
