package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcar implements zzdwb<Set<zzbqs<zzcym>>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcay> zzfcs;

    private zzcar(zzdwo<Executor> zzdwoVar, zzdwo<zzcay> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzfcs = zzdwoVar2;
    }

    public static zzcar zzr(zzdwo<Executor> zzdwoVar, zzdwo<zzcay> zzdwoVar2) {
        return new zzcar(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        Set emptySet;
        Executor executor = this.zzfck.get();
        zzcay zzcayVar = this.zzfcs.get();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcql)).booleanValue()) {
            emptySet = Collections.singleton(new zzbqs(zzcayVar, executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzdwh.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
