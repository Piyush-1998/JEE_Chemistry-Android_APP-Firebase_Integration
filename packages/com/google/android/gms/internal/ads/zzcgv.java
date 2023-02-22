package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcgv implements zzcgh<zzbio, zzcwm, zzchk> {
    private final zzaxl zzblh;
    private final Executor zzfbx;
    private final zzbjn zzfxm;
    private final Context zzlk;

    public zzcgv(Context context, zzaxl zzaxlVar, zzbjn zzbjnVar, Executor executor) {
        this.zzlk = context;
        this.zzblh = zzaxlVar;
        this.zzfxm = zzbjnVar;
        this.zzfbx = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh {
        zzua zza = zzcwi.zza(this.zzlk, zzcvrVar.zzgjg);
        if (this.zzblh.zzdwf < 4100000) {
            zzcgfVar.zzddv.zza(this.zzlk, zza, zzcvzVar.zzgka.zzfga.zzgkg, zzcvrVar.zzgjh.toString(), zzcgfVar.zzfxg);
        } else {
            zzcgfVar.zzddv.zza(this.zzlk, zza, zzcvzVar.zzgka.zzfga.zzgkg, zzcvrVar.zzgjh.toString(), zzawg.zza(zzcvrVar.zzgje), zzcgfVar.zzfxg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbio zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        zzbjn zzbjnVar = this.zzfxm;
        zzbla zzblaVar = new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi);
        View view = zzcgfVar.zzddv.getView();
        zzcwm zzcwmVar = zzcgfVar.zzddv;
        zzcwmVar.getClass();
        zzbir zza = zzbjnVar.zza(zzblaVar, new zzbiv(view, null, zzcgu.zza(zzcwmVar), zzcvrVar.zzgjg.get(0)));
        zza.zzadd().zzq(zzcgfVar.zzddv.getView());
        zza.zzacf().zza((zzbnl) new zzbhb(zzcgfVar.zzddv), this.zzfbx);
        zzcgfVar.zzfxg.zza(zza.zzack());
        return zza.zzadc();
    }
}
