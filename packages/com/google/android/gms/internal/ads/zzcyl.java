package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcyl implements zzdwb<zzcyg> {
    private final zzdwo<zzcyf> zzene;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<ScheduledExecutorService> zzfdm;

    private zzcyl(zzdwo<zzddl> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<zzcyf> zzdwoVar3) {
        this.zzfck = zzdwoVar;
        this.zzfdm = zzdwoVar2;
        this.zzene = zzdwoVar3;
    }

    public static zzcyl zzs(zzdwo<zzddl> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<zzcyf> zzdwoVar3) {
        return new zzcyl(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcyg(this.zzfck.get(), this.zzfdm.get(), this.zzene.get());
    }
}
