package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbho implements zzdwb<zzbhf> {
    private final zzdwo<zzpe> zzfci;
    private final zzdwo<zzajc> zzfcj;
    private final zzdwo<Executor> zzfck;

    private zzbho(zzdwo<zzpe> zzdwoVar, zzdwo<zzajc> zzdwoVar2, zzdwo<Executor> zzdwoVar3) {
        this.zzfci = zzdwoVar;
        this.zzfcj = zzdwoVar2;
        this.zzfck = zzdwoVar3;
    }

    public static zzbho zzb(zzdwo<zzpe> zzdwoVar, zzdwo<zzajc> zzdwoVar2, zzdwo<Executor> zzdwoVar3) {
        return new zzbho(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbhf) zzdwh.zza(new zzbhf(this.zzfci.get().zzkf(), this.zzfcj.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
