package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzciu extends zzciw<zzbkq> {
    private final zzbth zzelt;
    private final zzbpn zzerr;
    private final zzbei zzfza;
    private final zzbmk.zza zzfzb;

    public zzciu(zzbei zzbeiVar, zzbth zzbthVar, zzbmk.zza zzaVar, zzbpn zzbpnVar) {
        this.zzfza = zzbeiVar;
        this.zzelt = zzbthVar;
        this.zzfzb = zzaVar;
        this.zzerr = zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    protected final zzddi<zzbkq> zza(zzcwe zzcweVar, Bundle bundle) {
        return this.zzfza.zzabl().zza(this.zzfzb.zza(zzcweVar).zze(bundle).zzafy()).zza(this.zzerr).zza(this.zzelt).zzacd().zzaca().zzafs();
    }
}
