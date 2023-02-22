package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxf implements zzdwb<Executor> {
    private static final zzcxf zzgld = new zzcxf();

    public static zzcxf zzani() {
        return zzgld;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Executor) zzdwh.zza(zzaxn.zzdwm, "Cannot return null from a non-@Nullable @Provides method");
    }
}
