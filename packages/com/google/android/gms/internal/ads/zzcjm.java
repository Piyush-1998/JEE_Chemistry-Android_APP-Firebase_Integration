package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcjm implements zzcgh<zzbyz, zzamd, zzchk> {
    private final zzbzc zzfzm;
    private final Context zzlk;

    public zzcjm(Context context, zzbzc zzbzcVar) {
        this.zzlk = context;
        this.zzfzm = zzbzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh {
        try {
            zzcgfVar.zzddv.zzdh(zzcvrVar.zzdeu);
            zzcgfVar.zzddv.zza(zzcvrVar.zzeij, zzcvrVar.zzgjh.toString(), zzcvzVar.zzgka.zzfga.zzgkg, ObjectWrapper.wrap(this.zzlk), new zzcjr(this, zzcgfVar), zzcgfVar.zzfxg);
        } catch (RemoteException e) {
            zzdoy.zzj(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbyz zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, final zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        final zzcgc zzcgcVar = new zzcgc(zzcvrVar);
        zzbzb zza = this.zzfzm.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbza(new zzbsu(zzcgfVar, zzcgcVar) { // from class: com.google.android.gms.internal.ads.zzcjp
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
                    if (((zzamd) zzcgfVar2.zzddv).zzad(ObjectWrapper.wrap(context))) {
                        zzcgcVar2.zzaks();
                    } else {
                        zzaug.zzeu("Can't show rewarded video.");
                    }
                } catch (RemoteException e) {
                    zzaug.zzd("Can't show rewarded video.", e);
                }
            }
        }));
        zzcgcVar.zza(zza.zzaci());
        zzcgfVar.zzfxg.zza(zza.zzadr());
        return zza.zzadp();
    }
}
