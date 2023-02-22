package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbub implements zzdwb<zzbuz> {
    private final zzbtx zzfkj;
    private final zzdwo<zzbtq> zzfkl;

    public zzbub(zzbtx zzbtxVar, zzdwo<zzbtq> zzdwoVar) {
        this.zzfkj = zzbtxVar;
        this.zzfkl = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdwh.zza(this.zzfkl.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
