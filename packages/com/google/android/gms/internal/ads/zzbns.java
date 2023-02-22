package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbns implements zzdwb<zzbnl> {
    private final zzdwo<Set<zzbqs<zzbnm>>> zzfed;

    private zzbns(zzdwo<Set<zzbqs<zzbnm>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbns zzi(zzdwo<Set<zzbqs<zzbnm>>> zzdwoVar) {
        return new zzbns(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbnl(this.zzfed.get());
    }
}
