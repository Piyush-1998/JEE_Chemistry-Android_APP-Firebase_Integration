package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxt implements zzdwb<zzbxe> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzbzl> zzfno;

    public zzbxt(zzdwo<Context> zzdwoVar, zzdwo<zzcwe> zzdwoVar2, zzdwo<Executor> zzdwoVar3, zzdwo<zzbzl> zzdwoVar4) {
        this.zzejy = zzdwoVar;
        this.zzfef = zzdwoVar2;
        this.zzfdx = zzdwoVar3;
        this.zzfno = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbxe(this.zzejy.get(), this.zzfef.get(), this.zzfdx.get(), this.zzfno.get());
    }
}
