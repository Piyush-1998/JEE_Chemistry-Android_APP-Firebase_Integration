package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsa implements zzdwb<Set<zzbqs<zzbna>>> {
    private final zzdwo<zzbsz> zzfdd;
    private final zzbrx zzfin;

    private zzbsa(zzbrx zzbrxVar, zzdwo<zzbsz> zzdwoVar) {
        this.zzfin = zzbrxVar;
        this.zzfdd = zzdwoVar;
    }

    public static zzbsa zza(zzbrx zzbrxVar, zzdwo<zzbsz> zzdwoVar) {
        return new zzbsa(zzbrxVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfin.zza(this.zzfdd.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
