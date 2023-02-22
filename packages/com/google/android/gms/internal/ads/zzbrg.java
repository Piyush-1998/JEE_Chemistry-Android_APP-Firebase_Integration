package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbrg implements zzdwb<zzbrc> {
    private final zzdwo<Set<zzbqs<zzafb>>> zzfed;

    public zzbrg(zzdwo<Set<zzbqs<zzafb>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbrc(this.zzfed.get());
    }
}
