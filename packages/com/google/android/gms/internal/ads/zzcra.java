package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcra implements zzdwb<zzcqy> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<String> zzelu;

    private zzcra(zzdwo<Context> zzdwoVar, zzdwo<String> zzdwoVar2) {
        this.zzejy = zzdwoVar;
        this.zzelu = zzdwoVar2;
    }

    public static zzcra zzas(zzdwo<Context> zzdwoVar, zzdwo<String> zzdwoVar2) {
        return new zzcra(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcqy(this.zzejy.get(), this.zzelu.get());
    }
}
