package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxq implements zzdwb<zzbxn> {
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzbhx> zzfnp;
    private final zzdwo<zzbqv> zzfph;

    public zzbxq(zzdwo<Executor> zzdwoVar, zzdwo<zzbhx> zzdwoVar2, zzdwo<zzbqv> zzdwoVar3) {
        this.zzfdx = zzdwoVar;
        this.zzfnp = zzdwoVar2;
        this.zzfph = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbxn(this.zzfdx.get(), this.zzfnp.get(), this.zzfph.get());
    }
}
