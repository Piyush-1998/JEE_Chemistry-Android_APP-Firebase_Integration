package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxe implements zzdwb<zzdf> {
    private final zzcxa zzgla;
    private final zzdwo<zzcwy> zzglb;

    private zzcxe(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        this.zzgla = zzcxaVar;
        this.zzglb = zzdwoVar;
    }

    public static zzcxe zzd(zzcxa zzcxaVar, zzdwo<zzcwy> zzdwoVar) {
        return new zzcxe(zzcxaVar, zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzdf) zzdwh.zza(this.zzglb.get().zzgkz, "Cannot return null from a non-@Nullable @Provides method");
    }
}
