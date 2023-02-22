package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnm implements zzdwb<zzcnk> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzcee> zzgdt;

    public zzcnm(zzdwo<Executor> zzdwoVar, zzdwo<zzcee> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzgdt = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcnk(this.zzfck.get(), this.zzgdt.get());
    }
}
