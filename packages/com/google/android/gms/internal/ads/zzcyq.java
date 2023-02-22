package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcyq implements zzdwb<zzaix> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxl> zzfgx;
    private final zzcyn zzgmy;

    public zzcyq(zzcyn zzcynVar, zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2) {
        this.zzgmy = zzcynVar;
        this.zzejy = zzdwoVar;
        this.zzfgx = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzaix) zzdwh.zza(new zzaio().zzb(this.zzejy.get(), this.zzfgx.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
