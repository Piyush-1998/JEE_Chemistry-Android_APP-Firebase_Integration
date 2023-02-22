package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmr implements zzdwb<zzcwe> {
    private final zzbmk zzfgv;

    private zzbmr(zzbmk zzbmkVar) {
        this.zzfgv = zzbmkVar;
    }

    public static zzbmr zzi(zzbmk zzbmkVar) {
        return new zzbmr(zzbmkVar);
    }

    public static zzcwe zzj(zzbmk zzbmkVar) {
        return (zzcwe) zzdwh.zza(zzbmkVar.zzafu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzj(this.zzfgv);
    }
}
