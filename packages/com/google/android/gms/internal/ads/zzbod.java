package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbod implements zzdwb<zzbob> {
    private final zzdwo<Set<zzbqs<zzbog>>> zzfed;

    private zzbod(zzdwo<Set<zzbqs<zzbog>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbod zzk(zzdwo<Set<zzbqs<zzbog>>> zzdwoVar) {
        return new zzbod(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbob(this.zzfed.get());
    }
}
