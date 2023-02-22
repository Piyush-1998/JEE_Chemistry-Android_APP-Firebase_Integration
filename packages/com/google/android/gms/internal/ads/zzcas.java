package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcas implements zzdwb<zzcaq> {
    private final zzdwo<zzcuf> zzeme;
    private final zzdwo<zzsd> zzfrj;

    private zzcas(zzdwo<zzsd> zzdwoVar, zzdwo<zzcuf> zzdwoVar2) {
        this.zzfrj = zzdwoVar;
        this.zzeme = zzdwoVar2;
    }

    public static zzcas zzs(zzdwo<zzsd> zzdwoVar, zzdwo<zzcuf> zzdwoVar2) {
        return new zzcas(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcaq(this.zzfrj.get(), this.zzeme.get());
    }
}
