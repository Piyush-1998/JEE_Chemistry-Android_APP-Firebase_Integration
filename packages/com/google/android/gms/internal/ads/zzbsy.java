package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsy implements zzdwb<zzbsz> {
    private final zzdwo<zzbni> zzfit;
    private final zzdwo<zzcvr> zzfiu;

    private zzbsy(zzdwo<zzbni> zzdwoVar, zzdwo<zzcvr> zzdwoVar2) {
        this.zzfit = zzdwoVar;
        this.zzfiu = zzdwoVar2;
    }

    public static zzbsy zzj(zzdwo<zzbni> zzdwoVar, zzdwo<zzcvr> zzdwoVar2) {
        return new zzbsy(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbsz(this.zzfit.get(), this.zzfiu.get());
    }
}
