package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrn implements zzdwb<zzcrl> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<zzddl> zzfck;

    private zzcrn(zzdwo<zzddl> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzaxl> zzdwoVar3) {
        this.zzfck = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfan = zzdwoVar3;
    }

    public static zzcrn zzr(zzdwo<zzddl> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzaxl> zzdwoVar3) {
        return new zzcrn(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcrl(this.zzfck.get(), this.zzejy.get(), this.zzfan.get());
    }
}
