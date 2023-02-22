package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchl implements zzdwb<zzchh> {
    private final zzdwo<zzbjn> zzewa;
    private final zzdwo<zzcgn> zzewe;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<ScheduledExecutorService> zzfoz;
    private final zzdwo<zzbmz> zzfyf;

    public zzchl(zzdwo<zzbjn> zzdwoVar, zzdwo<zzcgn> zzdwoVar2, zzdwo<zzbmz> zzdwoVar3, zzdwo<ScheduledExecutorService> zzdwoVar4, zzdwo<zzddl> zzdwoVar5) {
        this.zzewa = zzdwoVar;
        this.zzewe = zzdwoVar2;
        this.zzfyf = zzdwoVar3;
        this.zzfoz = zzdwoVar4;
        this.zzfck = zzdwoVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzchh(this.zzewa.get(), this.zzewe.get(), this.zzfyf.get(), this.zzfoz.get(), this.zzfck.get());
    }
}
