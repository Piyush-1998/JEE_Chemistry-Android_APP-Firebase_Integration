package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdts extends AbstractList<String> implements zzdrn, RandomAccess {
    private final zzdrn zzhot;

    public zzdts(zzdrn zzdrnVar) {
        this.zzhot = zzdrnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final zzdrn zzbao() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final Object zzgq(int i) {
        return this.zzhot.zzgq(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzhot.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final void zzdb(zzdpm zzdpmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzdtr(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzdtu(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdrn
    public final List<?> zzban() {
        return this.zzhot.zzban();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zzhot.get(i);
    }
}
