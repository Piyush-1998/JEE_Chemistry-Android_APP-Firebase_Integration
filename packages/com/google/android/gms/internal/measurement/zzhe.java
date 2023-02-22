package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzhe implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzhc zzalq;
    private Iterator<Map.Entry<K, V>> zzalr;

    private zzhe(zzhc zzhcVar) {
        List list;
        this.zzalq = zzhcVar;
        list = this.zzalq.zzall;
        this.pos = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzalq.zzall;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzwm().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzwm() {
        Map map;
        if (this.zzalr == null) {
            map = this.zzalq.zzalo;
            this.zzalr = map.entrySet().iterator();
        }
        return this.zzalr;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (zzwm().hasNext()) {
            return (Map.Entry) zzwm().next();
        }
        list = this.zzalq.zzall;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhe(zzhc zzhcVar, zzhb zzhbVar) {
        this(zzhcVar);
    }
}
