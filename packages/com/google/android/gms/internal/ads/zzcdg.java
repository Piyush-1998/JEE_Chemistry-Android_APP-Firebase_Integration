package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdg implements zzdwb<zzddi<Bundle>> {
    private final zzdwo<zzcrt<Bundle>> zzeop;
    private final zzdwo<zzcyg> zzfek;

    private zzcdg(zzdwo<zzcyg> zzdwoVar, zzdwo<zzcrt<Bundle>> zzdwoVar2) {
        this.zzfek = zzdwoVar;
        this.zzeop = zzdwoVar2;
    }

    public static zzcdg zzaa(zzdwo<zzcyg> zzdwoVar, zzdwo<zzcrt<Bundle>> zzdwoVar2) {
        return new zzcdg(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzddi) zzdwh.zza(this.zzfek.get().zzu(zzcyd.SIGNALS).zzb(this.zzeop.get().zzs(new Bundle())).zzant(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
