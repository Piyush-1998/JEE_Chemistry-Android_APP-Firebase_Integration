package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzfd extends zzfl {
    private final StackTraceElement[] zzaag;

    public zzfd(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzdxVar, str, str2, zzbVar, i, 45);
        this.zzaag = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        zzbz zzbzVar;
        if (this.zzaag != null) {
            zzdv zzdvVar = new zzdv((String) this.zzaal.invoke(null, this.zzaag));
            synchronized (this.zzaaa) {
                this.zzaaa.zzbi(zzdvVar.zzxo.longValue());
                if (zzdvVar.zzxp.booleanValue()) {
                    zzbo.zza.zzb zzbVar = this.zzaaa;
                    if (zzdvVar.zzxq.booleanValue()) {
                        zzbzVar = zzbz.ENUM_FALSE;
                    } else {
                        zzbzVar = zzbz.ENUM_TRUE;
                    }
                    zzbVar.zzg(zzbzVar);
                } else {
                    this.zzaaa.zzg(zzbz.ENUM_FAILURE);
                }
            }
        }
    }
}
