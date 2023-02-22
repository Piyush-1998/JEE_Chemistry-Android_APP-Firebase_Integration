package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchw implements zzcgh<zzbrs, zzcwm, zzchk> {
    private final zzaxl zzblh;
    private final Executor zzfbx;
    private final zzbso zzfxy;
    private final Context zzlk;

    public zzchw(Context context, zzaxl zzaxlVar, zzbso zzbsoVar, Executor executor) {
        this.zzlk = context;
        this.zzblh = zzaxlVar;
        this.zzfxy = zzbsoVar;
        this.zzfbx = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh {
        if (this.zzblh.zzdwf < 4100000) {
            zzcgfVar.zzddv.zza(this.zzlk, zzcvzVar.zzgka.zzfga.zzgkg, zzcvrVar.zzgjh.toString(), zzcgfVar.zzfxg);
        } else {
            zzcgfVar.zzddv.zza(this.zzlk, zzcvzVar.zzgka.zzfga.zzgkg, zzcvrVar.zzgjh.toString(), zzawg.zza(zzcvrVar.zzgje), zzcgfVar.zzfxg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbrs zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, final zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        zzbru zza = this.zzfxy.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbrx(new zzbsu(zzcgfVar) { // from class: com.google.android.gms.internal.ads.zzchz
            private final zzcgf zzfxr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxr = zzcgfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsu
            public final void zza(boolean z, Context context) {
                zzcgf zzcgfVar2 = this.zzfxr;
                try {
                    ((zzcwm) zzcgfVar2.zzddv).setImmersiveMode(z);
                    ((zzcwm) zzcgfVar2.zzddv).showInterstitial();
                } catch (zzcwh unused) {
                    zzaug.zzet("Cannot show interstitial.");
                }
            }
        }));
        zza.zzacf().zza((zzbnl) new zzbhb(zzcgfVar.zzddv), this.zzfbx);
        zzcgfVar.zzfxg.zza(zza.zzack());
        return zza.zzadh();
    }
}
