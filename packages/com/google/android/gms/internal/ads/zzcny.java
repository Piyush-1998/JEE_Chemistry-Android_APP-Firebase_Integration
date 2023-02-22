package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcny implements zzdwb<zzcnt> {
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzddi<String>> zzgec;

    private zzcny(zzdwo<zzddi<String>> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzgec = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzcny zzaj(zzdwo<zzddi<String>> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        return new zzcny(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcnt(this.zzgec.get(), this.zzfck.get());
    }
}
