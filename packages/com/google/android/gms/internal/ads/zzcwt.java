package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcwt implements zzdwb<zzcwu> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzatz> zzelw;

    private zzcwt(zzdwo<Context> zzdwoVar, zzdwo<zzatz> zzdwoVar2) {
        this.zzejy = zzdwoVar;
        this.zzelw = zzdwoVar2;
    }

    public static zzcwt zzav(zzdwo<Context> zzdwoVar, zzdwo<zzatz> zzdwoVar2) {
        return new zzcwt(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcwu(this.zzejy.get(), this.zzelw.get());
    }
}
