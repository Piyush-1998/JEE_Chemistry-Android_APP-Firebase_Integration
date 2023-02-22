package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbys implements zzdwb<zzbyr> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzaxl> zzfgx;
    private final zzdwo<zzdf> zzfkh;
    private final zzdwo<com.google.android.gms.ads.internal.zza> zzfox;
    private final zzdwo<zzbcb> zzfqe;

    public zzbys(zzdwo<Context> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzdf> zzdwoVar3, zzdwo<zzaxl> zzdwoVar4, zzdwo<com.google.android.gms.ads.internal.zza> zzdwoVar5, zzdwo<zzbcb> zzdwoVar6) {
        this.zzejy = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzfkh = zzdwoVar3;
        this.zzfgx = zzdwoVar4;
        this.zzfox = zzdwoVar5;
        this.zzfqe = zzdwoVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbyr(this.zzejy.get(), this.zzfdx.get(), this.zzfkh.get(), this.zzfgx.get(), this.zzfox.get(), this.zzfqe.get());
    }
}
