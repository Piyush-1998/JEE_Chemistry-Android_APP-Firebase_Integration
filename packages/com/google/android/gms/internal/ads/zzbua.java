package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbua implements zzdwb<zzbyh> {
    private final zzbtx zzfkj;

    public zzbua(zzbtx zzbtxVar) {
        this.zzfkj = zzbtxVar;
    }

    public static zzbyh zza(zzbtx zzbtxVar) {
        return (zzbyh) zzdwh.zza(zzbtxVar.zzahi(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzfkj);
    }
}
