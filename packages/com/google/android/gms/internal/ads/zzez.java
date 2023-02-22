package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzez extends zzfl {
    public zzez(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2) {
        super(zzdxVar, str, str2, zzbVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        zzdj zzdjVar = new zzdj((String) this.zzaal.invoke(null, this.zzvo.getContext(), Boolean.valueOf(((Boolean) zzuv.zzon().zzd(zzza.zzcnd)).booleanValue())));
        synchronized (this.zzaaa) {
            this.zzaaa.zzal(zzdjVar.zzxe);
            this.zzaaa.zzbn(zzdjVar.zzxf);
        }
    }
}
