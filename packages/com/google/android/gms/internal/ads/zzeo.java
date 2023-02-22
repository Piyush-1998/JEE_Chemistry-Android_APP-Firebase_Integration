package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzeo extends zzfl {
    public zzeo(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2) {
        super(zzdxVar, str, str2, zzbVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        this.zzaaa.zzam(-1L);
        this.zzaaa.zzan(-1L);
        int[] iArr = (int[]) this.zzaal.invoke(null, this.zzvo.getContext());
        synchronized (this.zzaaa) {
            this.zzaaa.zzam(iArr[0]);
            this.zzaaa.zzan(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zzaaa.zzbm(iArr[2]);
            }
        }
    }
}
