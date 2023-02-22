package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnk implements zzdcj<zzape, zzcnl> {
    private Executor executor;
    private zzcee zzgdq;

    public zzcnk(Executor executor, zzcee zzceeVar) {
        this.executor = executor;
        this.zzgdq = zzceeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final /* synthetic */ zzddi<zzcnl> zzf(zzape zzapeVar) throws Exception {
        final zzape zzapeVar2 = zzapeVar;
        return zzdcy.zzb(this.zzgdq.zzg(zzapeVar2), new zzdcj(zzapeVar2) { // from class: com.google.android.gms.internal.ads.zzcnj
            private final zzape zzfhh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfhh = zzapeVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return zzdcy.zzah(new zzcnl(new JsonReader(new InputStreamReader((InputStream) obj))).zzn(this.zzfhh.zzdma));
            }
        }, this.executor);
    }
}
