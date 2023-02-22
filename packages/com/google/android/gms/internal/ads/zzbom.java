package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbom implements zzdwb<zzbok> {
    private final zzdwo<Set<zzbqs<zzbol>>> zzfed;

    private zzbom(zzdwo<Set<zzbqs<zzbol>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbom zzm(zzdwo<Set<zzbqs<zzbol>>> zzdwoVar) {
        return new zzbom(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbok(this.zzfed.get());
    }
}
