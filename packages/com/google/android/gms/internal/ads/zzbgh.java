package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgh implements zzdwb<zzczf> {
    private final zzdwo<Context> zzejy;

    public zzbgh(zzdwo<Context> zzdwoVar) {
        this.zzejy = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzczf) zzdwh.zza(new zzczf(this.zzejy.get(), com.google.android.gms.ads.internal.zzq.zzkx().zzwd()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
