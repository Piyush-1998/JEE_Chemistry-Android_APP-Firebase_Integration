package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfq implements zzdwb<zzcfr> {
    private final zzdwo<zzcfp> zzfwm;

    private zzcfq(zzdwo<zzcfp> zzdwoVar) {
        this.zzfwm = zzdwoVar;
    }

    public static zzcfq zzae(zzdwo<zzcfp> zzdwoVar) {
        return new zzcfq(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcfr(this.zzfwm.get());
    }
}
