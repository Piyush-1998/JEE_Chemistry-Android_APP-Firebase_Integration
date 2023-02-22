package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmx implements zzdwb<zzbmv> {
    private final zzdwo<Set<zzbqs<zztp>>> zzfed;

    private zzbmx(zzdwo<Set<zzbqs<zztp>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbmx zzg(zzdwo<Set<zzbqs<zztp>>> zzdwoVar) {
        return new zzbmx(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbmv(this.zzfed.get());
    }
}
