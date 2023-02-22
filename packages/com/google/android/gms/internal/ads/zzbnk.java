package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbnk implements zzdwb<zzbni> {
    private final zzdwo<Set<zzbqs<zzbnj>>> zzfed;

    private zzbnk(zzdwo<Set<zzbqs<zzbnj>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbnk zzh(zzdwo<Set<zzbqs<zzbnj>>> zzdwoVar) {
        return new zzbnk(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbni(this.zzfed.get());
    }
}
