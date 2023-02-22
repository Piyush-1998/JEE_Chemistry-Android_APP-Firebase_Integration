package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpv implements zzdwb<Set<zzbqs<zzbpg>>> {
    private final zzbpn zzfhv;

    private zzbpv(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbpv zzl(zzbpn zzbpnVar) {
        return new zzbpv(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
