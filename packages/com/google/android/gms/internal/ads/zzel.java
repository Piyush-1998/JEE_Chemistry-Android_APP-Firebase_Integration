package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzbo;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzel extends zzfl {
    private final Activity zzzr;
    private final View zzzs;

    public zzel(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2, View view, Activity activity) {
        super(zzdxVar, str, str2, zzbVar, i, 62);
        this.zzzs = view;
        this.zzzr = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        if (this.zzzs == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzuv.zzon().zzd(zzza.zzcna)).booleanValue();
        Object[] objArr = (Object[]) this.zzaal.invoke(null, this.zzzs, this.zzzr, Boolean.valueOf(booleanValue));
        synchronized (this.zzaaa) {
            this.zzaaa.zzbp(((Long) objArr[0]).longValue());
            this.zzaaa.zzbq(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zzaaa.zzag((String) objArr[2]);
            }
        }
    }
}
