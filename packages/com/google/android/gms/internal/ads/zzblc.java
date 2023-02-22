package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblc implements zzdwb<String> {
    private final zzbla zzffu;

    private zzblc(zzbla zzblaVar) {
        this.zzffu = zzblaVar;
    }

    public static zzblc zza(zzbla zzblaVar) {
        return new zzblc(zzblaVar);
    }

    public static String zzb(zzbla zzblaVar) {
        return (String) zzdwh.zza(zzblaVar.zzafr(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzb(this.zzffu);
    }
}
