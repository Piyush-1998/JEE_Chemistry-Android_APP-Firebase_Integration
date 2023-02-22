package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjd extends zzciw<zzbyz> {
    private final zzbpn zzerr;
    private final zzbei zzfza;
    private final zzbmk.zza zzfzb;

    public zzcjd(zzbei zzbeiVar, zzbmk.zza zzaVar, zzbpn zzbpnVar) {
        this.zzfza = zzbeiVar;
        this.zzfzb = zzaVar;
        this.zzerr = zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    protected final zzddi<zzbyz> zza(zzcwe zzcweVar, Bundle bundle) {
        return this.zzfza.zzabm().zze(this.zzfzb.zza(zzcweVar).zze(bundle).zzafy()).zze(this.zzerr).zzadn().zzaca().zzafs();
    }
}
