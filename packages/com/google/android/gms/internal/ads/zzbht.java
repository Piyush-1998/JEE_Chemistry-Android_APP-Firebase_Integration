package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbht implements zzdwb<zzajc> {
    private final zzdwo<zzaix> zzfcu;

    private zzbht(zzdwo<zzaix> zzdwoVar) {
        this.zzfcu = zzdwoVar;
    }

    public static zzbht zzb(zzdwo<zzaix> zzdwoVar) {
        return new zzbht(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzajc) zzdwh.zza(this.zzfcu.get().zzrl(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
