package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzdvu implements Iterator<E> {
    private int pos = 0;
    private final /* synthetic */ zzdvr zzhxc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvu(zzdvr zzdvrVar) {
        this.zzhxc = zzdvrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.pos < this.zzhxc.zzhxa.size() || this.zzhxc.zzhxb.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public final E next() {
        while (this.pos >= this.zzhxc.zzhxa.size()) {
            this.zzhxc.zzhxa.add(this.zzhxc.zzhxb.next());
        }
        List<E> list = this.zzhxc.zzhxa;
        int i = this.pos;
        this.pos = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
