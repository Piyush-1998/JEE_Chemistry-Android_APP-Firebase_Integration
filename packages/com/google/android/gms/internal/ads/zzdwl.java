package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdwl<T> implements zzdwo<T> {
    private static final Object zzhxo = new Object();
    private volatile Object zzduz = zzhxo;
    private volatile zzdwo<T> zzhxp;

    private zzdwl(zzdwo<T> zzdwoVar) {
        this.zzhxp = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final T get() {
        T t = (T) this.zzduz;
        if (t == zzhxo) {
            zzdwo<T> zzdwoVar = this.zzhxp;
            if (zzdwoVar == null) {
                return (T) this.zzduz;
            }
            T t2 = zzdwoVar.get();
            this.zzduz = t2;
            this.zzhxp = null;
            return t2;
        }
        return t;
    }

    public static <P extends zzdwo<T>, T> zzdwo<T> zzan(P p) {
        return ((p instanceof zzdwl) || (p instanceof zzdwc)) ? p : new zzdwl((zzdwo) zzdwh.checkNotNull(p));
    }
}
