package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmd implements zzbpc {
    private final zzaxl zzblh;
    private final zzaui zzdrp;
    private final zzccj zzfak;
    private final zzcwe zzfga;
    private final Context zzzc;

    public zzbmd(Context context, zzcwe zzcweVar, zzaxl zzaxlVar, zzaui zzauiVar, zzccj zzccjVar) {
        this.zzzc = context;
        this.zzfga = zzcweVar;
        this.zzblh = zzaxlVar;
        this.zzdrp = zzauiVar;
        this.zzfak = zzccjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zza(zzcvz zzcvzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzb(zzape zzapeVar) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcow)).booleanValue()) {
            com.google.android.gms.ads.internal.zzq.zzkr().zza(this.zzzc, this.zzblh, this.zzfga.zzgkh, this.zzdrp.zzve());
        }
        this.zzfak.zzaka();
    }
}
