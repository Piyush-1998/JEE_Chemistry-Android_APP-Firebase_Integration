package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblg<T> {
    private final zzcdt zzffx;
    private final zzcdw zzffy;
    private final zzdwo<zzddi<zzape>> zzffz;
    private final zzcwe zzfga;
    private final zzcyg zzfgb;
    private final zzbgt zzfgc;
    private final zzcjg<T> zzfgd;
    private final zzbpk zzfge;
    private final zzcvz zzfgf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblg(zzcdt zzcdtVar, zzcdw zzcdwVar, zzdwo<zzddi<zzape>> zzdwoVar, zzcwe zzcweVar, zzcyg zzcygVar, zzbgt zzbgtVar, zzcjg<T> zzcjgVar, zzbpk zzbpkVar, zzcvz zzcvzVar) {
        this.zzffx = zzcdtVar;
        this.zzffy = zzcdwVar;
        this.zzffz = zzdwoVar;
        this.zzfga = zzcweVar;
        this.zzfgb = zzcygVar;
        this.zzfgc = zzbgtVar;
        this.zzfgd = zzcjgVar;
        this.zzfge = zzbpkVar;
        this.zzfgf = zzcvzVar;
    }

    public final zzddi<T> zzafs() {
        zzcxp zzant;
        if (this.zzfgf != null) {
            zzant = this.zzfgb.zzu(zzcyd.SERVER_TRANSACTION).zzb(zzdcy.zzah(this.zzfgf)).zzant();
        } else {
            com.google.android.gms.ads.internal.zzq.zzkp().zzmh();
            if (this.zzfga.zzgkg.zzcck != null) {
                zzant = this.zzfgb.zzu(zzcyd.SERVER_TRANSACTION).zzb(this.zzffy.zzaki()).zzant();
            } else {
                zzant = this.zzfgb.zza((zzcyg) zzcyd.SERVER_TRANSACTION, (zzddi) this.zzffz.get()).zza(this.zzffx).zzant();
            }
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcrp)).booleanValue()) {
            return this.zzfgb.zza((zzcyg) zzcyd.RENDERER, (zzddi) zzant).zza(this.zzfgc).zza(this.zzfgd).zzant();
        }
        return this.zzfgb.zza((zzcyg) zzcyd.RENDERER, (zzddi) zzant).zza(this.zzfgc).zza(this.zzfgd).zza(((Integer) zzuv.zzon().zzd(zzza.zzcrq)).intValue(), TimeUnit.SECONDS).zzant();
    }
}
