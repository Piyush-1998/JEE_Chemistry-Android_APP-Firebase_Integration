package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzcnc;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnb extends zzati {
    private zzbei zzgdl;

    public zzcnb(zzbei zzbeiVar) {
        this.zzgdl = zzbeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(IObjectWrapper iObjectWrapper, zzath zzathVar, zzatd zzatdVar) {
        String str = zzathVar.zzbqy;
        String str2 = zzathVar.zzblw;
        zzua zzuaVar = zzathVar.zzdpz;
        zzdcy.zza(this.zzgdl.zzabo().zzf(new zzbmk.zza().zzby((Context) ObjectWrapper.unwrap(iObjectWrapper)).zza(new zzcwg().zzgf(str).zzg(new zztw().zznz()).zzd(zzuaVar).zzane()).zzafy()).zza(new zzcnc(new zzcnc.zza().zzge(str2))).zzf(new zzbpn.zza().zzagm()).zzado().zzadt(), new zzcna(this, zzatdVar), this.zzgdl.zzabb());
    }
}
