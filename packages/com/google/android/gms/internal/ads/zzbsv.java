package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsv implements zzdwb<zzcga<zzbrs>> {
    private final zzdwo<zzddl> zzfdx;
    private final zzdwo<zzcyg> zzfek;
    private final zzdwo<zzcib> zzfel;
    private final zzdwo<zzckk> zzfem;

    public zzbsv(zzdwo<zzcyg> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<zzcib> zzdwoVar3, zzdwo<zzckk> zzdwoVar4) {
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
