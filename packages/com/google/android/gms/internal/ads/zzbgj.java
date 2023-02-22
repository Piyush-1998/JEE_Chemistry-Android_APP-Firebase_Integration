package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgj implements zzdwb<zzaxm> {
    private final zzdwo<String> zzfas;

    public zzbgj(zzdwo<String> zzdwoVar) {
        this.zzfas = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzaxm) zzdwh.zza(new zzaxm(this.zzfas.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
