package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcim implements zzdwb<zzcig> {
    private final zzdwo<zzbwm> zzeqb;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<zzbtl> zzfxj;

    public zzcim(zzdwo<zzbtl> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<zzbwm> zzdwoVar3) {
        this.zzfxj = zzdwoVar;
        this.zzfck = zzdwoVar2;
        this.zzeqb = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcig(this.zzfxj.get(), this.zzfck.get(), this.zzeqb.get());
    }
}
