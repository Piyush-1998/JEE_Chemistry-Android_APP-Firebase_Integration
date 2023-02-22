package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcks implements zzcga<zzbio> {
    private final zzcyg zzfgb;
    private final zzbjn zzfxm;
    private final zzddl zzgag;
    private final Context zzgal;
    private final zzaah zzgam;

    public zzcks(Context context, zzbjn zzbjnVar, zzcyg zzcygVar, zzddl zzddlVar, zzaah zzaahVar) {
        this.zzgal = context;
        this.zzfxm = zzbjnVar;
        this.zzfgb = zzcygVar;
        this.zzgag = zzddlVar;
        this.zzgam = zzaahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (this.zzgam == null || zzcvrVar.zzgje == null || zzcvrVar.zzgje.zzdib == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<zzbio> zzb(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        zzbir zza = this.zzfxm.zza(new zzbla(zzcvzVar, zzcvrVar, null), new zzckx(this, new View(this.zzgal), null, zzckv.zzgaq, zzcvrVar.zzgjg.get(0)));
        final zzaaa zzaaaVar = new zzaaa(zza.zzade(), zzcvrVar.zzgje.zzdhz, zzcvrVar.zzgje.zzdib);
        return this.zzfgb.zzu(zzcyd.CUSTOM_RENDER_SYN).zza(new zzcxq(this, zzaaaVar) { // from class: com.google.android.gms.internal.ads.zzcku
            private final zzcks zzgao;
            private final zzaaa zzgap;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgao = this;
                this.zzgap = zzaaaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcxq
            public final void run() {
                this.zzgao.zza(this.zzgap);
            }
        }, this.zzgag).zzw(zzcyd.CUSTOM_RENDER_ACK).zzb(zzdcy.zzah(zza.zzadc())).zzant();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaaa zzaaaVar) throws Exception {
        this.zzgam.zza(zzaaaVar);
    }
}
