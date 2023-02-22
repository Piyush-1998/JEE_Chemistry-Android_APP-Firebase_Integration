package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzccb implements zzdwb<Set<zzbqs<zzbog>>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcch> zzfrj;
    private final zzcbx zzfsp;

    private zzccb(zzcbx zzcbxVar, zzdwo<zzcch> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfsp = zzcbxVar;
        this.zzfrj = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzccb zzd(zzcbx zzcbxVar, zzdwo<zzcch> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzccb(zzcbxVar, zzdwoVar, zzdwoVar2);
    }

    public static Set<zzbqs<zzbog>> zzb(zzcbx zzcbxVar, zzcch zzcchVar, Executor executor) {
        return (Set) zzdwh.zza(zzcbx.zzc(zzcchVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzb(this.zzfsp, this.zzfrj.get(), this.zzfck.get());
    }
}
