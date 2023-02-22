package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxe {
    private final Executor zzfbx;
    private final zzcwe zzfga;
    private final zzbzl zzfnm;
    private final Context zzlk;

    public zzbxe(Context context, zzcwe zzcweVar, Executor executor, zzbzl zzbzlVar) {
        this.zzlk = context;
        this.zzfga = zzcweVar;
        this.zzfbx = executor;
        this.zzfnm = zzbzlVar;
    }

    public final zzddi<zzbbw> zzm(final JSONObject jSONObject) {
        return zzdcy.zzb(zzdcy.zzb(zzdcy.zzah(null), new zzdcj(this) { // from class: com.google.android.gms.internal.ads.zzbxj
            private final zzbxe zzfpc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfpc.zzq(obj);
            }
        }, this.zzfbx), new zzdcj(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzbxh
            private final JSONObject zzfch;
            private final zzbxe zzfpc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpc = this;
                this.zzfch = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfpc.zza(this.zzfch, (zzbbw) obj);
            }
        }, this.zzfbx);
    }

    public final zzddi<zzbbw> zzp(final String str, final String str2) {
        return zzdcy.zzb(zzdcy.zzah(null), new zzdcj(this, str, str2) { // from class: com.google.android.gms.internal.ads.zzbxg
            private final String zzcyz;
            private final String zzdbt;
            private final zzbxe zzfpc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpc = this;
                this.zzcyz = str;
                this.zzdbt = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfpc.zza(this.zzcyz, this.zzdbt, obj);
            }
        }, this.zzfbx);
    }

    private final void zzk(zzbbw zzbbwVar) {
        zzbbwVar.zza("/video", zzaea.zzcxp);
        zzbbwVar.zza("/videoMeta", zzaea.zzcxq);
        zzbbwVar.zza("/precache", new zzbbg());
        zzbbwVar.zza("/delayPageLoaded", zzaea.zzcxt);
        zzbbwVar.zza("/instrument", zzaea.zzcxr);
        zzbbwVar.zza("/log", zzaea.zzcxk);
        zzbbwVar.zza("/videoClicked", zzaea.zzcxl);
        zzbbwVar.zzzp().zzar(true);
        zzbbwVar.zza("/click", zzaea.zzcxg);
        if (this.zzfga.zzdkl != null) {
            zzbbwVar.zza("/open", new zzaev(null, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzq(Object obj) throws Exception {
        zzbbw zza = this.zzfnm.zza(zzua.zzg(this.zzlk), false);
        final zzaxw zzl = zzaxw.zzl(zza);
        zzk(zza);
        zza.zzzp().zza(new zzbdi(zzl) { // from class: com.google.android.gms.internal.ads.zzbxi
            private final zzaxw zzefu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzefu = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbdi
            public final void zzrf() {
                this.zzefu.zzwp();
            }
        });
        zza.loadUrl((String) zzuv.zzon().zzd(zzza.zzcod));
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(String str, String str2, Object obj) throws Exception {
        final zzbbw zza = this.zzfnm.zza(zzua.zzg(this.zzlk), false);
        final zzaxw zzl = zzaxw.zzl(zza);
        zzk(zza);
        if (this.zzfga.zzdkl != null) {
            zza.zza(zzbdj.zzaat());
        } else {
            zza.zza(zzbdj.zzaas());
        }
        zza.zzzp().zza(new zzbdf(this, zza, zzl) { // from class: com.google.android.gms.internal.ads.zzbxl
            private final zzbxe zzfpc;
            private final zzbbw zzfpd;
            private final zzaxw zzfpe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpc = this;
                this.zzfpd = zza;
                this.zzfpe = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbdf
            public final void zzad(boolean z) {
                this.zzfpc.zza(this.zzfpd, this.zzfpe, z);
            }
        });
        zza.zzb(str, str2, null);
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbbw zzbbwVar, zzaxw zzaxwVar, boolean z) {
        if (this.zzfga.zzgkf != null && zzbbwVar.zzxl() != null) {
            zzbbwVar.zzxl().zzb(this.zzfga.zzgkf);
        }
        zzaxwVar.zzwp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(JSONObject jSONObject, final zzbbw zzbbwVar) throws Exception {
        final zzaxw zzl = zzaxw.zzl(zzbbwVar);
        if (this.zzfga.zzdkl != null) {
            zzbbwVar.zza(zzbdj.zzaat());
        } else {
            zzbbwVar.zza(zzbdj.zzaas());
        }
        zzbbwVar.zzzp().zza(new zzbdf(this, zzbbwVar, zzl) { // from class: com.google.android.gms.internal.ads.zzbxk
            private final zzbxe zzfpc;
            private final zzbbw zzfpd;
            private final zzaxw zzfpe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpc = this;
                this.zzfpd = zzbbwVar;
                this.zzfpe = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbdf
            public final void zzad(boolean z) {
                this.zzfpc.zzb(this.zzfpd, this.zzfpe, z);
            }
        });
        zzbbwVar.zza("google.afma.nativeAds.renderVideo", jSONObject);
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbbw zzbbwVar, zzaxw zzaxwVar, boolean z) {
        if (this.zzfga.zzgkf != null && zzbbwVar.zzxl() != null) {
            zzbbwVar.zzxl().zzb(this.zzfga.zzgkf);
        }
        zzaxwVar.zzwp();
    }
}
