package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvc implements zzdwb<zzasm> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcwe> zzfef;
    private final zzbvd zzfmg;

    private zzbvc(zzbvd zzbvdVar, zzdwo<Context> zzdwoVar, zzdwo<zzcwe> zzdwoVar2) {
        this.zzfmg = zzbvdVar;
        this.zzejy = zzdwoVar;
        this.zzfef = zzdwoVar2;
    }

    public static zzbvc zza(zzbvd zzbvdVar, zzdwo<Context> zzdwoVar, zzdwo<zzcwe> zzdwoVar2) {
        return new zzbvc(zzbvdVar, zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzasm) zzdwh.zza(new zzasm(this.zzejy.get(), this.zzfef.get().zzgkh), "Cannot return null from a non-@Nullable @Provides method");
    }
}
