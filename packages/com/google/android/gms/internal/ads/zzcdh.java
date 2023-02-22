package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdh implements zzdwb<zzddi<zzape>> {
    private final zzdwo<zzaui> zzemh;
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<zzcyg> zzfek;
    private final zzdwo<String> zzfrb;
    private final zzdwo<zzddi<Bundle>> zzfuc;
    private final zzdwo<ApplicationInfo> zzfud;
    private final zzdwo<List<String>> zzfue;
    private final zzdwo<PackageInfo> zzfuf;
    private final zzdwo<zzddi<String>> zzfug;
    private final zzdwo<String> zzfuh;

    private zzcdh(zzdwo<zzcyg> zzdwoVar, zzdwo<zzddi<Bundle>> zzdwoVar2, zzdwo<zzaxl> zzdwoVar3, zzdwo<ApplicationInfo> zzdwoVar4, zzdwo<String> zzdwoVar5, zzdwo<List<String>> zzdwoVar6, zzdwo<PackageInfo> zzdwoVar7, zzdwo<zzddi<String>> zzdwoVar8, zzdwo<zzaui> zzdwoVar9, zzdwo<String> zzdwoVar10) {
        this.zzfek = zzdwoVar;
        this.zzfuc = zzdwoVar2;
        this.zzfcq = zzdwoVar3;
        this.zzfud = zzdwoVar4;
        this.zzfrb = zzdwoVar5;
        this.zzfue = zzdwoVar6;
        this.zzfuf = zzdwoVar7;
        this.zzfug = zzdwoVar8;
        this.zzemh = zzdwoVar9;
        this.zzfuh = zzdwoVar10;
    }

    public static zzcdh zza(zzdwo<zzcyg> zzdwoVar, zzdwo<zzddi<Bundle>> zzdwoVar2, zzdwo<zzaxl> zzdwoVar3, zzdwo<ApplicationInfo> zzdwoVar4, zzdwo<String> zzdwoVar5, zzdwo<List<String>> zzdwoVar6, zzdwo<PackageInfo> zzdwoVar7, zzdwo<zzddi<String>> zzdwoVar8, zzdwo<zzaui> zzdwoVar9, zzdwo<String> zzdwoVar10) {
        return new zzcdh(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5, zzdwoVar6, zzdwoVar7, zzdwoVar8, zzdwoVar9, zzdwoVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        final zzddi<Bundle> zzddiVar = this.zzfuc.get();
        final zzaxl zzaxlVar = this.zzfcq.get();
        final ApplicationInfo applicationInfo = this.zzfud.get();
        final String str = this.zzfrb.get();
        final List<String> list = this.zzfue.get();
        final PackageInfo packageInfo = this.zzfuf.get();
        final zzddi<String> zzddiVar2 = this.zzfug.get();
        final zzaui zzauiVar = this.zzemh.get();
        final String str2 = this.zzfuh.get();
        return (zzddi) zzdwh.zza(this.zzfek.get().zza((zzcyg) zzcyd.REQUEST_PARCEL, zzddiVar, zzddiVar2).zzb(new Callable(zzddiVar, zzaxlVar, applicationInfo, str, list, packageInfo, zzddiVar2, zzauiVar, str2) { // from class: com.google.android.gms.internal.ads.zzcde
            private final zzaxl zzfdz;
            private final zzddi zzfov;
            private final String zzfqz;
            private final ApplicationInfo zzftv;
            private final List zzftw;
            private final PackageInfo zzftx;
            private final zzddi zzfty;
            private final zzaui zzftz;
            private final String zzfua;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfov = zzddiVar;
                this.zzfdz = zzaxlVar;
                this.zzftv = applicationInfo;
                this.zzfqz = str;
                this.zzftw = list;
                this.zzftx = packageInfo;
                this.zzfty = zzddiVar2;
                this.zzftz = zzauiVar;
                this.zzfua = str2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzddi zzddiVar3 = this.zzfov;
                zzaxl zzaxlVar2 = this.zzfdz;
                ApplicationInfo applicationInfo2 = this.zzftv;
                String str3 = this.zzfqz;
                List list2 = this.zzftw;
                PackageInfo packageInfo2 = this.zzftx;
                zzddi zzddiVar4 = this.zzfty;
                zzaui zzauiVar2 = this.zzftz;
                return new zzape((Bundle) zzddiVar3.get(), zzaxlVar2, applicationInfo2, str3, list2, packageInfo2, (String) zzddiVar4.get(), zzauiVar2.zzvc(), this.zzfua);
            }
        }).zzant(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
