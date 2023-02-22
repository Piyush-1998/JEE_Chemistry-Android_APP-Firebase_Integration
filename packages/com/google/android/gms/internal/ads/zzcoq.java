package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcoq implements zzdwb<zzcoo> {
    private final zzdwo<zzblr> zzelz;
    private final zzdwo<zzcwu> zzenj;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<String> zzger;
    private final zzdwo<String> zzges;

    private zzcoq(zzdwo<String> zzdwoVar, zzdwo<String> zzdwoVar2, zzdwo<zzblr> zzdwoVar3, zzdwo<zzcwu> zzdwoVar4, zzdwo<zzcwe> zzdwoVar5) {
        this.zzger = zzdwoVar;
        this.zzges = zzdwoVar2;
        this.zzelz = zzdwoVar3;
        this.zzenj = zzdwoVar4;
        this.zzfef = zzdwoVar5;
    }

    public static zzcoq zzh(zzdwo<String> zzdwoVar, zzdwo<String> zzdwoVar2, zzdwo<zzblr> zzdwoVar3, zzdwo<zzcwu> zzdwoVar4, zzdwo<zzcwe> zzdwoVar5) {
        return new zzcoq(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcoo(this.zzger.get(), this.zzges.get(), this.zzelz.get(), this.zzenj.get(), this.zzfef.get());
    }
}
