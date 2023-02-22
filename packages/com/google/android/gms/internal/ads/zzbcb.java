package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbcb {
    public static zzddi<zzbbw> zza(final Context context, final zzaxl zzaxlVar, final String str, final zzdf zzdfVar, final com.google.android.gms.ads.internal.zza zzaVar) {
        return zzdcy.zzb(zzdcy.zzah(null), new zzdcj(context, zzdfVar, zzaxlVar, zzaVar, str) { // from class: com.google.android.gms.internal.ads.zzbce
            private final zzdf zzczr;
            private final Context zzdpy;
            private final zzaxl zzefr;
            private final com.google.android.gms.ads.internal.zza zzefs;
            private final String zzeft;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
                this.zzczr = zzdfVar;
                this.zzefr = zzaxlVar;
                this.zzefs = zzaVar;
                this.zzeft = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                Context context2 = this.zzdpy;
                zzdf zzdfVar2 = this.zzczr;
                zzaxl zzaxlVar2 = this.zzefr;
                com.google.android.gms.ads.internal.zza zzaVar2 = this.zzefs;
                String str2 = this.zzeft;
                com.google.android.gms.ads.internal.zzq.zzkk();
                zzbbw zza = zzbcb.zza(context2, zzbdj.zzaar(), "", false, false, zzdfVar2, zzaxlVar2, null, null, zzaVar2, zzsd.zzmm(), null, false);
                final zzaxw zzl = zzaxw.zzl(zza);
                zza.zzzp().zza(new zzbdf(zzl) { // from class: com.google.android.gms.internal.ads.zzbcg
                    private final zzaxw zzefu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzefu = zzl;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbdf
                    public final void zzad(boolean z) {
                        this.zzefu.zzwp();
                    }
                });
                zza.loadUrl(str2);
                return zzl;
            }
        }, zzaxn.zzdwm);
    }

    public static zzbbw zza(final Context context, final zzbdj zzbdjVar, final String str, final boolean z, final boolean z2, final zzdf zzdfVar, final zzaxl zzaxlVar, zzaab zzaabVar, final com.google.android.gms.ads.internal.zzi zziVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzsd zzsdVar, final zzrf zzrfVar, final boolean z3) throws zzbcf {
        zzza.initialize(context);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcjx)).booleanValue()) {
            return zzbdp.zza(context, zzbdjVar, str, z, z2, zzdfVar, zzaxlVar, null, zziVar, zzaVar, zzsdVar, zzrfVar, z3);
        }
        try {
            return (zzbbw) zzawq.zza(new Callable(context, zzbdjVar, str, z, z2, zzdfVar, zzaxlVar, null, zziVar, zzaVar, zzsdVar, zzrfVar, z3) { // from class: com.google.android.gms.internal.ads.zzbcd
                private final String zzdbt;
                private final Context zzdpy;
                private final zzbdj zzefg;
                private final boolean zzefh;
                private final boolean zzefi;
                private final zzdf zzefj;
                private final zzaxl zzefk;
                private final zzaab zzefl = null;
                private final com.google.android.gms.ads.internal.zzi zzefm;
                private final com.google.android.gms.ads.internal.zza zzefn;
                private final zzsd zzefo;
                private final zzrf zzefp;
                private final boolean zzefq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdpy = context;
                    this.zzefg = zzbdjVar;
                    this.zzdbt = str;
                    this.zzefh = z;
                    this.zzefi = z2;
                    this.zzefj = zzdfVar;
                    this.zzefk = zzaxlVar;
                    this.zzefm = zziVar;
                    this.zzefn = zzaVar;
                    this.zzefo = zzsdVar;
                    this.zzefp = zzrfVar;
                    this.zzefq = z3;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.zzdpy;
                    zzbdj zzbdjVar2 = this.zzefg;
                    String str2 = this.zzdbt;
                    boolean z4 = this.zzefh;
                    boolean z5 = this.zzefi;
                    zzdf zzdfVar2 = this.zzefj;
                    zzaxl zzaxlVar2 = this.zzefk;
                    zzaab zzaabVar2 = this.zzefl;
                    com.google.android.gms.ads.internal.zzi zziVar2 = this.zzefm;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzefn;
                    zzsd zzsdVar2 = this.zzefo;
                    zzbci zzbciVar = new zzbci(zzbck.zzb(context2, zzbdjVar2, str2, z4, z5, zzdfVar2, zzaxlVar2, zzaabVar2, zziVar2, zzaVar2, zzsdVar2, this.zzefp, this.zzefq));
                    zzbciVar.setWebViewClient(com.google.android.gms.ads.internal.zzq.zzkl().zza(zzbciVar, zzsdVar2, z5));
                    zzbciVar.setWebChromeClient(new zzbbo(zzbciVar));
                    return zzbciVar;
                }
            });
        } catch (Throwable th) {
            throw new zzbcf("Webview initialization failed.", th);
        }
    }
}
