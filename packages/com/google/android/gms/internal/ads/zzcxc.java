package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxc implements zzdwb<zzcwy> {
    private final zzdwo<zzcww> zzfcl;
    private final zzcxa zzgla;
    private final zzdwo<String> zzglc;

    private zzcxc(zzcxa zzcxaVar, zzdwo<zzcww> zzdwoVar, zzdwo<String> zzdwoVar2) {
        this.zzgla = zzcxaVar;
        this.zzfcl = zzdwoVar;
        this.zzglc = zzdwoVar2;
    }

    public static zzcxc zza(zzcxa zzcxaVar, zzdwo<zzcww> zzdwoVar, zzdwo<String> zzdwoVar2) {
        return new zzcxc(zzcxaVar, zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzcwy) zzdwh.zza(this.zzfcl.get().zzgg(this.zzglc.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
