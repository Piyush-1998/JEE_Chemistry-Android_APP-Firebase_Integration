package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmw implements zzdwb<zzasi> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcvr> zzfcp;
    private final zzbmt zzfgw;
    private final zzdwo<zzaxl> zzfgx;
    private final zzdwo<zzask> zzfgy;

    private zzbmw(zzbmt zzbmtVar, zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3, zzdwo<zzask> zzdwoVar4) {
        this.zzfgw = zzbmtVar;
        this.zzejy = zzdwoVar;
        this.zzfgx = zzdwoVar2;
        this.zzfcp = zzdwoVar3;
        this.zzfgy = zzdwoVar4;
    }

    public static zzbmw zza(zzbmt zzbmtVar, zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3, zzdwo<zzask> zzdwoVar4) {
        return new zzbmw(zzbmtVar, zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        Context context = this.zzejy.get();
        zzaxl zzaxlVar = this.zzfgx.get();
        zzcvr zzcvrVar = this.zzfcp.get();
        zzask zzaskVar = this.zzfgy.get();
        if (zzcvrVar.zzgji != null) {
            return new zzarv(context, zzaxlVar, zzcvrVar.zzgji, zzcvrVar.zzgje.zzdhz, zzaskVar);
        }
        return null;
    }
}
