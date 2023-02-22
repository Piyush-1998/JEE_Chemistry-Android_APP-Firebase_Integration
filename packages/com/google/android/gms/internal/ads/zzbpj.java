package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpj implements zzdwb<zzbpk> {
    private final zzdwo<Set<zzbqs<Object>>> zzfed;

    private zzbpj(zzdwo<Set<zzbqs<Object>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbpj zzq(zzdwo<Set<zzbqs<Object>>> zzdwoVar) {
        return new zzbpj(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbpk(this.zzfed.get());
    }
}
