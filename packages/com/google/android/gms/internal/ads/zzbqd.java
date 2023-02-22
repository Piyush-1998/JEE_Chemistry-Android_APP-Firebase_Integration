package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqd implements zzdwb<Set<zzbqs<zzbol>>> {
    private final zzbpn zzfhv;

    private zzbqd(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbqd zzt(zzbpn zzbpnVar) {
        return new zzbqd(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfhv.zzagl(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
