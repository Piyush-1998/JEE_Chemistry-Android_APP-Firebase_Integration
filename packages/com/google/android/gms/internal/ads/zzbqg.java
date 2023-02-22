package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqg implements zzdwb<zzcjf> {
    private final zzdwo<Clock> zzfco;
    private final zzbpn zzfhv;

    private zzbqg(zzbpn zzbpnVar, zzdwo<Clock> zzdwoVar) {
        this.zzfhv = zzbpnVar;
        this.zzfco = zzdwoVar;
    }

    public static zzbqg zzb(zzbpn zzbpnVar, zzdwo<Clock> zzdwoVar) {
        return new zzbqg(zzbpnVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcjf) zzdwh.zza(this.zzfhv.zza(this.zzfco.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
