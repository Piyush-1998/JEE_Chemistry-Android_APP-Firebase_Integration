package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbes implements zzdwb<zzbgq> {
    private final zzbel zzejv;
    private final zzdwo<zzbei> zzejx;

    public zzbes(zzbel zzbelVar, zzdwo<zzbei> zzdwoVar) {
        this.zzejv = zzbelVar;
        this.zzejx = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbgq) zzdwh.zza(this.zzejx.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
