package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnz;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzckq<AdT, AdapterT, ListenerT extends zzbnz> implements zzdwb<zzckm<AdT, AdapterT, ListenerT>> {
    private final zzdwo<zzcge<AdapterT, ListenerT>> zzfao;
    private final zzdwo<zzddl> zzfdx;
    private final zzdwo<zzcyg> zzfek;
    private final zzdwo<zzcgh<AdT, AdapterT, ListenerT>> zzgaj;

    private zzckq(zzdwo<zzcyg> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<zzcge<AdapterT, ListenerT>> zzdwoVar3, zzdwo<zzcgh<AdT, AdapterT, ListenerT>> zzdwoVar4) {
        this.zzfek = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzfao = zzdwoVar3;
        this.zzgaj = zzdwoVar4;
    }

    public static <AdT, AdapterT, ListenerT extends zzbnz> zzckq<AdT, AdapterT, ListenerT> zzd(zzdwo<zzcyg> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<zzcge<AdapterT, ListenerT>> zzdwoVar3, zzdwo<zzcgh<AdT, AdapterT, ListenerT>> zzdwoVar4) {
        return new zzckq<>(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzckm(this.zzfek.get(), this.zzfdx.get(), this.zzfao.get(), this.zzgaj.get());
    }
}
