package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbuo implements zzdwb<zzbup> {
    private final zzdwo<zzbuh> zzflh;

    private zzbuo(zzdwo<zzbuh> zzdwoVar) {
        this.zzflh = zzdwoVar;
    }

    public static zzbuo zzx(zzdwo<zzbuh> zzdwoVar) {
        return new zzbuo(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbup(this.zzflh.get());
    }
}
