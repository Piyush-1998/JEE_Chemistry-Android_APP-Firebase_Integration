package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsf;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcaw implements zzdwb<zzcba> {
    private static final zzcaw zzfrm = new zzcaw();

    public static zzcaw zzajs() {
        return zzfrm;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcba) zzdwh.zza(new zzcba(zzsf.zza.EnumC0018zza.REQUEST_WILL_PROCESS_RESPONSE, zzsf.zza.EnumC0018zza.REQUEST_DID_PROCESS_RESPONSE, zzsf.zza.EnumC0018zza.REQUEST_FAILED_TO_PROCESS_RESPONSE), "Cannot return null from a non-@Nullable @Provides method");
    }
}
