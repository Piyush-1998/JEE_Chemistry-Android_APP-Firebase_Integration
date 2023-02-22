package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsh implements zzdwb<zzasm> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcwe> zzfef;
    private final zzbrx zzfin;

    private zzbsh(zzbrx zzbrxVar, zzdwo<Context> zzdwoVar, zzdwo<zzcwe> zzdwoVar2) {
        this.zzfin = zzbrxVar;
        this.zzejy = zzdwoVar;
        this.zzfef = zzdwoVar2;
    }

    public static zzbsh zza(zzbrx zzbrxVar, zzdwo<Context> zzdwoVar, zzdwo<zzcwe> zzdwoVar2) {
        return new zzbsh(zzbrxVar, zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzasm) zzdwh.zza(new zzasm(this.zzejy.get(), this.zzfef.get().zzgkh), "Cannot return null from a non-@Nullable @Provides method");
    }
}
