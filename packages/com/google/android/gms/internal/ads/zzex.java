package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzex extends zzfl {
    private long zzaad;

    public zzex(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2) {
        super(zzdxVar, str, str2, zzbVar, i, 12);
        this.zzaad = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        this.zzaaa.zzap(-1L);
        this.zzaaa.zzap(((Long) this.zzaal.invoke(null, this.zzvo.getContext())).longValue());
    }
}
