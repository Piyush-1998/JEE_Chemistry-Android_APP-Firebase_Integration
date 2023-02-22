package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdvz<T> implements zzdwb<T> {
    private zzdwo<T> zzhxn;

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final T get() {
        zzdwo<T> zzdwoVar = this.zzhxn;
        if (zzdwoVar == null) {
            throw new IllegalStateException();
        }
        return zzdwoVar.get();
    }

    public static <T> void zzaw(zzdwo<T> zzdwoVar, zzdwo<T> zzdwoVar2) {
        zzdwh.checkNotNull(zzdwoVar2);
        zzdvz zzdvzVar = (zzdvz) zzdwoVar;
        if (zzdvzVar.zzhxn != null) {
            throw new IllegalStateException();
        }
        zzdvzVar.zzhxn = zzdwoVar2;
    }
}
