package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsf;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcav implements zzdwb<zzcba> {
    private static final zzcav zzfrl = new zzcav();

    public static zzcav zzajr() {
        return zzfrl;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcba) zzdwh.zza(new zzcba(zzsf.zza.EnumC0018zza.REQUEST_WILL_BUILD_URL, zzsf.zza.EnumC0018zza.REQUEST_DID_BUILD_URL, zzsf.zza.EnumC0018zza.REQUEST_FAILED_TO_BUILD_URL), "Cannot return null from a non-@Nullable @Provides method");
    }
}
