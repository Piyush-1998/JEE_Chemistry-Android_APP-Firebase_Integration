package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbld implements zzdwb<zzcvr> {
    private final zzbla zzffu;

    private zzbld(zzbla zzblaVar) {
        this.zzffu = zzblaVar;
    }

    public static zzbld zzc(zzbla zzblaVar) {
        return new zzbld(zzblaVar);
    }

    public static zzcvr zzd(zzbla zzblaVar) {
        return (zzcvr) zzdwh.zza(zzblaVar.zzafq(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzd(this.zzffu);
    }
}
