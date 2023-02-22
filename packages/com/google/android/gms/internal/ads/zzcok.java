package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcok implements zzcru<zzcrr<Bundle>> {
    private final Executor executor;
    private final zzatr zzbml;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcok(Executor executor, zzatr zzatrVar) {
        this.executor = executor;
        this.zzbml = zzatrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcrr<Bundle>> zzalv() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcne)).booleanValue()) {
            return zzdcy.zzah(null);
        }
        return zzdcy.zzb(this.zzbml.zzui(), zzcoj.zzdos, this.executor);
    }
}
