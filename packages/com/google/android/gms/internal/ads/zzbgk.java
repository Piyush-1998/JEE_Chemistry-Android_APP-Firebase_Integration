package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgk implements zzdwb<zzrw> {
    private static final zzbgk zzfat = new zzbgk();

    public static zzbgk zzadw() {
        return zzfat;
    }

    public static zzrw zzadx() {
        return (zzrw) zzdwh.zza(new zzrw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzadx();
    }
}
