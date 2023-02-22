package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnt implements zzcru<Object> {
    private final Executor executor;
    private final zzddi<String> zzgdz;

    public zzcnt(zzddi<String> zzddiVar, Executor executor) {
        this.zzgdz = zzddiVar;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<Object> zzalv() {
        return zzdcy.zzb(this.zzgdz, zzcnw.zzbkv, this.executor);
    }
}
