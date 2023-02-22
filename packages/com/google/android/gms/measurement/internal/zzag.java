package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzag implements Iterator<String> {
    private Iterator<String> zzfr;
    private final /* synthetic */ zzah zzfs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzah zzahVar) {
        Bundle bundle;
        this.zzfs = zzahVar;
        bundle = this.zzfs.zzft;
        this.zzfr = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzfr.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzfr.next();
    }
}
