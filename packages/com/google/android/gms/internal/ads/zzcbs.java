package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbs implements zzdwb<zzcbt> {
    private final zzdwo<String> zzfsi;
    private final zzdwo<zzcbo> zzfsj;

    public zzcbs(zzdwo<String> zzdwoVar, zzdwo<zzcbo> zzdwoVar2) {
        this.zzfsi = zzdwoVar;
        this.zzfsj = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcbt(this.zzfsi.get(), this.zzfsj.get());
    }
}
