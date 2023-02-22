package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqh implements zzdwb<Set<zzbqs<zzbrb>>> {
    private final zzbpn zzfhv;

    private zzbqh(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbqh zzw(zzbpn zzbpnVar) {
        return new zzbqh(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
