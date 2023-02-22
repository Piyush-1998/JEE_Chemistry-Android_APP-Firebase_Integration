package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpx implements zzdwb<Set<zzbqs<zzbnb>>> {
    private final zzbpn zzfhv;

    private zzbpx(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbpx zzm(zzbpn zzbpnVar) {
        return new zzbpx(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfhv.zzagf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
