package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnu implements zzdwb<zzcnr> {
    private final zzdwo<zzcwe> zzfef;

    private zzcnu(zzdwo<zzcwe> zzdwoVar) {
        this.zzfef = zzdwoVar;
    }

    public static zzcnu zzah(zzdwo<zzcwe> zzdwoVar) {
        return new zzcnu(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcnr(this.zzfef.get());
    }
}
