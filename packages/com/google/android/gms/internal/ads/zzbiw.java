package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbiw implements zzdwb<zzbob> {
    private final zzbiv zzfec;
    private final zzdwo<Set<zzbqs<zzbog>>> zzfed;

    public zzbiw(zzbiv zzbivVar, zzdwo<Set<zzbqs<zzbog>>> zzdwoVar) {
        this.zzfec = zzbivVar;
        this.zzfed = zzdwoVar;
    }

    public static zzbob zza(zzbiv zzbivVar, Set<zzbqs<zzbog>> set) {
        return (zzbob) zzdwh.zza(zzbivVar.zza(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzfec, this.zzfed.get());
    }
}
