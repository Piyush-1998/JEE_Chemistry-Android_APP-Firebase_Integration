package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchy implements zzdwb<zzchw> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzbso> zzfxj;

    public zzchy(zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzbso> zzdwoVar3, zzdwo<Executor> zzdwoVar4) {
        this.zzejy = zzdwoVar;
        this.zzfcq = zzdwoVar2;
        this.zzfxj = zzdwoVar3;
        this.zzfdx = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzchw(this.zzejy.get(), this.zzfcq.get(), this.zzfxj.get(), this.zzfdx.get());
    }
}
