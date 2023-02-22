package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqx implements zzdwb<zzbqv> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<Set<zzbqs<zzpj>>> zzfed;
    private final zzdwo<zzcvr> zzfes;

    private zzbqx(zzdwo<Context> zzdwoVar, zzdwo<Set<zzbqs<zzpj>>> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3) {
        this.zzejy = zzdwoVar;
        this.zzfed = zzdwoVar2;
        this.zzfes = zzdwoVar3;
    }

    public static zzbqx zzi(zzdwo<Context> zzdwoVar, zzdwo<Set<zzbqs<zzpj>>> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3) {
        return new zzbqx(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbqv(this.zzejy.get(), this.zzfed.get(), this.zzfes.get());
    }
}
