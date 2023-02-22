package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmj implements zzdwb<zzbou> {
    private final zzdwo<zzbou> zzfgr;

    private zzbmj(zzdwo<zzbou> zzdwoVar) {
        this.zzfgr = zzdwoVar;
    }

    public static zzbmj zzf(zzdwo<zzbou> zzdwoVar) {
        return new zzbmj(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbou) zzdwh.zza(this.zzfgr.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
