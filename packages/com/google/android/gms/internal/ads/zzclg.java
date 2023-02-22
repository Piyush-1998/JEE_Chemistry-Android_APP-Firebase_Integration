package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclg implements zzdwb<zzcle> {
    private final zzcle zzgbb;

    private zzclg(zzcle zzcleVar) {
        this.zzgbb = zzcleVar;
    }

    public static zzclg zzc(zzcle zzcleVar) {
        return new zzclg(zzcleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        zzcle zzcleVar = this.zzgbb;
        if (zzcleVar != null) {
            return (zzcle) zzdwh.zza(zzcleVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
