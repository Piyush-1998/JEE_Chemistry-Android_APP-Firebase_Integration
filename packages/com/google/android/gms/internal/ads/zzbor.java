package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbor implements zzdwb<zzboo> {
    private final zzdwo<Set<zzbqs<com.google.android.gms.ads.internal.overlay.zzo>>> zzfed;

    private zzbor(zzdwo<Set<zzbqs<com.google.android.gms.ads.internal.overlay.zzo>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbor zzn(zzdwo<Set<zzbqs<com.google.android.gms.ads.internal.overlay.zzo>>> zzdwoVar) {
        return new zzbor(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzboo(this.zzfed.get());
    }
}
