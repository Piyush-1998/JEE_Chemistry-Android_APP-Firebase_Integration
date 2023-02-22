package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjb extends zzciw<zzbrs> {
    private final zzbpn zzerr;
    private final zzcle zzewq;
    private final zzbei zzfza;
    private final zzbmk.zza zzfzb;

    public zzcjb(zzbei zzbeiVar, zzbmk.zza zzaVar, zzcle zzcleVar, zzbpn zzbpnVar) {
        this.zzfza = zzbeiVar;
        this.zzfzb = zzaVar;
        this.zzewq = zzcleVar;
        this.zzerr = zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    protected final zzddi<zzbrs> zza(zzcwe zzcweVar, Bundle bundle) {
        return this.zzfza.zzabk().zzd(this.zzfzb.zza(zzcweVar).zze(bundle).zzafy()).zzd(this.zzerr).zzb(this.zzewq).zzadf().zzaca().zzafs();
    }
}
