package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class zzht implements ListIterator<String> {
    private ListIterator<String> zzama;
    private final /* synthetic */ int zzamb;
    private final /* synthetic */ zzhu zzamc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzht(zzhu zzhuVar, int i) {
        zzfp zzfpVar;
        this.zzamc = zzhuVar;
        this.zzamb = i;
        zzfpVar = this.zzamc.zzamd;
        this.zzama = zzfpVar.listIterator(this.zzamb);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzama.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzama.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzama.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzama.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzama.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zzama.next();
    }
}
