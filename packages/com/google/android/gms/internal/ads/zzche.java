package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzche implements zzdwb<zzchd> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzbso> zzfxj;
    private final zzdwo<zzcvp> zzfxz;

    public zzche(zzdwo<Context> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzbso> zzdwoVar3, zzdwo<zzcvp> zzdwoVar4) {
        this.zzejy = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzfxj = zzdwoVar3;
        this.zzfxz = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzchd(this.zzejy.get(), this.zzfdx.get(), this.zzfxj.get(), this.zzfxz.get());
    }
}
