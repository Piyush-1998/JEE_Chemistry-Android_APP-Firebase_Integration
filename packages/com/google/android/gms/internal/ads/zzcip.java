package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcip implements zzcgh<zzbuj, zzcwm, zzchk> {
    private final Executor zzfbx;
    private final zzbtl zzfyt;
    private final Context zzlk;

    public zzcip(Context context, zzbtl zzbtlVar, Executor executor) {
        this.zzlk = context;
        this.zzfyt = zzbtlVar;
        this.zzfbx = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh {
        zzcgfVar.zzddv.zza(this.zzlk, zzcvzVar.zzgka.zzfga.zzgkg, zzcvrVar.zzgjh.toString(), zzawg.zza(zzcvrVar.zzgje), zzcgfVar.zzfxg, zzcvzVar.zzgka.zzfga.zzdeh, zzcvzVar.zzgka.zzfga.zzgki);
    }

    private static boolean zza(zzcvz zzcvzVar, int i) {
        return zzcvzVar.zzgka.zzfga.zzgki.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbuj zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        zzbur zza;
        zzakg zzrp = zzcgfVar.zzddv.zzrp();
        zzakl zzrq = zzcgfVar.zzddv.zzrq();
        zzakm zzrv = zzcgfVar.zzddv.zzrv();
        if (zzrv != null && zza(zzcvzVar, 6)) {
            zza = zzbur.zzb(zzrv);
        } else if (zzrp != null && zza(zzcvzVar, 6)) {
            zza = zzbur.zzb(zzrp);
        } else if (zzrp != null && zza(zzcvzVar, 2)) {
            zza = zzbur.zza(zzrp);
        } else if (zzrq != null && zza(zzcvzVar, 6)) {
            zza = zzbur.zzb(zzrq);
        } else if (zzrq != null && zza(zzcvzVar, 1)) {
            zza = zzbur.zza(zzrq);
        } else {
            throw new zzcjh("No native ad mappers", 0);
        }
        if (!zzcvzVar.zzgka.zzfga.zzgki.contains(Integer.toString(zza.zzahp()))) {
            throw new zzcjh("No corresponding native ad listener", 0);
        }
        zzbus zza2 = this.zzfyt.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbvd(zza), new zzbwc(zzrq, zzrp, zzrv));
        zzcgfVar.zzfxg.zza(zza2.zzack());
        zza2.zzacf().zza((zzbnl) new zzbhb(zzcgfVar.zzddv), this.zzfbx);
        return zza2.zzacl();
    }
}
