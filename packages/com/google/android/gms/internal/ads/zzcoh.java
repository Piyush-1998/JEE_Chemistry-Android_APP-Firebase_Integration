package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcoh implements zzdwb<zzcof> {
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<zzcwe> zzfef;

    private zzcoh(zzdwo<zzddl> zzdwoVar, zzdwo<zzcwe> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzfef = zzdwoVar2;
    }

    public static zzcoh zzak(zzdwo<zzddl> zzdwoVar, zzdwo<zzcwe> zzdwoVar2) {
        return new zzcoh(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcof(this.zzfck.get(), this.zzfef.get());
    }
}
