package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcho implements zzcga<zzbrs> {
    private final zzaxl zzblh;
    private final Executor zzfbx;
    private final zzcwe zzfga;
    private final zzbzl zzfnm;
    private final zzbso zzfxy;
    private final Context zzlk;

    public zzcho(Context context, zzaxl zzaxlVar, zzcwe zzcweVar, Executor executor, zzbso zzbsoVar, zzbzl zzbzlVar) {
        this.zzlk = context;
        this.zzfga = zzcweVar;
        this.zzfxy = zzbsoVar;
        this.zzfbx = executor;
        this.zzblh = zzaxlVar;
        this.zzfnm = zzbzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (zzcvrVar.zzgje == null || zzcvrVar.zzgje.zzdib == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<zzbrs> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar) {
        final zzcab zzcabVar = new zzcab();
        zzddi<zzbrs> zzb = zzdcy.zzb(zzdcy.zzah(null), new zzdcj(this, zzcvrVar, zzcabVar, zzcvzVar) { // from class: com.google.android.gms.internal.ads.zzchr
            private final zzcho zzfyl;
            private final zzcvr zzfym;
            private final zzcab zzfyn;
            private final zzcvz zzfyo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyl = this;
                this.zzfym = zzcvrVar;
                this.zzfyn = zzcabVar;
                this.zzfyo = zzcvzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfyl.zza(this.zzfym, this.zzfyn, this.zzfyo, obj);
            }
        }, this.zzfbx);
        zzcabVar.getClass();
        zzb.addListener(zzchq.zza(zzcabVar), this.zzfbx);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(final zzcvr zzcvrVar, zzcab zzcabVar, zzcvz zzcvzVar, Object obj) throws Exception {
        zzddi<?> zza;
        final zzbbw zza2 = this.zzfnm.zza(this.zzfga.zzbll, zzcvrVar.zzegg);
        zza2.zzaq(zzcvrVar.zzdlr);
        zzcabVar.zza(this.zzlk, zza2.getView());
        zzaxv zzaxvVar = new zzaxv();
        final zzbru zza3 = this.zzfxy.zza(new zzbla(zzcvzVar, zzcvrVar, null), new zzbrx(new zzchu(this.zzlk, this.zzblh, zzaxvVar, zzcvrVar, zza2), zza2));
        zzaxvVar.set(zza3);
        zza3.zzaci().zza(new zzbnj(zza2) { // from class: com.google.android.gms.internal.ads.zzcht
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
        return zzdcy.zzb(zza, new zzdal(this, zza2, zzcvrVar, zza3) { // from class: com.google.android.gms.internal.ads.zzchs
            private final zzcvr zzfea;
            private final zzbbw zzfpd;
            private final zzcho zzfyl;
            private final zzbru zzfyp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyl = this;
                this.zzfpd = zza2;
                this.zzfea = zzcvrVar;
                this.zzfyp = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj2) {
                zzbbw zzbbwVar = this.zzfpd;
                zzcvr zzcvrVar2 = this.zzfea;
                zzbru zzbruVar = this.zzfyp;
                if (zzcvrVar2.zzdnj) {
                    zzbbwVar.zzaac();
                }
                zzbbwVar.zzzj();
                if (((Boolean) zzuv.zzon().zzd(zzza.zzckb)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzq.zzkl();
                    zzaur.zza(zzbbwVar);
                }
                return zzbruVar.zzadh();
            }
        }, this.zzfbx);
    }
}
