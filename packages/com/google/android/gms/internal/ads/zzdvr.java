package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdvr<E> extends AbstractList<E> {
    private static final zzdvt zzcp = zzdvt.zzn(zzdvr.class);
    List<E> zzhxa;
    Iterator<E> zzhxb;

    public zzdvr(List<E> list, Iterator<E> it) {
        this.zzhxa = list;
        this.zzhxb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.zzhxa.size() > i) {
            return this.zzhxa.get(i);
        }
        if (this.zzhxb.hasNext()) {
            this.zzhxa.add(this.zzhxb.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new zzdvu(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        zzcp.zzhr("potentially expensive size() call");
        zzcp.zzhr("blowup running");
        while (this.zzhxb.hasNext()) {
            this.zzhxa.add(this.zzhxb.next());
        }
        return this.zzhxa.size();
    }
}
