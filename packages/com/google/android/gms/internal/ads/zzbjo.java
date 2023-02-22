package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjo implements zzdwb<zzcga<zzbio>> {
    private final zzdwo<zzckm<zzbio, zzcwm, zzchk>> zzepq;
    private final zzdwo<Boolean> zzewh;
    private final zzdwo<zzciz> zzewj;

    public zzbjo(zzdwo<Boolean> zzdwoVar, zzdwo<zzciz> zzdwoVar2, zzdwo<zzckm<zzbio, zzcwm, zzchk>> zzdwoVar3) {
        this.zzewh = zzdwoVar;
        this.zzewj = zzdwoVar2;
        this.zzepq = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        boolean booleanValue = this.zzewh.get().booleanValue();
        zzciz zzcizVar = this.zzewj.get();
        zzckm<zzbio, zzcwm, zzchk> zzckmVar = this.zzepq.get();
        if (!booleanValue) {
            zzcizVar = zzckmVar;
        }
        return (zzcga) zzdwh.zza(zzcizVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
