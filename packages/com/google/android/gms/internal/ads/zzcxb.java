package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxb implements zzdwb<Context> {
    private final zzcxa zzgla;
    private final zzdwo<zzcwy> zzglb;

    private zzcxb(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        this.zzgla = zzcxaVar;
        this.zzglb = zzdwoVar;
    }

    public static zzcxb zzb(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        return new zzcxb(zzcxaVar, zzdwoVar);
    }

    public static Context zzb(zzcxa zzcxaVar, zzcwy zzcwyVar) {
        return (Context) zzdwh.zza(zzcwyVar.zzzc, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzb(this.zzgla, this.zzglb.get());
    }
}
