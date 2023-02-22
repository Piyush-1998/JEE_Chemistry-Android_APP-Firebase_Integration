package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblq implements zzdwb<zzblr> {
    private final zzdwo<Clock> zzfco;
    private final zzdwo<zzatq> zzfgi;

    private zzblq(zzdwo<Clock> zzdwoVar, zzdwo<zzatq> zzdwoVar2) {
        this.zzfco = zzdwoVar;
        this.zzfgi = zzdwoVar2;
    }

    public static zzblq zzb(zzdwo<Clock> zzdwoVar, zzdwo<zzatq> zzdwoVar2) {
        return new zzblq(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzblr(this.zzfco.get(), this.zzfgi.get());
    }
}
