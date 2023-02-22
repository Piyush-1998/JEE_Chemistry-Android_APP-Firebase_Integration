package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsu implements zzdwb<zzcss> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaph> zzeqj;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<String> zzfrb;

    public zzcsu(zzdwo<zzaph> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<String> zzdwoVar3, zzdwo<zzddl> zzdwoVar4) {
        this.zzeqj = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfrb = zzdwoVar3;
        this.zzfck = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcss(this.zzeqj.get(), this.zzejy.get(), this.zzfrb.get(), this.zzfck.get());
    }
}
