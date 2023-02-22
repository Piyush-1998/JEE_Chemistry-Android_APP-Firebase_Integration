package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbd implements zzdwb<zzcay> {
    private final zzdwo<zzsd> zzfrj;
    private final zzdwo<Map<zzcyd, zzcba>> zzfrw;

    private zzcbd(zzdwo<zzsd> zzdwoVar, zzdwo<Map<zzcyd, zzcba>> zzdwoVar2) {
        this.zzfrj = zzdwoVar;
        this.zzfrw = zzdwoVar2;
    }

    public static zzcbd zzt(zzdwo<zzsd> zzdwoVar, zzdwo<Map<zzcyd, zzcba>> zzdwoVar2) {
        return new zzcbd(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcay(this.zzfrj.get(), this.zzfrw.get());
    }
}
