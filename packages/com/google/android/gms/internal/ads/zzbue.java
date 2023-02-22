package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbue implements zzdwb<zzbhx> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<Clock> zzfco;
    private final zzdwo<zzpe> zzfkm;

    public zzbue(zzdwo<zzpe> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<Context> zzdwoVar3, zzdwo<Clock> zzdwoVar4) {
        this.zzfkm = zzdwoVar;
        this.zzfck = zzdwoVar2;
        this.zzejy = zzdwoVar3;
        this.zzfco = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbhx) zzdwh.zza(new zzbhx(this.zzfck.get(), new zzbhi(this.zzejy.get(), this.zzfkm.get()), this.zzfco.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
