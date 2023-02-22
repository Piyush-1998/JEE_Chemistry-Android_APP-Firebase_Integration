package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbdp {
    public static zzbbw zza(final Context context, final zzbdj zzbdjVar, final String str, final boolean z, final boolean z2, final zzdf zzdfVar, final zzaxl zzaxlVar, zzaab zzaabVar, final com.google.android.gms.ads.internal.zzi zziVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzsd zzsdVar, final zzrf zzrfVar, final boolean z3) throws zzbcf {
        try {
            return (zzbbw) zzawq.zza(new Callable(context, zzbdjVar, str, z, z2, zzdfVar, zzaxlVar, null, zziVar, zzaVar, zzsdVar, zzrfVar, z3) { // from class: com.google.android.gms.internal.ads.zzbds
                private final String zzdbt;
                private final Context zzdpy;
                private final zzbdj zzefg;
                private final boolean zzefh;
                private final boolean zzefi;
                private final zzdf zzefj;
                private final zzaxl zzefk;
                private final zzaab zzefl;
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
                    this.zzefl = r8;
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
                    zzrf zzrfVar2 = this.zzefp;
                    boolean z6 = this.zzefq;
                    zzbdm zzbdmVar = new zzbdm();
                    zzbdr zzbdrVar = new zzbdr(new zzbdk(context2), zzbdmVar, zzbdjVar2, str2, z4, z5, zzdfVar2, zzaxlVar2, zzaabVar2, zziVar2, zzaVar2, zzsdVar2, zzrfVar2, z6);
                    zzbci zzbciVar = new zzbci(zzbdrVar);
                    zzbdrVar.setWebChromeClient(new zzbbo(zzbciVar));
                    zzbdmVar.zza(zzbciVar, z5);
                    return zzbciVar;
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbcf("Webview initialization failed.", th);
        }
    }
}
