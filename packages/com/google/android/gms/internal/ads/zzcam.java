package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsf;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcam implements zzdwb<zzcba> {
    private static final zzcam zzfrd = new zzcam();

    public static zzcam zzajn() {
        return zzfrd;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcba) zzdwh.zza(new zzcba(zzsf.zza.EnumC0018zza.REQUEST_WILL_UPDATE_SIGNALS, zzsf.zza.EnumC0018zza.REQUEST_DID_UPDATE_SIGNALS, zzsf.zza.EnumC0018zza.REQUEST_FAILED_TO_UPDATE_SIGNALS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
