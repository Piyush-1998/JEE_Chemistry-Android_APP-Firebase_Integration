package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbfn implements zzbsr {
    private zzbmk zzelq;
    private final /* synthetic */ zzbfa zzerq;
    private zzbpn zzerr;
    private zzcle zzewq;

    private zzbfn(zzbfa zzbfaVar) {
        this.zzerq = zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* renamed from: zzadf */
    public final zzbso zzace() {
        zzdwh.zza(this.zzerr, zzbpn.class);
        zzdwh.zza(this.zzelq, zzbmk.class);
        zzdwh.zza(this.zzewq, zzcle.class);
        return new zzbfq(this.zzerq, new zzbli(), new zzcws(), new zzbmf(), new zzcbx(), this.zzerr, this.zzelq, new zzcxa(), this.zzewq);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final /* synthetic */ zzbsr zzb(zzcle zzcleVar) {
        this.zzewq = (zzcle) zzdwh.checkNotNull(zzcleVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final /* synthetic */ zzbsr zzd(zzbmk zzbmkVar) {
        this.zzelq = (zzbmk) zzdwh.checkNotNull(zzbmkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final /* synthetic */ zzbsr zzd(zzbpn zzbpnVar) {
        this.zzerr = (zzbpn) zzdwh.checkNotNull(zzbpnVar);
        return this;
    }
}
