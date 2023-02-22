package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbte implements zzdwb<zzbtf> {
    private final zzdwo<zzbuy> zzfdw;
    private final zzdwo<Map<String, zzcga<zzbkq>>> zzffl;
    private final zzdwo<Map<String, zzcga<zzbuj>>> zzfiz;
    private final zzdwo<Map<String, zzcih<zzbuj>>> zzfja;
    private final zzdwo<zzbkp<zzbio>> zzfjb;

    public zzbte(zzdwo<Map<String, zzcga<zzbkq>>> zzdwoVar, zzdwo<Map<String, zzcga<zzbuj>>> zzdwoVar2, zzdwo<Map<String, zzcih<zzbuj>>> zzdwoVar3, zzdwo<zzbkp<zzbio>> zzdwoVar4, zzdwo<zzbuy> zzdwoVar5) {
        this.zzffl = zzdwoVar;
        this.zzfiz = zzdwoVar2;
        this.zzfja = zzdwoVar3;
        this.zzfjb = zzdwoVar4;
        this.zzfdw = zzdwoVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbtf(this.zzffl.get(), this.zzfiz.get(), this.zzfja.get(), this.zzfjb, this.zzfdw.get());
    }
}
