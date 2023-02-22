package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyt implements zzdwb<zzbyp> {
    private final zzdwo<zzbpf> zzerj;
    private final zzdwo<zzbof> zzerp;
    private final zzdwo<zzbnr> zzesa;
    private final zzdwo<zzbmv> zzesd;
    private final zzdwo<zzboo> zzesr;

    public zzbyt(zzdwo<zzbmv> zzdwoVar, zzdwo<zzbnr> zzdwoVar2, zzdwo<zzbof> zzdwoVar3, zzdwo<zzboo> zzdwoVar4, zzdwo<zzbpf> zzdwoVar5) {
        this.zzesd = zzdwoVar;
        this.zzesa = zzdwoVar2;
        this.zzerp = zzdwoVar3;
        this.zzesr = zzdwoVar4;
        this.zzerj = zzdwoVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbyp(this.zzesd.get(), this.zzesa.get(), this.zzerp.get(), this.zzesr.get(), this.zzerj.get());
    }
}
