package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcgg implements zzcga<zzbii> {
    private final Executor zzfbx;
    private final zzcwe zzfga;
    private final zzbzl zzfnm;
    private final zzbie zzfxh;
    private final Context zzlk;

    public zzcgg(zzbie zzbieVar, Context context, Executor executor, zzbzl zzbzlVar, zzcwe zzcweVar) {
        this.zzlk = context;
        this.zzfxh = zzbieVar;
        this.zzfbx = executor;
        this.zzfnm = zzbzlVar;
        this.zzfga = zzcweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (zzcvrVar.zzgje == null || zzcvrVar.zzgje.zzdib == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<zzbii> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar) {
        return zzdcy.zzb(zzdcy.zzah(null), new zzdcj(this, zzcvzVar, zzcvrVar) { // from class: com.google.android.gms.internal.ads.zzcgj
            private final zzcvr zzfea;
            private final zzcvz zzfom;
            private final zzcgg zzfxi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxi = this;
                this.zzfom = zzcvzVar;
                this.zzfea = zzcvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfxi.zza(this.zzfom, this.zzfea, obj);
            }
        }, this.zzfbx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(zzcvz zzcvzVar, zzcvr zzcvrVar, Object obj) throws Exception {
        zzua zza = zzcwi.zza(this.zzlk, zzcvrVar.zzgjg);
        final zzbbw zzc = this.zzfnm.zzc(zza);
        final zzbia zza2 = this.zzfxh.zza(new zzbla(zzcvzVar, zzcvrVar, null), new zzbid(zzc.getView(), zzc, zzcwi.zze(zza), zzcvrVar.zzfdf));
        zza2.zzacw().zzb(zzc, false);
        zza2.zzaci().zza(new zzbnj(zzc) { // from class: com.google.android.gms.internal.ads.zzcgi
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
        return zzdcy.zzb(zzbzn.zza(zzc, zzcvrVar.zzgje.zzdhz, zzcvrVar.zzgje.zzdib), new zzdal(zza2) { // from class: com.google.android.gms.internal.ads.zzcgl
            private final zzbia zzfxk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxk = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj2) {
                return this.zzfxk.zzacv();
            }
        }, zzaxn.zzdwn);
    }
}
