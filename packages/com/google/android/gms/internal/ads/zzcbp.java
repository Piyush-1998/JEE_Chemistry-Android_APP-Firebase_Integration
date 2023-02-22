package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbp implements zzdwb<zzcbn> {
    private final zzdwo<Clock> zzfco;
    private final zzdwo<zzcbl> zzfsf;
    private final zzdwo<Set<zzcbm>> zzfsg;

    private zzcbp(zzdwo<zzcbl> zzdwoVar, zzdwo<Set<zzcbm>> zzdwoVar2, zzdwo<Clock> zzdwoVar3) {
        this.zzfsf = zzdwoVar;
        this.zzfsg = zzdwoVar2;
        this.zzfco = zzdwoVar3;
    }

    public static zzcbp zzm(zzdwo<zzcbl> zzdwoVar, zzdwo<Set<zzcbm>> zzdwoVar2, zzdwo<Clock> zzdwoVar3) {
        return new zzcbp(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcbn(this.zzfsf.get(), this.zzfsg.get(), this.zzfco.get());
    }
}
