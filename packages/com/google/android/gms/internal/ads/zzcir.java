package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcir implements zzcgh<zzbuj, zzamd, zzchk> {
    private final zzbtl zzfyt;
    private zzakm zzfyy;
    private final Context zzlk;

    public zzcir(Context context, zzbtl zzbtlVar) {
        this.zzlk = context;
        this.zzfyt = zzbtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zza(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh {
        try {
            zzcgfVar.zzddv.zzdh(zzcvrVar.zzdeu);
            zzcgfVar.zzddv.zza(zzcvrVar.zzeij, zzcvrVar.zzgjh.toString(), zzcvzVar.zzgka.zzfga.zzgkg, ObjectWrapper.wrap(this.zzlk), new zzcit(this, zzcgfVar), zzcgfVar.zzfxg);
        } catch (RemoteException e) {
            throw new zzcwh(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* synthetic */ zzbuj zzb(zzcvz zzcvzVar, zzcvr zzcvrVar, zzcgf<zzamd, zzchk> zzcgfVar) throws zzcwh, zzcjh {
        if (!zzcvzVar.zzgka.zzfga.zzgki.contains(Integer.toString(6))) {
            throw new zzcjh("Unified must be used for RTB.", 1);
        }
        zzbur zzb = zzbur.zzb(this.zzfyy);
        if (!zzcvzVar.zzgka.zzfga.zzgki.contains(Integer.toString(zzb.zzahp()))) {
            throw new zzcjh("No corresponding native ad listener", 0);
        }
        zzbus zza = this.zzfyt.zza(new zzbla(zzcvzVar, zzcvrVar, zzcgfVar.zzffi), new zzbvd(zzb), new zzbwc(null, null, this.zzfyy));
        zzcgfVar.zzfxg.zza(zza.zzack());
        return zza.zzacl();
    }
}
