package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzfg extends zzfl {
    private final View zzzs;

    public zzfg(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2, View view) {
        super(zzdxVar, str, str2, zzbVar, i, 57);
        this.zzzs = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        if (this.zzzs != null) {
            Boolean bool = (Boolean) zzuv.zzon().zzd(zzza.zzcno);
            zzeh zzehVar = new zzeh((String) this.zzaal.invoke(null, this.zzzs, this.zzvo.getContext().getResources().getDisplayMetrics(), bool));
            zzbo.zza.zzf.C0009zza zzar = zzbo.zza.zzf.zzar();
            zzar.zzdc(zzehVar.zzzm.longValue()).zzdd(zzehVar.zzzn.longValue()).zzde(zzehVar.zzzo.longValue());
            if (bool.booleanValue()) {
                zzar.zzdf(zzehVar.zzzp.longValue());
            }
            this.zzaaa.zzb((zzbo.zza.zzf) ((zzdqw) zzar.zzazr()));
        }
    }
}
