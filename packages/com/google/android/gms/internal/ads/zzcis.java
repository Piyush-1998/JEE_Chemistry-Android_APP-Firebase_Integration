package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcis implements zzdwb<zzcir> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzbtl> zzfxj;

    public zzcis(zzdwo<Context> zzdwoVar, zzdwo<zzbtl> zzdwoVar2) {
        this.zzejy = zzdwoVar;
        this.zzfxj = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcir(this.zzejy.get(), this.zzfxj.get());
    }
}
