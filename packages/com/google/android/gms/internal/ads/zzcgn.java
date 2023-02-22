package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcgn implements zzcga<zzbio> {
    private final Executor zzfbx;
    private final zzcwe zzfga;
    private final zzbzl zzfnm;
    private final zzbjn zzfxm;
    private final zzdal<zzcvr, zzavd> zzfxn;
    private final Context zzlk;

    public zzcgn(zzbjn zzbjnVar, Context context, Executor executor, zzbzl zzbzlVar, zzcwe zzcweVar, zzdal<zzcvr, zzavd> zzdalVar) {
        this.zzlk = context;
        this.zzfxm = zzbjnVar;
        this.zzfbx = executor;
        this.zzfnm = zzbzlVar;
        this.zzfga = zzcweVar;
        this.zzfxn = zzdalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (zzcvrVar.zzgje == null || zzcvrVar.zzgje.zzdib == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<zzbio> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar) {
        return zzdcy.zzb(zzdcy.zzah(null), new zzdcj(this, zzcvzVar, zzcvrVar) { // from class: com.google.android.gms.internal.ads.zzcgm
            private final zzcvr zzfea;
            private final zzcvz zzfom;
            private final zzcgn zzfxl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxl = this;
                this.zzfom = zzcvzVar;
                this.zzfea = zzcvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfxl.zzb(this.zzfom, this.zzfea, obj);
            }
        }, this.zzfbx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzbbw zzbbwVar) {
        zzbbwVar.zzzj();
        zzbco zzxl = zzbbwVar.zzxl();
        if (this.zzfga.zzgkf == null || zzxl == null) {
            return;
        }
        zzxl.zzb(this.zzfga.zzgkf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, Object obj) throws Exception {
        zzua zza = zzcwi.zza(this.zzlk, zzcvrVar.zzgjg);
        final zzbbw zzc = this.zzfnm.zzc(zza);
        zzc.zzaq(zzcvrVar.zzdlr);
        zzbjn zzbjnVar = this.zzfxm;
        zzbla zzblaVar = new zzbla(zzcvzVar, zzcvrVar, null);
        zzbzy zzbzyVar = new zzbzy(this.zzlk, zzc.getView(), this.zzfxn.apply(zzcvrVar));
        zzc.getClass();
        final zzbir zza2 = zzbjnVar.zza(zzblaVar, new zzbiv(zzbzyVar, zzc, zzcgp.zzp(zzc), zzcwi.zze(zza)));
        zza2.zzacw().zzb(zzc, false);
        zza2.zzaci().zza(new zzbnj(zzc) { // from class: com.google.android.gms.internal.ads.zzcgo
            private final zzbbw zzehv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehv = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbnj
            public final void onAdImpression() {
                zzbbw zzbbwVar = this.zzehv;
                if (zzbbwVar.zzzp() != null) {
                    zzbbwVar.zzzp().zzzb();
                }
            }
        }, zzaxn.zzdwn);
        zza2.zzacw();
        zzddi<?> zza3 = zzbzn.zza(zzc, zzcvrVar.zzgje.zzdhz, zzcvrVar.zzgje.zzdib);
        if (zzcvrVar.zzdnj) {
            zzc.getClass();
            zza3.addListener(zzcgr.zzh(zzc), this.zzfbx);
        }
        zza3.addListener(new Runnable(this, zzc) { // from class: com.google.android.gms.internal.ads.zzcgq
            private final zzbbw zzfpd;
            private final zzcgn zzfxl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxl = this;
                this.zzfpd = zzc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfxl.zzo(this.zzfpd);
            }
        }, this.zzfbx);
        return zzdcy.zzb(zza3, new zzdal(zza2) { // from class: com.google.android.gms.internal.ads.zzcgt
            private final zzbir zzfxp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxp = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj2) {
                return this.zzfxp.zzadc();
            }
        }, zzaxn.zzdwn);
    }
}
