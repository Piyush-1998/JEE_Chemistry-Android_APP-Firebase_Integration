package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbwr implements zzdwb<zzbwm> {
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<zzbwq> zzfor;
    private final zzdwo<zzbxb> zzfos;

    public zzbwr(zzdwo<zzddl> zzdwoVar, zzdwo<zzbwq> zzdwoVar2, zzdwo<zzbxb> zzdwoVar3) {
        this.zzfck = zzdwoVar;
        this.zzfor = zzdwoVar2;
        this.zzfos = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbwm(this.zzfck.get(), this.zzfor.get(), this.zzfos.get());
    }
}
