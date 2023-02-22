package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcgw implements zzcgh<zzbio, zzamd, zzchk> {
    private View view;
    private final zzbjn zzfxm;
    private final Context zzlk;

    public zzcgw(Context context, zzbjn zzbjnVar) {
        this.zzlk = context;
        this.zzfxm = zzbjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh {
        try {
            zzcgfVar.zzddv.zzdh(zzcvrVar.zzdeu);
            zzcgfVar.zzddv.zza(zzcvrVar.zzeij, zzcvrVar.zzgjh.toString(), zzcvzVar.zzgka.zzfga.zzgkg, ObjectWrapper.wrap(this.zzlk), new zzchb(this, zzcgfVar), zzcgfVar.zzfxg, zzcvzVar.zzgka.zzfga.zzbll);
        } catch (RemoteException e) {
            throw new zzcwh(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbio zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        zzbir zza = this.zzfxm.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbiv(this.view, null, new zzbkl(zzcgfVar) { // from class: com.google.android.gms.internal.ads.zzcgz
            private final zzcgf zzfxr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxr = zzcgfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbkl
            public final zzwr getVideoController() {
                return zzcgw.zza(this.zzfxr);
            }
        }, zzcvrVar.zzgjg.get(0)));
        zza.zzadd().zzq(this.view);
        zzcgfVar.zzfxg.zza(zza.zzack());
        return zza.zzadc();
    }

    public static final /* synthetic */ zzwr zza(zzcgf zzcgfVar) throws zzcwh {
        try {
            return ((zzamd) zzcgfVar.zzddv).getVideoController();
        } catch (RemoteException e) {
            throw new zzcwh(e);
        }
    }
}
