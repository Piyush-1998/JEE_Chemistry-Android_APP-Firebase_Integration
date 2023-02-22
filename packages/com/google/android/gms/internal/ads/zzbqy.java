package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqy implements zzdwb<zzbqw> {
    private final zzdwo<Set<zzbqs<zzbrb>>> zzfed;

    private zzbqy(zzdwo<Set<zzbqs<zzbrb>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbqy zzs(zzdwo<Set<zzbqs<zzbrb>>> zzdwoVar) {
        return new zzbqy(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbqw(this.zzfed.get());
    }
}
