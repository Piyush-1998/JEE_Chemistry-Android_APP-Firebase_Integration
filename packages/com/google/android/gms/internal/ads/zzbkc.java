package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbkc implements zzdwb<zzbkd> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<zzbbw> zzfdu;
    private final zzdwo<zzcvr> zzfes;

    public zzbkc(zzdwo<Context> zzdwoVar, zzdwo<zzbbw> zzdwoVar2, zzdwo<zzcvr> zzdwoVar3, zzdwo<zzaxl> zzdwoVar4) {
        this.zzejy = zzdwoVar;
        this.zzfdu = zzdwoVar2;
        this.zzfes = zzdwoVar3;
        this.zzfan = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbkd(this.zzejy.get(), this.zzfdu.get(), this.zzfes.get(), this.zzfan.get());
    }
}
