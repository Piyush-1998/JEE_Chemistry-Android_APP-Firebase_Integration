package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzhw implements Iterator<String> {
    private final /* synthetic */ zzhu zzamc;
    private Iterator<String> zzamy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhw(zzhu zzhuVar) {
        zzfp zzfpVar;
        this.zzamc = zzhuVar;
        zzfpVar = this.zzamc.zzamd;
        this.zzamy = zzfpVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzamy.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzamy.next();
    }
}
