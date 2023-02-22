package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbpw implements zzdwb<Set<zzbqs<zzbnf>>> {
    private final zzbpn zzfhv;

    public zzbpw(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfhv.zzagg(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
