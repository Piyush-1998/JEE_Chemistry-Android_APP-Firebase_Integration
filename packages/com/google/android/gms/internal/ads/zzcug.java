package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcug implements zzdwb<zzcud<zzbzc, zzbyz>> {
    private final zzdwo<Context> zzejy;

    public zzcug(zzdwo<Context> zzdwoVar) {
        this.zzejy = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        this.zzejy.get();
        return (zzcud) zzdwh.zza(new zzcue(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
