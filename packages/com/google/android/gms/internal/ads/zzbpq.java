package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpq implements zzdwb<Set<zzbqs<zzbnm>>> {
    private final zzbpn zzfhv;

    private zzbpq(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbpq zzg(zzbpn zzbpnVar) {
        return new zzbpq(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
