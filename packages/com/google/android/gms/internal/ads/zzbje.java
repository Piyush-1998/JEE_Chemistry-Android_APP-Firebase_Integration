package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbje implements zzdwb<zzbqs<zzbog>> {
    private final zzdwo<zzbkd> zzfdd;
    private final zzbiv zzfec;

    public zzbje(zzbiv zzbivVar, zzdwo<zzbkd> zzdwoVar) {
        this.zzfec = zzbivVar;
        this.zzfdd = zzdwoVar;
    }

    public static zzbqs<zzbog> zza(zzbiv zzbivVar, zzbkd zzbkdVar) {
        return (zzbqs) zzdwh.zza(new zzbqs(zzbkdVar, zzaxn.zzdwm), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zza(this.zzfec, this.zzfdd.get());
    }
}
