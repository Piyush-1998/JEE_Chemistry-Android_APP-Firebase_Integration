package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcey implements zzdwb<zzcen> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzapr> zzfvp;
    private final zzdwo<zzbgq> zzfvq;
    private final zzdwo<zzaps> zzfvr;

    private zzcey(zzdwo<Context> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzapr> zzdwoVar3, zzdwo<zzbgq> zzdwoVar4, zzdwo<zzaps> zzdwoVar5) {
        this.zzejy = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzfvp = zzdwoVar3;
        this.zzfvq = zzdwoVar4;
        this.zzfvr = zzdwoVar5;
    }

    public static zzcey zzg(zzdwo<Context> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzapr> zzdwoVar3, zzdwo<zzbgq> zzdwoVar4, zzdwo<zzaps> zzdwoVar5) {
        return new zzcey(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcen(this.zzejy.get(), this.zzfdx.get(), this.zzfvp.get(), this.zzfvq.get(), this.zzfvr.get());
    }
}
