package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcke implements zzcgh<zzbyz, zzcwm, zzchn> {
    private final Executor zzfbx;
    private final zzbzc zzfzm;
    private final Context zzlk;

    public zzcke(Context context, Executor executor, zzbzc zzbzcVar) {
        this.zzlk = context;
        this.zzfbx = executor;
        this.zzfzm = zzbzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchn> zzcgfVar) throws zzcwh {
        if (!zzcgfVar.zzddv.isInitialized()) {
            zzcgfVar.zzfxg.zza(new zzckg(this, zzcvzVar, zzcvrVar, zzcgfVar));
            zzcgfVar.zzddv.zza(this.zzlk, zzcvzVar.zzgka.zzfga.zzgkg, (String) null, zzcgfVar.zzfxg, zzcvrVar.zzgjh.toString());
            return;
        }
        zzc(zzcvzVar, zzcvrVar, zzcgfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzcwm, zzchn> zzcgfVar) {
        try {
            zzcgfVar.zzddv.zza(zzcvzVar.zzgka.zzfga.zzgkg, zzcvrVar.zzgjh.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcgfVar.zzffi);
            zzaug.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbyz zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, final zzcgf<zzcwm, zzchn> zzcgfVar) throws zzcwh, zzcjh {
        zzbzb zza = this.zzfzm.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbza(new zzbsu(zzcgfVar) { // from class: com.google.android.gms.internal.ads.zzckh
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
                    ((zzcwm) zzcgfVar2.zzddv).showVideo();
                } catch (zzcwh e) {
                    zzaug.zzd("Cannot show rewarded video.", e);
                }
            }
        }));
        zza.zzacf().zza((zzbnl) new zzbhb(zzcgfVar.zzddv), this.zzfbx);
        zzbnr zzacg = zza.zzacg();
        zzbmv zzach = zza.zzach();
        zzcgfVar.zzfxg.zza(new zzcki(this, zza.zzadi(), zzach, zzacg, zza.zzadq()));
        return zza.zzadp();
    }
}
