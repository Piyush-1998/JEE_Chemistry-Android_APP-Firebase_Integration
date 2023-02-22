package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsj implements zzdwb<zzbqs<zzbna>> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzbtd> zzfdd;
    private final zzbrx zzfin;

    private zzbsj(zzbrx zzbrxVar, zzdwo<zzbtd> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfin = zzbrxVar;
        this.zzfdd = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzbsj zzb(zzbrx zzbrxVar, zzdwo<zzbtd> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzbsj(zzbrxVar, zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfdd.get(), this.zzfck.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
