package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbta implements zzdwb<zzbtb> {
    private final zzdwo<zzbnl> zzfit;

    private zzbta(zzdwo<zzbnl> zzdwoVar) {
        this.zzfit = zzdwoVar;
    }

    public static zzbta zzv(zzdwo<zzbnl> zzdwoVar) {
        return new zzbta(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbtb(this.zzfit.get());
    }
}
