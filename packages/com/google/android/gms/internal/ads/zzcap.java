package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsf;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcap implements zzdwb<zzcba> {
    private static final zzcap zzfrf = new zzcap();

    public static zzcap zzajp() {
        return zzfrf;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcba) zzdwh.zza(new zzcba(zzsf.zza.EnumC0018zza.REQUEST_WILL_RENDER, zzsf.zza.EnumC0018zza.REQUEST_DID_RENDER, zzsf.zza.EnumC0018zza.REQUEST_FAILED_TO_RENDER), "Cannot return null from a non-@Nullable @Provides method");
    }
}
