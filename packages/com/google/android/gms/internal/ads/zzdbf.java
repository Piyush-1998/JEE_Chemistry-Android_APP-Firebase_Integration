package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdbf<E> extends zzdau<E> {
    private final zzdbd<E> zzgpd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbf(zzdbd<E> zzdbdVar, int i) {
        super(zzdbdVar.size(), i);
        this.zzgpd = zzdbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    protected final E get(int i) {
        return this.zzgpd.get(i);
    }
}
