package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdbn<E> extends zzdbd<E> {
    static final zzdbd<Object> zzgpp = new zzdbn(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzgpq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbn(Object[] objArr, int i) {
        this.zzgpq = objArr;
        this.size = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final int zzaol() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final boolean zzaoo() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final Object[] zzaok() {
        return this.zzgpq;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    final int zzaom() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdbd, com.google.android.gms.internal.ads.zzday
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzgpq, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdaq.zzr(i, this.size);
        return (E) this.zzgpq[i];
    }
}
