package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcso implements zzcru<zzcsl> {
    private final Executor executor;
    private final PackageInfo zzdiv;
    private final zzatn zzggu;
    private final String zzggw;

    public zzcso(zzatn zzatnVar, Executor executor, String str, PackageInfo packageInfo) {
        this.zzggu = zzatnVar;
        this.executor = executor;
        this.zzggw = str;
        this.zzdiv = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcsl> zzalv() {
        return zzdcy.zzb(zzdcy.zzb(this.zzggu.zza(this.zzggw, this.zzdiv), zzcsn.zzdos, this.executor), Throwable.class, new zzdcj(this) { // from class: com.google.android.gms.internal.ads.zzcsq
            private final zzcso zzggy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggy = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzggy.zze((Throwable) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zze(Throwable th) throws Exception {
        return zzdcy.zzah(new zzcsl(this.zzggw));
    }
}
