package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdp implements zzdwb<String> {
    private final zzdwo<Context> zzejy;

    private zzcdp(zzdwo<Context> zzdwoVar) {
        this.zzejy = zzdwoVar;
    }

    public static zzcdp zzab(zzdwo<Context> zzdwoVar) {
        return new zzcdp(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (String) zzdwh.zza(this.zzejy.get().getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
