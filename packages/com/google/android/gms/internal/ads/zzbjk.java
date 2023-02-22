package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjk implements zzdwb<zzcru<zzcno>> {
    private final zzdwo<ScheduledExecutorService> zzfdm;
    private final zzdwo<zzcnn> zzfeh;

    public zzbjk(zzdwo<zzcnn> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2) {
        this.zzfeh = zzdwoVar;
        this.zzfdm = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcru) zzdwh.zza(new zzcqq(this.zzfeh.get(), 0L, this.zzfdm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
