package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclf<AdT> implements zzdwb<zzclb<AdT>> {
    private final zzdwo<zzddl> zzfdx;
    private final zzdwo<zzcyg> zzfek;
    private final zzdwo<zzaah> zzgat;
    private final zzdwo<zzclc<AdT>> zzgba;

    public zzclf(zzdwo<zzcyg> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<zzaah> zzdwoVar3, zzdwo<zzclc<AdT>> zzdwoVar4) {
        this.zzfek = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzgat = zzdwoVar3;
        this.zzgba = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzclb(this.zzfek.get(), this.zzfdx.get(), this.zzgat.get(), this.zzgba.get());
    }
}
