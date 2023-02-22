package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcju implements zzcga<zzbyz> {
    private final zzaxl zzblh;
    private final Executor zzfbx;
    private final zzcwe zzfga;
    private final zzbzl zzfnm;
    private final zzbzc zzfzm;
    private final Context zzlk;

    public zzcju(Context context, zzaxl zzaxlVar, zzcwe zzcweVar, Executor executor, zzbzc zzbzcVar, zzbzl zzbzlVar) {
        this.zzlk = context;
        this.zzfga = zzcweVar;
        this.zzfzm = zzbzcVar;
        this.zzfbx = executor;
        this.zzblh = zzaxlVar;
        this.zzfnm = zzbzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (zzcvrVar.zzgje == null || zzcvrVar.zzgje.zzdib == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<zzbyz> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar) {
        final zzcab zzcabVar = new zzcab();
        zzddi<zzbyz> zzb = zzdcy.zzb(zzdcy.zzah(null), new zzdcj(this, zzcvrVar, zzcabVar, zzcvzVar) { // from class: com.google.android.gms.internal.ads.zzcjx
            private final zzcvr zzfym;
            private final zzcab zzfyn;
            private final zzcvz zzfyo;
            private final zzcju zzfzr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzr = this;
                this.zzfym = zzcvrVar;
                this.zzfyn = zzcabVar;
                this.zzfyo = zzcvzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfzr.zzb(this.zzfym, this.zzfyn, this.zzfyo, obj);
            }
        }, this.zzfbx);
        zzcabVar.getClass();
        zzb.addListener(zzcjw.zza(zzcabVar), this.zzfbx);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzb(final zzcvr zzcvrVar, zzcab zzcabVar, zzcvz zzcvzVar, Object obj) throws Exception {
        zzddi<?> zza;
        final zzbbw zza2 = this.zzfnm.zza(this.zzfga.zzbll, zzcvrVar.zzegg);
        zza2.zzaq(zzcvrVar.zzdlr);
        zzcabVar.zza(this.zzlk, zza2.getView());
        zzaxv zzaxvVar = new zzaxv();
        final zzbzb zza3 = this.zzfzm.zza(new zzbla(zzcvzVar, zzcvrVar, null), new zzbza(new zzcka(this.zzlk, this.zzfnm, this.zzfga, this.zzblh, zzcvrVar, zzaxvVar, zza2), zza2));
        zzaxvVar.set(zza3);
        zzaey.zza(zza2, zza3.zzadq());
        zza3.zzaci().zza(new zzbnj(zza2) { // from class: com.google.android.gms.internal.ads.zzcjz
            private final zzbbw zzehv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehv = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzbnj
            public final void onAdImpression() {
                zzbbw zzbbwVar = this.zzehv;
                if (zzbbwVar.zzzp() != null) {
                    zzbbwVar.zzzp().zzzb();
                }
            }
        }, zzaxn.zzdwn);
        zza3.zzacw().zzb(zza2, true);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcth)).booleanValue() && zzcvrVar.zzegg) {
            zza = zzdcy.zzah(null);
        } else {
            zza3.zzacw();
            zza = zzbzn.zza(zza2, zzcvrVar.zzgje.zzdhz, zzcvrVar.zzgje.zzdib);
        }
        return zzdcy.zzb(zza, new zzdal(this, zza2, zzcvrVar, zza3) { // from class: com.google.android.gms.internal.ads.zzcjy
            private final zzcvr zzfea;
            private final zzbbw zzfpd;
            private final zzcju zzfzr;
            private final zzbzb zzfzs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzr = this;
                this.zzfpd = zza2;
                this.zzfea = zzcvrVar;
                this.zzfzs = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj2) {
                zzbbw zzbbwVar = this.zzfpd;
                zzcvr zzcvrVar2 = this.zzfea;
                zzbzb zzbzbVar = this.zzfzs;
                if (zzcvrVar2.zzdnj) {
                    zzbbwVar.zzaac();
                }
                zzbbwVar.zzzj();
                if (((Boolean) zzuv.zzon().zzd(zzza.zzckb)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzq.zzkl();
                    zzaur.zza(zzbbwVar);
                }
                return zzbzbVar.zzadp();
            }
        }, this.zzfbx);
    }
}
