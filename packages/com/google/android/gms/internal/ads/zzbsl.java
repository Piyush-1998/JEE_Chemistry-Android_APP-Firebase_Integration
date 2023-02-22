package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsl implements zzdwb<zzbqs<zzbpg>> {
    private final zzdwo<Executor> zzfck;
    private final zzbrx zzfin;

    private zzbsl(zzbrx zzbrxVar, zzdwo<Executor> zzdwoVar) {
        this.zzfin = zzbrxVar;
        this.zzfck = zzdwoVar;
    }

    public static zzbsl zzd(zzbrx zzbrxVar, zzdwo<Executor> zzdwoVar) {
        return new zzbsl(zzbrxVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(this.zzfin.zzb(this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
