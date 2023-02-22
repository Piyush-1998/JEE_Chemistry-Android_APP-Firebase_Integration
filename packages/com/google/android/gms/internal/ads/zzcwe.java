package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcwe {
    public final zzua zzbll;
    public final zzaay zzdeh;
    public final zzagd zzdkl;
    public final int zzgdf;
    public final zzvz zzgke;
    public final zzyj zzgkf;
    public final zztx zzgkg;
    public final String zzgkh;
    public final ArrayList<String> zzgki;
    public final ArrayList<String> zzgkj;
    public final zzuf zzgkk;
    public final PublisherAdViewOptions zzgkl;
    public final zzvt zzgkm;
    public final Set<String> zzgkn;

    private zzcwe(zzcwg zzcwgVar) {
        zzyj zzyjVar;
        this.zzbll = zzcwg.zza(zzcwgVar);
        this.zzgkh = zzcwg.zzb(zzcwgVar);
        this.zzgke = zzcwg.zzc(zzcwgVar);
        this.zzgkg = new zztx(zzcwg.zzk(zzcwgVar).versionCode, zzcwg.zzk(zzcwgVar).zzcbx, zzcwg.zzk(zzcwgVar).extras, zzcwg.zzk(zzcwgVar).zzcby, zzcwg.zzk(zzcwgVar).zzcbz, zzcwg.zzk(zzcwgVar).zzcca, zzcwg.zzk(zzcwgVar).zzabj, zzcwg.zzk(zzcwgVar).zzbkg || zzcwg.zzl(zzcwgVar), zzcwg.zzk(zzcwgVar).zzccb, zzcwg.zzk(zzcwgVar).zzccc, zzcwg.zzk(zzcwgVar).zzng, zzcwg.zzk(zzcwgVar).zzccd, zzcwg.zzk(zzcwgVar).zzcce, zzcwg.zzk(zzcwgVar).zzccf, zzcwg.zzk(zzcwgVar).zzccg, zzcwg.zzk(zzcwgVar).zzcch, zzcwg.zzk(zzcwgVar).zzcci, zzcwg.zzk(zzcwgVar).zzccj, zzcwg.zzk(zzcwgVar).zzcck, zzcwg.zzk(zzcwgVar).zzabk, zzcwg.zzk(zzcwgVar).zzabl);
        zzaay zzaayVar = null;
        if (zzcwg.zzm(zzcwgVar) != null) {
            zzyjVar = zzcwg.zzm(zzcwgVar);
        } else {
            zzyjVar = zzcwg.zzn(zzcwgVar) != null ? zzcwg.zzn(zzcwgVar).zzcwa : null;
        }
        this.zzgkf = zzyjVar;
        this.zzgki = zzcwg.zzd(zzcwgVar);
        this.zzgkj = zzcwg.zze(zzcwgVar);
        if (zzcwg.zzd(zzcwgVar) != null) {
            if (zzcwg.zzn(zzcwgVar) == null) {
                zzaayVar = new zzaay(new NativeAdOptions.Builder().build());
            } else {
                zzaayVar = zzcwg.zzn(zzcwgVar);
            }
        }
        this.zzdeh = zzaayVar;
        this.zzgkk = zzcwg.zzf(zzcwgVar);
        this.zzgdf = zzcwg.zzg(zzcwgVar);
        this.zzgkl = zzcwg.zzh(zzcwgVar);
        this.zzgkm = zzcwg.zzi(zzcwgVar);
        this.zzdkl = zzcwg.zzj(zzcwgVar);
        this.zzgkn = zzcwgVar.zzgkn;
    }

    public final zzada zzana() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzgkl;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzjh();
    }
}
