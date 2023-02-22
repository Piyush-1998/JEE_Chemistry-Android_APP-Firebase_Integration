package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbfl implements zzbjw {
    private zzdwo<Set<zzbqs<zzbnm>>> zzert;
    private zzdwo<zzbnl> zzeru;
    private zzdwo<zzcvz> zzerv;
    private zzdwo<zzcvr> zzerw;
    private zzdwo<Set<zzbqs<zzbog>>> zzesm;
    private zzdwo<zzbob> zzesn;
    private zzdwo<String> zzesx;
    private zzdwo<zzbkn> zzesy;
    private final zzbjz zzewt;
    private zzdwo<zzada> zzewu;
    private zzdwo<Runnable> zzewv;
    private zzdwo<zzbjv> zzeww;
    private final /* synthetic */ zzbfj zzewx;

    private zzbfl(zzbfj zzbfjVar, zzbla zzblaVar, zzbjz zzbjzVar) {
        zzdwo zzdwoVar;
        this.zzewx = zzbfjVar;
        this.zzewt = zzbjzVar;
        this.zzerv = zzblf.zze(zzblaVar);
        this.zzerw = zzbld.zzc(zzblaVar);
        zzdwk zzbdg = zzdwk.zzaq(0, 2).zzaq(zzbfj.zzl(this.zzewx)).zzaq(zzbfj.zzk(this.zzewx)).zzbdg();
        this.zzert = zzbdg;
        this.zzeru = zzdwc.zzan(zzbns.zzi(zzbdg));
        zzdwk zzbdg2 = zzdwk.zzaq(4, 3).zzap(zzbfj.zzh(this.zzewx)).zzap(zzbfj.zzg(this.zzewx)).zzap(zzbfj.zzf(this.zzewx)).zzaq(zzbfj.zzaf(this.zzewx)).zzaq(zzbfj.zzae(this.zzewx)).zzaq(zzbfj.zzad(this.zzewx)).zzap(zzbfj.zzc(this.zzewx)).zzbdg();
        this.zzesm = zzbdg2;
        this.zzesn = zzdwc.zzan(zzbod.zzk(zzbdg2));
        zzblc zza = zzblc.zza(zzblaVar);
        this.zzesx = zza;
        this.zzesy = zzblw.zzb(this.zzerv, this.zzerw, this.zzeru, this.zzesn, zza);
        this.zzewu = new zzbkb(zzbjzVar);
        zzbjy zzbjyVar = new zzbjy(zzbjzVar);
        this.zzewv = zzbjyVar;
        zzdwo<zzbkn> zzdwoVar2 = this.zzesy;
        zzdwo<zzada> zzdwoVar3 = this.zzewu;
        zzdwoVar = this.zzewx.zzerq.zzekc;
        this.zzeww = zzdwc.zzan(new zzbka(zzdwoVar2, zzdwoVar3, zzbjyVar, zzdwoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final zzbio zzada() {
        return (zzbio) zzdwh.zza(this.zzeww.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
