package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgm implements zzdwb<zzajn> {
    private static final zzbgm zzfav = new zzbgm();

    public static zzbgm zzadz() {
        return zzfav;
    }

    public static zzajn zzaea() {
        return (zzajn) zzdwh.zza(new zzajn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzaea();
    }
}
