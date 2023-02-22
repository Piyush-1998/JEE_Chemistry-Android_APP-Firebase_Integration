package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcka implements zzbsu {
    private final zzaxl zzblh;
    private final zzcvr zzfet;
    private final zzcwe zzfga;
    private final zzbzl zzfnm;
    private final zzddi<zzbzb> zzfyq;
    private final zzbbw zzfzt;
    private final Context zzlk;

    private zzcka(Context context, zzbzl zzbzlVar, zzcwe zzcweVar, zzaxl zzaxlVar, zzcvr zzcvrVar, zzddi<zzbzb> zzddiVar, zzbbw zzbbwVar) {
        this.zzlk = context;
        this.zzfnm = zzbzlVar;
        this.zzfga = zzcweVar;
        this.zzblh = zzaxlVar;
        this.zzfet = zzcvrVar;
        this.zzfyq = zzddiVar;
        this.zzfzt = zzbbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zza(boolean z, Context context) {
        zzbbw zzbbwVar;
        zzbbw zzbbwVar2;
        zzbzb zzbzbVar = (zzbzb) zzdcy.zzc(this.zzfyq);
        try {
            zzcvr zzcvrVar = this.zzfet;
            if (!this.zzfzt.zzaae()) {
                zzbbwVar2 = this.zzfzt;
            } else {
                if (!((Boolean) zzuv.zzon().zzd(zzza.zzckf)).booleanValue()) {
                    zzbbwVar2 = this.zzfzt;
                } else {
                    final zzbbw zzc = this.zzfnm.zzc(this.zzfga.zzbll);
                    zzaey.zza(zzc, zzbzbVar.zzadq());
                    final zzcab zzcabVar = new zzcab();
                    zzcabVar.zza(this.zzlk, zzc.getView());
                    zzbzbVar.zzacw().zzb(zzc, true);
                    zzc.zzzp().zza(new zzbdf(zzcabVar, zzc) { // from class: com.google.android.gms.internal.ads.zzckd
                        private final zzbbw zzfpd;
                        private final zzcab zzfyk;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfyk = zzcabVar;
                            this.zzfpd = zzc;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbdf
                        public final void zzad(boolean z2) {
                            zzcab zzcabVar2 = this.zzfyk;
                            zzbbw zzbbwVar3 = this.zzfpd;
                            zzcabVar2.zzajm();
                            zzbbwVar3.zzzj();
                            zzbbwVar3.zzzp().zzzb();
                        }
                    });
                    zzbdg zzzp = zzc.zzzp();
                    zzc.getClass();
                    zzzp.zza(zzckc.zzq(zzc));
                    zzc.zzb(zzcvrVar.zzgje.zzdhz, zzcvrVar.zzgje.zzdib, null);
                    zzbbwVar = zzc;
                    zzbbwVar.zzas(true);
                    com.google.android.gms.ads.internal.zzq.zzkj();
                    com.google.android.gms.ads.internal.zzg zzgVar = new com.google.android.gms.ads.internal.zzg(false, zzaul.zzbb(this.zzlk), false, 0.0f, -1, z, this.zzfet.zzgjl, this.zzfet.zzble);
                    com.google.android.gms.ads.internal.zzq.zzki();
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zztp) null, zzbzbVar.zzadj(), (com.google.android.gms.ads.internal.overlay.zzt) null, zzbbwVar, this.zzfet.zzgjm, this.zzblh, this.zzfet.zzdkv, zzgVar, this.zzfet.zzgje.zzdhz, this.zzfet.zzgje.zzdib), true);
                }
            }
            zzbbwVar = zzbbwVar2;
            zzbbwVar.zzas(true);
            com.google.android.gms.ads.internal.zzq.zzkj();
            com.google.android.gms.ads.internal.zzg zzgVar2 = new com.google.android.gms.ads.internal.zzg(false, zzaul.zzbb(this.zzlk), false, 0.0f, -1, z, this.zzfet.zzgjl, this.zzfet.zzble);
            com.google.android.gms.ads.internal.zzq.zzki();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zztp) null, zzbzbVar.zzadj(), (com.google.android.gms.ads.internal.overlay.zzt) null, zzbbwVar, this.zzfet.zzgjm, this.zzblh, this.zzfet.zzdkv, zzgVar2, this.zzfet.zzgje.zzdhz, this.zzfet.zzgje.zzdib), true);
        } catch (zzbcf e) {
            zzaxi.zzc("", e);
        }
    }
}
