package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfk implements zzdwb<zzcfj> {
    private final zzdwo<zzcfh> zzepa;
    private final zzdwo<zzddl> zzfvy;

    private zzcfk(zzdwo<zzcfh> zzdwoVar, zzdwo<zzddl> zzdwoVar2) {
        this.zzepa = zzdwoVar;
        this.zzfvy = zzdwoVar2;
    }

    public static zzcfk zzai(zzdwo<zzcfh> zzdwoVar, zzdwo<zzddl> zzdwoVar2) {
        return new zzcfk(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcfj(this.zzepa.get(), this.zzfvy.get());
    }
}
