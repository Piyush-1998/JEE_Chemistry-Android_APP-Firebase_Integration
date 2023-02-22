package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsf;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcau implements zzdwb<zzcba> {
    private static final zzcau zzfrk = new zzcau();

    public static zzcau zzajq() {
        return zzfrk;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcba) zzdwh.zza(new zzcba(zzsf.zza.EnumC0018zza.REQUEST_WILL_UPDATE_GMS_SIGNALS, zzsf.zza.EnumC0018zza.REQUEST_DID_UPDATE_GMS_SIGNALS, zzsf.zza.EnumC0018zza.REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
