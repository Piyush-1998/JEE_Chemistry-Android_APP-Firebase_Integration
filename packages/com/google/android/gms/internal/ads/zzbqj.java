package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqj implements zzdwb<Set<zzbqs<VideoController.VideoLifecycleCallbacks>>> {
    private final zzbpn zzfhv;

    private zzbqj(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbqj zzx(zzbpn zzbpnVar) {
        return new zzbqj(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
