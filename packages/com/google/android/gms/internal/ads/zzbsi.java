package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsi implements zzdwb<Set<zzbqs<zzbqp>>> {
    private final zzdwo<zzbtb> zzfdd;

    private zzbsi(zzdwo<zzbtb> zzdwoVar) {
        this.zzfdd = zzdwoVar;
    }

    public static zzbsi zzu(zzdwo<zzbtb> zzdwoVar) {
        return new zzbsi(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(Collections.singleton(zzbqs.zzb(this.zzfdd.get(), zzaxn.zzdwn)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
