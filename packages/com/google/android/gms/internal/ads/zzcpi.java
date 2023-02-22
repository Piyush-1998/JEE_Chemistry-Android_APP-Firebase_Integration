package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcpi implements zzdwb<zzcpd<zzcrx>> {
    private final zzdwo<zzcsa> zzelb;
    private final zzdwo<Clock> zzfco;

    public zzcpi(zzdwo<zzcsa> zzdwoVar, zzdwo<Clock> zzdwoVar2) {
        this.zzelb = zzdwoVar;
        this.zzfco = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcpd) zzdwh.zza(new zzcpd(this.zzelb.get(), ((Long) zzuv.zzon().zzd(zzza.zzcmb)).longValue(), this.zzfco.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
