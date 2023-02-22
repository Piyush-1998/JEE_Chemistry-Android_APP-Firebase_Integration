package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcib implements zzcgh<zzbrs, zzamd, zzchk> {
    private final zzbso zzfxy;
    private final Context zzlk;

    public zzcib(Context context, zzbso zzbsoVar) {
        this.zzlk = context;
        this.zzfxy = zzbsoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh {
        try {
            zzcgfVar.zzddv.zzdh(zzcvrVar.zzdeu);
            zzcgfVar.zzddv.zza(zzcvrVar.zzeij, zzcvrVar.zzgjh.toString(), zzcvzVar.zzgka.zzfga.zzgkg, ObjectWrapper.wrap(this.zzlk), new zzcic(this, zzcgfVar), zzcgfVar.zzfxg);
        } catch (RemoteException e) {
            throw new zzcwh(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbrs zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, final zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        final zzcgc zzcgcVar = new zzcgc(zzcvrVar);
        zzbru zza = this.zzfxy.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbrx(new zzbsu(zzcgfVar, zzcgcVar) { // from class: com.google.android.gms.internal.ads.zzcia
            private final zzcgf zzfxr;
            private final zzcgc zzfys;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxr = zzcgfVar;
                this.zzfys = zzcgcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsu
            public final void zza(boolean z, Context context) {
                zzcgf zzcgfVar2 = this.zzfxr;
                zzcgc zzcgcVar2 = this.zzfys;
                try {
                    if (((zzamd) zzcgfVar2.zzddv).zzac(ObjectWrapper.wrap(context))) {
                        zzcgcVar2.zzaks();
                    } else {
                        zzaug.zzeu("Cannot show interstitial.");
                    }
                } catch (RemoteException e) {
                    zzaug.zzd("Cannot show interstitial.", e);
                }
            }
        }));
        zzcgcVar.zza(zza.zzaci());
        zzcgfVar.zzfxg.zza(zza.zzack());
        return zza.zzadh();
    }
}
