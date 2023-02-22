package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpt implements zzdwb<Set<zzbqs<zzbog>>> {
    private final zzbpn zzfhv;

    private zzbpt(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbpt zzi(zzbpn zzbpnVar) {
        return new zzbpt(zzbpnVar);
    }

    public static Set<zzbqs<zzbog>> zzj(zzbpn zzbpnVar) {
        return (Set) zzdwh.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzj(this.zzfhv);
    }
}
