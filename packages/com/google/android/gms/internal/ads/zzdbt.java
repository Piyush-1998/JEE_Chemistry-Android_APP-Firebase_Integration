package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdbt<E> extends zzdbg<E> {
    static final zzdbt<Object> zzgpu = new zzdbt<>(new Object[0], 0, null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient int zzafv;
    private final transient Object[] zzgpv;
    private final transient Object[] zzgpw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbt(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzgpv = objArr;
        this.zzgpw = objArr2;
        this.mask = i2;
        this.zzafv = i;
        this.size = i3;
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

    @Override // com.google.android.gms.internal.ads.zzdbg
    final boolean zzaoq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zzgpw;
        if (obj == null || objArr == null) {
            return false;
        }
        int zzdp = zzdaz.zzdp(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = zzdp & this.mask;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzdp = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final zzdbu<E> zzaoj() {
        return (zzdbu) zzaon().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final Object[] zzaok() {
        return this.zzgpv;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    final int zzaom() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzgpv, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    final zzdbd<E> zzaor() {
        return zzdbd.zzb(this.zzgpv, this.size);
    }

    @Override // com.google.android.gms.internal.ads.zzdbg, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzafv;
    }

    @Override // com.google.android.gms.internal.ads.zzdbg, com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
