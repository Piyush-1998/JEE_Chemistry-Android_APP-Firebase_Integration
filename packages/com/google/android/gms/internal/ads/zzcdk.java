package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdk implements zzdwb<ApplicationInfo> {
    private final zzdwo<Context> zzejy;

    private zzcdk(zzdwo<Context> zzdwoVar) {
        this.zzejy = zzdwoVar;
    }

    public static zzcdk zzaa(zzdwo<Context> zzdwoVar) {
        return new zzcdk(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (ApplicationInfo) zzdwh.zza(this.zzejy.get().getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
