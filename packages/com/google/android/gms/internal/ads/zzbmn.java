package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmn implements zzdwb<Context> {
    private final zzdwo<Context> zzfgo;
    private final zzbmk zzfgv;

    private zzbmn(zzbmk zzbmkVar, zzdwo<Context> zzdwoVar) {
        this.zzfgv = zzbmkVar;
        this.zzfgo = zzdwoVar;
    }

    public static zzbmn zza(zzbmk zzbmkVar, zzdwo<Context> zzdwoVar) {
        return new zzbmn(zzbmkVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Context) zzdwh.zza(this.zzfgv.zzbx(this.zzfgo.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
