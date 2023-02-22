package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaio {
    private final Object zzdau = new Object();
    private final Object zzdav = new Object();
    private zzaix zzdaw;
    private zzaix zzdax;

    public final zzaix zza(Context context, zzaxl zzaxlVar) {
        zzaix zzaixVar;
        synchronized (this.zzdav) {
            if (this.zzdax == null) {
                this.zzdax = new zzaix(zzl(context), zzaxlVar, (String) zzuv.zzon().zzd(zzza.zzcge));
            }
            zzaixVar = this.zzdax;
        }
        return zzaixVar;
    }

    public final zzaix zzb(Context context, zzaxl zzaxlVar) {
        zzaix zzaixVar;
        synchronized (this.zzdau) {
            if (this.zzdaw == null) {
                this.zzdaw = new zzaix(zzl(context), zzaxlVar, (String) zzuv.zzon().zzd(zzza.zzcgf));
            }
            zzaixVar = this.zzdaw;
        }
        return zzaixVar;
    }

    private static Context zzl(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
