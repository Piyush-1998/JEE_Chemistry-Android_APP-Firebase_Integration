package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqc implements zzdwb<Set<zzbqs<AppEventListener>>> {
    private final zzbpn zzfhv;

    private zzbqc(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbqc zzs(zzbpn zzbpnVar) {
        return new zzbqc(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfhv.zzagi(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
