package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjh implements zzdwb<Set<zzbqs<zzpj>>> {
    private final zzdwo<zzbkf> zzfdd;
    private final zzbiv zzfec;

    public zzbjh(zzbiv zzbivVar, zzdwo<zzbkf> zzdwoVar) {
        this.zzfec = zzbivVar;
        this.zzfdd = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(Collections.singleton(new zzbqs(this.zzfdd.get(), zzaxn.zzdwn)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
