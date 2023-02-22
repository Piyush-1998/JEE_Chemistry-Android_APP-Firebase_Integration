package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcad implements zzdwb<zzcaa> {
    private final zzdwo<zzbbw> zzfdu;

    private zzcad(zzdwo<zzbbw> zzdwoVar) {
        this.zzfdu = zzdwoVar;
    }

    public static zzcad zzy(zzdwo<zzbbw> zzdwoVar) {
        return new zzcad(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcaa(this.zzfdu.get());
    }
}
