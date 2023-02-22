package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbfz implements zzdwb<com.google.android.gms.ads.internal.zza> {
    private final zzbfx zzfag;

    public zzbfz(zzbfx zzbfxVar) {
        this.zzfag = zzbfxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zza) zzdwh.zza(this.zzfag.zzads(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
