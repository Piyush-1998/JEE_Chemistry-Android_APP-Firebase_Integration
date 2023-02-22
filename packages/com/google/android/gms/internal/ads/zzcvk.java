package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvk implements zzdwb<zzcvf> {
    private final zzdwo<zzcwc> zzeyy;
    private final zzdwo<String> zzgis;
    private final zzdwo<zzcvb> zzgit;
    private final zzdwo<zzcui> zzgiu;

    public zzcvk(zzdwo<String> zzdwoVar, zzdwo<zzcvb> zzdwoVar2, zzdwo<zzcui> zzdwoVar3, zzdwo<zzcwc> zzdwoVar4) {
        this.zzgis = zzdwoVar;
        this.zzgit = zzdwoVar2;
        this.zzgiu = zzdwoVar3;
        this.zzeyy = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcvf(this.zzgis.get(), this.zzgit.get(), this.zzgiu.get(), this.zzeyy.get());
    }
}
