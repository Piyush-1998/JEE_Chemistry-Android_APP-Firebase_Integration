package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpu implements zzdwb<Set<zzbqs<zztp>>> {
    private final zzbpn zzfhv;

    private zzbpu(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbpu zzk(zzbpn zzbpnVar) {
        return new zzbpu(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfhv.zzagj(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
