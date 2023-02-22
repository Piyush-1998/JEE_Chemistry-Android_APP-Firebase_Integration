package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbly implements zzdwb<com.google.android.gms.ads.internal.zzc> {
    private final zzdwo<Context> zzejy;
    private final zzblz zzfgl;
    private final zzdwo<zzasi> zzfgm;

    private zzbly(zzblz zzblzVar, zzdwo<Context> zzdwoVar, zzdwo<zzasi> zzdwoVar2) {
        this.zzfgl = zzblzVar;
        this.zzejy = zzdwoVar;
        this.zzfgm = zzdwoVar2;
    }

    public static zzbly zza(zzblz zzblzVar, zzdwo<Context> zzdwoVar, zzdwo<zzasi> zzdwoVar2) {
        return new zzbly(zzblzVar, zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zzc) zzdwh.zza(new com.google.android.gms.ads.internal.zzc(this.zzejy.get(), this.zzfgm.get(), null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
