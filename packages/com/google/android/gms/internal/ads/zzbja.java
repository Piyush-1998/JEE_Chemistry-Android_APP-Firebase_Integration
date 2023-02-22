package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbja implements zzdwb<zzbio> {
    private final zzdwo<zzbiq> zzexl;
    private final zzbiv zzfec;

    public zzbja(zzbiv zzbivVar, zzdwo<zzbiq> zzdwoVar) {
        this.zzfec = zzbivVar;
        this.zzexl = zzdwoVar;
    }

    public static zzbio zza(zzbiv zzbivVar, Object obj) {
        return (zzbio) zzdwh.zza((zzbiq) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzfec, this.zzexl.get());
    }
}
