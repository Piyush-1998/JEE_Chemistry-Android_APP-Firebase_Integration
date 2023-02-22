package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbz implements zzdwb<Set<zzbqs<zzbnb>>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcch> zzfrj;
    private final zzcbx zzfsp;

    private zzcbz(zzcbx zzcbxVar, zzdwo<zzcch> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfsp = zzcbxVar;
        this.zzfrj = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzcbz zzc(zzcbx zzcbxVar, zzdwo<zzcch> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzcbz(zzcbxVar, zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(zzcbx.zzd(this.zzfrj.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
