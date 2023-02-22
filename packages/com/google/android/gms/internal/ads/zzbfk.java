package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbfk implements zzbjm {
    private zzbmk zzelq;
    private zzbth zzelt;
    private final /* synthetic */ zzbfa zzerq;
    private zzbpn zzerr;
    private zzcle zzewq;
    private zzbkh zzewr;
    private zzbin zzews;

    private zzbfk(zzbfa zzbfaVar) {
        this.zzerq = zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* renamed from: zzacz */
    public final zzbjn zzace() {
        zzdwh.zza(this.zzerr, zzbpn.class);
        zzdwh.zza(this.zzelq, zzbmk.class);
        zzdwh.zza(this.zzewq, zzcle.class);
        zzdwh.zza(this.zzewr, zzbkh.class);
        zzdwh.zza(this.zzews, zzbin.class);
        zzdwh.zza(this.zzelt, zzbth.class);
        return new zzbfj(this.zzerq, this.zzews, this.zzelt, new zzbli(), new zzcws(), new zzbmf(), new zzcbx(), this.zzerr, this.zzelq, new zzcxa(), this.zzewq, this.zzewr);
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final /* synthetic */ zzbjm zzb(zzbth zzbthVar) {
        this.zzelt = (zzbth) zzdwh.checkNotNull(zzbthVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final /* synthetic */ zzbjm zzb(zzbin zzbinVar) {
        this.zzews = (zzbin) zzdwh.checkNotNull(zzbinVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final /* synthetic */ zzbjm zza(zzbkh zzbkhVar) {
        this.zzewr = (zzbkh) zzdwh.checkNotNull(zzbkhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final /* synthetic */ zzbjm zza(zzcle zzcleVar) {
        this.zzewq = (zzcle) zzdwh.checkNotNull(zzcleVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final /* synthetic */ zzbjm zzc(zzbmk zzbmkVar) {
        this.zzelq = (zzbmk) zzdwh.checkNotNull(zzbmkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final /* synthetic */ zzbjm zzc(zzbpn zzbpnVar) {
        this.zzerr = (zzbpn) zzdwh.checkNotNull(zzbpnVar);
        return this;
    }
}
