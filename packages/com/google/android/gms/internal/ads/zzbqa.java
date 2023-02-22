package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqa implements zzdwb<Set<zzbqs<AdMetadataListener>>> {
    private final zzbpn zzfhv;

    private zzbqa(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbqa zzp(zzbpn zzbpnVar) {
        return new zzbqa(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzfhv.zzagh(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
