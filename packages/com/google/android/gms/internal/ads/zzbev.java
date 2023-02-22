package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbev implements zzdwb<zzaps> {
    private final zzdwo<Context> zzejy;

    public zzbev(zzdwo<Context> zzdwoVar) {
        this.zzejy = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        Context context = this.zzejy.get();
        return (zzaps) zzdwh.zza(new zzapq(context, new zzapt(context).zztc()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
