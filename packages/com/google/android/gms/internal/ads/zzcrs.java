package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrs implements zzdwb<zzcrq> {
    private final zzdwo<zzcuf> zzfiu;

    private zzcrs(zzdwo<zzcuf> zzdwoVar) {
        this.zzfiu = zzdwoVar;
    }

    public static zzcrs zzal(zzdwo<zzcuf> zzdwoVar) {
        return new zzcrs(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcrq(this.zzfiu.get());
    }
}
