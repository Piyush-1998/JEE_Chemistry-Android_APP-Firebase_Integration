package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqe implements zzdwb<zzcqc> {
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<zzcvp> zzfxz;

    private zzcqe(zzdwo<zzddl> zzdwoVar, zzdwo<zzcvp> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzfxz = zzdwoVar2;
    }

    public static zzcqe zzap(zzdwo<zzddl> zzdwoVar, zzdwo<zzcvp> zzdwoVar2) {
        return new zzcqe(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcqc(this.zzfck.get(), this.zzfxz.get());
    }
}
