package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbeq implements zzdwb<zzcge<zzcwm, zzchk>> {
    private final zzbel zzejv;
    private final zzdwo<zzchm> zzejw;

    public zzbeq(zzbel zzbelVar, zzdwo<zzchm> zzdwoVar) {
        this.zzejv = zzbelVar;
        this.zzejw = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcge) zzdwh.zza(new zzcie(this.zzejw.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
