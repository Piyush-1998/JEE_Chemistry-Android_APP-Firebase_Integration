package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbsw implements zzdwb<zzbsx> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<Integer> zzfcr;
    private final zzdwo<zzbbw> zzfdu;
    private final zzdwo<zzcvr> zzfes;

    private zzbsw(zzdwo<Context> zzdwoVar, zzdwo<zzbbw> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3, zzdwo<zzaxl> zzdwoVar4, zzdwo<Integer> zzdwoVar5) {
        this.zzejy = zzdwoVar;
        this.zzfdu = zzdwoVar2;
        this.zzfes = zzdwoVar3;
        this.zzfan = zzdwoVar4;
        this.zzfcr = zzdwoVar5;
    }

    public static zzbsw zzd(zzdwo<Context> zzdwoVar, zzdwo<zzbbw> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3, zzdwo<zzaxl> zzdwoVar4, zzdwo<Integer> zzdwoVar5) {
        return new zzbsw(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbsx(this.zzejy.get(), this.zzfdu.get(), this.zzfes.get(), this.zzfan.get(), this.zzfcr.get().intValue());
    }
}
