package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzeq extends zzfl {
    private long startTime;

    public zzeq(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, long j, int i, int i2) {
        super(zzdxVar, str, str2, zzbVar, i, 25);
        this.startTime = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzaal.invoke(null, new Object[0])).longValue();
        synchronized (this.zzaaa) {
            this.zzaaa.zzbr(longValue);
            if (this.startTime != 0) {
                this.zzaaa.zzat(longValue - this.startTime);
                this.zzaaa.zzaw(this.startTime);
            }
        }
    }
}
