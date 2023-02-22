package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbtj implements zzdwb<zzbth> {
    private final zzbth zzfje;

    private zzbtj(zzbth zzbthVar) {
        this.zzfje = zzbthVar;
    }

    public static zzbtj zze(zzbth zzbthVar) {
        return new zzbtj(zzbthVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        zzbth zzbthVar = this.zzfje;
        if (zzbthVar != null) {
            return (zzbth) zzdwh.zza(zzbthVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
