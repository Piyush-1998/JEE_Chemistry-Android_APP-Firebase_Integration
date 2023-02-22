package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhp implements zzdwb<zzbhk> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzajc> zzfcl;
    private final zzdwo<zzbhi> zzfcm;
    private final zzdwo<zzbhf> zzfcn;
    private final zzdwo<Clock> zzfco;

    private zzbhp(zzdwo<zzajc> zzdwoVar, zzdwo<zzbhi> zzdwoVar2, zzdwo<Executor> zzdwoVar3, zzdwo<zzbhf> zzdwoVar4, zzdwo<Clock> zzdwoVar5) {
        this.zzfcl = zzdwoVar;
        this.zzfcm = zzdwoVar2;
        this.zzfck = zzdwoVar3;
        this.zzfcn = zzdwoVar4;
        this.zzfco = zzdwoVar5;
    }

    public static zzbhp zza(zzdwo<zzajc> zzdwoVar, zzdwo<zzbhi> zzdwoVar2, zzdwo<Executor> zzdwoVar3, zzdwo<zzbhf> zzdwoVar4, zzdwo<Clock> zzdwoVar5) {
        return new zzbhp(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbhk(this.zzfcl.get(), this.zzfcm.get(), this.zzfck.get(), this.zzfcn.get(), this.zzfco.get());
    }
}
