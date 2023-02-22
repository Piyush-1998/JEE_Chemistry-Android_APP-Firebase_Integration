package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcce implements zzdwb<Set<zzbqs<zzcym>>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcch> zzfrj;
    private final zzcbx zzfsp;

    private zzcce(zzcbx zzcbxVar, zzdwo<zzcch> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfsp = zzcbxVar;
        this.zzfrj = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzcce zzg(zzcbx zzcbxVar, zzdwo<zzcch> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzcce(zzcbxVar, zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(zzcbx.zzh(this.zzfrj.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
