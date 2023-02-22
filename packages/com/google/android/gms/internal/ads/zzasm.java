package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzasm implements zzpj {
    private final Object lock;
    private String zzbqy;
    private final Context zzcfz;
    private boolean zzdpt;

    public zzasm(Context context, String str) {
        this.zzcfz = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzbqy = str;
        this.zzdpt = false;
        this.lock = new Object();
    }

    public final void zzaf(boolean z) {
        if (com.google.android.gms.ads.internal.zzq.zzlh().zzab(this.zzcfz)) {
            synchronized (this.lock) {
                if (this.zzdpt == z) {
                    return;
                }
                this.zzdpt = z;
                if (TextUtils.isEmpty(this.zzbqy)) {
                    return;
                }
                if (this.zzdpt) {
                    com.google.android.gms.ads.internal.zzq.zzlh().zze(this.zzcfz, this.zzbqy);
                } else {
                    com.google.android.gms.ads.internal.zzq.zzlh().zzf(this.zzcfz, this.zzbqy);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zza(zzpk zzpkVar) {
        zzaf(zzpkVar.zzbnp);
    }

    public final String getAdUnitId() {
        return this.zzbqy;
    }
}
