package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgu implements zzdwb<zzbgv> {
    private final zzdwo<zzaui> zzemh;

    private zzbgu(zzdwo<zzaui> zzdwoVar) {
        this.zzemh = zzdwoVar;
    }

    public static zzbgu zza(zzdwo<zzaui> zzdwoVar) {
        return new zzbgu(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbgv(this.zzemh.get());
    }
}
