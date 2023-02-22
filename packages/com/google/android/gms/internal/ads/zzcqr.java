package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqr implements zzdwb<zzcqs> {
    private final zzdwo<PackageInfo> zzfuf;
    private final zzdwo<ApplicationInfo> zzfuk;

    private zzcqr(zzdwo<ApplicationInfo> zzdwoVar, zzdwo<PackageInfo> zzdwoVar2) {
        this.zzfuk = zzdwoVar;
        this.zzfuf = zzdwoVar2;
    }

    public static zzcqr zzaq(zzdwo<ApplicationInfo> zzdwoVar, zzdwo<PackageInfo> zzdwoVar2) {
        return new zzcqr(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcqs(this.zzfuk.get(), this.zzfuf.get());
    }
}
