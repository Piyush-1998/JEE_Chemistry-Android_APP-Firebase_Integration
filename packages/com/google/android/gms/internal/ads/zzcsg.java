package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsg implements zzdwb<zzcse> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzddl> zzfck;

    private zzcsg(zzdwo<zzddl> zzdwoVar, zzdwo<Context> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzejy = zzdwoVar2;
    }

    public static zzcsg zzau(zzdwo<zzddl> zzdwoVar, zzdwo<Context> zzdwoVar2) {
        return new zzcsg(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcse(this.zzfck.get(), this.zzejy.get());
    }
}
