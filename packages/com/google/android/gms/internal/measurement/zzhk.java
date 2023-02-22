package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzhk implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzhc zzalq;
    private Iterator<Map.Entry<K, V>> zzalr;
    private boolean zzalv;

    private zzhk(zzhc zzhcVar) {
        this.zzalq = zzhcVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzalq.zzall;
        if (i >= list.size()) {
            map = this.zzalq.zzalm;
            if (map.isEmpty() || !zzwm().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzalv) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzalv = false;
        this.zzalq.zzwk();
        int i = this.pos;
        list = this.zzalq.zzall;
        if (i < list.size()) {
            zzhc zzhcVar = this.zzalq;
            int i2 = this.pos;
            this.pos = i2 - 1;
            zzhcVar.zzcg(i2);
            return;
        }
        zzwm().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzwm() {
        Map map;
        if (this.zzalr == null) {
            map = this.zzalq.zzalm;
            this.zzalr = map.entrySet().iterator();
        }
        return this.zzalr;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzalv = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzalq.zzall;
        if (i >= list.size()) {
            return (Map.Entry) zzwm().next();
        }
        list2 = this.zzalq.zzall;
        return (Map.Entry) list2.get(this.pos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhk(zzhc zzhcVar, zzhb zzhbVar) {
        this(zzhcVar);
    }
}
