package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcca implements zzdwb<Set<zzbqs<zzbpc>>> {
    public static Set<zzbqs<zzbpc>> zza(zzcbx zzcbxVar, zzcch zzcchVar, Executor executor) {
        return (Set) zzdwh.zza(zzcbx.zzi(zzcchVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
