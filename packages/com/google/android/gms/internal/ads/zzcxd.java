package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxd implements zzdwb<zzatz> {
    private final zzcxa zzgla;
    private final zzdwo<zzcwy> zzglb;

    private zzcxd(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        this.zzgla = zzcxaVar;
        this.zzglb = zzdwoVar;
    }

    public static zzcxd zzc(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        return new zzcxd(zzcxaVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzatz) zzdwh.zza(this.zzglb.get().zzdqe, "Cannot return null from a non-@Nullable @Provides method");
    }
}
