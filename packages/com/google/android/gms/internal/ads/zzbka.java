package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbka implements zzdwb<zzbjv> {
    private final zzdwo<zzbkn> zzesy;
    private final zzdwo<Runnable> zzewv;
    private final zzdwo<zzada> zzfcs;
    private final zzdwo<Executor> zzfdx;

    public zzbka(zzdwo<zzbkn> zzdwoVar, zzdwo<zzada> zzdwoVar2, zzdwo<Runnable> zzdwoVar3, zzdwo<Executor> zzdwoVar4) {
        this.zzesy = zzdwoVar;
        this.zzfcs = zzdwoVar2;
        this.zzewv = zzdwoVar3;
        this.zzfdx = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbjv(this.zzesy.get(), this.zzfcs.get(), this.zzewv.get(), this.zzfdx.get());
    }
}
