package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcpf implements zzdwb<zzcpd<zzcoz>> {
    private final zzdwo<Clock> zzfco;
    private final zzdwo<zzcpc> zzgfa;

    public zzcpf(zzdwo<zzcpc> zzdwoVar, zzdwo<Clock> zzdwoVar2) {
        this.zzgfa = zzdwoVar;
        this.zzfco = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcpd) zzdwh.zza(new zzcpd(this.zzgfa.get(), 10000L, this.zzfco.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
