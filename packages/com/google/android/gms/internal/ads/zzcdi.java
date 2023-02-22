package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdi implements zzdwb<zzddi<String>> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcyg> zzfek;

    private zzcdi(zzdwo<zzcyg> zzdwoVar, zzdwo<Context> zzdwoVar2) {
        this.zzfek = zzdwoVar;
        this.zzejy = zzdwoVar2;
    }

    public static zzcdi zzab(zzdwo<zzcyg> zzdwoVar, zzdwo<Context> zzdwoVar2) {
        return new zzcdi(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        final Context context = this.zzejy.get();
        return (zzddi) zzdwh.zza(this.zzfek.get().zzu(zzcyd.WEBVIEW_COOKIE).zzc(new Callable(context) { // from class: com.google.android.gms.internal.ads.zzcdd
            private final Context zzdpy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager zzbd = com.google.android.gms.ads.internal.zzq.zzkl().zzbd(this.zzdpy);
                return zzbd != null ? zzbd.getCookie("googleads.g.doubleclick.net") : "";
            }
        }).zza(1L, TimeUnit.SECONDS).zza(Exception.class, zzcdc.zzftu).zzant(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
