package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbtn implements zzdwb<Set<String>> {
    private final zzdwo<zzbuy> zzfdw;

    public zzbtn(zzdwo<zzbuy> zzdwoVar) {
        this.zzfdw = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        Set emptySet;
        if (this.zzfdw.get().zzaih() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzdwh.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
