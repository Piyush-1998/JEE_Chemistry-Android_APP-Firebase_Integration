package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbti implements zzdwb<zzbuy> {
    private final zzbth zzfje;

    private zzbti(zzbth zzbthVar) {
        this.zzfje = zzbthVar;
    }

    public static zzbti zzc(zzbth zzbthVar) {
        return new zzbti(zzbthVar);
    }

    public static zzbuy zzd(zzbth zzbthVar) {
        return (zzbuy) zzdwh.zza(zzbthVar.zzagy(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzd(this.zzfje);
    }
}
