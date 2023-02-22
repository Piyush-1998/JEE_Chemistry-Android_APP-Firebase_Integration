package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbep implements zzdwb<zzcge<zzcwm, zzchn>> {
    private final zzbel zzejv;
    private final zzdwo<zzchm> zzejw;

    public zzbep(zzbel zzbelVar, zzdwo<zzchm> zzdwoVar) {
        this.zzejv = zzbelVar;
        this.zzejw = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcge) zzdwh.zza(new zzcjv(this.zzejw.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
