package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvq implements zzdwb<zzcvl> {
    private final zzdwo<zzcwc> zzeyy;
    private final zzdwo<zzcvb> zzgit;
    private final zzdwo<zzcui> zzgiu;

    public zzcvq(zzdwo<zzcvb> zzdwoVar, zzdwo<zzcui> zzdwoVar2, zzdwo<zzcwc> zzdwoVar3) {
        this.zzgit = zzdwoVar;
        this.zzgiu = zzdwoVar2;
        this.zzeyy = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcvl(this.zzgit.get(), this.zzgiu.get(), this.zzeyy.get());
    }
}
