package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbnl extends zzbpm<zzbnm> {
    public zzbnl(Set<zzbqs<zzbnm>> set) {
        super(set);
    }

    public final void zzbu(final Context context) {
        zza(new zzbpo(context) { // from class: com.google.android.gms.internal.ads.zzbno
            private final Context zzdpy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzbnm) obj).zzbu(this.zzdpy);
            }
        });
    }

    public final void zzbv(final Context context) {
        zza(new zzbpo(context) { // from class: com.google.android.gms.internal.ads.zzbnn
            private final Context zzdpy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzbnm) obj).zzbv(this.zzdpy);
            }
        });
    }

    public final void zzbw(final Context context) {
        zza(new zzbpo(context) { // from class: com.google.android.gms.internal.ads.zzbnq
            private final Context zzdpy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzbnm) obj).zzbw(this.zzdpy);
            }
        });
    }

    public final void zza(zzbri zzbriVar, Executor executor) {
        zza(zzbqs.zzb(new zzbnp(this, zzbriVar), executor));
    }
}
