package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcio implements zzdwb<zzcip> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzbtl> zzfxj;

    public zzcio(zzdwo<Context> zzdwoVar, zzdwo<zzbtl> zzdwoVar2, zzdwo<Executor> zzdwoVar3) {
        this.zzejy = zzdwoVar;
        this.zzfxj = zzdwoVar2;
        this.zzfdx = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcip(this.zzejy.get(), this.zzfxj.get(), this.zzfdx.get());
    }
}
