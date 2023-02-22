package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzckl implements zzdwb<zzcke> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzbzc> zzfxj;

    public zzckl(zzdwo<Context> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzbzc> zzdwoVar3) {
        this.zzejy = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzfxj = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcke(this.zzejy.get(), this.zzfdx.get(), this.zzfxj.get());
    }
}
