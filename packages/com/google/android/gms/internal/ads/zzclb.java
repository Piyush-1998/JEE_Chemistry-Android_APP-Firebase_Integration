package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclb<AdT> implements zzcga<AdT> {
    private final zzcyg zzfgb;
    private final zzddl zzgag;
    private final zzaah zzgam;
    private final zzclc<AdT> zzgav;

    public zzclb(zzcyg zzcygVar, zzddl zzddlVar, zzaah zzaahVar, zzclc<AdT> zzclcVar) {
        this.zzfgb = zzcygVar;
        this.zzgag = zzddlVar;
        this.zzgam = zzaahVar;
        this.zzgav = zzclcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (this.zzgam == null || zzcvrVar.zzgje == null || zzcvrVar.zzgje.zzdib == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<AdT> zzb(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        zzaxv zzaxvVar = new zzaxv();
        zzclj zzcljVar = new zzclj();
        zzcljVar.zza(new zzcld(this, zzaxvVar, zzcvzVar, zzcvrVar, zzcljVar));
        final zzaaa zzaaaVar = new zzaaa(zzcljVar, zzcvrVar.zzgje.zzdhz, zzcvrVar.zzgje.zzdib);
        return this.zzfgb.zzu(zzcyd.CUSTOM_RENDER_SYN).zza(new zzcxq(this, zzaaaVar) { // from class: com.google.android.gms.internal.ads.zzcla
            private final zzaaa zzgap;
            private final zzclb zzgau;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgau = this;
                this.zzgap = zzaaaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcxq
            public final void run() {
                this.zzgau.zzb(this.zzgap);
            }
        }, this.zzgag).zzw(zzcyd.CUSTOM_RENDER_ACK).zzb(zzaxvVar).zzant();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzaaa zzaaaVar) throws Exception {
        this.zzgam.zza(zzaaaVar);
    }
}
