package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcol implements zzdwb<zzcok> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzatr> zzgeg;

    private zzcol(zzdwo<Executor> zzdwoVar, zzdwo<zzatr> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzgeg = zzdwoVar2;
    }

    public static zzcol zzal(zzdwo<Executor> zzdwoVar, zzdwo<zzatr> zzdwoVar2) {
        return new zzcol(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcok(this.zzfck.get(), this.zzgeg.get());
    }
}
