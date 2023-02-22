package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzciz extends zzciw<zzbio> {
    private final zzbth zzelt;
    private final zzbpn zzerr;
    private final zzcle zzewq;
    private final ViewGroup zzfdl;
    private final zzbou zzffd;
    private final zzbei zzfza;
    private final zzbmk.zza zzfzb;

    public zzciz(zzbei zzbeiVar, zzbmk.zza zzaVar, zzcle zzcleVar, zzbpn zzbpnVar, zzbth zzbthVar, zzbou zzbouVar, ViewGroup viewGroup) {
        this.zzfza = zzbeiVar;
        this.zzfzb = zzaVar;
        this.zzewq = zzcleVar;
        this.zzerr = zzbpnVar;
        this.zzelt = zzbthVar;
        this.zzffd = zzbouVar;
        this.zzfdl = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    protected final zzddi<zzbio> zza(zzcwe zzcweVar, Bundle bundle) {
        return this.zzfza.zzabi().zzc(this.zzfzb.zza(zzcweVar).zze(bundle).zzafy()).zzc(this.zzerr).zza(this.zzewq).zzb(this.zzelt).zza(new zzbkh(this.zzffd)).zzb(new zzbin(this.zzfdl)).zzacz().zzaca().zzafs();
    }
}
