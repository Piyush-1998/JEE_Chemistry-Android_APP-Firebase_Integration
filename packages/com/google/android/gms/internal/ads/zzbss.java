package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbss implements zzdwb<String> {
    private static final zzbss zzfiq = new zzbss();

    public static zzbss zzagw() {
        return zzfiq;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (String) zzdwh.zza("interstitial", "Cannot return null from a non-@Nullable @Provides method");
    }
}
