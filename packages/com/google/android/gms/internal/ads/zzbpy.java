package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpy implements zzdwb<Set<zzbqs<zzbna>>> {
    private final zzbpn zzfhv;

    private zzbpy(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbpy zzn(zzbpn zzbpnVar) {
        return new zzbpy(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfhv.zzagd(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
