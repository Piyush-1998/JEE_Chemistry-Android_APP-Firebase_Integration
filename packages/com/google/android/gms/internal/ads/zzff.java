package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzff extends zzfl {
    private final zzeg zzws;
    private long zzzl;

    public zzff(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2, zzeg zzegVar) {
        super(zzdxVar, str, str2, zzbVar, i, 53);
        this.zzws = zzegVar;
        if (zzegVar != null) {
            this.zzzl = zzegVar.zzcs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        if (this.zzws != null) {
            this.zzaaa.zzbl(((Long) this.zzaal.invoke(null, Long.valueOf(this.zzzl))).longValue());
        }
    }
}
