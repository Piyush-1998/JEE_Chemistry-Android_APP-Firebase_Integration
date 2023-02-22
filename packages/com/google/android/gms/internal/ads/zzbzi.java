package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbzi implements zzdwb<zzcga<zzbyz>> {
    private final zzdwo<zzddl> zzfdx;
    private final zzdwo<zzcyg> zzfek;
    private final zzdwo<zzcjm> zzfel;
    private final zzdwo<zzckk> zzfem;

    public zzbzi(zzdwo<zzcyg> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<zzcjm> zzdwoVar3, zzdwo<zzckk> zzdwoVar4) {
        this.zzfek = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzfel = zzdwoVar3;
        this.zzfem = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcga) zzdwh.zza(new zzckm(this.zzfek.get(), this.zzfdx.get(), this.zzfem.get(), this.zzfel.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
