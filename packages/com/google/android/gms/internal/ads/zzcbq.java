package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbq implements zzdwb<zzcbo> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxm> zzepi;
    private final zzdwo<Executor> zzfck;

    public zzcbq(zzdwo<Executor> zzdwoVar, zzdwo<zzaxm> zzdwoVar2, zzdwo<Context> zzdwoVar3) {
        this.zzfck = zzdwoVar;
        this.zzepi = zzdwoVar2;
        this.zzejy = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcbo(this.zzfck.get(), this.zzepi.get(), this.zzejy.get());
    }
}
