package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqj implements zzdwb<zzcqg> {
    private final zzdwo<zzaui> zzemh;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<PackageInfo> zzfuf;

    public zzcqj(zzdwo<zzddl> zzdwoVar, zzdwo<zzcwe> zzdwoVar2, zzdwo<PackageInfo> zzdwoVar3, zzdwo<zzaui> zzdwoVar4) {
        this.zzfck = zzdwoVar;
        this.zzfef = zzdwoVar2;
        this.zzfuf = zzdwoVar3;
        this.zzemh = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcqg(this.zzfck.get(), this.zzfef.get(), this.zzfuf.get(), this.zzemh.get());
    }
}
