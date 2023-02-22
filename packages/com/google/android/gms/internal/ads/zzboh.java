package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzboh implements zzdwb<zzbof> {
    private final zzdwo<Set<zzbqs<AdMetadataListener>>> zzfed;

    private zzboh(zzdwo<Set<zzbqs<AdMetadataListener>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzboh zzl(zzdwo<Set<zzbqs<AdMetadataListener>>> zzdwoVar) {
        return new zzboh(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbof(this.zzfed.get());
    }
}
