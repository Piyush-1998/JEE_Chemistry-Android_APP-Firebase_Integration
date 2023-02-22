package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjl implements zzcgh<zzbyz, zzcwm, zzchk> {
    private final Executor zzfbx;
    private final zzbzc zzfzm;
    private final Context zzlk;

    public zzcjl(Context context, Executor executor, zzbzc zzbzcVar) {
        this.zzlk = context;
        this.zzfbx = executor;
        this.zzfzm = zzbzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh {
        try {
            zzcgfVar.zzddv.zzb(this.zzlk, zzcvzVar.zzgka.zzfga.zzgkg, zzcvrVar.zzgjh.toString(), zzcgfVar.zzfxg);
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcgfVar.zzffi);
            zzaug.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbyz zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, final zzcgf<zzcwm, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        zzbzb zza = this.zzfzm.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbza(new zzbsu(zzcgfVar) { // from class: com.google.android.gms.internal.ads.zzcjk
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
                    ((zzcwm) zzcgfVar2.zzddv).zzca(context);
                } catch (zzcwh e) {
                    zzaug.zzd("Cannot show rewarded .", e);
                }
            }
        }));
        zza.zzacf().zza((zzbnl) new zzbhb(zzcgfVar.zzddv), this.zzfbx);
        zzcgfVar.zzfxg.zza(zza.zzadr());
        return zza.zzadp();
    }
}
