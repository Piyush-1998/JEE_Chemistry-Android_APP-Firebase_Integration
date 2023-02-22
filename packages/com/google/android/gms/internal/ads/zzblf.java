package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblf implements zzdwb<zzcvz> {
    private final zzbla zzffu;

    private zzblf(zzbla zzblaVar) {
        this.zzffu = zzblaVar;
    }

    public static zzblf zze(zzbla zzblaVar) {
        return new zzblf(zzblaVar);
    }

    public static zzcvz zzf(zzbla zzblaVar) {
        return (zzcvz) zzdwh.zza(zzblaVar.zzafp(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzf(this.zzffu);
    }
}
