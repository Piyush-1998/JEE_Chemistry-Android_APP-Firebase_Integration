package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcwz implements zzdwb<zzaui> {
    private final zzcxa zzgla;
    private final zzdwo<zzcwy> zzglb;

    private zzcwz(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        this.zzgla = zzcxaVar;
        this.zzglb = zzdwoVar;
    }

    public static zzcwz zza(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        return new zzcwz(zzcxaVar, zzdwoVar);
    }

    public static zzaui zza(zzcxa zzcxaVar, zzcwy zzcwyVar) {
        return (zzaui) zzdwh.zza(zzcwyVar.zzdrp, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzgla, this.zzglb.get());
    }
}
