package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqb implements zzdwb<Set<zzbqs<zzbog>>> {
    private final zzbpn zzfhv;

    private zzbqb(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbqb zzq(zzbpn zzbpnVar) {
        return new zzbqb(zzbpnVar);
    }

    public static Set<zzbqs<zzbog>> zzr(zzbpn zzbpnVar) {
        return (Set) zzdwh.zza(zzbpnVar.zzage(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzr(this.zzfhv);
    }
}
