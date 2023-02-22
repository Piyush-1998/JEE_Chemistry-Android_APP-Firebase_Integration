package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdbq extends zzdbd<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzgpo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbq(Object[] objArr, int i, int i2) {
        this.zzgpo = objArr;
        this.offset = i;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final boolean zzaoo() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdaq.zzr(i, this.size);
        return this.zzgpo[(i * 2) + this.offset];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }
}
