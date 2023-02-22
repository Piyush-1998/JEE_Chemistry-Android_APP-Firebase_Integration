package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvo implements zzdwb<zzbvm> {
    private final zzdwo<zzbyh> zzeuf;
    private final zzdwo<Clock> zzfco;

    public zzbvo(zzdwo<zzbyh> zzdwoVar, zzdwo<Clock> zzdwoVar2) {
        this.zzeuf = zzdwoVar;
        this.zzfco = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbvm(this.zzeuf.get(), this.zzfco.get());
    }
}
