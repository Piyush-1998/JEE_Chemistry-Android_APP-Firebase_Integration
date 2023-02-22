package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbze implements zzdwb<zzcga<zzbyz>> {
    private final zzdwo<zzckm<zzbyz, zzcwm, zzchn>> zzfcm;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzckm<zzbyz, zzcwm, zzchk>> zzfqj;

    public zzbze(zzdwo<zzckm<zzbyz, zzcwm, zzchn>> zzdwoVar, zzdwo<zzckm<zzbyz, zzcwm, zzchk>> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3) {
        this.zzfcm = zzdwoVar;
        this.zzfqj = zzdwoVar2;
        this.zzfef = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        zzckm<zzbyz, zzcwm, zzchn> zzckmVar;
        zzdwo<zzckm<zzbyz, zzcwm, zzchn>> zzdwoVar = this.zzfcm;
        zzdwo<zzckm<zzbyz, zzcwm, zzchk>> zzdwoVar2 = this.zzfqj;
        if (this.zzfef.get().zzgkn.contains("new_rewarded")) {
            zzckmVar = zzdwoVar2.get();
        } else {
            zzckmVar = zzdwoVar.get();
        }
        return (zzcga) zzdwh.zza(zzckmVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
