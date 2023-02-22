package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsf;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcax implements zzdwb<zzcba> {
    private static final zzcax zzfrn = new zzcax();

    public static zzcax zzajt() {
        return zzfrn;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcba) zzdwh.zza(new zzcba(zzsf.zza.EnumC0018zza.REQUEST_WILL_MAKE_NETWORK_REQUEST, zzsf.zza.EnumC0018zza.REQUEST_DID_RECEIVE_NETWORK_RESPONSE, zzsf.zza.EnumC0018zza.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST), "Cannot return null from a non-@Nullable @Provides method");
    }
}
