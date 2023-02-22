package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcry<T> implements zzdwb<zzcrt<T>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<Set<zzcru<? extends zzcrr<T>>>> zzggo;

    private zzcry(zzdwo<Executor> zzdwoVar, zzdwo<Set<zzcru<? extends zzcrr<T>>>> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzggo = zzdwoVar2;
    }

    public static <T> zzcry<T> zzat(zzdwo<Executor> zzdwoVar, zzdwo<Set<zzcru<? extends zzcrr<T>>>> zzdwoVar2) {
        return new zzcry<>(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcrt(this.zzfck.get(), this.zzggo.get());
    }
}
