package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbug implements zzdwb<zzbuh> {
    private final zzdwo<zzbur> zzfkg;

    private zzbug(zzdwo<zzbur> zzdwoVar) {
        this.zzfkg = zzdwoVar;
    }

    public static zzbug zzw(zzdwo<zzbur> zzdwoVar) {
        return new zzbug(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbuh(this.zzfkg.get());
    }
}
