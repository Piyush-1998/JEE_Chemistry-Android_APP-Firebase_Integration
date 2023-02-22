package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdbr<K> extends zzdbg<K> {
    private final transient zzdbd<K> zzgpd;
    private final transient zzdbh<K, ?> zzgps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbr(zzdbh<K, ?> zzdbhVar, zzdbd<K> zzdbdVar) {
        this.zzgps = zzdbhVar;
        this.zzgpd = zzdbdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final boolean zzaoo() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final zzdbu<K> zzaoj() {
        return (zzdbu) zzaon().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzday
    public final int zza(Object[] objArr, int i) {
        return zzaon().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdbg, com.google.android.gms.internal.ads.zzday
    public final zzdbd<K> zzaon() {
        return this.zzgpd;
    }

    @Override // com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.zzgps.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzgps.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdbg, com.google.android.gms.internal.ads.zzday, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
