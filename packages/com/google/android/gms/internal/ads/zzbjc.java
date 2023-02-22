package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjc implements zzdwb<Set<zzbqs<zzbog>>> {
    private final zzdwo<zzbkf> zzfdd;
    private final zzbiv zzfec;

    public zzbjc(zzbiv zzbivVar, zzdwo<zzbkf> zzdwoVar) {
        this.zzfec = zzbivVar;
        this.zzfdd = zzdwoVar;
    }

    public static Set<zzbqs<zzbog>> zza(zzbiv zzbivVar, zzbkf zzbkfVar) {
        return (Set) zzdwh.zza(Collections.singleton(new zzbqs(zzbkfVar, zzaxn.zzdwn)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzfec, this.zzfdd.get());
    }
}
